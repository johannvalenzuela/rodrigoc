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
    /**
     * 
     */
    public String nombreDocente;

    /**
     * 
     */
    public String areaTrabajo;

    /**
     * 
     */
    public ArrayList<Asignatura> nominaAsignaturas;

    Docente ( String Docente, String AreaDeTrabajo){
        nombreDocente = Docente  ;
        this.areaTrabajo = AreaDeTrabajo;
        this.nominaAsignaturas = new ArrayList<>();
    }
    public void agregarAsignatura(Asignatura asignatura){
        this.nominaAsignaturas.add(asignatura);
    }
}
