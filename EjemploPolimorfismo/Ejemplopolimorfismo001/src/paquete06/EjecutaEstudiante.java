package paquete06;

import java.util.ArrayList;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
         */
        Scanner sc = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        int numeroE;
        int contador;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        System.out.println("Cuantos estudiantes desea ingresar?");
        numeroE = sc.nextInt();

        System.out.println("");

        // inicio de solución
        contador = 0;
        while (contador < numeroE) {

            System.out.println("Tipo de Estudiante a ingresar\n"
                    + "Ingrese (1) para Estudiante Presencial\n"
                    + "Ingrese (2) para Estudiante Distancia\n");

            tipoEstudiante = sc.nextInt();
            sc.nextLine();

            System.out.println("");

            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = sc.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = sc.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = sc.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = sc.nextInt();

            if (tipoEstudiante == 1) {

                System.out.println("Ingrese el número de créditos");
                numeroCreds = sc.nextInt();
                System.out.println("Ingrese el costo de cada créditos");
                costoCred = sc.nextDouble();

                System.out.println("");

                EstudiantePresencial estudianteP = new EstudiantePresencial(
                        nombresEst, apellidosEst, identificacionEst, edadEst,
                        numeroCreds, costoCred);

                estudiantes.add(estudianteP);

            } else {

                System.out.println("Ingrese el número de asignaturas");
                numeroAsigs = sc.nextInt();
                System.out.println("Ingrese el costo de cada cada asignatura");
                costoAsig = sc.nextDouble();

                System.out.println("");

                EstudianteDistancia estudianteD = new EstudianteDistancia(
                        nombresEst, apellidosEst, identificacionEst, edadEst,
                        numeroAsigs, costoAsig);

                estudiantes.add(estudianteD);

            }

            contador = contador + 1;
        }

        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();

            System.out.printf("Datos Estudiante\n"
                    + "%s\n",
                    estudiantes.get(i));

        }
    }

}
