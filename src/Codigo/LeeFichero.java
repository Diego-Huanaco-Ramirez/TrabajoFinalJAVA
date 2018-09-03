/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import static Codigo.Intranet.alumno;
import static Codigo.Intranet.asigAl;
import static Codigo.Intranet.asigDat;
import static Codigo.Intranet.contAsig;
import java.io.*;

 
public class LeeFichero {
    public static File archivoDatal = null;
    public static File archivoAsigal = null;
    public static File archivoDatasig = null;
    
    public LeeFichero() {
      
 
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivoDatal = new File ("datosAlumno.txt");
            archivoAsigal = new File("asignaturasAlumnos.txt");
            archivoDatasig = new File("datosAsignatura.txt");
        }
        catch(Exception e){
             System.out.println("El archivo no existe");
      }
   }

    public static boolean comparaDatos(String text) throws IOException
    {
        FileReader fr = null;
        fr = new FileReader (archivoDatal);
        BufferedReader br = null;
        br = new BufferedReader(fr);
        String linea;
        String cadena[];
        
        while((linea = br.readLine()) != null){
            if(linea.substring(0, linea.indexOf(";")).equalsIgnoreCase(text)){
                cadena = linea.split(";");
                alumno[0] = new Alumno(cadena[0], cadena[1], cadena[2], cadena[3]);
                try{                    
                    if( null != fr ){   
                        fr.close();     
                    }                  
                }catch (Exception e2){ 
                    e2.printStackTrace();
                }
            return true;
            }              
        }
        try{                    
            if( null != fr ){   
               fr.close();     
            }                  
        }catch (Exception e2){ 
            e2.printStackTrace();
        }
         return false;
            
    }
    
    public static void leerAsignaturas() throws IOException
    {
        FileReader fr = null;
        fr = new FileReader (archivoAsigal);
        BufferedReader br = null;
        br = new BufferedReader(fr);
        String linea;
        String cadena[];
        int i = 0;
        
        while((linea = br.readLine()) != null){
            if(linea.substring(0, linea.indexOf(";")).equalsIgnoreCase(alumno[0].getRut())){
                 cadena = linea.split(";");
                 asigAl[i++] = new AsignaturasAlumno(cadena[1], cadena[2], cadena[3], cadena[4], cadena[5]); 
                 contAsig = i; 
            }
        }
        try{                    
            if( null != fr ){   
               fr.close();     
            }                  
        }catch (Exception e2){ 
            e2.printStackTrace();
        }
    }
    
    public static void leerDatosasig() throws IOException
    {
        FileReader fr = null;
        fr = new FileReader (archivoDatasig);
        BufferedReader br = null;
        br = new BufferedReader(fr);
        String linea;
        String cadena[];
        int i = 0;
        
        while((linea = br.readLine()) != null){
                cadena = linea.split(";");
                asigDat[i++] = new Asignaturas(cadena[0],cadena[1], cadena[2], cadena[3], cadena[4]);
        }   
        try{                    
            if( null != fr ){   
               fr.close();     
            }                  
        }catch (Exception e2){ 
            e2.printStackTrace();
        }
    }
    
    public static int AlumnoPoraño(String año) throws IOException
    {
        FileReader fr = null;
        fr = new FileReader (archivoDatal);
        BufferedReader br = null;
        br = new BufferedReader(fr);
        String linea;
        String cadena[];
        int cont = 0;
        
        while((linea = br.readLine()) != null){
            cadena = linea.split(";");
            if(cadena[2].equalsIgnoreCase(año))
            {
                cont++;
            }
        }
        try{                    
            if( null != fr ){   
               fr.close();     
            }                  
        }catch (Exception e2){ 
            e2.printStackTrace();
        }
        return cont;
    }
    
    public static double AlumnoSexo( String sexo) throws IOException
    {
        FileReader fr = null;
        fr = new FileReader (archivoDatal);
        BufferedReader br = null;
        br = new BufferedReader(fr);
        String linea;
        String cadena[];
        double cont = 0;
        double contalumno = 0;
        double redondeo;
        
        while((linea = br.readLine()) != null){
            cadena = linea.split(";");
            contalumno++;
            if(cadena[3].equalsIgnoreCase(sexo))
            {
                cont++;
            }
        }
        try{                    
            if( null != fr ){   
               fr.close();     
            }                  
        }catch (Exception e2){ 
            e2.printStackTrace();
        }
        redondeo = ( (cont / contalumno) * 100);
        return Math.rint(redondeo * 100)/100;
        
    }
    
    public static double Alumnoaprob( String cod, String año) throws IOException
    {
        FileReader fr = null;
        fr = new FileReader (archivoAsigal);
        BufferedReader br = null;
        br = new BufferedReader(fr);
        String linea;
        String cadena[];
        double cont = 0;
        double contalumno = 0;
        double contCurs = 0;
        double redondeo;
        
        while((linea = br.readLine()) != null){
            cadena = linea.split(";");
            if(cadena[1].equalsIgnoreCase(cod))
            {   
                if(cadena[3].equalsIgnoreCase(año))
                {
                    contalumno++; 
                    if(cadena[5].equalsIgnoreCase("A"))
                        cont++;
                    else if(cadena[5].equalsIgnoreCase("C"))
                        contCurs++;
                }
            }
        }
        try{                    
            if( null != fr ){   
               fr.close();     
            }                  
        }catch (Exception e2){ 
            e2.printStackTrace();
        }
        if( (cont > 0) ){
            redondeo = ( ( cont / (contalumno - contCurs)) * 100);
            return Math.rint(redondeo * 100)/100;
        }
        return 0;  
    }
}

