package co.mision.tic.apirestciclo4.Repository;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.mision.tic.apirestciclo4.Model.UserModel;

@Repository
public interface UserRepository extends MongoRepository<UserModel , String>  {

    ArrayList<UserModel> findByNombre(String nombre); 

    

                
}

