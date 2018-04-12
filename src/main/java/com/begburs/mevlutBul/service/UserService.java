package com.begburs.mevlutBul.service;

import com.begburs.mevlutBul.repository.QuestionRepository;
import com.begburs.mevlutBul.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;
import com.begburs.mevlutBul.model.User;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;




    public User login(String uniqueId){

        User user = new User();
        user = userRepository.findByEmail(uniqueId);
        return user;
    }


    public  User register(User user){

        if(login(user.getEmail()) == null)
        {

            System.out.println("Kullanıcı kaydı yapıldı!");

            return userRepository.save(user);
        }
        else
        {
            System.out.println("Kullanıcı girişi yapıldı!");
            return user;
        }


    }


}
