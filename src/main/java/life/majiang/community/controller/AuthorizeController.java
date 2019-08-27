package life.majiang.community.controller;

import life.majiang.community.dto.AccessTokenDTO;
import life.majiang.community.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Chen Hualiang
 * @date 2019/8/26 - 18:17
 */
@Controller
public class AuthorizeController {

    @Autowired
    private GithubProvider githubProvider;

    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code") String code,
                           @RequestParam(name = "state") String state){
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setClient_id("49d0a583ad7ef700f872");
        accessTokenDTO.setClient_secret("719e000662aba291ac0dfdf20e4dac1417ba0e3a");
        accessTokenDTO.setCode(code);
        accessTokenDTO.setRedirect_uri("http://locahost:8887/callback");
        accessTokenDTO.setState(state);
        githubProvider.getAccessToken(accessTokenDTO);
        return "index";
    }
}

