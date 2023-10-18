package fr.dawan.plateformecours.entities;

import fr.dawan.plateformecours.entities.users.Etudiant;
import fr.dawan.plateformecours.entities.users.Formateur;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Contenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String titre;
    private String description;
    
    @ManyToOne
    private Formateur formateur;
    
    @ManyToOne
    private Etudiant etudiant;
    
}
