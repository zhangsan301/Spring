package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    Long save(User user);


    void saveUserRole(Long id, Long[] roleIds);

    void delUserRoleRel(Long userId);

    void del(Long userId);

    User findByUsernameAndPassword(String username, String password);
}
