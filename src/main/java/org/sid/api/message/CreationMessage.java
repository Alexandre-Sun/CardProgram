package org.sid.api.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CreationMessage {

	@Autowired
	MessageRepository messageRepository;
	
	@RequestMapping(value = "/creationMessage", method = RequestMethod.GET)
	public String displayFormCreationMessage(Model model) {

		model.addAttribute("message", new Message());

		return "/contact";
	}
	
	@PostMapping(value = "/creationMessage")
	public ModelAndView saveformMessage(Model model, Message message) {

		messageRepository.save(message);
		return new ModelAndView("redirect:/contact");

	}
}
