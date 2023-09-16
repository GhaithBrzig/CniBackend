package com.cni.eagleye.dao.entities;

import lombok.*;

import javax.persistence.*;

import java.util.Date;


@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "csv_file")

public class CsvFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEmp")
    private Long id;

    private int matricule;
    private int mois;
    private int annee;
    private int type_paie;
    private int codind;
    private double montant_ind;
    private int nature_ind;
    private int grd;
    private int cat;
    private int corps;
    private int codfam;
    private int codsfam;
    private int indice;
    private int nature;
    private int fonc;
    private int dire;
    private int sdir;
    private int serv;
    private int centreg;
    private int gouv;
    private int gouvn;
    private int natorg;
    private int budg;
    private int sitfam;
    private int sexe;
    private double montant_ind_masse_salariale;

}
