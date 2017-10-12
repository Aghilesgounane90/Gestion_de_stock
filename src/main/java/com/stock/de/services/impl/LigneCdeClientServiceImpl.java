package com.stock.de.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.de.dao.ILigneCdeClientDao;
import com.stock.de.entites.LigneCdeClient;
import com.stock.de.services.ILigneCdeClientService;

@Transactional
public class LigneCdeClientServiceImpl implements ILigneCdeClientService {

	private ILigneCdeClientDao dao;
	public void setDao(ILigneCdeClientDao dao) {
		this.dao = dao;
	}
	
	@Override
	public LigneCdeClient save(LigneCdeClient entity) {
		return dao.save(entity);
	}

	@Override
	public LigneCdeClient update(LigneCdeClient entity) {
		return dao.update(entity);
	}

	@Override
	public List<LigneCdeClient> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<LigneCdeClient> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public LigneCdeClient getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public LigneCdeClient findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public LigneCdeClient findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
