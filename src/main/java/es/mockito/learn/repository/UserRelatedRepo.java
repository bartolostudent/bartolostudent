package es.mockito.learn.repository;

import es.mockito.learn.entity.User;
import org.springframework.stereotype.Repository;

public interface UserRelatedRepo {
    void setRelatedUsers(User user1, User user2);
}
