package com.cni.eagleye.controller;

import com.cni.eagleye.service.classes.ClientService;
import com.cni.eagleye.dao.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientService cServ;


    @GetMapping("Display")
    public List<Client> DisplayAllStudent() {
        return cServ.listClient();
    }

    @DeleteMapping("/Remove/{id}")
    public void removeOperateur(@PathVariable("id") int id) {
        cServ.supprimerClient(id);
    }
}
