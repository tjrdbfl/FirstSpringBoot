package com.dennis.api.user;

import lombok.*;

@NoArgsConstructor(access=AccessLevel.PROTECTED)
@Getter
@ToString
public class User {
    private String username;
    private String password;

    @Builder(builderMethodName = "builder")

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
