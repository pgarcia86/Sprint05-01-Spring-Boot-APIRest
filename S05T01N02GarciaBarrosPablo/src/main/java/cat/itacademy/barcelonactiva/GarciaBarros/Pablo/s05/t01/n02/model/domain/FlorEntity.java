package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n02.model.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "Flores_Entity")
public class FlorEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "florId")
	private Integer pk_FlorId;
	
	@Column(name = "florName")
	private String florName;
	
	@Column(name = "florCountry")
	private String florCountry;
	
	public FlorEntity(String name, String country) {
		this.florName = name;
		this.florCountry = country;
	}
	
	public FlorEntity() {}

	public Integer getPk_FlorId() {
		return pk_FlorId;
	}

	public void setPk_FlorId(Integer pk_FlorId) {
		this.pk_FlorId = pk_FlorId;
	}

	public String getFlorName() {
		return florName;
	}

	public void setFlorName(String florName) {
		this.florName = florName;
	}

	public String getFlorCountry() {
		return florCountry;
	}

	public void setFlorCountry(String florCountry) {
		this.florCountry = florCountry;
	}
	
	
	

}
