package com.stock.de.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.de.dao.ICommandeClientDao;
import com.stock.de.entites.CommandeClient;
import com.stock.de.services.ICommandeClientService;

@Transactional
public class CommandeClientServiceImpl implements ICommandeClientService {

	private ICommandeClientDao dao;
	public void setDao(ICommandeClientDao dao) {
		this.dao = dao;
	}
	
	@Override
	public CommandeClient save(CommandeClient entity) {
		return dao.save(entity);
	}

	@Override
	public CommandeClient update(CommandeClient entity) {
		return dao.update(entity);
	}

	@Override
	public List<CommandeClient> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<CommandeClient> selectAll(String sortField, String sort) {
		return dao.selectAll();
	}

	@Override
	public CommandeClient getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public CommandeClient findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public CommandeClient findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
