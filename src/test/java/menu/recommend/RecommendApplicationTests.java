package menu.recommend;

import com.querydsl.jpa.impl.JPAQueryFactory;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import menu.recommend.domain.Category;
import menu.recommend.domain.Menu;
import menu.recommend.domain.QMenu;
import menu.recommend.repository.CategoryRepository;
import menu.recommend.repository.MenuRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@SpringBootTest
class RecommendApplicationTests {
	
	@PersistenceContext
	EntityManager em;



}
