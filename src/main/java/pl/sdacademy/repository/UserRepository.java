package pl.sdacademy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sdacademy.User;

public interface UserRepository extends JpaRepository<User, Integer> {
//     User findByUsername(String username);
//     User findByEmail(String email);
//     User findById(int id);

}
