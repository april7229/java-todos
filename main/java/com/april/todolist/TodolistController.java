package com.april.todolist;

import com.april.todolist.models.Customer;
import com.april.todolist.models.Snack;
import com.april.todolist.models.VendingMachine;
import com.april.todolist.repository.CustomerRepository;
import com.april.todolist.repository.SnackRepository;
import com.april.todolist.repository.VendingMachineRepository;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Api(value = "ToDoList Application", description = "The classic ToDoList Application in CRUD")
@RestController
@RequestMapping(path = {}, produces = MediaType.APPLICATION_JSON_VALUE)


public class TodolistController {
    @Autowired
         UserReposoitory userrepos;

    @Autowired
        TodoRepository todorepos;

    @ApiOperation(value = "list All User", response = List.class)

    @ApiResponses(value =
            {
                    @ApiResponse(code = 200, message = "Successfully recetrieve list"),
                    @ApiResponse(code = 401, message = "You are not authorized to the view the resource"),
                    @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
                    @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
            })
    @GetMapping("/user")
    public List<User> alluser()
    {
        return userrepos.findAll();
    }
    @GetMapping("/user")
    public List<User> alluser()
    {
        return userrepos.findAll();
    }
    @GetMapping("/User/name/{name}")
    public User findUser(@PathVariable String name)
    {
        var foundUser = usertrepos.findByName(name);
        if (foundUser != null)
        {
            return foundUser;
        }
        else
        {
            return null;
        }
    }
    @PostMapping("/user")
    public User newuser(@RequestBody User user) throws URISyntaxException
    {
        return custrepos.save(customer);
    }

    @PutMapping("/User/id/{id}")
    public Customer changeUser(@RequestBody User newcust, @PathVariable long id) throws URISyntaxException
    {
        Optional<User> updateUser = userrepos.findById(id);
        if (updateUser.isPresent())
        {
            newuser.setId(id);
            userrepos.save(newuser);

            return newuser;
        }
        else
        {
            return null;
        }
    }

    @DeleteMapping("/user/id/{id}")
    public User deleteUser(@PathVariable long id)
    {
        var foundUser = userrepos.findById(id);
        if (foundUser.isPresent())
        {
            userrepos.deleteById(id);
            return foundUser.get();
        }
        else
        {
            return null;
        }
    }

    @GetMapping("/todo")
    public List<Snack> alltodo()
    public void deletetodo(@PathVariable Long id)
    {
        snackrepos.deleteById(id);
    }

    // GET    /vending - returns all vending machines *
    // GET    /vending/id/{id} - returns vending machine based on id *
    // GET    /vending/name/{name} - returns vending machine based on name *
    // POST   /vending - adds a vending machine *
    // PUT    /vending/id/{} - updates vending machine based on id *
    // DELETE /vending/{id} - delete vending machine based on id
    // since vending machine is returning a list of snacks, return value must be list


    {
        return snackrepos.findAll();
    }






}


