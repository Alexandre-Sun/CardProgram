package org.sid;

import org.sid.api.bin.Bin;
import org.sid.api.bin.BinRepository;
import org.sid.api.bin.BinService;
import org.sid.api.partenaire.Partenaire;
import org.sid.api.partenaire.PartenaireRepository;
import org.sid.api.utilisateur.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class CardprogramApplication {

	@Autowired
	UtilisateurRepository utilisateurRepository;

	@Autowired
	PartenaireRepository partenaireRepository;
	
	@Autowired
	BinRepository binRepository;
	
	@Autowired
	private BinService binService;

	@RequestMapping("/template.html")
	public String template() {

		return "template";
	}

	@RequestMapping("/")
	public String index() {

		return "index";
	}

	@RequestMapping("/fichePartenaire")
	public String fichePartenaire() {

		return "partenaires/fichePartenaire";
	}

	@RequestMapping("/index")
	public String indexhtml() {

		return "index";
	}
	
	@RequestMapping("/bin")
	public String bin(Model model) {

		Iterable<Bin> listBins = binRepository.findAll();
		model.addAttribute("listBins", listBins);	
		
		
		
		return "bins/bin";
	}
	
	@RequestMapping("/gestionBin")
	public String gestionBin() {

		return "bins/gestionBin";
	}

	@RequestMapping("/contact")
	public String contact() {

		return "contact";
	}

	@RequestMapping("/informationsPersonnelles")
	public String informationsPersonnelles() {

		return "informationsPersonnelles";
	}

	

	@RequestMapping("/partenaires")
	public String partenaires(Model model) {

		Iterable<Partenaire> listPartenaires = partenaireRepository.findAll();
		model.addAttribute("listPartenaires", listPartenaires);

		return "partenaires/partenaires";
	}



	public static void main(String[] args) {
		SpringApplication.run(CardprogramApplication.class, args);
	}

}
