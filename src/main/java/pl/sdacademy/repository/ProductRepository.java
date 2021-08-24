package pl.sdacademy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sdacademy.entity.Product;

import java.util.List;


public interface ProductRepository extends JpaRepository<Product,Integer> {



}
