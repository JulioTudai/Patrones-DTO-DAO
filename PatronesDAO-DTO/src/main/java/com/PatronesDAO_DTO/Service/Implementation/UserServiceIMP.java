package com.PatronesDAO_DTO.Service.Implementation;

import com.PatronesDAO_DTO.Persistence.Entity.DAO.Implementation.UserDaoIMP;
import com.PatronesDAO_DTO.Persistence.Entity.DAO.Interfaces.IUserDAO;
import com.PatronesDAO_DTO.Persistence.Entity.UserEntity;
import com.PatronesDAO_DTO.Presentation.DTO.UserDTO;
import com.PatronesDAO_DTO.Service.Interfaces.IUserService;
import org.apache.catalina.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceIMP implements IUserService {

    @Autowired
    private IUserDAO userDAO;

    @Override
    public List<UserDTO> findAll() {
        ModelMapper modelMapper = new ModelMapper();

        return this.userDAO.findAll()
                .stream()
                .map(userEntity -> modelMapper.map(userEntity,UserDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO findById(Long id) {

        Optional<UserEntity> userEntity = this.userDAO.findById(id);

        if(userEntity.isPresent()){
            ModelMapper modelMapper = new ModelMapper();
            UserEntity currentUser = userEntity.get();

            return modelMapper.map(currentUser, UserDTO.class);
        }
        else{
            return new UserDTO();
        }
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {

        try{
            ModelMapper modelMapper = new ModelMapper();
            UserEntity userEntity = modelMapper.map(userDTO, UserEntity.class);
            this.userDAO.saveUser(userEntity);

            return userDTO;
        } catch (Exception e) {
            throw new UnsupportedOperationException("Error al guardar el usuario");
        }

    }

    @Override
    public UserDTO updateUser(UserDTO userdto, Long id) {
        Optional<UserEntity> userEntity = this.userDAO.findById(id);

        if(userEntity.isPresent()){
            UserEntity currentUserEntity = userEntity.get();
            currentUserEntity.setName(userdto.getName());
            currentUserEntity.setLastName(userdto.getLastName());
            currentUserEntity.setEmail(userdto.getEmail());
            currentUserEntity.setAge(userdto.getAge());

            this.userDAO.updateUser(currentUserEntity);

            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(currentUserEntity, UserDTO.class);
        }else {
            throw new IllegalArgumentException("El usuario no existe");
        }

    }

    @Override
    public String deletUser(Long id) {

        Optional<UserEntity> userEntity = this.userDAO.findById(id);

        if(userEntity.isPresent()) {
            UserEntity currentUserEntity = userEntity.get();
            this.userDAO.deletUser(currentUserEntity);

            return "Usuario con ID" + id+ " ha sido eliminado";
        }
        else {
            return "El usuario con id "+ id + " No Existe";
        }

    }
}
