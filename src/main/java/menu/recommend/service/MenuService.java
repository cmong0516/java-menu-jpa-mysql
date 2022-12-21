package menu.recommend.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import menu.recommend.domain.MenuDto;
import menu.recommend.repository.MenuRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MenuService {
    private final MenuRepository menuRepository;

    public List<MenuDto> findMenu() {
        return menuRepository.findMenuDto();
    }
}
