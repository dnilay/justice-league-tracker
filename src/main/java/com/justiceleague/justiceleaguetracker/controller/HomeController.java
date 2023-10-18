package com.justiceleague.justiceleaguetracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
@RestController
public class HomeController {

    @GetMapping
    public String sayHello() throws UnknownHostException {
        String ip= InetAddress.getLocalHost().toString();
        return "application is running "+ip;
    }
}
