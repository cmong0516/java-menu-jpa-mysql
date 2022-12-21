package menu.recommend;

import menu.recommend.domain.Category;
import menu.recommend.domain.Menu;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RecommendApplicationTests {

	@Test
	void contextLoads() {
	}


	@Test
	void CategoryTest() {
		Menu m1 = new Menu("짜장면");
		Menu m2 = new Menu("짬뽕");
		Category c1 = new Category("중식");

		m1.changeCategory(c1);
		m2.changeCategory(c1);

		Assertions.assertThat(c1.getMenus().size()).isEqualTo(2);
		Assertions.assertThat(c1.getMenus().contains(m1)).isEqualTo(true);
		Assertions.assertThat(c1.getMenus().contains(m2)).isEqualTo(true);
	}
}
