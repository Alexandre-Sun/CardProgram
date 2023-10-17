package org.sid.api.utilisateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/utilisateurs")
public class UtilisateurController {
	
	@Autowired
	private UtilisateurService utilisateurService;
	
	@GetMapping("/listUtilisateurs")
	public Iterable<Utilisateur> getUtilisateur(){
		return utilisateurService.getUtilisateurs();
	}
	
	

}
