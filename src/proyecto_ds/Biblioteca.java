/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_ds;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author onair
 */
public class Biblioteca extends javax.swing.JFrame {

    /**
     * Creates new form Biblioteca
     */
    public Biblioteca() {
        setTitle("MUSIC LOUD :))");
        setResizable(false);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/iconos/icono_musica.png"));
        setIconImage(icon);
        initComponents();
        btnReproducir.setVisible(false);
        LeerArchivo(); //Seobtendran los datos guardados previamente
    }

    //Declaracion de la lista, la pila y la cola(la LinkedList cumplira con todas las funciones que una cola nos ofrece)
    private final ArrayList<Songs> lista=new ArrayList();
    public LinkedList cola = new LinkedList();
    private Stack<Songs> pila=new Stack();
    private int cont=0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Add = new javax.swing.JButton();
        Modify = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        AllSongs = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        Exit = new javax.swing.JButton();
        AddPL = new javax.swing.JButton();
        PL = new javax.swing.JButton();
        btnReproducir = new javax.swing.JButton();
        btnBorrarBusqueda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 204));

        Add.setText("Agregar cancion");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Modify.setText("Modificar dato de la cancion");
        Modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyActionPerformed(evt);
            }
        });

        Delete.setText("Eliminar cancion");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Biblioteca Musical");

        jButton4.setText("Buscar cancion ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        AllSongs.setText("Todas las canciones");
        AllSongs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllSongsActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cancion", "Album", "Duracion", "Interprete", "Compositor", "Año"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        Exit.setText("Guardar cambios y Salir");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        AddPL.setText("Agregar a tu playlist");
        AddPL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPLActionPerformed(evt);
            }
        });

        PL.setText("PlayList");
        PL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLActionPerformed(evt);
            }
        });

        btnReproducir.setText("Reproducir Cancion");
        btnReproducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproducirActionPerformed(evt);
            }
        });

        btnBorrarBusqueda.setText("Borrar ultima busqueda");
        btnBorrarBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarBusquedaActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/YdBO.gif"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pngwing.com.png"))); // NOI18N

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Agregar Cancion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem4.setText("Ver Biblioteca");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItem2.setText("Ver Playlist");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        jMenuItem3.setText("Acerca de...");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Modify)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AllSongs, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AddPL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnReproducir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBorrarBusqueda)))
                        .addGap(15, 15, 15)))
                .addComponent(Exit)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add)
                    .addComponent(Modify)
                    .addComponent(Delete)
                    .addComponent(jButton4)
                    .addComponent(AllSongs)
                    .addComponent(Exit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddPL)
                    .addComponent(PL)
                    .addComponent(btnReproducir)
                    .addComponent(btnBorrarBusqueda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarBusquedaActionPerformed
        // TODO add your handling code here:
        try {
            pila.pop();
        Buscadas();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "No hay elementos buscados...");
        }
        
    }//GEN-LAST:event_btnBorrarBusquedaActionPerformed

    /**
     * Reproduce una cancion que se encuentre en la Playlist
     * @param evt 
     */
    private void btnReproducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproducirActionPerformed
        // TODO add your handling code here:
        //Al solicitar una cancion de la cola, esta tambien dejara de pertenecer a la estructura
        Songs s = (Songs) cola.pollFirst();
        JOptionPaneConTimeOut.visualizaDialogo(null, "Reproduciendo: " +s.getCancion(), "Reproduccion de la COLA :))", 4000);
        //JOptionPane.showMessageDialog(null, "Reproduciendo: " +s.getCancion());
        ActualizarTablaPlaylist();
    }//GEN-LAST:event_btnReproducirActionPerformed

    /**
     * Muestra los datos de la Playlist
     * @param evt 
     */
    private void PLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLActionPerformed
        ActualizarTablaPlaylist();
        btnReproducir.setVisible(true);
        DesactivarBotones();
    }//GEN-LAST:event_PLActionPerformed

    /**
     * Añade un Nodo a la cola (Añade una cancion a la Playlist)
     * @param evt 
     */
    private void AddPLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPLActionPerformed

        try {
            DefaultTableModel dtm=(DefaultTableModel)tabla.getModel();

            int fila = tabla.getSelectedRow();
            /**c.setLocationRelativeTo(null);
            c.setVisible(true);*/
            if(fila>=0){ //Se verifica que se haya seleccionado alguna cancion
                Songs song=new Songs();
                song.setCancion(lista.get(fila).getCancion());
                song.setAlbum(lista.get(fila).getAlbum());
                song.setDuracion(lista.get(fila).getDuracion());
                song.setInterprete(lista.get(fila).getInterprete());
                song.setCompositor(lista.get(fila).getCompositor());
                song.setAnio(lista.get(fila).getAnio());
                cola.offer(song); //Se solicitaran los datos de la lista y se pasaran a la cola para la Playlist
                JOptionPane.showMessageDialog(null, "La cancion se ha agregado a la playlist con exito :)))");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "La cancion no se ha podido meter en la playlist :(((");
        }
    }//GEN-LAST:event_AddPLActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        Respaldo();
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void AllSongsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllSongsActionPerformed
        ActualizarTabla();
        btnReproducir.setVisible(false);
        ActivarBotones();
        //int[] fechas = obtenerFechas();
        //quicksort(fechas, fechas[0], fechas.length);
    }//GEN-LAST:event_AllSongsActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String nuevo=JOptionPane.showInputDialog(this,"Ingrese el nombre de la cancion a buscar");
        Songs c = new Songs();
        int pregunta = 0;
        for(Object obj:lista){
            c=(Songs)obj;
            if(c.getCancion().equals(nuevo)){
                pregunta = 1;
                /*JOptionPane.showMessageDialog(this,("Cancion encontrada\n"+"Album: "+c.getAlbum()
                    +"\nDuracion: "+c.getDuracion()+"\nInterprete: "+c.getInterprete()
                    +"\nCompositor: "+c.getCompositor()+"\nAnio: "+c.getAnio()));*/
            pila.add(c);
            Buscadas();
            break;
        }
        }
        if(pregunta == 0) {
            JOptionPane.showMessageDialog(this,"No sse puedo encontrar la cancion :(((");
        } else {
            JOptionPane.showMessageDialog(this,("Cancion encontrada\n"+"Album: "+c.getAlbum()
                +"\nDuracion: "+c.getDuracion()+"\nInterprete: "+c.getInterprete()
                +"\nCompositor: "+c.getCompositor()+"\nAnio: "+c.getAnio()));
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * Borra un Nodo de la lista
     * @param evt 
     */
    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        int fila=tabla.getSelectedRow();

        if(fila>=0){
            int opcion=JOptionPane.showConfirmDialog(this,"Â¿Estas seguro de eliminar esta cancion?","Eliminar",JOptionPane.YES_NO_OPTION);
            //0=Si , 1=No
            if(opcion==0){
                lista.remove(fila); //Se eliminara el elemento de la lista en la posicion del indice de la tabla
                ActualizarTabla();
            }else{
                JOptionPane.showMessageDialog(this,"Accion Cancelada ","Cancelado",JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Seleccione cancion a eliminar ","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    /**
     * Modiifica un campo especifico de un Nodo Song guardado dentro de la lista
     * @param evt 
     */
    private void ModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyActionPerformed
        int fila=tabla.getSelectedRow(); //Se obtiene la fila seleccionada
        int columna=tabla.getSelectedColumn(); //Se obtiene la columna seleccionada
        if(fila>=0){ //Verifica que algo este seleccionado
            String nuevo=JOptionPane.showInputDialog(this,("Ingresa la modificacion de "+tabla.getColumnName(columna)),"");
            if(!nuevo.isEmpty()){ //Verifica que el nuevo atributo se haya llenado
                switch(columna){
                    case 0:
                    lista.get(fila).setCancion(nuevo); //Obteniendo el indice, se podra recurri al elemento seleccionado y se podra hacer la modificacion pertirnente
                    break;
                    case 1:
                    lista.get(fila).setAlbum(nuevo);
                    break;
                    case 2:
                    lista.get(fila).setDuracion(nuevo);
                    break;
                    case 3:
                    lista.get(fila).setInterprete(nuevo);
                    break;
                    case 4:
                    lista.get(fila).setCompositor(nuevo);
                    break;
                    case 5:
                    lista.get(fila).setAnio(nuevo);
                    break;
                }
            }else{
                JOptionPane.showMessageDialog(this,"Ingrese el cambio","Error",JOptionPane.ERROR_MESSAGE);
            }
            ActualizarTabla();
        }else{
            JOptionPane.showMessageDialog(this,"Seleccione la casilla a modificar","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ModifyActionPerformed

    /**
     *Guarda un nuevo objeto de la clase Song dentro de la lista
     * @param evt 
     */
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        //Obtenemos los datos de JDialog nuevaCancion
        try {
            nuevaCancion c=new nuevaCancion(this,true);
            c.setLocationRelativeTo(null);
            c.setVisible(true);
            if(c.getEdo()){ //Si se ha escrito algo dentro del JDialog
                Songs song=new Songs(); //Dentro de el nuevo objeto Songs se meteran los nuevos atributos
                song.setCancion(c.getCancion());
                song.setAlbum(c.getAlbum());
                song.setDuracion(c.getDuracion());
                song.setInterprete(c.getInterprete());
                song.setCompositor(c.getCompositor());
                song.setAnio(c.getAnio());
                lista.add(song); //Al tener todos los atributos, el objeto Song es guardado dentro de la lista
                ActualizarTabla(); //Se actualiza la tabla para reflejar los resultados
                btnReproducir.setVisible(false);
                ActivarBotones();
                JOptionPane.showMessageDialog(null, "La cancion se ha agregado con exito!!!");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "La cancion no se ha podid agregar!!!");
        }

    }//GEN-LAST:event_AddActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        Acerca acer=new Acerca(this,true);
        acer.setLocationRelativeTo(null);
        acer.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        //Obtenemos los datos de JDialog nuevaCancion
        try {
            nuevaCancion c=new nuevaCancion(this,true);
            c.setLocationRelativeTo(null);
            c.setVisible(true);
            if(c.getEdo()){ //Si se ha escrito algo dentro del JDialog
                Songs song=new Songs(); //Dentro de el nuevo objeto Songs se meteran los nuevos atributos
                song.setCancion(c.getCancion());
                song.setAlbum(c.getAlbum());
                song.setDuracion(c.getDuracion());
                song.setInterprete(c.getInterprete());
                song.setCompositor(c.getCompositor());
                song.setAnio(c.getAnio());
                lista.add(song); //Al tener todos los atributos, el objeto Song es guardado dentro de la lista
                ActualizarTabla(); //Se actualiza la tabla para reflejar los resultados
                btnReproducir.setVisible(false);
                ActivarBotones();
                JOptionPane.showMessageDialog(null, "La cancion se ha agregado con exito!!!");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "La cancion no se ha podid agregar!!!");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        ActualizarTablaPlaylist();
        btnReproducir.setVisible(true);
        DesactivarBotones();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        ActualizarTabla();
        btnReproducir.setVisible(false);
        ActivarBotones();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * Obtiene las fechas y las almacena en nu arreglo
     * @return 
     */
    public int[] obtenerFechas() {
        DefaultTableModel dtm=(DefaultTableModel)tabla.getModel();
        Object nf[]={null,null,null,null,null,null};
        int[] fechas = new int[lista.size()];
        cont=0;
        //Llenar tabla
        Songs c;
        for(Object obj:lista){
            c=(Songs)obj;
            fechas[cont] = Integer.parseInt(c.getAnio());
            dtm.insertRow(0, nf);
            tabla.setValueAt(c.getCancion(), 0, 0);
            tabla.setValueAt(c.getAlbum(), 0, 1);
            tabla.setValueAt(c.getDuracion(), 0, 2);
            tabla.setValueAt(c.getInterprete(),0, 3);
            tabla.setValueAt(c.getCompositor(),0, 4);
            tabla.setValueAt(c.getAnio(),0, 5);
            cont++;
        }
        return fechas;
    }
    
    public static void quicksort(int A[], int izq, int der) {

        int pivote=A[izq]; // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        int aux;

        while(i < j){                          // mientras no se crucen las búsquedas                                   
           while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
            while(A[j] > pivote) j--;           // busca elemento menor que pivote
                if (i < j) {                        // si no se han cruzado                      
                    aux= A[i];                      // los intercambia
                    A[i]=A[j];
                    A[j]=aux;
                }
        }

        A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
        A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha

        if(izq < j-1)
           quicksort(A,izq,j-1);          // ordenamos subarray izquierdo
        if(j+1 < der)
           quicksort(A,j+1,der);          // ordenamos subarray derecho
    }
    /**
     * Busca una cancion con ayuda de una pila
     */
    private void Buscadas(){
        DefaultTableModel dtm=(DefaultTableModel)tabla.getModel();
        Object nf[]={null,null,null,null,null,null};
        //Vaciar tabla
       for(int b=(cont-1);b>=0;b--){
            dtm.removeRow(b);
        }
        cont=0;
        //Llenar tabla
        Songs c;
        for(Object obj:pila){
            c=(Songs)obj;
            dtm.insertRow(0, nf);
            tabla.setValueAt(c.getCancion(), 0, 0);
            tabla.setValueAt(c.getAlbum(), 0, 1);
            tabla.setValueAt(c.getDuracion(), 0, 2);
            tabla.setValueAt(c.getInterprete(),0, 3);
            tabla.setValueAt(c.getCompositor(),0, 4);
            tabla.setValueAt(c.getAnio(),0, 5);
            cont++;
        }
    }
    
    /**
     * Crea o actualiza el archivo "Bibilioteca musical.txt" y "Playlist.txt" con los datos actuales
     */
    private void Respaldo(){ //Metodo para guardar un archivo txt con TODOS los datos de la biblioteca
    try{
    FileWriter fw =new FileWriter("Biblioteca Musical.txt");
    FileWriter fw2 = new FileWriter("Playlist.txt");
    BufferedWriter bw=new BufferedWriter(fw);
    BufferedWriter bw2=new BufferedWriter(fw2);
    Songs c;
    for(Object obj:lista){ //Dada la cantidad de elementos que tiene la lista, se iterara el ciclo for
        c=(Songs)obj;
        bw.write(c.getCancion()+ "," +c.getAlbum()+ "," +c.getDuracion()+ "," +c.getInterprete()+ "," +c.getCompositor()+ "," +c.getAnio()+ "\n"); //Imprime en el archivo Biblioteca Musica.txt los datos de las canciones guardadas en la lista
    }
    for(Object obj:cola){ //Dada la cantidad de elementos que tiene la cola, se iterara el ciclo for
        c=(Songs)obj;
        bw2.write(c.getCancion()+ ","+c.getAlbum()+ "," +c.getDuracion()+"," +c.getInterprete()+ "," +c.getCompositor()+ ","+c.getAnio()+ "\n"); //Imprime en el archivo Playlist.txt los datos de las canciones guardadas en la cola
    }
    bw.close();
    bw2.close();
    fw.close();
    fw2.close();
    }catch(Exception e){
        System.out.println("Error // "+e.getMessage()  );
    }    
    }
    
    public void ActivarBotones() {
        Modify.setEnabled(true);
        Delete.setEnabled(true);
    }
    
    public void DesactivarBotones() {
        Modify.setEnabled(false);
        Delete.setEnabled(false);
    }
    
    /**
     * Metodo encargado de leer y recuperar el archivo txt donde se almacenan los datos de la Biblioteca y la Playlist
     */
    private void LeerArchivo(){ 
        File file=new File("Biblioteca Musical.txt");
        File file2 = new File("Playlist.txt");
        try{
            Scanner escaner=new Scanner(file);
            while(escaner.hasNextLine()){
                String linea=escaner.nextLine();
                Scanner delimitar=new Scanner(linea);
                delimitar.useDelimiter("\\s*,\\s*");
                Songs c=new Songs();
                c.setCancion(delimitar.next());
                c.setAlbum(delimitar.next());
                c.setDuracion(delimitar.next());
                c.setInterprete(delimitar.next());
                c.setCompositor(delimitar.next());
                c.setAnio(delimitar.next());
                lista.add(c);
            }
            escaner.close();
            ActualizarTabla();
        }catch(FileNotFoundException e){
            System.out.println("Error // "+e.getMessage()  );
        }
        try{
            Scanner escaner=new Scanner(file2);
            while(escaner.hasNextLine()){
                String linea=escaner.nextLine();
                Scanner delimitar=new Scanner(linea);
                delimitar.useDelimiter("\\s*,\\s*");
                Songs c=new Songs();
                c.setCancion(delimitar.next());
                c.setAlbum(delimitar.next());
                c.setDuracion(delimitar.next());
                c.setInterprete(delimitar.next());
                c.setCompositor(delimitar.next());
                c.setAnio(delimitar.next());
                cola.offer(c);
            }
            escaner.close();
            ActualizarTabla();
        }catch(FileNotFoundException e){
            System.out.println("Error // "+e.getMessage()  );
        }
    }
    
    /**
     * Actualiza la tabla con los datos de la Biblioteca mas recientes
     * @param evt 
     */
    private void ActualizarTabla(){ //Se actualizara la tabla con todos los elementos que tiene la lista
        DefaultTableModel dtm=(DefaultTableModel)tabla.getModel();
        Object nf[]={null,null,null,null,null,null};
        //Vaciar tabla
        for(int b=(cont-1);b>=0;b--){
            dtm.removeRow(b);
        }
        cont=0;
        //Llenar tabla
        Songs c;
        for(Object obj:lista){
            c=(Songs)obj;
            dtm.addRow(nf);
            tabla.setValueAt(c.getCancion(), cont, 0);
            tabla.setValueAt(c.getAlbum(), cont, 1);
            tabla.setValueAt(c.getDuracion(), cont, 2);
            tabla.setValueAt(c.getInterprete(), cont, 3);
            tabla.setValueAt(c.getCompositor(), cont, 4);
            tabla.setValueAt(c.getAnio(), cont, 5);
            cont++;
        }
    }
    
    /**
     * Actualiza la tabla con los datos de la Playlist mas recientes
     * @param evt 
     */
    private void ActualizarTablaPlaylist(){ //Se actualizara la tabla con todos los eleemntos que tenga la cola
        DefaultTableModel dtm=(DefaultTableModel)tabla.getModel();
        Object nf[]={null,null,null,null,null,null};
        //Vaciar tabla
       for(int b=(cont-1);b>=0;b--){
            dtm.removeRow(b);
        }
        cont=0;
        //Llenar tabla
        Songs c;
        for(Object obj:cola){
            c=(Songs)obj;
            dtm.addRow(nf);
            tabla.setValueAt(c.getCancion(), cont, 0);
            tabla.setValueAt(c.getAlbum(), cont, 1);
            tabla.setValueAt(c.getDuracion(), cont, 2);
            tabla.setValueAt(c.getInterprete(), cont, 3);
            tabla.setValueAt(c.getCompositor(), cont, 4);
            tabla.setValueAt(c.getAnio(), cont, 5);
            cont++;
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton AddPL;
    private javax.swing.JButton AllSongs;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Modify;
    private javax.swing.JButton PL;
    private javax.swing.JButton btnBorrarBusqueda;
    private javax.swing.JButton btnReproducir;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
