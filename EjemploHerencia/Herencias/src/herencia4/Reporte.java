/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Reporte {
    
   protected String codigo;
   
   public Reporte(String cod){
       
       codigo = cod;

    }

    public void establecerCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String obtenerCodigo() {
        return codigo;
    }
   
   
}
