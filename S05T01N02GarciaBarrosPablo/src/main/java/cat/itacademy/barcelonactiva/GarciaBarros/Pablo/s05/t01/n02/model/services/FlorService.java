package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n02.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n02.model.domain.FlorEntity;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n02.model.repository.IFlor;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n02.controller.exceptions.*;


@Service
public class FlorService implements IFlorService{
	
	@Autowired 
	private IFlor flor;

	
	@Override
	public List<FlorEntity> getAll() {
		
		return flor.findAll();
	}
	
	public boolean findById(int id) {
		
		if(id <= 0) {
			throw new NotValidIdException("EL ID DEBE SER MAYOR A 0 - ID = " + id);
		}
		else if(flor.existsById(id) == false) {
			throw new NotFoundIdException("EL ID INGRESADO NO EXISTE - ID = " + id);
		}
		else {
			return true;
		}
		
	}

	
	@Override
	public FlorEntity getOne(int id) {
		
		if(findById(id) == true) {
			return flor.getReferenceById(id);
		}
		return null;
		
	}


	@Override
	public String deleteById(int id) {
		
		if(findById(id) == true) {
			flor.deleteById(id);
			return "Se elimino el registro con ID = " + id;
		}
		else {
			throw new CannotDeleteException("NO SE PUEDE ELIMINAR EL REGISTRO CON ID = " + id);
		}
	}

	@Override
	public FlorEntity add(String name, String country) {
		
		FlorEntity newFlor = new FlorEntity(name, country);
		flor.save(newFlor);
		
		return newFlor;
	}

	@Override
	public FlorEntity update(int id, String name) {
		if(findById(id) == true) {
			FlorEntity florAux = flor.getReferenceById(id);
			florAux.setFlorName(name);
			this.flor.save(florAux);
			return this.flor.getReferenceById(id);
		}
		else {
			return null;
			
		}
	}
	
	

}
