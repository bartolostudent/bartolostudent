package es.mockito.learn.service.impl;

import es.mockito.learn.entity.User;
import es.mockito.learn.repository.UserRelatedRepo;
import es.mockito.learn.service.UserRelatedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRelatedServiceImpl implements UserRelatedService {

    @Autowired
    UserRelatedRepo userRelatedRepo;

    @Override
    public void setRelatedUsers(User user1, User user2) {
        userRelatedRepo.setRelatedUsers(user1, user2);
    }
}
