package com.PatronesDAO_DTO.Service.Interfaces;

import com.PatronesDAO_DTO.Presentation.DTO.UserDTO;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IUserService {

    List<UserDTO> findAll();

    UserDTO findById(Long id);

    UserDTO createUser(UserDTO userDTO);

    UserDTO updateUser(UserDTO userdto,Long id);

    String deletUser(Long id);

}
