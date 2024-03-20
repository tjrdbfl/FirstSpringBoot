package com.dennis.api.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RequiredArgsConstructor
@RestController
public class UserController {
    @PostMapping("/login")
    public Map<String,?> login(@RequestBody Map<String,?> map){
        Map<String,String> resMap=new HashMap<>();
        String username=map.get("username").toString();
        String password=map.get("password").toString();
        resMap.put("username",username);
        resMap.put("password",password);

        System.out.print("username: "+username+"password: "+password);
        return resMap;
    }
}
