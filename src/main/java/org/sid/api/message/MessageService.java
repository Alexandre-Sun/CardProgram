package org.sid.api.message;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
public class MessageService {

	@Autowired
	private MessageRepository messageRepository;

	public Optional<Message> getMessage(final Long id) {
		return messageRepository.findById(id);
	}

	public Iterable<Message> getMessages() {
		return messageRepository.findAll();
	}

	public String deleteMessage(final Long id) {
		messageRepository.deleteById(id);
		return "";
	}

	public void saveMessage(Message message) {
		messageRepository.save(message);
		
	}
	
}
