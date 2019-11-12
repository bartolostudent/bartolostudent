package es.mockito.learn.service;

import es.mockito.learn.entity.User;
import es.mockito.learn.repository.UserRelatedRepo;
import es.mockito.learn.repository.impl.UserRelatedRepoImpl;
import es.mockito.learn.service.impl.UserRelatedServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;


import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class UserRelatedServiceTest {

    @InjectMocks
    UserRelatedServiceImpl userRelatedService = new UserRelatedServiceImpl();

    @Mock
    UserRelatedRepoImpl userRelatedRepo;

    @Mock
    User user1;

    @Mock
    User user2;

    /*
    @Autowired
    UserRelatedRepo userRelatedRepo;

    @Override
    public void setRelatedUsers(User user1, User user2) {
        userRelatedRepo.setRelatedUsers(user1, user2);
    }
    */

    @DisplayName("Set User related")
    @Test
    void setRelatedUsers() {

        user1 = mock(User.class);
        user2 = mock(User.class);

        //given
        doNothing().when(userRelatedService).setRelatedUsers(user1, user2);
        //when
        userRelatedRepo.setRelatedUsers(user1,user2);
        //then
        verify(userRelatedService).setRelatedUsers(user1,user2);

        //assert true;
    }
}