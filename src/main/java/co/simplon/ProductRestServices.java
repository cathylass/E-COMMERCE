package co.simplon;


import co.simplon.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import co.simplon.entities.Product;
import co.simplon.dao.ProductRepository;

import java.util.List;
@CrossOrigin("*")
@RestController
public class ProductRestServices {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping(value = "/listProduct")
    public List<Product> listProduct() {
        return productRepository.findAll();
    }

    @GetMapping(value = "/listProduct/{id}")
    public List<Product> listProduct(@PathVariable(name = "id") Long id) {
        return (List<Product>) productRepository.findById(id).get();
    }

    @PutMapping(value = "/listProduct/{id}")
    public Product update(@PathVariable(name = "id") Long id, @RequestBody Product p) {
        p.setId(id);
        return productRepository.save(p);
    }

    @PostMapping(value = "/listProduct")
    public Product save(@RequestBody Product p) {
        return productRepository.save(p);
    }
    @DeleteMapping(value = "/listProduct/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        productRepository.deleteById(id);
    }
}
