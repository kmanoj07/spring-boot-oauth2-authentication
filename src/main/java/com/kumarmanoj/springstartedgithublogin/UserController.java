package com.kumarmanoj.springstartedgithublogin;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class UserController {
    @RequestMapping(path = "/user", method = RequestMethod.GET)
    public String user(@AuthenticationPrincipal OAuth2User principal) { // Only accessible to logged-in user via OAuth2 authentication
        System.out.println(principal);
        return principal.getAttribute(principal.getAttribute("name"));
    }
}
