/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_ds;

import java.io.*;

/**
 *
 * @author onair
 */
public class BibliotecaMusical {
    
    public static void main(String[] args) throws IOException {
        
        File archivo=new File("Biblioteca Musical.txt");
        File archivo2=new File("PlayList.txt");
        BufferedWriter bw;
        BufferedWriter bw2;
        if(!archivo.exists()){//Si el archivo no existe
            bw= new BufferedWriter(new FileWriter(archivo)) ;   
        }
        if(!archivo2.exists()){//Si el archivo no existe
            bw2= new BufferedWriter(new FileWriter(archivo2)) ;
        }
        Biblioteca bib=new Biblioteca();
        bib.setLocationRelativeTo(null);
        bib.setVisible(true);
        
    }
    
}
