package br.com.projeto.caixa.main;

import br.com.projeto.caixa.Repository.ProductRepository;
import br.com.projeto.caixa.Repository.UserRepository;
import br.com.projeto.caixa.models.Product;
import br.com.projeto.caixa.models.Sale;
import br.com.projeto.caixa.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Component
public class Main {

    private Scanner scanner = new Scanner(System.in);
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;

    private List<User> users = new ArrayList<>();
    private List<Product> products = new ArrayList<>();
    private List<Sale> sales = new ArrayList<>();


    public Main(UserRepository userRepository, ProductRepository productRepository) {
    }

    public void displayMenu(){
        var option = -1;

        var menu = """
                1 - Cadastrar usuário
                2 - Buscar usuários 
                3 - Cadastrar produto
                4 - Buscar produto
                5 - Realizar Venda
                
                0 - Sair
                """;

        while (option != 0){
            System.out.println(menu);
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    createUser();
                    break;
                case 2:
                    searchUsers();
                    break;
                case 3:
                    createProduct();
                    break;
                case 4:
                    searchProducts();
                    break;
                case 5:
                    makeSale();
                    break;
                case 0:
                    System.out.println("Saindo!!");
                    break;
                default:
                    System.out.println("Opção inválida!!!");
                    break;
            }
        }
    }

    public void createUser(){
        System.out.println("Informe o nome do usuário: ");
        var name = scanner.nextLine();
        System.out.println("Informe o email do usuário: ");
        var email = scanner.nextLine();
        System.out.println("Informe a senha do usuário: ");
        var password = scanner.nextLine();

        User user = new User(name, email, password);

        userRepository.save(user);

    }

    public void searchUsers(){
        System.out.println("Informe o nome do usuário que você deseja buscar: ");
        var userName = scanner.nextLine();

        Optional<User> findUser = userRepository.findByNameContainingIgnoreCase(userName);

        if (findUser.isPresent()){
            System.out.println("Usuário encontrado: " + findUser.get());
        } else {
            System.out.println("Usuário não encontrado!!!");
        }
    }

    public void createProduct(){
        System.out.println("Informe o nome do produto: ");
        var name = scanner.nextLine();
        System.out.println("Informe o valor do produto: ");
        var value = scanner.nextDouble();
        scanner.nextLine();

        Product product = new Product(name, value);

        productRepository.save(product);
    }

    public void searchProducts(){
        System.out.println("Informe o nome do produto que você deseja buscar: ");
        var productName = scanner.nextLine();

        Optional<Product> findProduct = productRepository.findByNameContainingIgnoreCase(productName);

        if (findProduct.isPresent()){
            System.out.println("Produto encontrado: " + findProduct.get());
        } else {
            System.out.println("Produto não encontrado!!!");
        }
    }

    public void makeSale(){

        searchUsers();

        LocalDate now = LocalDate.now();

//        Sale sale = new Sale(now, user);

        System.out.println("\n Escolha um dos seguintes produtos\n");

        productRepository.findAll();

        products.forEach(p -> {
            if (!productRepository.existsById(products.get()))
        });



    }
}
