/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiante;

/**
 *
 * @author PERSONAL
 */
public class Curso {
   private  String nombre;
   private String descri;
   private int capMax;
   private Estudiante[] estudiantes;
   private int cont = 0;
            
   //Constructor
   public Curso(String nombre, String descri, int capMax){
       this.nombre = nombre;
       this.descri = descri;
       this.capMax = capMax;
       this.estudiantes = new Estudiante[capMax];
       this.cont = 0;
   } 
   
   //================================Metodo get=================================
   public String getNombre(){
       return nombre;
   }
   
   public String getDescri(){
       return descri;
   }
   
   public int getCapMax(){
       return capMax;
   }
   
   public Estudiante[] getEstudiantes(){
       return estudiantes;
   }
   
   public int getCont(){
       return cont;
   }
   
   //================================Metodo set===========================
   public void setNombre(String nombre){
       this.nombre = nombre;
   }
   
   public void setDescri(String descri){
       this.descri = descri;
   }
   
   public void setCapMax(int capMax){
       this.capMax = capMax;
   }
   
   //========================AGREGAR ESTUDIANTE==============================
    public void agregarEstudiante(Estudiante e){
       if(cont < capMax){
           estudiantes[cont] = e;
           cont ++;
       }
       else{
           System.out.println("<<La clase ya esta llena>>");
       }       
    }
    
    //=========================MOSTRAR INFORMACION DEL CURSO===============
    public void mostrarInformacionCurso(){
        System.out.println("Nombre del curso: " + nombre);
        System.out.println("Descripcion: " + descri);
        System.out.println("Capacidad maxima: " + capMax);
        System.out.println("==========Estudiantes==========");
        for(int i = 0; i < cont; i++){
            System.out.println(estudiantes[i].getNombre());
        }
        System.out.println("===================================");
    }
}
