package org.sid.api.utilisateur;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UtilisateurRepository extends CrudRepository<Utilisateur,Long>{

	
	
}
