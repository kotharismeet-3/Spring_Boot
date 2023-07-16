package dev.hashnode.merndeveloper.realestate.User.DTO;

public record UserDTO(
    Long id,
    String email,
    String username,
    String firstName,
    String lastName,
    String socialType
) {
    public UserDTO {

    }
}
