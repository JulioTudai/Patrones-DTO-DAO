package com.PatronesDAO_DTO.Persistence.Entity.DAO.Interfaces;

import com.PatronesDAO_DTO.Persistence.Entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface IUserDAO {

    List<UserEntity> findAll();

    Optional<UserEntity> findById(Long id);

    void saveUser(UserEntity userEntity);

    void updateUser(UserEntity userEntity);

    void deletUser(UserEntity userEntity);

}
