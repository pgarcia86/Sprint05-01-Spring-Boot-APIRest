package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.services.SucursalService;







/*
 * 
 * 
 * 
 * 
 * 
 * SUCURSAL NO TIENE QUE HEREDAR DE SUCURSAL DTO. DEBO DUPLICAR LOS REGISTROS
 * 
 * 
 * 
 * 
 * 
 */







@Controller
@RequestMapping("/sucursal")
public class SucursalController {
	
	@Autowired
	private SucursalService sucursal;
	
	@GetMapping("/getAll")
	private String getAll(Model model) {
		
		List<Sucursal> sucursales = sucursal.getAll();
		model.addAttribute("sucursales", sucursales);
		return "getAllPage";
	}
	
	
	@PostMapping("/add/{name}/{country}")
	private String add(@PathVariable("name") String name, @PathVariable("country") String country, Model model) {
		
		Sucursal newSucursal = new Sucursal(name, country);
		sucursal.add(newSucursal);
		model.addAttribute("name", name);
		model.addAttribute("country", country);
		
		return "addPage";
	}
	

}
