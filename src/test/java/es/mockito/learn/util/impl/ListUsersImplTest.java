package es.mockito.learn.util.impl;

import es.mockito.learn.entity.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.*;

public class ListUsersImplTest {

    private static List<User> lista = new ArrayList<>();

    @Mock
    public ListUsersImpl listUser;

    @Mock
    public User user;

    @DisplayName("Add User to List")
    @Test
    void addUserToList(){

        //given
        listUser = mock(ListUsersImpl.class);
        user = mock(User.class);
        lista.add(user);

        doNothing().when(listUser).addUserToList(user);
        //when
        listUser.addUserToList(user);
        //then
        verify(listUser).addUserToList(user);

    }

    @DisplayName("Get User list")
    @Test
    void getListUser() {
        //given
        listUser = mock(ListUsersImpl.class);
        user = mock(User.class);
        lista.add(user);

        doNothing().when(listUser).addUserToList(user);
        when(listUser.getListUser()).thenReturn(lista);
        //when
        listUser.addUserToList(user);
        List<User> u = listUser.getListUser();
        //then
        assertNotNull(u);
        assertEquals(lista, u);
        verify(listUser, times(1)).getListUser();
    }

    @DisplayName("Set list user")
    @Test
    void setListUser(){
        //given
        listUser = mock(ListUsersImpl.class);
        user = mock(User.class);
        lista.add(user);

        doNothing().when(listUser).setListUser(lista);
        //when
        listUser.setListUser(lista);
        //then
        verify(listUser).setListUser(lista);
    }

    @DisplayName("Set true")
    @Test
    void setTrue(){
        assert true; 
    }
}