package com.dennis.api;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
public class HomeRepository {
    public static String test() {
        return "test";
    }
}
