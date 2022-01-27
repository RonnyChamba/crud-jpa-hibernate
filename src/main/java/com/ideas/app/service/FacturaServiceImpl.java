package com.ideas.app.service;

import javax.transaction.Transactional;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ideas.app.jpa.model.Factura;
import com.ideas.app.repository.FacturaRepository;


@Service
@Transactional
public class FacturaServiceImpl implements FacturaService {

	
	@Autowired
	private FacturaRepository facturaRepository;
		
	@Override
	public Iterable<Factura> list() {
		
		return  facturaRepository.findAll();
	}

	@Override
	public Factura buscarById(Integer codigo) {
		
		return  facturaRepository.findById(codigo).orElse(null);
	}

	@Override
	public void delete(Integer codigo) {
		
		facturaRepository.deleteById(codigo);

	}

	@Override
	public void add(Factura factura) {
		
		facturaRepository.save(factura);

	}

	@Override
	public void update(Factura factura) {
		facturaRepository.save(factura);

	}

	@Override
	public Long count() {
		
		return facturaRepository.count();
	}

	
}
