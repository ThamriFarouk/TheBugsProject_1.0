/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyModels;

/**
 *
 * 
 */
public class Adherent extends Personne {
    
    private String poste;
    
     public Adherent(String nom,String prenom,int age,int cin,int numTel,String email, String poste){
        super(nom,prenom,age,cin,numTel,email);
        this.poste=poste;
    }
    // getters & setters
    
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    
    public String getPrenom(){
        return prenom;
    }
    public void setPrenom(String prenom){
        this.prenom=prenom;
    }
    
    public int getCin(){
        return cin;
    }
    public void setCin(int cin){
        this.cin=cin;
    }
    
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    
    public int getNumTel(){
        return numTel;
    }
    public void setNumTel(int numTel){
        this.numTel=numTel;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    


    public String getPoste(){
        return poste;
    }
    public void setPoste(String poste){
        this.poste=poste;
    }
}
