package org.sid.api.partenaire;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
public class PartenaireService {

	@Autowired
	private PartenaireRepository partenaireRepository;
	
	public Optional<Partenaire> getPartenaire(final Long id){
		return partenaireRepository.findById(id);
	}
	
	public Iterable<Partenaire> getPartenaires(){
		return partenaireRepository.findAll();
	}
	
	public void deletePartenaire(final Long id) {
		partenaireRepository.deleteById(id);
	}
	
	public Partenaire savePartenaire(Partenaire partenaire) {
		Partenaire savedPartenaire = partenaireRepository.save(partenaire);
		return savedPartenaire;
	}
	
}
