package org.sid.api.partenaire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CreationPartenaire {

	@Autowired
	PartenaireRepository partenaireRepository;

	// Page pour afficher le formulaire de creation d'un partenaire

	@RequestMapping(value = "/creationPartenaire", method = RequestMethod.GET)
	public String displayFormCreationPartenaire(Model model) {

		model.addAttribute("partenaire", new Partenaire());

		return "partenaires/formulairePartenaire";
	}

	// action de sauvegarde du partenaire.

	@PostMapping(value = "/creationPartenaire")
	public ModelAndView saveformPartenaire(Model model, Partenaire partenaire) {

		partenaireRepository.save(partenaire);
		return new ModelAndView("redirect:/partenaires");

	}

}
