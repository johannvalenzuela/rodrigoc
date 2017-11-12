package archivodenotas;

/**
 *
 * @author Julinspi
 */
public class Archivodenotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cupo = 45 ;
        ListaAlumnos todosLosAlumnos = new ListaAlumnos();
        todosLosAlumnos.CargarDelArchivo("C:\\Users\\johan\\Desktop\\rodrigoc\\archivodenotas\\build\\classes\\archivodenotas\\Alumnos.txt");
        // Lector leedor = new Lector(");
        // Nota[] nominaNotas = new Nota[cupo];
        // leedor.leerArchivo(nominaNotas);
        // leedor = new Lector("C:\\Users\\johan\\Desktop\\rodrigoc\\archivodenotas\\build\\classes\\archivodenotas\\Docentes.txt");
        // Docente[] nominaDocentes = new Docente[cupo];
        // leedor.leerArchivoDocente(nominaDocentes);
    }
    
}

