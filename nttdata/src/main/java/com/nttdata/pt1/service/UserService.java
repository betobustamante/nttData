package com.nttdata.pt1.service;

import com.nttdata.pt1.exception.BusinessException;
import com.nttdata.pt1.model.User;
import com.nttdata.pt1.repository.UserRepository;
import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserbyId(String idNumber){
        Optional<User> optionalUser = userRepository.findById(idNumber);
        try {
            return optionalUser.get();
        }catch (Exception ex){
            throw ex;
        }

    }
}
