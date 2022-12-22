package menu.recommend.domain;

import com.querydsl.core.annotations.QueryProjection;
import java.util.List;
import lombok.Data;

@Data
public class CategoryDto {
    private String name;
    private List<MenuDto> menus;


    @QueryProjection
    public CategoryDto(String name,List<MenuDto> menus) {
        this.name = name;
        this.menus = menus;
    }
}
