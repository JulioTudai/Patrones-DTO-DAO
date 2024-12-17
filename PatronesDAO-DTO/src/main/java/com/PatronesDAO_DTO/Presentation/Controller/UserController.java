package com.PatronesDAO_DTO.Presentation.Controller;

import com.PatronesDAO_DTO.Persistence.Entity.UserEntity;
import com.PatronesDAO_DTO.Presentation.DTO.UserDTO;
import com.PatronesDAO_DTO.Service.Interfaces.IUserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;
    //FindAll
    @GetMapping("/find")
    public ResponseEntity<List<UserDTO>> findAll(){
        return new ResponseEntity<>(this.userService.findAll(), HttpStatus.OK);
    }

    //FindID
    @GetMapping("/find/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id){
        return new ResponseEntity<>(this.userService.findById(id),HttpStatus.OK);
    }

    //Create user
    @PostMapping("/create")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO){
        return new ResponseEntity<>(this.userService.createUser(userDTO),HttpStatus.CREATED);
    }


    //update User
    @PutMapping("/update/{id}")
    public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userDTO,@PathVariable Long id) {
        return new ResponseEntity<>(this.userService.updateUser(userDTO,id),HttpStatus.CREATED);
    }

    //delet
    @DeleteMapping("/delet/{id}")
    public ResponseEntity<String> deletUser(@PathVariable Long id){
        return new ResponseEntity<>(this.userService.deletUser(id),HttpStatus.NO_CONTENT);
    }
}
