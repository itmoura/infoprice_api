package br.com.infoprice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", columnDefinition = "int")
	private long id;
	
	@Column(name = "name")
    private String name;
	
	@Column(name = "ibge")
    private String ibge;
	
	@Column(name = "uf")
    private String uf;
	
	public City(){
        this(new Long(0));
    }

	public City(Long id) {
		this.id = id;
		this.name = "";
		this.ibge = "";
		this.uf = "";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIbge() {
		return ibge;
	}

	public void setIbge(String ibge) {
		this.ibge = ibge;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
}
