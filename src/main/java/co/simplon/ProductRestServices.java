package co.simplon;


import co.simplon.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.entities.Product;
import co.simplon.dao.ProductRepository;

import java.util.List;
@CrossOrigin("*")
@RestController
public class ProductRestServices {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping(value = "/listProducts")
    public List<Product> listProducts() {
        return productRepository.findAll();
    }

    @GetMapping(value = "/listProducts/{id}")
    public Product listProducts(@PathVariable(name = "id") Long id) {
        return productRepository.findById(id).get();
    }

    @PutMapping(value = "/listProducts/{id}")
    public Product update(@PathVariable(name = "id") Long id, @RequestBody Product p) {
        p.setId(id);
        return productRepository.save(p);
    }

    @PostMapping(value = "/listProducts")
    public Product save(@RequestBody Product p) {
        return productRepository.save(p);
    }
    @DeleteMapping(value = "/listProducts/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        productRepository.deleteById(id);
    }
}
