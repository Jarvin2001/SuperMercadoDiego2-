/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercadodigo.Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author jarvi
 */
public class Leer {
    static  String[] listadeproductos = new String[10];
    static  String rutaabsoluta = "\\host\\Inventario.txt";
    public static void main(String[] arg) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null; 
        
      
        try {
            // Creamos el fichero y creamos el BufferedReader, para leer datos
            String path = (System.getProperty("user.dir"));

            archivo = new File(path + rutaabsoluta);
                fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea;
            int i=0;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                listadeproductos[i] = linea;
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Cerramos ficheros
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
