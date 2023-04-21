
package modeldao;

import config.Conexion;
import interfaz.MeAprendiz;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import model.Aprendiz;


public class AprendizDao  implements MeAprendiz{

    Conexion co= new Conexion();
    Connection cn;
    PreparedStatement pc;
    ResultSet rs;
    Aprendiz ape = new Aprendiz();
    
    public Aprendiz list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    public List listadoA() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

        
    public boolean registraap(Aprendiz ap) {
        
        String sql="insert into Aprendiz(docu,NombreA,ApellidoA,EmailA,TelefonoA)values('"+ap.getDocuapre()+"','"+ap.getNombre()+"','"+ap.getApellidoA()+"', '"+ap.getCorreoA()+"','"+ap.getTeleapre()+"')";
        try{
        cn=co.getConnection();
        pc=cn.prepareStatement(sql);
        pc.executeUpdate();
       /* while(rs.next()){
            ape.setId(rs.getInt("id"));
            ape.setDocuapre(rs.getInt("Docu"));
            ape.setNombre(rs.getString("NombreA"));
            ape.setApellidoA(rs.getString("ApellidoA"));
            ape.setCorreoA(rs.getString("CorreoA"));
            ape.setTeleapre(rs.getString("TelefonoA"));*/
        
        }catch(Exception e){
        
        }
        return false;
      
    }

   
    public boolean actualizarap(Aprendiz ap) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public boolean eliminarap(Aprendiz ap) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

