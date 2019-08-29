package life.majiang.community.dto;

import lombok.Data;

/**
 * @author Chen Hualiang
 * @date 2019/8/27 - 10:42
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;
}
