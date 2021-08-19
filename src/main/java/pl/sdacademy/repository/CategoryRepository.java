package pl.sdacademy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sdacademy.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

//    Category findCategoryByNameByName(String name);
}
