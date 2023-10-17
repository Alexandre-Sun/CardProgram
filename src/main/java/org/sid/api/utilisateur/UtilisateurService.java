package org.sid.api.utilisateur;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;


@Data
@Service
public class UtilisateurService {

		@Autowired
		private UtilisateurRepository utilisateurRepository;
		
		public Optional<Utilisateur> getUtilisateur(final Long id){
			return utilisateurRepository.findById(id);
		}
		
		public Iterable<Utilisateur> getUtilisateurs(){
			return utilisateurRepository.findAll();
		}
		
		public void deleteUtilisateur(final Long id) {
			utilisateurRepository.deleteById(id);
		}
		
		public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
			Utilisateur savedUtilisateur = utilisateurRepository.save(utilisateur);
			return savedUtilisateur;
		}
		
	
}
