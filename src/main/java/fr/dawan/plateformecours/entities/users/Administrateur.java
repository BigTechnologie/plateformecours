package fr.dawan.plateformecours.entities.users;

import java.time.LocalDate;

import fr.dawan.plateformecours.entities.User;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;

@Entity
public class Administrateur extends User {

    public Administrateur(String nom, String prenom, @Email String email, LocalDate dateNaissance, String password) {
        super(nom, prenom, email, dateNaissance, password);
        // TODO Auto-generated constructor stub
    }

}
