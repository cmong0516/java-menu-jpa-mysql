package menu.recommend.domain;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MenuDto {
    private String menuName;
    private String categoryName;


    @QueryProjection
    public MenuDto(String menuName, String categoryName) {
        this.menuName = menuName;
        this.categoryName = categoryName;
    }
}
