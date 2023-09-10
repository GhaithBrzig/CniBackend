package com.cni.eagleye.dao.repository;

import com.cni.eagleye.dao.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    public Client findByNomAndPrenom(@Param("nom") String nom, @Param("prenom") String prenom);
}
