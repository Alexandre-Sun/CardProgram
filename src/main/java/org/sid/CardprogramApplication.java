package org.sid;

import org.sid.api.bin.Bin;
import org.sid.api.bin.BinRepository;
import org.sid.api.partenaire.Partenaire;
import org.sid.api.partenaire.PartenaireRepository;
import org.sid.api.partenaire.PartenaireService;
import org.sid.api.utilisateur.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	PartenaireService partenaireService;

	@RequestMapping("/template.html")
	public String template() {

		return "template";
	}

	@RequestMapping("/")
	public String index() {

		return "index";
	}

	/*@RequestMapping("/fichePartenaire")
	public ModelAndView getPartenaire(@PathVariable("id") final Long id) {

		partenaireService.getPartenaire(id);
		
		return new ModelAndView ("partenaires/fichePartenaire");
	}
	*/
	
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

		return "contacts/contact";
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
