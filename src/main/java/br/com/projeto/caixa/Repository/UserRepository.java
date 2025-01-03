package br.com.projeto.caixa.Repository;

import br.com.projeto.caixa.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByNameContainingIgnoreCase(String name);
}
