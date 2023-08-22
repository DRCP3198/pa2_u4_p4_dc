package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.example.demo.modelo.Propietario;
import com.example.demo.repository.IPropietarioRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional.TxType;

@Repository
@jakarta.transaction.Transactional
public class PropietarioServiceImpl implements IPropietarioService{
	
	@Autowired
	private IPropietarioRepo iPropietarioRepo;

	@Override
	@jakarta.transaction.Transactional(value = TxType.REQUIRED)
	public void agregar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.iPropietarioRepo.insertar(propietario);
	}

	@Override
	@jakarta.transaction.Transactional(value = TxType.REQUIRED)
	public void modificar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.iPropietarioRepo.actualizar(propietario);
	}

	@Override
	@jakarta.transaction.Transactional(value = TxType.REQUIRED)
	public Propietario encontrarId(Integer id) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepo.buscarId(id);
	}

	@Override
	@jakarta.transaction.Transactional(value = TxType.REQUIRED)
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iPropietarioRepo.eliminar(id);
	}

	@Override
	public List<Propietario> reporte() {
		// TODO Auto-generated method stub
		return this.iPropietarioRepo.buscarTodos();
	}

	

}
