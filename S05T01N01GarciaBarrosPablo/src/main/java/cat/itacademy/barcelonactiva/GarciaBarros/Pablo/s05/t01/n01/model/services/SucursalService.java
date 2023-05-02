package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.dto.SucursalDTO;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.repository.ISucursal;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.repository.ISucursalDTO;

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
	
	public int getId(int id) {
		Sucursal sucursalAux = sucursal.getReferenceById(id);
		return sucursalAux.getPk_SucursalId();
	}

	@Override
	public Sucursal getOne(int id) {
		
		return sucursal.getReferenceById(id);
		
	}

	@Override
	public void deleteById(int id) {
		
		sucursal.deleteById(id);
		
	}

	@Override
	public void updateName(int id, String newName) {
		
		Sucursal sucursalAux = sucursal.getReferenceById(id);
		
		sucursalAux.setSucursalName(newName);
		
		this.sucursal.save(sucursalAux);
		
	}
	
	
	
	
	
	
	

}
