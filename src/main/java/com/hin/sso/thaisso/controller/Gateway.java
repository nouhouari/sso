package com.hin.sso.thaisso.controller;

import java.net.URI;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("gateway")
@Slf4j
public class Gateway {

  @GetMapping
  public ResponseEntity<Void> checkSSO(HttpServletResponse response, HttpServletRequest request) {
    
    // Check the User id
    Iterator<String> it = request.getHeaderNames().asIterator();
    while(it.hasNext()) {
      String key = it.next();
      log.debug("{} -> {}", key, request.getHeader(key));
    }
    
    // Check the user with local database
    
    // Get the token from keycloak
    
    // Redirect to the dms application
    ResponseEntity<Void> responseEntity = ResponseEntity
        .status(HttpStatus.PERMANENT_REDIRECT)
        .header("abc", "def")
        .location(URI.create("http://localhost:8080/dms"))
        .build();
    return responseEntity;
  }
  
}
