package fr.dawan.plateformecours.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Message")
public class Message {
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long idmessage;
        
        @OneToOne
        private User destinataire;
        @OneToOne
        private User expediteur;
        private String message;
        public long getIdmessage() {
                return idmessage;
        }
        public void setIdmessage(long idmessage) {
                this.idmessage = idmessage;
        }
       
        public User getDestinataire() {
            return destinataire;
        }
        public void setDestinataire(User destinataire) {
            this.destinataire = destinataire;
        }
        public User getExpediteur() {
            return expediteur;
        }
        public void setExpediteur(User expediteur) {
            this.expediteur = expediteur;
        }
        public String getMessage() {
                return message;
        }
        public void setMessage(String message) {
                this.message = message;
        } 
        
        
        

}