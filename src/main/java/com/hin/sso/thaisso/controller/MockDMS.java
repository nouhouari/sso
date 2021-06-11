package com.hin.sso.thaisso.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dms")
public class MockDMS {

  @GetMapping
  public ResponseEntity<String> dms(HttpServletResponse response) {
    String headers = response.getHeaderNames().stream().reduce("", (s1,s2)->s1+ "\n" + s2);
    return new ResponseEntity<String>(headers, HttpStatus.OK);
  }
}
