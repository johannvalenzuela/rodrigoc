/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivodenotas;

import java.util.ArrayList;

/**
 *
 * @author Julinspi
 */
public class Docente {
    String NombreDocente ;
    int promedio, sol1, sol2, sol3 ;
    String AreaDeTrabajo;
    ArrayList<String> Asignaturas;
    Docente ( String Docente, String AreaDeTrabajo)
    {
        NombreDocente = Docente  ;
        this.AreaDeTrabajo = AreaDeTrabajo;
        this.Asignaturas = new ArrayList<>();
    }
    public void agregarAsignatura(String asignatura){
        this.Asignaturas.add(asignatura);
    }
    public void ver()
    {
        System.out.print("Nombre : "+NombreDocente + "  Area de trabajo:"+ this.AreaDeTrabajo+" Asignaturas: " );
        int i;
        for(i = 0; i < this.Asignaturas.size() ; i++){
            System.out.print(" "+this.Asignaturas.get(i));
        }
        System.out.println(".");
    }
}
