package br.com.projeto.caixa.Repository;

import br.com.projeto.caixa.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
     Optional<Product> findByNameContainingIgnoreCase(String name);
}
