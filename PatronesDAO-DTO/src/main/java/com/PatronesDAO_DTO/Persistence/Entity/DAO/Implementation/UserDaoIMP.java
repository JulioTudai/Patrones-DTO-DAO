package com.PatronesDAO_DTO.Persistence.Entity.DAO.Implementation;

import com.PatronesDAO_DTO.Persistence.Entity.DAO.Interfaces.IUserDAO;
import com.PatronesDAO_DTO.Persistence.Entity.UserEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;



@Repository
public class UserDaoIMP implements IUserDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<UserEntity> findAll() {
        return this.em.createQuery("SELECT u FROM UserEntity u").getResultList();
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
