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
 * @author johan
 */
public class ListaCursos {
    ArrayList<Curso> cursos;
    
    ListaCursos(){
        cursos = new ArrayList<>();
    }
    public void ver(){
        
    }
    File archivo;
    public void cargarDelArchivo(String url, ListaAsignaturas asignaturas, ListaDocentes docentes){
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
                    
                    Asignatura asignatura =asignaturas.ObtenerAsignatura(strT.nextToken());
                    int semestre = Integer.parseInt(strT.nextToken());
                    int anno = Integer.parseInt(strT.nextToken());
                    Docente profesor = docentes.ObtenerDocente(strT.nextToken());
                    String horario = strT.nextToken();
                    String sala = strT.nextToken();
                    Curso cursoNuevo = new Curso(asignatura,semestre,anno,profesor, horario,sala);
                    //System.out.println("Nombre : "+curso.nombreAlumno + " Notas: "+alumno.VerNotas()+" Promedio: "+ alumno.VerPromedio() );
                    this.cursos.add(cursoNuevo);
                    
                }
            }
            buf.close();
        } catch (IOException e) {
        }
        System.out.println("___________________________________________");
    }
}
