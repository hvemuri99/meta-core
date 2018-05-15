package com.meta.web.security;

import com.meta.web.exception.MetaCoreApiException;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author hvemuri
 * @Generated at 5/15/2018 12:20 PM
 */
@Component
public class AppBasicAuthFilter {

    @Value("${meta.core.basic.auth.username:drfirst}")
    private String username;

    @Value("${meta.core.basic.auth.password:Drfirst1234}")
    private String password;

    public void validateBasicAuth(String authorization) {
        String actualAuth = username + ":" + password;
        byte[] encodedActualAuth = Base64.encodeBase64(actualAuth.getBytes());
        String basicActualAuth = "Basic " + new String(encodedActualAuth);
        if (!basicActualAuth.equalsIgnoreCase(authorization)) {
            throw new MetaCoreApiException("01", "BasicAuthFailed");
        }
    }
}
