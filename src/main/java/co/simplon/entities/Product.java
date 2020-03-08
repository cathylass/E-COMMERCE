package co.simplon.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor   // permet de générer un constructeur avec toutes les variables de la classe
@NoArgsConstructor    //génère un constructeur par défaut sans paramètres.
@ToString             //renvoie une chaîne de caractères représentant l'objet.
public class Product implements Serializable {

@Id @GeneratedValue(strategy = GenerationType.IDENTITY) //permet de mappé
//attributs
    private Long id;
    private String designation;
    private double price;
    private int quantity;


}
