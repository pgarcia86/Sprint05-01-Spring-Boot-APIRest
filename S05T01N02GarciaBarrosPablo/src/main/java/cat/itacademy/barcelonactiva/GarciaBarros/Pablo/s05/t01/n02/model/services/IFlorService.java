package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n02.model.services;

import java.util.List;

import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n02.model.domain.FlorEntity;

public interface IFlorService {
	
	public List<FlorEntity> getAll();
	
	public FlorEntity getOne(int id);
	
	public String deleteById(int id);
	
	public FlorEntity add(String name, String country);
	
	public FlorEntity update(int id, String country);

}
