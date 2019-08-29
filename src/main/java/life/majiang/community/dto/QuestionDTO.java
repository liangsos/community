package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

/**
 * @author Chen Hualiang
 * @date 2019/8/29 - 10:41
 */
@Data
public class QuestionDTO {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}
