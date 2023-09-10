package com.cni.eagleye.service.classes;


import com.cni.eagleye.dao.entities.User;
import com.cni.eagleye.dao.repository.ClientRepository;
import com.cni.eagleye.dao.repository.UserRepository;
import com.cni.eagleye.dao.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRep;

    @Autowired
    ClientRepository cRep;

    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public User findUserByUserName(String unserName) {
        return this.userRep.findByUserName(unserName);
    }

    public Client saveUser(Client e) {
        User u = new User();
        u.setEmail(e.getEmail());
        u.setUserName(e.getUsername());
        u.setRole("CLIENT");
        u.setPassword(bCryptPasswordEncoder.encode(e.getPassword()));
        e.setPassword(bCryptPasswordEncoder.encode(e.getPassword()));
        u.setActive(true);
        User uu = this.userRep.save(u);
        e.setUser(uu);
        return this.cRep.save(e);
    }
}
