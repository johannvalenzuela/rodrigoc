package archivodenotas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 *
 */
public class ListaAlumnos {



    /**
     *
     */
    public ArrayList<Alumno> alumnos;

        /**
     * Default constructor
     */
    public ListaAlumnos() {
        alumnos= new ArrayList<>();
    }
    File archivo;

    /**
     * @param url
     */
    public void CargarDelArchivo(String url) {
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
                    Nota S1 = new Nota(Integer.parseInt(strT.nextToken()));
                    Nota S2 = new Nota(Integer.parseInt(strT.nextToken()));
                    Nota S3 = new Nota(Integer.parseInt(strT.nextToken()));
                    Alumno alumno = new Alumno(nombre); 
                    alumno.AgregarNota(S1);
                    alumno.AgregarNota(S2);
                    alumno.AgregarNota(S3);
                    System.out.println("Nombre : "+alumno.nombreAlumno + " Notas: "+alumno.VerNotas()+" Promedio: "+ alumno.VerPromedio() );
                    this.alumnos.add(alumno);
                    
                }
            }
            buf.close();
        } catch (IOException e) {
        }
        System.out.println("___________________________________________");
    }

    /**
     * @param nombreAlumno
     */
    public Alumno ObtenerAlumno(String nombreAlumno) {
        // TODO implement here
        int i;
        for(i=0;i<this.alumnos.size();i++){
            if(nombreAlumno.equals(this.alumnos.get(i).nombreAlumno)){
                return this.alumnos.get(i);
            }
        }
        return null;
    }

}
