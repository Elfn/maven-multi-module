package com.elsior.controllers;

import com.elsior.entities.domain.UserCommand;
import com.elsior.entities.User;
import com.elsior.mapper.UserMapper;

/**
 * @PROJECT mvn-parent
 * @Author Elimane on 12/11/2022
 */
public class UserController {

  public User saveUser(UserCommand command){
    User newUser = UserMapper.INSTANCE.userCommandToUser(command);
    return newUser;
  }

}
