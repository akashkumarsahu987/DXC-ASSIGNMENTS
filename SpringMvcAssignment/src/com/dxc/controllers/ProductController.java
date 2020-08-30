package com.dxc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dxc.beans.Product;
import com.dxc.repository.ProductRepo;

@Controller
public class ProductController {

	@Autowired
	ProductRepo productRepo;

	@RequestMapping("/")
	public String display() {
		return "index";
	}

	@RequestMapping("/addproduct")
	public ModelAndView showform() {
		return new ModelAndView("addproduct", "command", new Product());
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("product") Product product) {
		productRepo.addProduct(product);// add product to repo
		return new ModelAndView("redirect:/viewproducts");
	}

	@RequestMapping("/viewproducts")
	public ModelAndView vieProducts() {
		return new ModelAndView("viewproducts", "list", productRepo.getProducts());
	}

	@RequestMapping("/delproduct")
	public String displayDelProducts() {
		
		return "delproduct";
	}
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delProducts() {//get the form id as parameter
		
		// write logic to delete product from repo
		
		return "delproduct";
	}	
	
}
