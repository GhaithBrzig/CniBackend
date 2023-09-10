package com.cni.eagleye.dao.entities;


import java.io.Serializable;

import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Client")
public class Client implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idClient")
    private Integer idClient;
    private String nom;
    private String prenom;
    private String password;
    private String email;
private String username;

    @OneToOne(cascade = CascadeType.REMOVE)
    private User user;

    @Override
    public String toString() {
        return "Client [idClient=" + idClient + ", nomE=" + nom + ", prenomE=" + prenom +
                 ", password=" + password + ", email=" + email + "]";
    }

}