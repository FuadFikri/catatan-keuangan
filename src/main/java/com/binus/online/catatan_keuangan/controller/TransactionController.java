package com.binus.online.catatan_keuangan.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
public class TransactionController {

    private List<String> productList = new ArrayList<>(); // Sample in-memory list to hold products

    @GetMapping
    public String listProducts(Model model) {
        model.addAttribute("products", productList);
        return "list";
    }
//
//    @GetMapping("/new")
//    public String newProductForm(Model model) {
//        model.addAttribute("product", new Product());
//        return "form";
//    }
//
//    @GetMapping("/edit/{id}")
//    public String editProductForm(@PathVariable("id") int id, Model model) {
//        Product product = productList.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
//        model.addAttribute("product", product);
//        return "form";
//    }
//
//    @PostMapping("/save")
//    public String saveProduct(@ModelAttribute Product product) {
//        if (product.getId() == null) {
//            product.setId(productList.size() + 1);
//            productList.add(product);
//        } else {
//            productList.removeIf(p -> p.getId().equals(product.getId()));
//            productList.add(product);
//        }
//        return "redirect:/products";
//    }
//
//    @GetMapping("/delete/{id}")
//    public String deleteProduct(@PathVariable("id") int id) {
//        productList.removeIf(p -> p.getId() == id);
//        return "redirect:/products";
//    }
}
