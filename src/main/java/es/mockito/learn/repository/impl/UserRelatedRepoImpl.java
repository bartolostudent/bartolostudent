package es.mockito.learn.repository.impl;

import es.mockito.learn.entity.User;

import es.mockito.learn.repository.UserRelatedRepo;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class UserRelatedRepoImpl implements UserRelatedRepo {
    @Override
    public void setRelatedUsers(User user1, User user2) {

    }
}
