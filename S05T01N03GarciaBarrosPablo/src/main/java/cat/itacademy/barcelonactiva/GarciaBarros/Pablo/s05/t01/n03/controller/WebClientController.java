package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n02.model.domain.FlorEntity;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n03.services.WebClientService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


/*
 * 
 * 
 * 
 * FALTA MANEJAR LAS EXCEPCIONES
 * 
 * 
 * 
 *  
 * 
 * */



@RestController
@RequestMapping("/client")
public class WebClientController {
	
	@Autowired
	WebClientService webService;
	
	
	@GetMapping("/flor/all")
	public Flux<FlorEntity> getAll(){
		
		return webService.findFlor();
	}
	
	@GetMapping("/flor/getOne/{id}")
	public Mono<FlorEntity> getOne(@PathVariable("id") int id){
		
		return webService.findOne(id);
	}
	
	
	
	@PostMapping("/flor/add/{name}/{country}")
	public Mono<FlorEntity> add(@PathVariable("name") String name, @PathVariable("country") String country){
		
		return webService.add(name, country);
	}
	
	@PutMapping("/flor/update/{id}/{name}")
	public Mono<FlorEntity> update(@PathVariable("id") Integer id, @PathVariable("name") String name){
		
		return webService.update(id, name);
	}
	
	@DeleteMapping("/flor/delete/{id}")
	public Mono<Void> delete(@PathVariable("id") Integer id) {
		
		return this.webService.delete(id);
	}
	
	
	
	

}
