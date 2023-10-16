package org.sid.api.partenaire;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
public interface PartenaireRepository extends CrudRepository<Partenaire, Long> {

Optional<Partenaire> findById(Long id);

}
