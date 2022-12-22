package menu.recommend.repository;

import java.util.List;
import menu.recommend.domain.Menu;
import menu.recommend.domain.MenuDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu,Long> {
    @Query("select new menu.recommend.domain.MenuDto(m.name,c.name) from Menu m join m.category c")
    List<MenuDto> findMenuDto();
}
