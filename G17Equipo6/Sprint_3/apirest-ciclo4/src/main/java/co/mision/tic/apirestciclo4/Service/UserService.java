package co.mision.tic.apirestciclo4.Service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.mision.tic.apirestciclo4.Model.UserModel;
import co.mision.tic.apirestciclo4.Repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> obtainUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();

    }

    public UserModel saveUser(UserModel user){
        return userRepository.save(user);
    }
    
    public boolean deleteUser(String id){
        if(userRepository.existsById(id)){
            userRepository.deleteById(id);
            return true;
        }else{
            return false;
        } 
    } 
    
    public Optional<UserModel> obtainUserById(String id){
        return userRepository.findById(id);
    }

    public ArrayList<UserModel>obtainUserByName(String nombre){
        return userRepository.findByNombre(nombre);
    }

   


}
