package archivodenotas;

import java.util.*;

/**
 *
 */
public class Alumno {

    /**
     *
     */
    public String nombreAlumno;

    /**
     *
     */
    public ArrayList<Nota> notas;

    /**
     * Default constructor
     */
    Alumno(String nombre) {
        nombreAlumno = nombre;
        notas = new ArrayList<Nota>();
    }

    Alumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    public String VerNotas() {
        // TODO implement here
        String todasLasNotas = "";
        int i;
        for (i = 0; i < notas.size(); i++) {
            todasLasNotas = todasLasNotas+" "+notas.get(i).Valor;
        }
        return todasLasNotas;
    }

    /**
     * @param nuevaNota
     */
    public void AgregarNota(Nota nuevaNota) {
        // TODO implement here
        this.notas.add(nuevaNota);
    }

    /**
     *
     */
    public int VerPromedio() {
        // TODO implement here
        int i, promedio, acumulado = 0;
        for (i = 0; i < notas.size(); i++) {
            acumulado = acumulado + notas.get(i).Valor;
        }
        promedio = acumulado/notas.size();
        return promedio;
    }
}
