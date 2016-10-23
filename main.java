import java.util.*;
import java.io.*;

public class main {
		
    private static Paciente file;
    private static String texto,texto1;
    private static VectorHeap<String> vec;
	
	
    public static void main (String[] args) {
	try{	
            String [] personas=new String [100];
            System.out.println("\nEmergencias Hospital.\n");
            file = new Paciente();
             texto = file.leerArchivo("paciente.txt");
            texto1="";
             vec = new VectorHeap<String>();
             
            for (String texto1:texto.split("\n")){
            	String texto3 = texto1.substring(texto1.length()-1);
            	vec.add(texto3);				
            }	
	
            System.out.println(" Prioridad   Nombre        ");
            while(!vec.isEmpty()){
                System.out.println("    " + vec.removeFirst());
            }
	}catch (Exception e){
            System.err.println("Archivo no encontrado:\n" + e.getMessage());
        }
	
    }

}
