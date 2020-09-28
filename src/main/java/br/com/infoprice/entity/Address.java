package br.com.infoprice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", columnDefinition = "int")
	private long id;
	
	@Column(name = "place_public")
    private String placePublic;
	
	@Column(name = "number")
    private Integer number;
	
	@Column(name = "complement")
    private String complement;
	
	@Column(name = "neighborhood")
    private String neighborhood;
	
	@Column(name = "cep")
    private String cep;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City cityId;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User userId;
	
	public Address(){
        this(new Long(0));
    }
	
	public Address(Long id){
        this.id = id;
        this.placePublic = "";
        this.number = 0;
        this.complement = "";
        this.neighborhood = "";
        this.cep = "";
        this.cityId = new City();
        this.userId = new User();
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPlacePublic() {
		return placePublic;
	}

	public void setPlacePublic(String placePublic) {
		this.placePublic = placePublic;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public City getCityId() {
		return cityId;
	}

	public void setCityId(City cityId) {
		this.cityId = cityId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}
	
	
}
