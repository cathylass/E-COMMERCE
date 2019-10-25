package co.simplon;

import co.simplon.dao.ProductRepository;
import co.simplon.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class ProjetAngularApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private RepositoryRestConfiguration restConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(ProjetAngularApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		restConfiguration.exposeIdsFor(Product.class);

		//Product p = new Product(null,"toto",12.5,3);

		productRepository.save(new Product(null,"Vélo electrique",1567,5));
		productRepository.save(new Product(null,"Vélo ",324,10));
		productRepository.save(new Product(null,"Trotinette electrique",231,6));
		productRepository.save(new Product(null,"Trotinette",53,15));
		productRepository.save(new Product(null,"casque",39,40));
		productRepository.save(new Product(null,"Moto",8564,8));
		productRepository.save(new Product(null,"scooter ",2842,10));
		productRepository.save(new Product(null,"gants",98,56));
		productRepository.save(new Product(null,"Combinaison",153,73));
		productRepository.save(new Product(null,"casque",39,40));

		productRepository.findAll().forEach(p->{
			System.out.println(p.toString());
		});









	}
}
