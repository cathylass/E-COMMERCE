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



		productRepository.save(new Product(null,"Vélo electrique",1567,5));
		productRepository.save(new Product(null,"Vélo ",324,10));
		productRepository.save(new Product(null,"Trotinette electrique",231,6));
		productRepository.save(new Product(null,"Trotinette",53,15));
		productRepository.save(new Product(null,"casque",39,40));
		productRepository.save(new Product(null,"Moto",8564,8));
		productRepository.save(new Product(null,"Blouson",456,50));
		productRepository.save(new Product(null,"gants ",78,100));
		productRepository.save(new Product(null,"Combinaison",289,39));
		productRepository.save(new Product(null,"Echarpe",22,47));
		productRepository.save(new Product(null,"Veste-thermique",95,40));
		productRepository.save(new Product(null,"Collants-laine",16,95));
		productRepository.save(new Product(null,"Chaussettes",15,205));
		productRepository.save(new Product(null,"Pull",66,47));
		productRepository.save(new Product(null,"Vélo electrique",2567,5));
		productRepository.save(new Product(null,"Vélo ",1324,10));
		productRepository.save(new Product(null,"Trotinette electrique",300,16));
		productRepository.save(new Product(null,"Trotinette",64,15));
		productRepository.save(new Product(null,"casque",123,50));
		productRepository.save(new Product(null,"Moto",5634,18));
		productRepository.save(new Product(null,"Blouson",377,50));
		productRepository.save(new Product(null,"gants ",33,150));
		productRepository.save(new Product(null,"Combinaison",178,39));
		productRepository.save(new Product(null,"Echarpe",29,47));
		productRepository.save(new Product(null,"Veste-thermique",120,50));
		productRepository.save(new Product(null,"Collants-laine",17,95));
		productRepository.save(new Product(null,"Chaussettes",10,205));
		productRepository.save(new Product(null,"Pull",23,47));
		productRepository.save(new Product(null,"Vélo electrique",1567,5));
		productRepository.save(new Product(null,"Vélo ",324,10));
		productRepository.save(new Product(null,"Trotinette electrique",231,6));
		productRepository.save(new Product(null,"Trotinette",53,15));
		productRepository.save(new Product(null,"casque",39,40));
		productRepository.save(new Product(null,"Moto",8564,8));
		productRepository.save(new Product(null,"Blouson",456,50));
		productRepository.save(new Product(null,"gants ",78,100));
		productRepository.save(new Product(null,"Combinaison",289,39));
		productRepository.save(new Product(null,"Echarpe",22,47));
		productRepository.save(new Product(null,"Veste-thermique",95,40));
		productRepository.save(new Product(null,"Collants-laine",16,95));
		productRepository.save(new Product(null,"Chaussettes",15,205));
		productRepository.save(new Product(null,"Pull",66,47));
		productRepository.save(new Product(null,"Vélo electrique",2567,5));
		productRepository.save(new Product(null,"Vélo ",1324,10));
		productRepository.save(new Product(null,"Trotinette electrique",300,16));
		productRepository.save(new Product(null,"Trotinette",64,15));
		productRepository.save(new Product(null,"casque",123,70));
		productRepository.save(new Product(null,"Moto",5634,17));
		productRepository.save(new Product(null,"Blouson",377,150));
		productRepository.save(new Product(null,"gants ",33,50));
		productRepository.save(new Product(null,"Combinaison",178,139));
		productRepository.save(new Product(null,"Echarpe",29,40));
		productRepository.save(new Product(null,"Veste-thermique",120,150));
		productRepository.save(new Product(null,"Collants-laine",17,195));
		productRepository.save(new Product(null,"Chaussettes",10,405));
		productRepository.save(new Product(null,"Pull",23,69));
		productRepository.findAll().forEach(p->{
			System.out.println(p.toString());
		});









	}
}
