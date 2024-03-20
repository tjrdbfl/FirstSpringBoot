package com.dennis.api;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HomeService {
    private final HomeRepository repository;
    public String test() {
        return HomeRepository.test();
    }
}
