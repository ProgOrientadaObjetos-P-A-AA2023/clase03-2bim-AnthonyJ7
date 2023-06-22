/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

public class EstudianteDistancia extends Estudiante {

    /*1.  Declarar
        numeroAsignaturas: Entero 
        costoAsginatura: Real 
     */

    int numeroAsignaturas;
    double costoAsignatura;

    //  Métodos establecer y calcular para los datos o atributos de la clase
    public EstudianteDistancia(String nombre, String apellido, String id,
            int edad, int na, double ca) {

        super(nombre, apellido, id, edad);
        numeroAsignaturas = na;
        costoAsignatura = ca;
    }

    // 2.  Método establecerNumeroAsginaturas(numero: Real)
    public void establecerNumeroAsginaturas(int numero) {
        numeroAsignaturas = numero;
    }

    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecerCostoAsignatura(double valor) {
        costoAsignatura = valor;
    }

    // 4.  Método calcularMatriculaDistancia()
    @Override
    public void calcularMatricula() {
        matricula = numeroAsignaturas * costoAsignatura;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroAsignaturas() : Entero
    public int obtenerNumeroAsignaturas() {
        return numeroAsignaturas;
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public double obtenerCostoAsignatura() {
        return costoAsignatura;
    }

    @Override
    public String toString() {
        String cadena = String.format("Estudiante Distancia:\nNombres: %s\n"
                + "Apellidos: %s\nIdentificacion: %s\nEdad: %d\nNumero "
                + "Asignaturas: %d\nCosto de las Asignaturas: %.2f\nCosto de "
                + "Matricula: %.2f\n",
                nombresEstudiante, apellidosEstudiante, identificacionEstudiante,
                edadEstudiante, numeroAsignaturas, costoAsignatura, matricula);
        return cadena;
    }

}
