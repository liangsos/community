package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

/**
 * @author Chen Hualiang
 * @date 2019/9/20 - 9:40
 */
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Long type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private String content;
    private User user;
}
