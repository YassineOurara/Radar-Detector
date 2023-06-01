package org.sid.immatriculationservice.entities;

import org.eclipse.persistence.oxm.annotations.XmlInverseReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@XmlRootElement(name = "Owner")
@XmlAccessorType(XmlAccessType.FIELD)
public class Owner {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @XmlElement
    private String name;
    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
    @XmlElementWrapper(name = "vehicles")
    @XmlElement(name = "vehicle")
    @JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
    @XmlInverseReference(mappedBy = "owner")
    private List<Vehicle> vehicles;
}


