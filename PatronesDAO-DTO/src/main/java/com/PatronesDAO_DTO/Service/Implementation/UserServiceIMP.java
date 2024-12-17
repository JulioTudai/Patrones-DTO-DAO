package com.PatronesDAO_DTO.Service.Implementation;

import com.PatronesDAO_DTO.Presentation.DTO.UserDTO;
import com.PatronesDAO_DTO.Service.Interfaces.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceIMP implements IUserService {
    @Override
    public List<UserDTO> findAll() {
        return List.of();
    }

    @Override
    public UserDTO findById(Long id) {
        return null;
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO updateUser(UserDTO userdto, Long id) {
        return null;
    }

    @Override
    public String deletUser(Long id) {
        return "";
    }
}
