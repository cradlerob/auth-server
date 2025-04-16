package com.mifel.exam.auth.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class PrincipalController {

    @GetMapping("/home")
    public Principal user(Principal principal) {
        return principal;
    }
}
