package fr.dawan.plateformecours.entities.users;

import java.time.LocalDate;
import java.util.List;

import fr.dawan.plateformecours.entities.Cour;
import fr.dawan.plateformecours.entities.User;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;

@Entity
public class Formateur extends User {
    
   @OneToMany(mappedBy = "formateur")
   private List<Cour> cours;

    public Formateur(String nom, String prenom, @Email String email, LocalDate dateNaissance, String password, List<Cour> cours) {
        super(nom, prenom, email, dateNaissance, password);
        this.cours = cours;
    }

    public List<Cour> getCours() {
        return cours;
    }

    public void setCours(List<Cour> cours) {
        this.cours = cours;
    }
    
    

}
