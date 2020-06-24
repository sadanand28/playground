package com.playground.user.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.Response.Status.OK;

@RestController
@RequestMapping("/rest")
public class UserQueryController {

    @GetMapping
    @Produces(MediaType.APPLICATION_JSON)
    public String checkSecuredAPI() {
        return "SUCCESS";
    }
}