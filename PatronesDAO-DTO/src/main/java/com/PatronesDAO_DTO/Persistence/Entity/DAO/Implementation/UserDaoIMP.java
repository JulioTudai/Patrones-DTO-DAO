package com.PatronesDAO_DTO.Persistence.Entity.DAO.Implementation;

import com.PatronesDAO_DTO.Persistence.Entity.DAO.Interfaces.IUserDAO;
import com.PatronesDAO_DTO.Persistence.Entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserDaoIMP implements IUserDAO {

    @Override
    public List<UserEntity> findAll() {
        return List.of();
    }

    @Override
    public Optional<UserEntity> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public UserEntity saveUser(UserEntity userEntity) {
        return null;
    }

    @Override
    public UserEntity updateUser(UserEntity userEntity) {
        return null;
    }

    @Override
    public UserEntity deletUser(UserEntity userEntity) {
        return null;
    }
}
