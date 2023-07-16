package dev.hashnode.merndeveloper.realestate.User.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.hashnode.merndeveloper.realestate.User.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
