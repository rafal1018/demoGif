package com.aka.demoGif.model.repository;

import com.aka.demoGif.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {

    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(0, "funny"),
            new Category(1, "sport"),
            new Category(2, "it")
    );

    public List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }

    ;
}
