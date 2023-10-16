package org.sid.api.partenaire;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/partenaires")
@Controller
public class PartenaireController {

	@Autowired
	private PartenaireService partenaireService;

	@Autowired
	private PartenaireRepository partenaireRepository;

	@GetMapping("/deletePartenaire/{id}")
	public ModelAndView deletePartenaire(@PathVariable("id") final Long id) {
		partenaireService.deletePartenaire(id);
		return new ModelAndView("redirect:/partenaires");
	}

	@GetMapping("/fichePartenaire/{id}")
	public String afficherPartenaire(@PathVariable Long id, Model model) {

		Optional<Partenaire> part = partenaireRepository.findById(id);
		Partenaire partenaire = part.get();
		model.addAttribute("partenaire", partenaire);
		
		return "partenaires/fichePartenaire";

	}
}
