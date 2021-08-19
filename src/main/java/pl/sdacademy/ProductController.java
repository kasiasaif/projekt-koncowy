package pl.sdacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.management.modelmbean.ModelMBeanAttributeInfo;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @GetMapping
    public String list(ModelMap modelMap) {
        List<Product> products = productRepository.findAll();
        modelMap.addAttribute("products", products);
        return "product/product_list";
    }


    @GetMapping("/add")
    public String addForm(@ModelAttribute("product") Product  product) {
        return "product/product";

    }

}