package pl.sdacademy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sdacademy.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {


}
