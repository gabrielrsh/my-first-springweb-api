package dio.myfirstspringwebapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.myfirstspringwebapi.model.User;
import dio.myfirstspringwebapi.repository.UserRepository;

@RestController
public class UserController {

    @Autowired
    UserRepository repository;

    @GetMapping("/users")
    public List<User> getUsers(){
        return repository.findAll();
    }
}
