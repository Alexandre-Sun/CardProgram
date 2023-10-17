package org.sid.api.partenaire;

import jakarta.persistence.Column;
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
@Table(name = "partenaires")
public class Partenaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	@Column
	public String nom;

	@Column
	public String numero_siret;

	@Column
	public String date_contrat;

	@Column
	public String adresse_mail;

	@Column
	public String siege_social;

	@Column
	public String secteur_activite;

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

	public String getNumero_siret() {
		return numero_siret;
	}

	public void setNumero_siret(String numero_siret) {
		this.numero_siret = numero_siret;
	}

	public String getDate_contrat() {
		return date_contrat;
	}

	public void setDate_contrat(String date_contrat) {
		this.date_contrat = date_contrat;
	}

	public String getAdresse_mail() {
		return adresse_mail;
	}

	public void setAdresse_mail(String adresse_mail) {
		this.adresse_mail = adresse_mail;
	}

	public String getSiege_social() {
		return siege_social;
	}

	public void setSiege_social(String siege_social) {
		this.siege_social = siege_social;
	}

	public String getSecteur_activite() {
		return secteur_activite;
	}

	public void setSecteur_activite(String secteur_activite) {
		this.secteur_activite = secteur_activite;
	}
}
