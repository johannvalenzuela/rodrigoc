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
public class ListaAsignaturas {

    /**
     *
     */
    public ArrayList<Asignatura> asignaturas;

    /**
     * Default constructor
     */
    public ListaAsignaturas() {
        asignaturas = new ArrayList<>();
    }

    public void AgregarAsignatura(Asignatura nuevaAsignatura) {
        this.asignaturas.add(nuevaAsignatura);
    }

    public Asignatura ObtenerAsignatura(String nombreAsignatura) {
        int i;
        for (i = 0; i < this.asignaturas.size(); i++) {
            if (nombreAsignatura.equals(this.asignaturas.get(i).nombreAsignatura)) {
                return this.asignaturas.get(i);
            }
        }
        return null;
    }
    File archivo;

    /**
     * @param url
     */
    public void CargarDelArchivo(String url) {
        // TODO implement here
        try {
            archivo = new File(url);
        } catch (Exception e) {
        }
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader buf = new BufferedReader(fr);
            while (buf.ready()) {
                String frase = buf.readLine();
                StringTokenizer strT = new StringTokenizer(frase);
                while (strT.hasMoreTokens()) {
                    String nombre = strT.nextToken();
                    Asignatura asignatura = new Asignatura(nombre);
                    this.asignaturas.add(asignatura);
                }
            }
            buf.close();
        } catch (IOException e) {
        }
    }

    public void ver() {
        System.out.println("___________________________________________");
        System.out.println("Lista Asignaturas");
        int i;
        for(i=0; i< this.asignaturas.size(); i++ ) {
            System.out.println("Nombre : " + this.asignaturas.get(i).nombreAsignatura);
        }
        System.out.println("___________________________________________");
    }
}
