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

	public Optional<Partenaire> getPartenaire(final Long id) {
		return partenaireRepository.findById(id);
	}

	public Iterable<Partenaire> getPartenaires() {
		return partenaireRepository.findAll();
	}

	public String deletePartenaire(final Long id) {
		partenaireRepository.deleteById(id);
		return "partenaires/fichePartenaire";
	}

	public void savePartenaire(Partenaire partenaire) {
		partenaireRepository.save(partenaire);
		
	}

}
