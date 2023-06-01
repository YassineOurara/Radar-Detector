package org.sid.immatriculationservice.repositories;

import org.sid.immatriculationservice.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
