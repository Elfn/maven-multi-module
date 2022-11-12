package com.elsior.mapper;

import com.elsior.entities.User;
import com.elsior.entities.domain.UserCommand;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-12T07:03:03+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserCommand userToUserCommand(User user) {
        if ( user == null ) {
            return null;
        }

        UserCommand userCommand = new UserCommand();

        userCommand.setName( user.getName() );
        userCommand.setAge( user.getAge() );

        return userCommand;
    }

    @Override
    public User userCommandToUser(UserCommand command) {
        if ( command == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.name( command.getName() );
        user.age( command.getAge() );

        return user.build();
    }
}
