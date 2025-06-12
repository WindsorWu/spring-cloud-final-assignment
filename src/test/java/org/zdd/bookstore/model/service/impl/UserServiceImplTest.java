
package org.zdd.bookstore.model.service.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.zdd.bookstore.model.dao.UserMapper;
import org.zdd.bookstore.model.entity.User;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceImplTest {

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private UserMapper userMapper;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testFindUserById() {
        // Arrange
        int userId = 1;
        User mockUser = new User();
        mockUser.setUserId(userId);
        mockUser.setUsername("testUser");

        when(userMapper.selectByPrimaryKey(userId)).thenReturn(mockUser);

        // Act
        User result = userService.findUserById(userId);

        // Assert
        assertNotNull(result);
        assertEquals("testUser", result.getUsername());
        verify(userMapper, times(1)).selectByPrimaryKey(userId);
    }
}