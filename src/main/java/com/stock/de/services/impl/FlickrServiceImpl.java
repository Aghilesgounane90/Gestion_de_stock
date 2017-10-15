package com.stock.de.services.impl;

import java.io.InputStream;

import com.stock.de.dao.IFlickrDao;
import com.stock.de.services.IFlackrService;

public class FlickrServiceImpl implements IFlackrService {

	private IFlickrDao dao;
	public void setDao(IFlickrDao dao) {
		this.dao = dao;
	}
	@Override
	public String savePhoto(InputStream photo, String title) throws Exception {
		return dao.savePhoto(photo, title);
	}
	
	

}
