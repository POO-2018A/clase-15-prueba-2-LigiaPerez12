/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

/**
 *
 * @author ESFOT
 */
public class Estudiantes {

    private String nombre;
    private int edad;
    private String[] materias;
    private int nivel;
    String getedad;
    
    public Estudiantes(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
        
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public String getnombre(){
        return nombre;
    }
    
    public void setedad(int edad){
        this.edad=edad;
    }
    
    public int getedad(){
        return edad;
        
    }
    
    public void setnivel(int nivel){
        this.nivel=nivel;
    }
    
    
    public int getnivel(){
        return nivel;
    }
    public void setmaterias(String[] materias){
        this.materias=materias;
    }
    
    public String[] getmaterias(){
        return materias;
    }
    
    
    
}
