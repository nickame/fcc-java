package com.web.app.service.impl;

import com.web.app.model.entity.UserEntity;
import com.web.app.repository.UserRepository;
import com.web.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserEntity save(UserEntity entity) {
        return repository.saveAndFlush(entity);
    }

    @Override
    public UserEntity update(UserEntity entity) {
        return repository.saveAndFlush(entity);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

    @Override
    public UserEntity findById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<UserEntity> findAll() {
        return repository.findAll();
    }
}
