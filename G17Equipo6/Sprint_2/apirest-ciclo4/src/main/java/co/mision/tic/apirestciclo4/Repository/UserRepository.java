package co.mision.tic.apirestciclo4.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.mision.tic.apirestciclo4.Model.UserModel;

@Repository
public interface UserRepository extends MongoRepository<UserModel , String>  {

    UserModel  findByNombre(String nombre);

                
}

