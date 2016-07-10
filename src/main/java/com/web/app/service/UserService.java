package com.web.app.service;

import com.web.app.model.entity.UserEntity;

import java.util.List;

public interface UserService {
    UserEntity save(UserEntity entity);

    UserEntity update(UserEntity entity);

    void delete(Long id);

    UserEntity findById(Long id);

    List<UserEntity> findAll();
}
