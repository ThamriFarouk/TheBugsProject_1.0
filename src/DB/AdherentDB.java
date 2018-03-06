/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;
import MyModels.Adherent;
import java.sql.ResultSet;
import thebugsproject.CnxOrcl;
import java.sql.SQLException;
/**
 *
 * 
 */
public class AdherentDB {
    
    public static void AjouterAdherent(Adherent adherent) throws SQLException, ClassNotFoundException{
       
            String req="insert into ADHERENT values ('"+adherent.getNom()+
                    "','"+adherent.getPrenom()+"','"+adherent.getAge()+"','"+
                    adherent.getCin()+"','"+ adherent.getNumTel()+"','"+adherent.getEmail()+
                    "','"+adherent.getPoste()+"')";
            
            CnxOrcl.inst.executeQuery(req);
            
        
       

   
    }
    
    
}
