/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;
import herencia2.Estudiante;
/**
 *
 * @author reroes
 */
    public class ReporteEstudiante extends Reporte {
    
        double promedioMatriculas;
        ArrayList<Estudiante> lista;
    
    public ReporteEstudiante(String codigo,ArrayList<Estudiante> milista){
        
        super(codigo);
        lista = milista;
        
    
    }

    public void establecerPromedioMatriculas() {
        
        double suma = 0;
        
        for (int i = 0; i< lista.size();i++){
        
            suma = suma + lista.get(i).getMatricula();
        
        }
        
        promedioMatriculas = suma / lista.size();
        
    }

    public void establecerLista(ArrayList<Estudiante> lista) {
        this.lista = lista;
    }

    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }

    public ArrayList<Estudiante> obtenerLista() {
        return lista;
    }
    
    @Override
    
    public String toString(){
    
        String cadena = "Reporte estudiantes\n";
    
        cadena = String.format("%sCodigo: %s\n", 
                cadena,
                codigo);
    
        cadena = String.format("%sLista de estudiantes\n", cadena);
        
        for(int i = 0; i < lista.size(); i++){
            
            Estudiante e = obtenerLista().get(i);
        
            cadena = String.format("%sNombres: %s\n"
                    + "Apellidos: %s\n"
                    + "Edad: %d\n"
                    + "Matricula: %.1f\n",
                    cadena,
                    e.getNombre(),
                    e.getApellido(),
                    e.getEdad(),
                    e.getMatricula());
        
        }
        
        cadena = String.format("%sEl promedio de matriculas es: %.3f\n", 
                cadena,
                obtenerPromedioMatriculas());
        
        return cadena;
        
    }  
    
    
}
