package life.majiang.community.model;

import lombok.Data;

/**
 * @author Chen Hualiang
 * @date 2019/8/28 - 16:16
 */
@Data
public class Question {
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

}