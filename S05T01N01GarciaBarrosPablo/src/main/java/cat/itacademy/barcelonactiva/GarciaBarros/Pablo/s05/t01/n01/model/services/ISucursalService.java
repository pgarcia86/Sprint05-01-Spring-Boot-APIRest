package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.services;

import java.util.List;

import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.domain.Sucursal;

public interface ISucursalService {
	
	public List<Sucursal> getAll();
	
	public Sucursal getOne(int id);
	
	public void add(Sucursal newSucursal);
	
	public void deleteById(int id);
	
	public void updateName(int id, String newName);
	
	

}
