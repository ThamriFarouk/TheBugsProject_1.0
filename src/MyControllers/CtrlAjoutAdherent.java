/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyControllers;
import MyModels.Adherent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import DB.AdherentDB;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abir
 */
public class CtrlAjoutAdherent implements ActionListener {
    private JTextField nom;
	private JTextField prenom;
	private JTextField age;
        private JTextField cin;
        private JTextField numtel;
        private JTextField email;
	private JComboBox comboxPoste;

	public CtrlAjoutAdherent(JTextField nom, JTextField prenom,JTextField age, 
        JTextField cin,JTextField numtel,JTextField email,JComboBox comboxPoste ){
		super();
		this.nom = nom;
		this.prenom =prenom;
		this.age = age;
		this.cin = cin;
		this.numtel = numtel;
                this.email=email;
                this.comboxPoste=comboxPoste;
	}

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String nomAdh= nom.getText();
            String prenomAdh= prenom.getText();
            int ageAdh=Integer.parseInt(age.getText()) ;
            int cinAdh=Integer.parseInt(cin.getText());
            int numtelAdh= Integer.parseInt(numtel.getText());
            String emailAdh=email.getText();
            String PosteAdh=comboxPoste.getSelectedItem().toString();
            Adherent adh = new Adherent(nomAdh, prenomAdh, ageAdh, cinAdh,numtelAdh, emailAdh, PosteAdh);
            
            try {
                AdherentDB.AjouterAdherent(adh);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CtrlAjoutAdherent.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CtrlAjoutAdherent.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
    }
    
}
