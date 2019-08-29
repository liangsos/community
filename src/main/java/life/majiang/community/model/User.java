package life.majiang.community.model;

import lombok.Data;

/**
 * @author Chen Hualiang
 * @date 2019/8/27 - 17:18
 */
@Data
public class User {
    /**
     *id
     */
    private Integer id;

    /**
     *name
     */
    private String name;

    /**
     *accountId
     */
    private String accountId;

    /**
     *token
     */
    private String token;

    /**
     *创建时间
     */
    private Long gmtCreate;

    /**
     *修改时间
     */
    private Long gmtModified;
    
    /**
     *头像地址
     */
    private String avatarUrl;


}
