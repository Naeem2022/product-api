package in.ashokit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Product;
import in.ashokit.repository.ProductRepository;

@RestController
public class ProductRestController {
	@Autowired
	private ProductRepository productRepo;
	
	@PostMapping(value="/product",consumes= {"application/json","application/xml"})
	public ResponseEntity<String> addProduct(@RequestBody Product product){
		String message=null;
		productRepo.save(product);
		message="PRODUCT CREATED SUCCESSFULLY";
		return new ResponseEntity<String>(message,HttpStatus.CREATED);
		
	}
	@GetMapping(value="/products",produces= {"application/json","application/xml"})
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> list = productRepo.findAll();
		return new ResponseEntity<List<Product>>(list,HttpStatus.OK);
	}

}
