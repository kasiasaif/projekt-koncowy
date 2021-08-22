package pl.sdacademy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sdacademy.entity.Product;


public interface ProductRepository extends JpaRepository<Product,Integer> {

//    Product findById (int id);
//    Product findByName(String name);
//    List<Product> findByCategoryId(int categoryId);
}
