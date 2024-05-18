package com.cb.userdept.repositories;
//cria de acordo com o nome que pede, ex: ClienteRepository
import com.cb.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
