package org.sid.immatriculationservice.web.soap;

import org.apache.cxf.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.cxf.jaxws.EndpointImpl;

@Configuration
public class CXFSoapWebServiceConfig {
    @Autowired
    private Bus bus;
    @Autowired
    private ImmatriculationSoapService immatriculationSoapService;

    @Bean
    public EndpointImpl endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, immatriculationSoapService);
        endpoint.publish("/ImmatriculationService");
        return endpoint;
    }
}
