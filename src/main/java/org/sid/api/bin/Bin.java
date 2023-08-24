package org.sid.api.bin;

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
@Table(name = "bin")
public class Bin {
		
	//BIN
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String emetteur_banque;
	private String bin8;
	private String pan_range;
	private String status;


	//CARD PROGRAM
	private String région;
	private String pays;
	private String compte;
	
	//VISA PLATFORM
	private String platform;
	private String funding_source;
	private String p_v_c;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmetteur_banque() {
		return emetteur_banque;
	}
	public void setEmetteur_banque(String emetteur_banque) {
		this.emetteur_banque = emetteur_banque;
	}
	public String getBin8() {
		return bin8;
	}
	public void setBin8(String bin8) {
		this.bin8 = bin8;
	}
	public String getPan_range() {
		return pan_range;
	}
	public void setPan_range(String pan_range) {
		this.pan_range = pan_range;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRégion() {
		return région;
	}
	public void setRégion(String région) {
		this.région = région;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getCompte() {
		return compte;
	}
	public void setCompte(String compte) {
		this.compte = compte;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getFunding_source() {
		return funding_source;
	}
	public void setFunding_source(String funding_source) {
		this.funding_source = funding_source;
	}
	public String getP_v_c() {
		return p_v_c;
	}
	public void setP_v_c(String p_v_c) {
		this.p_v_c = p_v_c;
	}
	Bin(Long id, String emetteur_banque, String bin8, String pan_range, String status, String région, String pays,
			String compte, String platform, String funding_source, String p_v_c) {
		super();
		this.id = id;
		this.emetteur_banque = emetteur_banque;
		this.bin8 = bin8;
		this.pan_range = pan_range;
		this.status = status;
		this.région = région;
		this.pays = pays;
		this.compte = compte;
		this.platform = platform;
		this.funding_source = funding_source;
		this.p_v_c = p_v_c;
	}
	Bin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
