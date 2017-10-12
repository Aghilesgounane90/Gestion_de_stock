package com.stock.de.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.de.dao.ILigneCdeFournisseurDao;
import com.stock.de.entites.LigneCdeFournisseur;
import com.stock.de.services.ILigneCdeFournisseurService;

@Transactional
public class LigneCdeFournisseurServiceImpl implements ILigneCdeFournisseurService {

	 private ILigneCdeFournisseurDao dao;
	public void setDao(ILigneCdeFournisseurDao dao) {
		this.dao = dao;
	}
	 
	@Override
	public LigneCdeFournisseur save(LigneCdeFournisseur entity) {
		return dao.save(entity);
	}

	@Override
	public LigneCdeFournisseur update(LigneCdeFournisseur entity) {
		return dao.update(entity);
	}

	@Override
	public List<LigneCdeFournisseur> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<LigneCdeFournisseur> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public LigneCdeFournisseur getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public LigneCdeFournisseur findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public LigneCdeFournisseur findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
