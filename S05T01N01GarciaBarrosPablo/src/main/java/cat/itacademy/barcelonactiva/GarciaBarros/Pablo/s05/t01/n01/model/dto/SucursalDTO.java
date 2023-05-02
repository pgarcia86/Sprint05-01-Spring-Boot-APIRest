package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.dto;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;



@Entity
@Table(name = "sucursalDTO")
public class SucursalDTO {

private static final List<String> UE_CONTRIES = List.of("Alemania", "Bélgica", "Croacia", "Dinamarca", "España", "Francia", 
		"Irlanda", "Letonia", "Luxemburgo",	"Países Bajos", "Suecia", "Bulgaria", "Eslovaquia", "Estonia", "Grecia",
		"Malta", "Polonia", "República Checa", "Austria", "Chipre", "Eslovenia", "Finlandia", "Hungría", "Italia", 
		"Lituania", "Portugal", "Rumanía");

	
	
	@Id
	@Column(name = "id_sucursal")
	
	@PrimaryKeyJoinColumn(name = "id_sucursal")
	private int pk_SucursalId;
	
	@Column(name = "SucursalName")
	private String sucursalName;
	
	@Column(name = "SucursalCountry")
	private String sucursalCountry;

	@Column(name = "SucursalType")
	private String sucursalType;
	
	public SucursalDTO() {}
	
	public SucursalDTO(int id, String name, String country) {
		this.pk_SucursalId = id;
		this.sucursalName = name;
		this.sucursalCountry = country;
		setSucursalType(this.sucursalType);
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
		
		if(UE_CONTRIES.contains(this.sucursalCountry)) {
			this.sucursalType = "UE";
		}
		else {
			this.sucursalType = "Fuera UE";
		}
	}

}
