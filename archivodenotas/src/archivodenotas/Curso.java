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
        System.out.println("___________________________________________");
        System.out.println("Lista de Alumnos");
        int i,j;
        for(i=0; i< this.alumnos.size(); i++){
            System.out.print("Nombre: " +this.alumnos.get(i).nombreAlumno+" Notas:");
            for(j=0;j<this.alumnos.get(i).notas.size();j++){
                System.out.print(" "+this.alumnos.get(i).notas.get(j).Valor);
            }
            System.out.print(" Promedio: "+this.alumnos.get(i).VerPromedio());
        }
        System.out.println("___________________________________________");
    }

    /**
     * @param nuevoAlumno
     */
    public void InscribirAlumno(Alumno nuevoAlumno) {
        // TODO implement here
        this.alumnos.add(nuevoAlumno);
    }

}
