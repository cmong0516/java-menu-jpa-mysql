package menu.recommend.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import menu.recommend.domain.Category;
import menu.recommend.domain.MenuDto;
import menu.recommend.service.CategoryService;
import menu.recommend.service.MenuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RecommendController {

    private final CategoryService categoryService;
    private final MenuService menuService;

    @GetMapping("/menu/show")
    public List<MenuDto> showMenu() {
        return menuService.findMenu();
    }

    @GetMapping("/category/all")
    public List<Category> showAllCategory() {
        return categoryService.findAllCategory();
    }

    @GetMapping("/menu/all/dsl")
    public List<MenuDto> showAllCategoryByDsl() {
        return categoryService.findAll();
    }
}
