package co.mision.tic.apirestciclo4.Controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.mision.tic.apirestciclo4.Model.UserModel;
import co.mision.tic.apirestciclo4.Service.UserService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<UserModel> obtainUsers(){
        return userService.obtainUsers();
    }

    @PostMapping()
    public UserModel saveUser(@RequestBody UserModel user){
        return userService.saveUser(user);
    }

    @DeleteMapping(path = "/{id}")
    public String removeUserById(@PathVariable("id") String id){
        if(this.userService.deleteUser(id))
            return "El usuario "+id+" ha sido eliminado";
        else
            return "No es posible eliminar el usuario "+id;    

    }
    
    @GetMapping(path = "/{id}")
    public Optional <UserModel> obtainUserById(@PathVariable("id") String id){
        return this.userService.obtainUserById(id);
    }

    @GetMapping(path = "/nombre/{nombre}")
    public ArrayList <UserModel> obtainUserByName(@PathVariable("nombre") String nombre){
        return userService.obtainUserByName(nombre);

    }

   

 
}
