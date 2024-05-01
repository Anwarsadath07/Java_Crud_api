package com.example.crudapi.repository;


import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.crudapi.model.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
   
    Optional<Role> findByAuthority(String authority);
   
}