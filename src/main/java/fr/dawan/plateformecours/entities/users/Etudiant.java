package fr.dawan.plateformecours.entities.users;

import java.time.LocalDate;

import fr.dawan.plateformecours.entities.Formation;
import fr.dawan.plateformecours.entities.User;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;

@Entity
public class Etudiant extends User{

    @ManyToOne
    private Formation formation;
    
    public Etudiant(String nom, String prenom, @Email String email, LocalDate dateNaissance, String password, Formation formation) {
        super(nom, prenom, email, dateNaissance, password);
        this.formation = formation;
    }

}
