/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyModels;

/**
 *
 * @author abir
 */
public class Personne {
    
    protected String nom;
    protected String prenom;
    protected int cin;
    protected int age;
    protected int numTel;
    protected String email;
    
    //contructeur
    
    public Personne(String nom,String prenom,int cin,int age,int numTel,String email){
        this.nom=nom;
        this.prenom=prenom;
        this.cin=cin;
        this.age=age;
        this.numTel=numTel;
        this.email=email;
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
    
}
