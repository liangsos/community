package life.majiang.community.model;

/**
 * @author Chen Hualiang
 * @date 2019/8/27 - 17:18
 */
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

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }
}
