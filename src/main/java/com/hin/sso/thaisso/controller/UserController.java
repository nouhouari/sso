/**
 * 
 */
package com.hin.sso.thaisso.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hin.sso.thaisso.dto.UserDto;

import lombok.extern.slf4j.Slf4j;

/**
 * @author nhouari
 *
 */
@RestController
@RequestMapping("user")
@Slf4j
public class UserController {

  @PostMapping
  public void createUser(UserDto user) {
    log.debug("Creating user {}", user);
  }
  
}
