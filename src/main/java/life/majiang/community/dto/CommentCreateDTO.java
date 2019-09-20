package life.majiang.community.dto;

import lombok.Data;

/**
 * @author Chen Hualiang
 * @date 2019/9/12 - 16:05
 */
@Data
public class CommentCreateDTO {
    /*
     * 所回复的问题的ID
     */
    private Long parentId;
    /*
     *回复的内容
     */
    private String content;
    /*
     *回复的类型 1表示回复问题，2表示回复评论
     */
    private Long type;
}
