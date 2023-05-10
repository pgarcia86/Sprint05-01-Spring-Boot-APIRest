package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n02.model.domain.FlorEntity;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n02.model.services.FlorService;

@RestController
@RequestMapping("/flor")
public class FlorController {
	
	@Autowired
	private FlorService flor;
	
	@GetMapping("/getAll")
	public ResponseEntity<List<FlorEntity>> getAll() {
		
		return new ResponseEntity<>(flor.getAll(), HttpStatus.OK);
		
	}
	
	@GetMapping("/getOne/{id}")
	public ResponseEntity<FlorEntity> getOne(@PathVariable("id") int id){
		
		return new ResponseEntity<FlorEntity>(flor.getOne(id), HttpStatus.OK);
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") int id){
		
		return new ResponseEntity<String>(flor.deleteById(id), HttpStatus.OK);
	}
	
	@PostMapping("/add/{name}/{country}")
	public ResponseEntity<FlorEntity> add(@PathVariable("name") String name, @PathVariable("country") String country){
				
		return new ResponseEntity<FlorEntity>(flor.add(name, country), HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{id}/{name}")
	public ResponseEntity<FlorEntity> update(@PathVariable("id") int id, @PathVariable("name") String name){
		
		return new ResponseEntity<FlorEntity>(flor.update(id, name), HttpStatus.OK);
		
	}

}
