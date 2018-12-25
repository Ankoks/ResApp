package ru.ankoks.RestApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: ankoks
 * Date: 25.12.2018
 */
@RestController
public class HomeController {

    @GetMapping("/version")
    public String getVersion() {
        return "{\"version:\": 1.0}";
    }
}
