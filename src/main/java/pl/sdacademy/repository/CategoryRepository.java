package pl.sdacademy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sdacademy.entity.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

//    Category findCategoryByNameByName(String name);
}
