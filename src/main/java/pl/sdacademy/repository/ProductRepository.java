package pl.sdacademy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sdacademy.Product;

import java.util.List;


public interface ProductRepository extends JpaRepository<Product,Integer> {

//    Product findById (int id);
//    Product findByName(String name);
//    List<Product> findByCategoryId(int categoryId);
}
