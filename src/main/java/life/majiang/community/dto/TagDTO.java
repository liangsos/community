package life.majiang.community.dto;

import lombok.Data;

import java.util.List;

/**
 * @author Chen Hualiang
 * @date 2019/9/27 - 11:01
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
