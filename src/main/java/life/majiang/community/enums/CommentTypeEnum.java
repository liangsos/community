package life.majiang.community.enums;

/**
 * @author Chen Hualiang
 * @date 2019/9/16 - 14:54
 */
public enum CommentTypeEnum {
    QUESTION(1),
    COMMENT(2);

    private Integer type;

    public Integer getType(){
        return type;
    }

    CommentTypeEnum(Integer type) {
        this.type = type;
    }
}
