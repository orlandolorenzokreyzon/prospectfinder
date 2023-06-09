package com.kreyzon.prospectfinder.api.controller;

import com.kreyzon.prospectfinder.api.service.BusinessLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prospectfinder/api/v1/business/login")
public class LoginController {
    @Autowired
    private BusinessLoginService businessLoginService;

    @PostMapping
    public ResponseEntity<String> login() {
        return ResponseEntity.ok(businessLoginService.login());
    }
}
