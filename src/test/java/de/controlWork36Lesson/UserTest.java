package de.controlWork36Lesson;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;

    @BeforeEach
    void setUp() {
        user = new User("Lina", 29);

    }


    @Test
    void testGetUser_name() {
        assertEquals("Lina", user.getName());


    }

    @Test
    void testSetUser_name() {
        User user1 = new User("Alex",30);
        user.setName("Alex");
        assertEquals("Alex", user.getName());

    }

    @Test
    void testGetAge() {
    }

    @Test
    void testSetAge() {
    }

    @Test
    void testAddFriend() {
        User user2 = new User("Dilan", 32);
        user.addFriend("Dilan");
        assertTrue(user.getFriendsList().contains("Dilan"));
    }

    @Test
    void testRemoveFriend() {
    }

    @Test
    void testGetFriendsList() {
    }

    @Test
    void testSetFriendsList() {
    }
}