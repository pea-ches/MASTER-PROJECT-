package com.main.minticpets.controller;

import com.main.minticpets.dao.ProductoDao;
import com.main.minticpets.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/tienda")
@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class ProductController{

    @GetMapping
    public List<Product> tienda() throws Exception {
        return new ProductoDao().listProducts();
    }
}
