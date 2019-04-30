package pe.com.falabella.cosmosdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import pe.com.falabella.cosmosdb.model.Product;
import pe.com.falabella.cosmosdb.service.ProductService;

@Slf4j
@RestController
@RequestMapping("api/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping(value="/findByName/{name}")
	public List<Product> findProductByName(@PathVariable("name")String name){
		return productService.findProductByName(name);
	}

	@PostMapping(value="/create")
	public Product createProduct(@RequestBody Product product){
		return productService.createProduct(product);
	}
	
	@PostMapping(value="/delete/{name}")
	public void deleteProduct(@PathVariable("name")String name){
		 productService.deleteProduct(name);
	}
}
