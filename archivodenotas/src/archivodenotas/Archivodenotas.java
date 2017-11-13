package archivodenotas;

import java.util.*;

/**
 *
 * @author Julinspi
 */
public class Archivodenotas {

    static ListaAsignaturas todasLasAsignaturas;
    static ListaAlumnos todosLosAlumnos;
    static ListaDocentes todosLosDocentes;
    static ListaCursos todosLosCursos;

    public static void mostrarMenuPrincipal() {
        System.out.println("---------------");
        System.out.println("MENU PRINCIPAL");
        System.out.println("---------------");
        System.out.println("1) Lista de asignaturas");
        System.out.println("2) Lista de cursos");
        System.out.println("3) Lista de docentes");
        System.out.println("4) Lista de alumnos");
        System.out.println("5) Menú de cursos");
        System.out.println("6) Salir");
    }

    public static void mostrarMenuCursos() {
        System.out.println("---------------");
        System.out.println("MENU CURSOS");
        System.out.println("---------------");
        System.out.println("1) Agregar Curso");
        System.out.println("2) Agregar Alumno a Curso");
        System.out.println("3) Ver notas de un curso");
        System.out.println("4) Volver");
    }

    public static void agregarCurso() {
        todasLasAsignaturas.ver();
        System.out.println("Ingresa nombre de asignatura");
        Scanner scanner = new Scanner(System.in);
        Asignatura asignatura = todasLasAsignaturas.ObtenerAsignatura(scanner.nextLine());
        todosLosDocentes.ver();
        System.out.println("Ingresa nombre del docente");
        Docente docente = todosLosDocentes.ObtenerDocente(scanner.nextLine());
        System.out.println("Ingresa semestre del curso");
        int semestre = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingresa año del curso");
        int anno = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingresa horario del curso");
        String horario = scanner.nextLine();
        System.out.println("Ingresa sala del curso");
        String sala = scanner.nextLine();
        todosLosCursos.cursos.add(new Curso(asignatura, anno, semestre, docente, horario, sala));
    }

    public static void verNotasDeCurso() {
        todosLosCursos.ver();
        System.out.println("Ingrese NUMERO del curso");
        Scanner scanner = new Scanner(System.in);
        int posicionCurso = Integer.parseInt(scanner.nextLine());
        todosLosCursos.cursos.get(posicionCurso).VerAlumnos();
    }

    public static void agregarAlumnoACurso() {
        todosLosCursos.ver();
        System.out.println("Ingrese NUMERO del curso");
        Scanner scanner = new Scanner(System.in);
        int posicionCurso = Integer.parseInt(scanner.nextLine());
        todosLosAlumnos.ver();
        System.out.println("Ingresa nombre del alumno");
        Alumno alumno = todosLosAlumnos.ObtenerAlumno(scanner.nextLine());
        System.out.println("Ingresa las notas del alumno separadas por un espacio");
        StringTokenizer strT = new StringTokenizer(scanner.nextLine(), " ");
        while (strT.hasMoreTokens()) {
            Nota nota = new Nota(Integer.parseInt(strT.nextToken()));
            alumno.AgregarNota(nota);
        }
        todosLosCursos.cursos.get(posicionCurso).alumnos.add(alumno);
    }

    public static void menuCursos() {
        int opcion = 0;
        while (opcion != 4) {
            mostrarMenuCursos();
            System.out.println("Ingresa tu alternativa: ");
            Scanner scanner = new Scanner(System.in);
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1:
                    agregarCurso();
                    break;
                case 2:
                    agregarAlumnoACurso();
                    break;
                case 3:
                    verNotasDeCurso();
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        todasLasAsignaturas = new ListaAsignaturas();
        todasLasAsignaturas.CargarDelArchivo("C:\\Users\\johan\\Desktop\\rodrigoc\\archivodenotas\\build\\classes\\archivodenotas\\Asignaturas.txt");

        todosLosAlumnos = new ListaAlumnos();
        todosLosAlumnos.CargarDelArchivo("C:\\Users\\johan\\Desktop\\rodrigoc\\archivodenotas\\build\\classes\\archivodenotas\\Alumnos.txt");

        todosLosDocentes = new ListaDocentes();
        todosLosDocentes.CargarDelArchivo("C:\\Users\\johan\\Desktop\\rodrigoc\\archivodenotas\\build\\classes\\archivodenotas\\Docentes.txt", todasLasAsignaturas);

        todosLosCursos = new ListaCursos();
        todosLosCursos.CargarDelArchivo("C:\\Users\\johan\\Desktop\\rodrigoc\\archivodenotas\\build\\classes\\archivodenotas\\Cursos.txt", todasLasAsignaturas, todosLosDocentes);

        int opcion = 0;
        while (opcion != 6) {
            mostrarMenuPrincipal();
            System.out.println("Ingresa tu alternativa ");
            Scanner scanner = new Scanner(System.in);
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1:
                    todasLasAsignaturas.ver();
                    break;
                case 2:
                    todosLosCursos.ver();
                    break;
                case 3:
                    todosLosDocentes.ver();
                    break;
                case 4:
                    todosLosAlumnos.ver();
                    break;
                case 5:
                    menuCursos();
                    break;
                default:
                    break;
            }
        }
    }
}
