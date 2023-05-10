package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n02.model.DTO;

import java.util.List;


public class FlorDTO {
	
	private static final List<String> UE_CONTRIES = List.of("Alemania", "Bélgica", "Croacia", "Dinamarca", "España", "Francia", 
			"Irlanda", "Letonia", "Luxemburgo",	"Países Bajos", "Suecia", "Bulgaria", "Eslovaquia", "Estonia", "Grecia",
			"Malta", "Polonia", "República Checa", "Austria", "Chipre", "Eslovenia", "Finlandia", "Hungría", "Italia", 
			"Lituania", "Portugal", "Rumanía");
	
	
	private Integer pk_FloriId;
	
	private String florName;
	
	private String florCountry;
	
	private String florType;
	
	public FlorDTO(String name, String country) {
		this.florName = name;
		this.florCountry = country;
		setFlorType(this.florType);
	}
	
	
	
	public Integer getPk_FloriId() {
		return pk_FloriId;
	}

	public void setPk_FloriId(Integer pk_FloriId) {
		this.pk_FloriId = pk_FloriId;
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

	public String getFlorType() {
		return florType;
	}


	public void setFlorType(String florType) {		
		
		if(UE_CONTRIES.contains(this.florType)) {
			this.florType = "UE";
		}
		else {
			this.florType = "Fuera UE";
		}
	}

}
