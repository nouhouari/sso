package com.hin.sso.thaisso.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.ToString;

@Data
@Valid
@ToString
public class UserDto {
  
  @NotNull
  private String userId;
  @NotNull
  private String username;
  private String firstname;
  private String lastname;
}
