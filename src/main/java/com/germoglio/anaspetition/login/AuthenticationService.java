package com.germoglio.anaspetition.login;


import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password){

        boolean isValidUserName = username.equalsIgnoreCase("uni");
        boolean isValidPassword = password.equalsIgnoreCase("galway");

        return isValidUserName && isValidPassword;
    }
}


