package com.aka.demoGif.Controller;


import com.aka.demoGif.model.Category;
import com.aka.demoGif.model.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @RequestMapping("/categories")
    public String gifCategories(ModelMap modelMap) {
        List<Category> categoryList = categoryRepository.getAllCategories();

        // 2. przekazanie obiektów do widoku
        modelMap.put("categories", categoryList);
        return "categories";
    }

}
