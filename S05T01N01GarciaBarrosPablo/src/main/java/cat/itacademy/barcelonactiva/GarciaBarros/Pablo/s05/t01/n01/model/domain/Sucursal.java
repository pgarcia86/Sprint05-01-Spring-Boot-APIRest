package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sucursal")
public class Sucursal{

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "id_sucursal")
		private int pk_SucursalId;
		
		@Column(name = "sucursalName")
		private String sucursalName;
		
		@Column(name = "sucursalCountry")
		private String sucursalCountry;
	
	
	public Sucursal(String name, String country) {
		this.sucursalName = name;
		this.sucursalCountry = country;
	}
	
	public Sucursal() {}

	public int getPk_SucursalId() {
		return pk_SucursalId;
	}

	public void setPk_SucursalId(int pk_SucursalId) {
		this.pk_SucursalId = pk_SucursalId;
	}

	public String getSucursalName() {
		return sucursalName;
	}

	public void setSucursalName(String sucursalName) {
		this.sucursalName = sucursalName;
	}

	public String getSucursalCountry() {
		return sucursalCountry;
	}

	public void setSucursalCountry(String sucursalCountry) {
		this.sucursalCountry = sucursalCountry;
	}
	
	
	
}
