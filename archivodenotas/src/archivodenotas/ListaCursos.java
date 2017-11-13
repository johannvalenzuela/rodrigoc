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
        System.out.println("___________________________________________");
        System.out.println("Lista de Cursos");
        int i;
        for(i=0; i< this.cursos.size(); i++){
            System.out.print((i+1)+") Asignatura: " +this.cursos.get(i).asignatura.nombreAsignatura);
            System.out.print("\t Año: " +this.cursos.get(i).anno);
            System.out.print("\t Semestre: " +this.cursos.get(i).semestre);
            System.out.print("\t Horario: " +this.cursos.get(i).horario);
            System.out.print("\t Sala: " +this.cursos.get(i).sala);
            System.out.println("\t Profesor: " +this.cursos.get(i).docente.nombreDocente);
            
        }
        System.out.println("___________________________________________");
    }
    File archivo;
    public void CargarDelArchivo(String url, ListaAsignaturas asignaturas, ListaDocentes docentes){
        try {
            archivo = new File(url);
        } catch (Exception e) { }
        
        int i = 0;
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
                    this.cursos.add(cursoNuevo);
                    
                }
            }
            buf.close();
        } catch (IOException e) {
        }
    }
}
