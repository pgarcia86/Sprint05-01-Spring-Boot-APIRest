package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.services.SucursalService;


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
	
	
	@GetMapping("/getOne/{id}")
	private String getOne(@PathVariable("id") int id, Model model) {
		
		
		model.addAttribute("sucursal", sucursal.getOne(id));
		
		return "getOnePage";
	}
	
	
	@PostMapping("/add/{name}/{country}")
	private String add(@PathVariable("name") String name, @PathVariable("country") String country, Model model) {
		
		Sucursal newSucursal = new Sucursal(name, country);
		sucursal.add(newSucursal);
		model.addAttribute("newSucursal", newSucursal);
		
		return "addPage";
	}
	
	
	@DeleteMapping("/delete/{id}")
	private String delete(@PathVariable("id") int id, Model model) {
		
		sucursal.deleteById(id);
		model.addAttribute("id", id);
		
		return "deletePage";
	}
	
	
	@PutMapping("/update/{id}/{newName}")
	private String update(@PathVariable("id") int id, @PathVariable("newName") String newName, Model model) {
		
		sucursal.updateName(id, newName);
		
		model.addAttribute("id", id);
		model.addAttribute("newName", newName);
		
		return "updatePage";
	}
	

}
