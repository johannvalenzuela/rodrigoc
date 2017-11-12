/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivodenotas;

import java.util.*;

/**
 * 
 */
public class ListaDocentes {

    /**
     * 
     */
    public ArrayList<Docente> docentes;    
    
    /**
     * Default constructor
     */
    public ListaDocentes() {
        docentes = new ArrayList<>();
    }






    /**
     * @param url
     */
    public void CargarDelArchivo(String url) {
        // TODO implement here
    }

    /**
     * @param nombreDocente
     */
    public Docente ObtenerDocente(String nombreDocente) {
        // TODO implement here
        int i;
        for(i=0;i<this.docentes.size();i++){
            if(nombreDocente.equals(this.docentes.get(i).NombreDocente)){
                return this.docentes.get(i);
            }
        }
        return null;
    }

}
