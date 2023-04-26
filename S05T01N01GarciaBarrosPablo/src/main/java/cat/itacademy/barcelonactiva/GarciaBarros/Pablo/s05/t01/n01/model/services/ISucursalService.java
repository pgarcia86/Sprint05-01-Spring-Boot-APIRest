package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.services;

import java.util.List;

import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.domain.Sucursal;

public interface ISucursalService {
	
	public List<Sucursal> getAll();
	
	public void add(Sucursal newSucursal);

}
