package fr.dawan.plateformecours.entities;

import fr.dawan.plateformecours.entities.users.Formateur;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Cour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCour")
    private long id;
    @Column(nullable = false)
    private String nomCour;
    
    @ManyToOne
    private Formateur formateur;
    
    @ManyToOne
    private Formation formation;
}
