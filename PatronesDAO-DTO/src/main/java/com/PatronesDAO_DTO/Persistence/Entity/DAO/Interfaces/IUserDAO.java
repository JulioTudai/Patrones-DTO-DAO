package com.PatronesDAO_DTO.Persistence.Entity.DAO.Interfaces;

import com.PatronesDAO_DTO.Persistence.Entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface IUserDAO {

    List<UserEntity> findAll();

    Optional<UserEntity> findById(Long id);

    UserEntity saveUser(UserEntity userEntity);

    UserEntity updateUser(UserEntity userEntity);

    UserEntity deletUser(UserEntity userEntity);

}
