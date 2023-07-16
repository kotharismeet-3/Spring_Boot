package dev.hashnode.merndeveloper.realestate.User.DTO;


import java.util.function.Function;

import dev.hashnode.merndeveloper.realestate.User.model.User;

public class UserDTOMapper implements Function<User, UserDTO> {
    public UserDTOMapper() {}
    @Override
    public UserDTO apply(User user) {
        return new UserDTO(
            user.getId(),
            user.getEmail(),
            user.getUsername(),
            user.getFirstName(),
            user.getLastName(),
            user.getSocialType()
        );
    }
}
