package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.dto;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;


@Entity
@Table(name = "sucursal")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class SucursalDTO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_sucursal")
	private int pk_SucursalId;
	
	@Column(name = "SucursalName")
	private String sucursalName;
	
	@Column(name = "SucursalCountry")
	private String sucursalCountry;

	@Column(name = "SucursalType")
	private String sucursalType;
	
	
	private final List<String> UE_CONTRIES = List.of("Alemania", "Bélgica", "Croacia", "Dinamarca", "España", "Francia", 
			"Irlanda", "Letonia", "Luxemburgo",	"Países Bajos", "Suecia", "Bulgaria", "Eslovaquia", "Estonia", "Grecia",
			"Malta", "Polonia", "República Checa", "Austria", "Chipre", "Eslovenia", "Finlandia", "Hungría", "Italia", 
			"Lituania", "Portugal", "Rumanía");
	
	public SucursalDTO() {}
	
	public SucursalDTO(String name, String country) {
		this.sucursalName = name;
		this.sucursalCountry = country;
	}
	
	

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

	public String getSucursalType() {
		return sucursalType;
	}

	public void setSucursalType(String sucursalType) {
		this.sucursalType = sucursalType;
	}

}
