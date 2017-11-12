package archivodenotas;

import java.util.*;

/**
 * 
 */
public class Curso {

    /**
     * 
     */
    public String horario;
    public int semestre;
    public int anno;

    /**
     * 
     */
    public String sala;

    /**
     * 
     */
    public ArrayList<Alumno> alumnos;

    /**
     * 
     */
    public Docente docente;

    /**
     * 
     */
    public Asignatura asignatura;



    /**
     * Default constructor
     */
    public Curso(Asignatura asignatura, int anno, int semestre,Docente docente,String hora, String sala) {
        this.anno = anno;
        this.semestre = semestre;
        this.sala = sala;
        this.docente = docente;
        this.horario = hora;
        this.asignatura = asignatura;
        this.alumnos = new ArrayList<>();
    }


    /**
     * 
     */
    public void VerListaCursos() {
        // TODO implement here
    }

    /**
     * 
     */
    public void VerAlumnos() {
        // TODO implement here
    }

    /**
     * @param nuevoAlumno
     */
    public void InscribirAlumno(Alumno nuevoAlumno) {
        // TODO implement here
        this.alumnos.add(nuevoAlumno);
    }

}
