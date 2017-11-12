/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivodenotas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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





    File archivo;
    /**
     * @param url
     */
    public void CargarDelArchivo(String url,ListaAsignaturas asignaturas) {
        // TODO implement here
       // TODO implement here
        try {
            archivo = new File(url);
        } catch (Exception e) { }
        
        int i = 0;
        System.out.println("___________________________________________");
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader buf = new BufferedReader(fr);
            while (buf.ready()) {
                String frase = buf.readLine();
                StringTokenizer strT = new StringTokenizer(frase);
                while (strT.hasMoreTokens()) {
                    String nombre = strT.nextToken();
                    String area = strT.nextToken();
                    Docente docente = new Docente(nombre,area); 
                    System.out.print("Nombre : "+docente.nombreDocente + " Area: "+docente.areaTrabajo+" Asignaturas:");
                    while (strT.hasMoreTokens()) {
                        String asign = strT.nextToken();
                        docente.agregarAsignatura(asignaturas.ObtenerAsignatura(asign));
                        System.out.print(" "+asign);
                    }
                    System.out.println("");
                    this.docentes.add(docente);
                }
            }
            buf.close();
        } catch (IOException e) {
        }
        System.out.println("___________________________________________");
    }

    /**
     * @param nombreDocente
     */
    public Docente ObtenerDocente(String nombreDocente) {
        // TODO implement here
        int i;
        for(i=0;i<this.docentes.size();i++){
            if(nombreDocente.equals(this.docentes.get(i).nombreDocente)){
                return this.docentes.get(i);
            }
        }
        return null;
    }

}
