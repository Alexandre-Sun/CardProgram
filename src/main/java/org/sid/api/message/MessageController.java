package org.sid.api.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class MessageController {
	
	@Autowired
	private MessageService messageService;
	
	@GetMapping("/listMessages")
	public Iterable<Message> getMessage() {
		return messageService.getMessages();
	}

}
