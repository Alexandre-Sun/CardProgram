package org.sid.api.utilisateur;

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
@Table(name="utilisateurs")
public class Utilisateur {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String civilite;
	private String date_naissance;
	private String adresse_mail;
	private String adresse_postale;
	private String mot_de_passe;
	private String poste;
	private String equipe;
	private String role;
	
	Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	Utilisateur(Long id, String nom, String prenom, String civilite, String date_naissance, String adresse_mail,
			String adresse_postale, String mot_de_passe, String poste, String equipe, String role) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.civilite = civilite;
		this.date_naissance = date_naissance;
		this.adresse_mail = adresse_mail;
		this.adresse_postale = adresse_postale;
		this.mot_de_passe = mot_de_passe;
		this.poste = poste;
		this.equipe = equipe;
		this.role = role;
	}
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
	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	public String getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getAdresse_mail() {
		return adresse_mail;
	}
	public void setAdresse_mail(String adresse_mail) {
		this.adresse_mail = adresse_mail;
	}
	public String getAdresse_postale() {
		return adresse_postale;
	}
	public void setAdresse_postale(String adresse_postale) {
		this.adresse_postale = adresse_postale;
	}
	public String getMot_de_passe() {
		return mot_de_passe;
	}
	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public String getEquipe() {
		return equipe;
	}
	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
