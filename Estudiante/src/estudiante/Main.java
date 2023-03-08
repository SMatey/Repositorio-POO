/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiante;

/**
 *
 * @author PERSONAL
 */
public class Main {
    public static void main(String[] args) {
        //Crear estudiantes
       Estudiante p1 = new Estudiante("Sebastian", 19, 2023, "Ingenieria en computacion");
       Estudiante p2 = new Estudiante("Juan", 22, 2023, "Electronica");
       Estudiante p3 = new Estudiante("Maria", 20, 2023, "Produccion industrial");
       Estudiante p4 = new Estudiante("Valeria", 21, 2023, "Turismo");
       Estudiante p5 = new Estudiante("Carlos", 18, 2023, "Ingenieria en computacion");
       Estudiante p6 = new Estudiante("Yolanda", 25, 2023, "Produccion  industrial");
       
       //Crear cursos
       Curso c1 = new Curso("Programacion orientada a objetos", "Se trabaja POO con java", 5);
       Curso c2 = new Curso("Taller de programacion", "Se aprende a programar con python", 6);
       
       //Agregar estudiantes a los cursos
         c1.agregarEstudiante(p6);
         c1.agregarEstudiante(p3);
         c1.agregarEstudiante(p1);
         c2.agregarEstudiante(p4);
         c2.agregarEstudiante(p2);
         c2.agregarEstudiante(p5);
         
         //Mostrar informacion de los cursos
         c1.mostrarInformacionCurso();
         c2.mostrarInformacionCurso();
    }
}

