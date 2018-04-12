package com.begburs.mevlutBul.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.begburs.mevlutBul.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String uniqueId);
    User save(User user);

}
