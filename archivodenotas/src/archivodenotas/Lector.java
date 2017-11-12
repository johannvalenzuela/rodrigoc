package archivodenotas;
/**
 *
 * @author Julinspi
 */
import java.util.*;
import java.io.*;

class Lector
{
	File archivo;
	Lector(String nombreDeArchivo)
	{
		try {
			archivo = new File(nombreDeArchivo);
		    } catch (Exception e) {	}
	}
	Lector()
	{
		// aca el nombre del archivo se lee desde teclado
		try {
		   String nombreDeArchivo = "" ;
                   InputStreamReader isr = new  InputStreamReader(System.in);
		   BufferedReader teclado= new BufferedReader(isr);
		   archivo = new File(nombreDeArchivo);
		} catch (Exception e) {	}
		
	}
	public void leerArchivo(Nota[] N)
	{
     	
	}
	public void leerArchivoDocente(Docente[] D)
	{
            int i=0;
             System.out.println("___________________________________________");
     	     try {
                FileReader fr = new FileReader(archivo); 
	        BufferedReader buf = new BufferedReader(fr);
	        while (buf.ready())
	        {
	          String frase = buf.readLine();
	          StringTokenizer strT = new StringTokenizer(frase);
	          while ( strT.hasMoreTokens())
	          {
	            	String nombre = strT.nextToken();    
                        String area = strT.nextToken();
                        int j;
                        D[i] = new Docente(nombre,area);
	        	
                        D[i].ver();	 
	          }
	        }
	          buf.close();
		} catch (IOException e) {	}	
	    System.out.println("___________________________________________");
     	
	}
}

