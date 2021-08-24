package pl.sdacademy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.sdacademy.entity.Category;
import pl.sdacademy.entity.Product;
import pl.sdacademy.repository.CategoryRepository;
import pl.sdacademy.repository.ProductRepository;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;


    public ProductController(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }


    @GetMapping
    public String list(ModelMap modelMap) {
        List<Product> products = productRepository.findAll();
        List<Category> category = categoryRepository.findAll();
        modelMap.addAttribute("products", products);
        modelMap.addAttribute("categories", category);
        return "product/product_list";
    }


    @GetMapping("/add")
    public String addForm(@ModelAttribute("product") Product product, ModelMap modelMap) {
        List<Category> category = categoryRepository.findAll();
        modelMap.addAttribute("categories", category);
        return "product/product";

    }

    @PostMapping("/add")
    public String addResult(Product product, @RequestParam int categoryId) {
        Category byId = categoryRepository.getById(categoryId);
        product.setCategory(byId);
        productRepository.save(product);
        return "redirect:/product";
    }

    @GetMapping("/by-category/{categoryId}")
    public String productsByCategory(@PathVariable int categoryId, ModelMap modelMap) {
        productRepository.findProductByCategory_Id(categoryId);
        modelMap.addAttribute("products", productRepository)
        return "product/by_category";

    }
//    @GetMapping("/by-category/{categoryId}")
//    public String productsByCategory(@PathVariable int categoryId, ModelMap modelMap) {
//        productRepository.findProductByCategory_Id(categoryId);
//        modelMap.addAttribute("products", productRepository);
//        return "product/by_category";
//
//    }

}