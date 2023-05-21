package com.telcotec.eagleye.dao.entities;


import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Technicien")
public class Technicien implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idTechnicien")
    private Integer idTechnicien;
    private String nom;
    private String prenom;
    private String password;
    private String email;


    @OneToOne
    private User user;

    @Override
    public String toString() {
        return "Technicien [idTechnicien=" + idTechnicien + ", nomE=" + nom + ", prenomE=" + prenom +
                 ", password=" + password + ", email=" + email + "]";
    }

}