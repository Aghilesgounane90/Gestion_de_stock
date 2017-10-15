package com.stock.de;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import com.stock.de.dao.impl.FlickrDaoImpl;

public class Test {

	public static void main(String[] args) {
	FlickrDaoImpl flickr = new FlickrDaoImpl();
	flickr.auth();
	try {
		InputStream Stream = new FileInputStream(new File("C:\\projet gestion de stock\\121.jpg"));
		String url= flickr.savePhoto(Stream, "nature");
		System.out.println(url);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}

}
