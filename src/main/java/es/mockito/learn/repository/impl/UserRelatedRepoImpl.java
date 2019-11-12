package es.mockito.learn.repository.impl;

import es.mockito.learn.entity.User;

import es.mockito.learn.repository.UserRelatedRepo;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Repository
public class UserRelatedRepoImpl implements UserRelatedRepo {

    HashMap<User, User> userHashMap = new HashMap<>();

    @Override
    public void setRelatedUsers(User user1, User user2) {

        userHashMap.put(user1, user2);

    }
}
