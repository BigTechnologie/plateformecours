package fr.dawan.plateformecours.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Formation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idFormation")
    private long id;
    @Column(nullable = false)
    private String nomFormation;
    
    @OneToMany(mappedBy = "formation")
    private List<Cour> cours;
}
