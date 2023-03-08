/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiante;
// alt + insert
/**
 *
 * @author PERSONAL
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private int anioActual = 2023;
    private String carrera;
    
    //Constructor
    public Estudiante(String nombre, int edad, int anioActual, String carrera){
        this.nombre = nombre;
        this.edad = edad;
        this.anioActual = anioActual;
        this.carrera = carrera;
    }
    
    //Metodos get
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public int getAnioActual(){
        return anioActual;
    }
    
    public String getCarrera(){
        return carrera;
    }
    
    //Metodos set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void setAnioActual(int anioActual){
        this.anioActual = anioActual;
    }
    
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
}
