package com.example1.demo1.security;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/13/2020, thur
 **/
public class SecurityConstants {
    public static final String SECRET = "SecretKeyToGenJWTs";
    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/api/v1/users/sign-up";

}