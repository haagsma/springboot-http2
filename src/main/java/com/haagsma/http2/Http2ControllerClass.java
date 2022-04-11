package com.haagsma.http2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Http2ControllerClass {

    @GetMapping("/")
    public String index() {
        return "It works!";
    }

    @GetMapping("/list")
    public List<String> list(@RequestParam(value = "q", required = false, defaultValue = "1") Integer quantity) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            list.add("adowijdaowijdaoiwdjoaijwodaijwodajwoidja");
        }
        return list;
    }
}
