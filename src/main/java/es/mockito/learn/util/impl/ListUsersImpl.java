package es.mockito.learn.util.impl;

import es.mockito.learn.entity.User;
import es.mockito.learn.util.ListUser;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ListUsersImpl implements ListUser {

    private List<User> listUser;

    public ListUsersImpl() {
        listUser = new ArrayList<User>();
    }

    @Override
    public List<User> getListUser() {
        return listUser;
    }

    @Override
    public void setListUser(List<User> listUser) {
        this.listUser = listUser;
    }

    @Override
    public void addUserToList(User user) {
        listUser.add(user);
    }
}
