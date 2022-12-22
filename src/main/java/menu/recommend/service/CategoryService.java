package menu.recommend.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import menu.recommend.domain.Category;
import menu.recommend.domain.MenuDto;
import menu.recommend.repository.CategoryJpaRepository;
import menu.recommend.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {


    private final CategoryJpaRepository categoryJpaRepository;
    private final CategoryRepository categoryRepository;

    public List<Category> findAllCategory() {
        return categoryRepository.findAll();
    }

    public List<MenuDto> findAll() {
        return categoryJpaRepository.findAllMenu();
    }
}
