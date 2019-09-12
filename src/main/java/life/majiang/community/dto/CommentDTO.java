package life.majiang.community.dto;

import lombok.Data;

/**
 * @author Chen Hualiang
 * @date 2019/9/12 - 16:05
 */
@Data
public class CommentDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
