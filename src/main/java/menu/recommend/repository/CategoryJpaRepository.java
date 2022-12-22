package menu.recommend.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import menu.recommend.domain.Category;
import menu.recommend.domain.MenuDto;
import menu.recommend.domain.QCategory;
import menu.recommend.domain.QMenu;
import menu.recommend.domain.QMenuDto;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryJpaRepository {

    private final EntityManager em;
    private final JPAQueryFactory queryFactory;

    public CategoryJpaRepository(EntityManager em) {
        this.em = em;
        this.queryFactory = new JPAQueryFactory(em);
    }

    public void save(Category category) {
        em.persist(category);
    }

    public Optional<Category> findById(Long id) {
        Category findCategory = em.find(Category.class, id);
        return Optional.ofNullable(findCategory);
    }

    public List<MenuDto> findAllMenu() {
        return queryFactory.select(new QMenuDto(
                        QMenu.menu.name,
                        QCategory.category.name))
                .from(QMenu.menu)
                .leftJoin(QMenu.menu.category, QCategory.category)
                .fetch();
    }

    public List<Category> findByCategoryName(String categoryName) {
        return em.createQuery("select c from Category  c where c.name = :categoryName", Category.class)
                .setParameter("categoryName", categoryName)
                .getResultList();
    }
}
