package com.cni.eagleye.service.classes;

import com.cni.eagleye.dao.entities.Client;
import com.cni.eagleye.dao.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository cRep;

    public void supprimerClient(int id) {
        cRep.deleteById(id);
    }
    public List<Client> listClient() {
        List<Client> clients =(List<Client>) cRep.findAll();
        return clients;
    }
}
