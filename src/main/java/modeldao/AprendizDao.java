
package modeldao;

import interfaz.MeAprendiz;
import java.util.List;
import model.Aprendiz;


public class AprendizDao  implements MeAprendiz{

            
    public Aprendiz list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    public List listadoA() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

        
    public boolean registraap(Aprendiz ap) {
        /*String sql="insert into Aprendiz(docu,NombreA,ApellidoA,EmailA,TelefonoA)values('"+ap.getDocuapre()+"','"+ap.getNombre()+"','"+ap.getApellidoA()+"', '"+ap.getCorreoA()+"','"+ap.getTeleapre()+"')";
        try{
        
        }catch(){
        
        }
        return false;
      
    }*/

   
    public boolean actualizarap(Aprendiz ap) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public boolean eliminarap(Aprendiz ap) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

