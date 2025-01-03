package br.com.projeto.caixa;

import br.com.projeto.caixa.Repository.ProductRepository;
import br.com.projeto.caixa.Repository.UserRepository;
import br.com.projeto.caixa.main.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CaixaApplication implements CommandLineRunner {
	@Autowired
	UserRepository userRepository;
	@Autowired
	ProductRepository productRepository;
	@Autowired
	Main main = new Main(userRepository, productRepository);

	public static void main(String[] args) {
		SpringApplication.run(CaixaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		main.displayMenu();
	}
}
