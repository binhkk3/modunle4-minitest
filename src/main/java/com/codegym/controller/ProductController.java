package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping ("/create")
    public ModelAndView showFromCreate(){
        ModelAndView modelAndView = new ModelAndView("/create");
        return modelAndView;
    }
    @GetMapping("/index")
    public String showlist (Model model){
        Iterable<Product> productList = productService.findAll();
        return "/index";
    }

}
