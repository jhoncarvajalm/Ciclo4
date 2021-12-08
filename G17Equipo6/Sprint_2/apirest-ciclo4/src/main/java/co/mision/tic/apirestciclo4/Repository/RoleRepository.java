package co.mision.tic.apirestciclo4.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.mision.tic.apirestciclo4.Model.RoleModel;

public interface RoleRepository extends MongoRepository<RoleModel, String> {
    
}
