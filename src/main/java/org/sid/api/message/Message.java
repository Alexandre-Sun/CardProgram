package org.sid.api.message;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="messages")
public class Message {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String adresse_mail;
	private String texte;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse_mail() {
		return adresse_mail;
	}
	public void setAdresse_mail(String adresse_mail) {
		this.adresse_mail = adresse_mail;
	}
	public String getTexte() {
		return texte;
	}
	public void setTexte(String texte) {
		this.texte = texte;
	}
	Message(Long id, String nom, String prenom, String adresse_mail, String texte) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse_mail = adresse_mail;
		this.texte = texte;
	}
	Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
