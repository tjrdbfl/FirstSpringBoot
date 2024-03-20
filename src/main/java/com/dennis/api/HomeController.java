package com.dennis.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequiredArgsConstructor
public class HomeController {
    private final HomeService service;
    @RequestMapping("/")
    public String hello(){
        return service.test();
    }
    @PostMapping("/name")
    public Map<String,?> name(@RequestBody Map<String,?> map){
        String name=map.get("name").toString();
        System.out.println("request 가 가져온 이름: "+name);
        Map<String,String> resMap=new HashMap<>();
        resMap.put("name",name);
        return resMap;
    }
}
