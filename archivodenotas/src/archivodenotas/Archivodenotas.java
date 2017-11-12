package archivodenotas;

import java.util.*;

/**
 *
 * @author Julinspi
 */
public class Archivodenotas {
    public static void mostrarMenuPrincipal(){
        System.out.println("---------------");
        System.out.println("MENU PRINCIPAL");
        System.out.println("---------------");
        System.out.println("1) Lista de cursos");
        System.out.println("2) Lista de docentes");
        System.out.println("3) Lista de Alumnos");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaAsignaturas todasLasAsignaturas = new ListaAsignaturas();
        todasLasAsignaturas.CargarDelArchivo("C:\\Users\\johan\\Desktop\\rodrigoc\\archivodenotas\\build\\classes\\archivodenotas\\Asignaturas.txt");
        
        ListaAlumnos todosLosAlumnos = new ListaAlumnos();
        todosLosAlumnos.CargarDelArchivo("C:\\Users\\johan\\Desktop\\rodrigoc\\archivodenotas\\build\\classes\\archivodenotas\\Alumnos.txt");
        
        ListaDocentes todosLosDocentes = new ListaDocentes();
        todosLosDocentes.CargarDelArchivo("C:\\Users\\johan\\Desktop\\rodrigoc\\archivodenotas\\build\\classes\\archivodenotas\\Docentes.txt", todasLasAsignaturas);
        
        int opcion = 0;
        while(opcion!=5){
            mostrarMenuPrincipal();
            System.out.println("Ingresa tu alternativa ");
            Scanner scanner = new Scanner(System.in);
            opcion = Integer.parseInt(scanner.nextLine());
            switch(opcion){
                case 1:
                    todasLasAsignaturas.ver();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5: 
                    break;
                default :
                    break;
            }
        }
    }
}