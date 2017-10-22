package com.stock.de.controllers;

import com.stock.de.entites.Client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.de.services.IClientService;
@Controller
@RequestMapping(value="/client")
public class ClientController {

	@Autowired
	public IClientService clientService;
	
	@RequestMapping(value="/")
	public String Client(Model model){
		List<Client> clients = clientService.selectAll(); 
		if(clients ==null){
			clients = new ArrayList<Client>();
		}
		model.addAttribute("Clients", clients);
		return "client/client";
	}
}
