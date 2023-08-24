package org.sid.api.partenaire;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PartenaireRepository extends CrudRepository<Partenaire,Long>{

}
