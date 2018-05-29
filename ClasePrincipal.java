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
public class ClasePrincipal {
    
    public static void main(String[] args){
        
        Estudiantes[] estudiantes= new Estudiantes[5];
        
        estudiantes[0]=new Estudiantes("Fernando", 20);
        estudiantes[1]=new Estudiantes("alison ", 21);
        estudiantes[2]=new Estudiantes("jimena", 19);
        estudiantes[3]=new Estudiantes("elena", 22);
        estudiantes[4]=new Estudiantes("esteban", 21);
        
        String[] m  = {"matematicas","lenguaje"};
        String[] m1  = {"computacion","lenguaje"};
        String[] m2 = {"programacion","matematicas"};
        String[] m3  = {"sociales","lenguaje"};
        String[] m4  = {"matematicas","programacion"};
        estudiantes[0].setmaterias(m);
        estudiantes[1].setmaterias(m1);
        estudiantes[2].setmaterias(m2);
        estudiantes[3].setmaterias(m3);
        estudiantes[4].setmaterias(m4);   
        
  
        
        
        for(int i=0; i<5; i++){
            System.out.println("Se ha ingresado el estudiante con la siguiente informacion");
            System.out.println("Estudiante" + (i+1));
            System.out.println("Estudiante nombre" + estudiantes[i].getnombre() + estudiantes[i].getedad() + estudiantes[i].getmaterias());
            
        }
        
        
        
        
        
        
        
    }
    
}
