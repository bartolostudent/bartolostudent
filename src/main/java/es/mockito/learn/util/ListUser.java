package es.mockito.learn.util;

import es.mockito.learn.entity.User;

import java.util.List;

public interface ListUser {

    List<User> getListUser();
    void setListUser(List<User> listUser);
    void addUserToList(User user);

}