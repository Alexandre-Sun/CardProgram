package org.sid.api.partenaire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/partenaires")
public class PartenaireController {

	@Autowired
	private PartenaireService partenaireService;

	@GetMapping("/listPartenaires")
	public Iterable<Partenaire> getPartenaire() {
		return partenaireService.getPartenaires();
	}

	@GetMapping("/deletePartenaire/{id}")
	public ModelAndView deletePartenaire(@PathVariable("id") final Long id) {
		partenaireService.deletePartenaire(id);
		return new ModelAndView("redirect:/");
	}

	
}
