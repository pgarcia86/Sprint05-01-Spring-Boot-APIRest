package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.dto.SucursalDTO;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.repository.ISucursal;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.repository.ISucursalDTO;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.controller.exceptions.NotFoundIdException;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.controller.exceptions.NotValidIdException;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.controller.exceptions.CannotDeleteException;

@Service
public class SucursalService implements ISucursalService{
	
	
	@Autowired
	private ISucursal sucursal;
	
	@Autowired
	private ISucursalDTO sucursalDTO;

	@Override
	public List<Sucursal> getAll() {
		return sucursal.findAll();
	}

	@Override
	public void add(Sucursal newSucursal) {
		
		sucursal.save(newSucursal);		
		sucursalDTO.save(new SucursalDTO(newSucursal.getPk_SucursalId(), newSucursal.getSucursalName(), newSucursal.getSucursalCountry()));
	}

	@Override
	public Sucursal getOne(int id) {
		
		if(findById(id) == true) {
			return sucursal.getReferenceById(id);
		}
		return null;
	}

	@Override
	public void deleteById(int id) {
		
		if(findById(id) == true){
			sucursal.deleteById(id);
			sucursalDTO.deleteById(id);
		}	
		else {
			throw new CannotDeleteException("No se pudo eliminar el registro");
		}
	}

	@Override
	public void updateName(int id, String newName) {
		
		Sucursal sucursalAux = sucursal.getReferenceById(id);
		SucursalDTO sucursalDTOAux = sucursalDTO.getReferenceById(id);
		
		sucursalAux.setSucursalName(newName);
		sucursalDTOAux.setSucursalName(newName);
		
		this.sucursal.save(sucursalAux);
		this.sucursalDTO.save(sucursalDTOAux);
		
	}
	
	
	public boolean findById(int id) {
		
		if(id <= 0) {
			throw new NotValidIdException("El ID debe ser mayor a cero - ID = " + id);
		}
		else if(sucursal.existsById(id) == false) {
			throw new NotFoundIdException("El ID no esta cargado en la Base de Datos - ID = " + id);
		}
		else {
			return true;
		}
	}
	
	
	
	
	
	
	

}
