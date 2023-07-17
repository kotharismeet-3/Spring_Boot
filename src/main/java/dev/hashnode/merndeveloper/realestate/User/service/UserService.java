package dev.hashnode.merndeveloper.realestate.User.service;

import java.util.List;
// import java.util.stream.Collectors;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.hashnode.merndeveloper.realestate.User.model.User;
// import dev.hashnode.merndeveloper.realestate.User.DTO.UserDTO;
import dev.hashnode.merndeveloper.realestate.User.DTO.UserDTOMapper;
import dev.hashnode.merndeveloper.realestate.User.repository.UserRepository;

@Service()
public class UserService {
    private final UserRepository userRepository;
    // private final UserDTOMapper userDTOMapper;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        // this.userDTOMapper = userDTOMapper;
    }
    
    // public List<UserDTO> getUsers() {
    //     return userRepository.findAll()
    //             .stream()
    //             .map(userDTOMapper)
    //             .collect(Collectors.toList());
    // }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUser(Long userId) {
        return userRepository.findById(userId);
    }

    public void createUser(User user) {
        Optional<User> userExist = userRepository.findUserByEmail(user.getEmail());
        if(userExist.isPresent()) {
            throw new IllegalStateException("Email is already Taken!");
        } else {
            userRepository.save(user);
        }
    }

    public void deleteUser(Long userId) {
        Boolean exists = userRepository.existsById(userId);
        if(exists) {
            userRepository.deleteById(userId);
        } else {
            throw new IllegalStateException("User dosen't exist with ${userId}");   
        }
    }
}
