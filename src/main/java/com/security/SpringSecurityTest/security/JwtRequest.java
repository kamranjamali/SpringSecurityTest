package com.security.SpringSecurityTest.security;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JwtRequest {

    private String username;
    private String password;
}
