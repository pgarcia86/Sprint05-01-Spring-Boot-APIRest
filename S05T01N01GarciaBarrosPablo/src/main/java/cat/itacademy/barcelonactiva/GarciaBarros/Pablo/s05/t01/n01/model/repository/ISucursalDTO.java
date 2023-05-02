package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.model.dto.SucursalDTO;

@Repository
public interface ISucursalDTO extends JpaRepository<SucursalDTO, Integer>{

}
