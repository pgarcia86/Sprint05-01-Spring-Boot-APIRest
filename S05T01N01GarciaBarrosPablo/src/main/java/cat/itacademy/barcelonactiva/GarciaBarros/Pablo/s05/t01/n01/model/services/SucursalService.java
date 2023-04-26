package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.repository.ISucursal;

@Service
public class SucursalService implements ISucursalService{
	
	
	@Autowired
	private ISucursal sucursal;

	@Override
	public List<Sucursal> getAll() {
		return sucursal.findAll();
	}

	@Override
	public void add(Sucursal newSucursal) {
		sucursal.save(newSucursal);
	}
	
	public int getId(int id) {
		Sucursal sucursalAux = sucursal.getReferenceById(id);
		return sucursalAux.getPk_SucursalId();
	}
	
	
	
	
	
	
	

}
