package com.stock.de.services;

import java.io.InputStream;

public interface IFlackrService {

	public String savePhoto(InputStream photo,String title) throws Exception;
}
