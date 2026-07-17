package com.empolyee.repository;

import com.empolyee.model.entity.EmpolyeeBE;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IEmpolyeerepository extends MongoRepository<EmpolyeeBE, String> {

    boolean existsByEmail(String email);

    Optional<EmpolyeeBE> findByemail(String email);
}