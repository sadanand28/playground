package com.playground.user.auth.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class SecurityConfig {
/*

    @Value("${user.auth.token.headerName}")
    public static String AUTH_HEADER_NAME;

    @Value("${user.auth.secretKey}")
    public static String SECRET_KEY;


    @Value("${user.auth.token.prefix}")
    public static String TOKEN_PREFIX;

    @Value("${user.auth.token.expiry}")
    public static long TOKEN_EXPIRY_TIME;

    @Value("${user.auth.path}")
    public static String SIGN_UP_URL;

*/

    public static String AUTH_HEADER_NAME="Authorization";

    public static String SECRET_KEY="SecretKeyForJWT";

    public static String TOKEN_PREFIX="B2CAUTH";

    public static long TOKEN_EXPIRY_TIME=30000;

    public static String SIGN_UP_URL="/users/signUp";
}
