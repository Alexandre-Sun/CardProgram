package org.sid.api.bin;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BinRepository extends CrudRepository<Bin, Long>{
	
}
