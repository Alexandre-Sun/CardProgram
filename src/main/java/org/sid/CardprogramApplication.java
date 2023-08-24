package org.sid;

import org.sid.api.partenaire.Partenaire;
import org.sid.api.partenaire.PartenaireRepository;
import org.sid.api.partenaire.PartenaireService;
import org.sid.api.utilisateur.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class CardprogramApplication {

	@Autowired
	UtilisateurRepository utilisateurRepository;

	@Autowired
	PartenaireRepository partenaireRepository;

	@Autowired
	private PartenaireService partenaireService;

	@RequestMapping("/template.html")
	public String template() {

		return "template";
	}

	@RequestMapping("/")
	public String index() {

		return "index";
	}

	@RequestMapping("/fichePartenaire.html")
	public String fichePartenaire() {

		return "partenaires/fichePartenaire";
	}

	@RequestMapping("/index.html")
	public String indexhtml() {

		return "index";
	}

	@RequestMapping("/contact.html")
	public String contact() {

		return "contact";
	}

	@RequestMapping("/informationsPersonnelles.html")
	public String informationsPersonnelles() {

		return "informationsPersonnelles";
	}

	@RequestMapping("/bin.html")
	public String bin() {

		return "bin";
	}

	

	@RequestMapping("/partenaires.html")
	public String partenaires(Model model) {

		Iterable<Partenaire> listPartenaires = partenaireRepository.findAll();
		model.addAttribute("listPartenaires", listPartenaires);

		return "partenaires/partenaires";
	}
	
	@RequestMapping("/createPartenaire")
	public String formulairePartenaire() {

		return "partenaires/formulairePartenaire";
	}
	
	@PostMapping("/savePartenaire")
	public String savePartenaire(@RequestParam String nom) {
	
		Partenaire partenaire = new Partenaire(null, null, null, null, null, null, null);
		partenaire.setNom(nom);
		partenaireService.savePartenaire(partenaire);
		return ("partenaires/partenaires");
	}

	public static void main(String[] args) {
		SpringApplication.run(CardprogramApplication.class, args);
	}

}
