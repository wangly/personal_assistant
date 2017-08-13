package com.fzu.service;

import org.springframework.stereotype.Service;

/**
 * Created by lilian on 2017/8/13.
 */
@Service
public class TestService {

    public String clear(String str) {
        return str.trim();
    }
}
