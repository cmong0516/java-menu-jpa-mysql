package menu.recommend.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import menu.recommend.domain.MenuDto;
import menu.recommend.service.MenuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RecommendController {

    private final MenuService menuService;

    @GetMapping("/menu/show")
    public List<MenuDto> showMenu() {
        return menuService.findMenu();
    }
}
