package com.example.Counter.service;

import com.example.Counter.model.Counter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CounterService {
    private static Map<String,Integer> hs=new HashMap<>();
    public Counter addUser(String name){
        hs.put(name,hs.getOrDefault(name,0)+1);
        Counter obj=new Counter(name,hs.get(name));
        return obj;
    }
}
