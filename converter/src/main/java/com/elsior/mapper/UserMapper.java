package com.elsior.mapper;

import com.elsior.entities.User;
import com.elsior.entities.domain.UserCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @PROJECT mvn-parent
 * @Author Elimane on 12/11/2022
 */
@Mapper
public interface UserMapper {
  UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

  public UserCommand userToUserCommand(User user);
  public User userCommandToUser(UserCommand command);
}
