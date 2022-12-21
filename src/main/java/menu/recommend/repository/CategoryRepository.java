package menu.recommend.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import java.util.List;
import menu.recommend.domain.Category;
import menu.recommend.domain.MenuDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
