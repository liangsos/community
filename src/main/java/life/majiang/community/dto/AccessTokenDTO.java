package life.majiang.community.dto;

import lombok.Data;

/**
 *访问令牌
 * @author Chen Hualiang
 * @date 2019/8/27 - 9:21
 */
@Data
public class AccessTokenDTO {
    
    /**
     *client_id
     */
    private String client_id;

    /**
     *client_secret
     */
    private String client_secret;
    
    /**
     *code
     */
    private String code;

    /**
     *redirect_uri
     */
    private String redirect_uri;
    
    /**
     *state
     */
    private String state;

}
