package com.dulcestintin.principal;

import com.dulcestintin.controller.Conexion;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import javax.print.PrintException;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JTextField;
import java.lang.Object;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.Calendar;
import java.util.GregorianCalendar;

 
public class Interface extends javax.swing.JFrame implements Runnable{
    Conexion con,query;
    ResultSet rs;
    ResultSet rs2;
   public  int IDusuario;
    String id2="";
 
    private Object txtestatus;
    private JLabel jLabel20;
    private JLabel jLabel6;
    private JLabel jLabel21;
    private JTextField txtapellidom;
    private JTextField txtapellidop;
    private JTextField txtdireccion;
    private JTextField txtciudad;
    private JLabel jLabel24;
    private int limite = 4;
    static int j=0,w=0,jj=0; 
    static String aux3;
    static float total=0;
    static String inv[]=new String[50000];
    static float invT=0;
   public static String id,cad;
   String hora,minutos,segundos,ampm;
    Calendar calendario;    
    Thread h1;
    public static int rowCount, numfac;
   
 
    public Interface() {
      
    try {
            initComponents();
             h1 = new Thread(this);
            h1.start();
          
 
           con = new Conexion();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }

    
            

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTdd = new javax.swing.JTextField();
        jTprecio = new javax.swing.JTextField();
        jTexistencia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTnombre = new javax.swing.JTextField();
        jTyyyy = new javax.swing.JTextField();
        jTmm = new javax.swing.JTextField();
        jBagregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTespecificaciones = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTdescripcion = new javax.swing.JTextArea();
        jLabel42 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTbcaducidad = new javax.swing.JTextField();
        jTbprecio = new javax.swing.JTextField();
        jTbexistencia = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jBmodificar1 = new javax.swing.JButton();
        dc1 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jTproducto = new javax.swing.JTextField();
        lbHora2 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTbdescripcion = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTbuscar = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTbespecificaciones = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTbdescripcion2 = new javax.swing.JTextArea();
        jTID = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTbnombre1 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTbnombre2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbHora1 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTvnombre = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jBfactura = new javax.swing.JButton();
        jBventa = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tproductos = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        Tlista = new javax.swing.JTable();
        jBimprimir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTtotal = new javax.swing.JTextField();
        jBquitar = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMusers = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Caducidad:");

        jLabel29.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(102, 153, 255))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farmacia \"Las Lomas\" // Interfaz Administrador");
        setResizable(false);

        jTabbedPane1.setToolTipText("");

        jPanel1.setToolTipText("");
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Existencia:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("DD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nombre del Producto:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Especificaciones: ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        jTdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTddKeyTyped(evt);
            }
        });
        jPanel1.add(jTdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 20, -1));

        jTprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTprecioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTprecioKeyTyped(evt);
            }
        });
        jPanel1.add(jTprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 140, -1));

        jTexistencia.setToolTipText("");
        jTexistencia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTexistencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTexistenciaKeyTyped(evt);
            }
        });
        jPanel1.add(jTexistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 70, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Precio:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        jTnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnombreActionPerformed(evt);
            }
        });
        jPanel1.add(jTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 220, -1));

        jTyyyy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTyyyyKeyTyped(evt);
            }
        });
        jPanel1.add(jTyyyy, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 40, -1));

        jTmm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTmmKeyTyped(evt);
            }
        });
        jPanel1.add(jTmm, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 20, -1));

        jBagregar.setText("Agregar");
        jBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarActionPerformed(evt);
            }
        });
        jPanel1.add(jBagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 150, 40));

        jTespecificaciones.setColumns(20);
        jTespecificaciones.setRows(5);
        jScrollPane1.setViewportView(jTespecificaciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 230, 180));

        jTdescripcion.setColumns(20);
        jTdescripcion.setRows(5);
        jTdescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jTdescripcion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 230, 180));
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 330, 110));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Descripcion:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 800, 410));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Caducidad:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("YYYY");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("MM");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jLabel31.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel31.setMinimumSize(new java.awt.Dimension(500, 500));
        jLabel31.setName(""); // NOI18N
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 870, 720));

        jTabbedPane1.addTab("Agregar", null, jPanel1, "Agregar Producto");

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText("Busqueda por Descripcion:");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Existencia:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, -1, -1));

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Caducidad:");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        jLabel23.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Especificaciones:");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, -1, -1));

        jTbcaducidad.setEditable(false);
        jTbcaducidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTbcaducidadActionPerformed(evt);
            }
        });
        jPanel4.add(jTbcaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 130, -1));

        jTbprecio.setEditable(false);
        jTbprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTbprecioKeyTyped(evt);
            }
        });
        jPanel4.add(jTbprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 110, -1));

        jTbexistencia.setEditable(false);
        jPanel4.add(jTbexistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 110, -1));

        jLabel25.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Precio:");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, -1));

        jBmodificar1.setText("Modificar");
        jBmodificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificar1ActionPerformed(evt);
            }
        });
        jPanel4.add(jBmodificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 630, 120, 40));

        dc1.setText("Desbloquear Campos");
        dc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dc1ActionPerformed(evt);
            }
        });
        jPanel4.add(dc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 630, 190, 40));

        jLabel36.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 204, 204));
        jLabel36.setText("Nombre Producto:");
        jPanel4.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jTproducto.setEditable(false);
        jPanel4.add(jTproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 220, -1));

        lbHora2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbHora2.setText("jLabel42");
        lbHora2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lbHora2PropertyChange(evt);
            }
        });
        jPanel4.add(lbHora2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 160, -1));

        jLabel34.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 800, 340));

        jLabel26.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Descripción:");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        jTbdescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTbdescripcionKeyPressed(evt);
            }
        });
        jPanel4.add(jTbdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 220, -1));

        jTbuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTbuscar.setColumnSelectionAllowed(true);
        jTbuscar.getTableHeader().setReorderingAllowed(false);
        jTbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbuscarMouseClicked(evt);
            }
        });
        jTbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTbuscarKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTbuscar);
        jTbuscar.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 700, 200));

        jTbespecificaciones.setColumns(20);
        jTbespecificaciones.setEditable(false);
        jTbespecificaciones.setRows(5);
        jScrollPane7.setViewportView(jTbespecificaciones);

        jPanel4.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 230, 170));

        jTbdescripcion2.setColumns(20);
        jTbdescripcion2.setEditable(false);
        jTbdescripcion2.setRows(5);
        jScrollPane8.setViewportView(jTbdescripcion2);

        jPanel4.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 230, 170));

        jTID.setEditable(false);
        jTID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(jTID, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 70, -1));
        jPanel4.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 330, 110));

        jLabel12.setText("ID Admin:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, 20));

        jTbnombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTbnombre1KeyPressed(evt);
            }
        });
        jPanel4.add(jTbnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 220, -1));

        jLabel37.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 800, 330));

        jLabel38.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(204, 204, 204));
        jLabel38.setText("Busqueda por Nombre:");
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jTbnombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTbnombre2KeyPressed(evt);
            }
        });
        jPanel4.add(jTbnombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 220, -1));

        jLabel30.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel30.setMinimumSize(new java.awt.Dimension(500, 500));
        jLabel30.setName(""); // NOI18N
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 720));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 700));

        jTabbedPane1.addTab("Buscar/Modificar", null, jPanel3, "Buscar Productos y Modificarlos");

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbHora1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbHora1.setText("jLabel42");
        lbHora1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lbHora1PropertyChange(evt);
            }
        });
        jPanel2.add(lbHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 140, -1));

        jLabel32.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Nombre Producto:");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jTvnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTvnombreKeyPressed(evt);
            }
        });
        jPanel2.add(jTvnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 220, -1));
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 320, 110));

        jBfactura.setText("Factura");
        jBfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfacturaActionPerformed(evt);
            }
        });
        jPanel2.add(jBfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 570, 120, 40));

        jBventa.setText("Agregar");
        jBventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBventaActionPerformed(evt);
            }
        });
        jPanel2.add(jBventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 140, 30));

        Tproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tproductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TproductosKeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(Tproductos);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 760, 170));

        Tlista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(Tlista);
        Tlista.getColumnModel().getColumn(0).setResizable(false);
        Tlista.getColumnModel().getColumn(1).setResizable(false);
        Tlista.getColumnModel().getColumn(2).setResizable(false);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 760, 180));

        jBimprimir.setText("Imprimir");
        jBimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBimprimirActionPerformed(evt);
            }
        });
        jPanel2.add(jBimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, 120, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Total:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("$");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 20, 60));

        jTtotal.setEditable(false);
        jTtotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTtotal.setForeground(new java.awt.Color(255, 0, 0));
        jTtotal.setText("0.00");
        jPanel2.add(jTtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 220, 60));

        jBquitar.setText("Limpiar");
        jBquitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBquitarActionPerformed(evt);
            }
        });
        jPanel2.add(jBquitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 200, 30));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel35.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 810, 630));

        jLabel28.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel28.setMinimumSize(new java.awt.Dimension(500, 500));
        jLabel28.setName(""); // NOI18N
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 870, 720));
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 330, 110));

        jTabbedPane1.addTab("Venta", null, jPanel2, "Realizar una Venta");

        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 330, 110));

        jLabel27.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel27.setMinimumSize(new java.awt.Dimension(500, 500));
        jLabel27.setName(""); // NOI18N
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 870, 720));

        jTabbedPane1.addTab("...", null, jPanel5, "Alertas de Poco Producto o Caducidad");

        jPanel6.setLayout(null);
        jPanel6.add(jLabel43);
        jLabel43.setBounds(510, 430, 0, 0);

        jLabel40.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel40.setMinimumSize(new java.awt.Dimension(500, 500));
        jLabel40.setName(""); // NOI18N
        jPanel6.add(jLabel40);
        jLabel40.setBounds(0, 0, 0, 0);

        jTabbedPane1.addTab("...", jPanel6);

        jMenu1.setText("Agregar");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMusers.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMusers.setText("Usuario");
        jMusers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMusersActionPerformed(evt);
            }
        });
        jMenu1.add(jMusers);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Modificar");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Contraseña");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Salir");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Cerrar Sesion");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName(" ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "Estás seguro de cerrar el Sistema?","Cerrar Sistema",1)==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

private void jBimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBimprimirActionPerformed
if(JOptionPane.showConfirmDialog(rootPane, "Ya esta listo para imprimir el Ticket?","Imprimir Ticket",1)==0){
    String existe = null;
    int e;
        String ID = null;
        String ticket;
        String ss;
    if (j==0)
        {

            JOptionPane.showMessageDialog(null, "No hay ningun elemento  en la Tabla de Venta");

        }

        else
    {
        
        try {
                //se crea la conexion y las consultas
                con = new Conexion();
                String pro[] = new String[100],p;
                String pro2[] = new String[100];
                int to[] = new int[100];
                float prec[] = new float[100];
                Object ex = null,precio=null;
                Object pros=null;
                
                // se crea la sentecia sql y se ejecuta para hacer la modificacion
                for (int i=0; i<j; i++) {
                     
                     pros = Tlista.getValueAt(i, 0);
                     pro[i] = objectToString(pros);
                     p=objectToString(Tlista.getValueAt(i, 1));
                     prec[i]= Float.parseFloat(p);
                     ex=  Tlista.getValueAt(i, 2);
                     String xe = objectToString(ex);
                     to[i] = Integer.parseInt(xe);
                   
                     String sqlc = "SELECT * FROM productos WHERE nombre_producto = '"+pro[i]+"'";
                    // System.out.println("antes");
                     rs = con.Consulta(sqlc);
                    // System.out.println("despues");
                     while(rs.next()){
                         ID = rs.getString(1);
                         existe = rs.getString(5);
                     
                     }
                    
                     e = Integer.parseInt(existe);
                    // Float k = Float.parseFloat(ex[i]);
                    int t = e - to[i];
                   
                    String modifica = "UPDATE  `productos` SET  `existencia` = "+t+" WHERE `id_producto` ="+ID+"";
                    con.ejecutar(modifica); 
                    
                }
 
                String iduser = jTID.getText();
                String t=jTtotal.getText();
                float tota = Float.parseFloat(t);
                String user = "SELECT * FROM usuarios WHERE Id_usuario= '"+iduser+"'";
                String nombre = null,ap = null;
                rs = con.Consulta(user);
                while(rs.next()){
                         nombre = rs.getString(2);
                         ap = rs.getString(3);
                     }
                
                Date fecha = new Date();
                String cadena="Farmacia 'Las Lomas'\nRFC: TOSO850220GN9\nBaltazar N. 4  \nSan Antonio Coaxomulco, Tlaxcala\nFecha: "+fecha+"\n\nCant.\tProducto\tPrecio\n";
                String cade="";
                for (int i=0;i<j;i++){
                
                    pro2[i]=pro[i];
                    if(pro[i].length()<=8)
                        pro[i]=pro[i]+"     ";
                    if(pro[i].length()>15){
                        pro[i] = pro[i].substring(0, 15);
                    
                    }
                    cade = cade+""+to[i]+"\t"+pro[i]+"\t"+prec[i]*to[i]+"\n";
                
                }
                String efectivo = JOptionPane.showInputDialog(null, "Venta Realizada\nTotal a Cobrar: $"+t+"\nEfectivo Recibido: ");
                float efe = Float.parseFloat(efectivo);
                float cambio = efe - tota;
                 ticket = cadena+cade+"\nTotal: \t$"+jTtotal.getText()+"\n\tEfectivo: $"+efectivo+"\n\tCambio: $"+cambio+"\n\n    Le atendio: "+nombre+" "+ap+"\n\n    CON EL CORAZON EN LAS MANOS\n    GRACIAS POR SU COMPRA.\n\n\n\n";
            //se toma el servicio de impresión por defecto (impresora por defecto)
PrintService service = PrintServiceLookup.lookupDefaultPrintService();
 
DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
//Creamos un trabajo de impresión
DocPrintJob pj = service.createPrintJob();
//Nuestro trabajo de impresión envía una cadena de texto
 ss=new String(ticket);
byte[] bytes;
//Transformamos el texto a bytes que es lo que soporta la impresora
bytes=ss.getBytes();
//Creamos un documento (Como si fuese una hoja de Word para imprimir)
Doc doc=new SimpleDoc(bytes,flavor,null);

//Obligado coger la excepción PrintException
  //Mandamos a impremir el documento
  pj.print(doc, null);
 
                System.out.println(ticket);
                String id34=jTID.getText();
               ticket = "";
                //String venta = "INSERT INTO `ventas`(`total`, `id_usuario`) VALUES (,'"+t+"','"+id34+"')";
                String venta = "INSERT INTO  `negocio`.`ventas` (`id_ventas` ,`total` ,`fecha` ,`Id_usuario`)VALUES (NULL ,  '"+t+"', CURRENT_TIMESTAMP ,  '"+id34+"');";
                con.ejecutar(venta);
                for(int i=0;i<j;i++){
                    venta = "INSERT INTO `negocio`.`vendidos` (`id_vendido`, `producto`, `precio`, `cantidad`, `fecha`, `Id_usuario`) VALUES (NULL, '"+pro2[i]+"', '"+prec[i]+"', '"+to[i]+"', CURRENT_TIMESTAMP, '"+id34+"');";
                    con.ejecutar(venta);
                }
                JOptionPane.showMessageDialog(null, "Venta Realizada\n\nTotal a Cobrar: $"+t+"\nCambio: $"+cambio);
                total=0;
                jTtotal.setText("0.00");


                int x =Tlista.getRowCount()-1;
                    DefaultTableModel temp = (DefaultTableModel) Tlista.getModel();
                    while(x>=0){
                    temp.removeRow(x);
                    x--;
                 
                }
    
    
                j=0;


            } catch (PrintException ex1) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex1);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    
    
}
    
    
}//GEN-LAST:event_jBimprimirActionPerformed

private void jBventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBventaActionPerformed
//DefaultTableModel modelo = new DefaultTableModel();
//        this.Tlista.setModel(modelo);

    
    DefaultTableModel modelo = new DefaultTableModel(){
                        @Override
        public boolean isCellEditable(int rowIndex, int vColIndex) {
            return false;
        }};

    int aux = Tproductos.getSelectedRow();
    if (aux==-1)
        {

            JOptionPane.showMessageDialog(null, "No se a seleccionado nada de la tabla.");

        }

        else
    { 
        String nombre = Tproductos.getValueAt(aux, 1).toString();
            String precio = Tproductos.getValueAt(aux, 2).toString();
         
        String aux2 = precio;
        float tot = Float.parseFloat(aux2);
        String cant = JOptionPane.showInputDialog("Cantidad: ");
        float cantidad = Float.parseFloat(cant);
        tot=tot*cantidad;
        total=tot+total;
        String aux3 = String.valueOf(total);
        jTtotal.setText(aux3);
        DefaultTableModel temp = (DefaultTableModel) 
                Tlista.getModel();
        Object nuevo[]= {temp.getRowCount()+1,"",""};
        temp.addRow(nuevo);
        
           Tlista.setValueAt(nombre, j, 0);
           Tlista.setValueAt(precio, j, 1);
           Tlista.setValueAt(cant, j, 2);
           j++;//Aumenta el contador

        
        }
}//GEN-LAST:event_jBventaActionPerformed

private void jBfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfacturaActionPerformed

    
    if (j==0)
        {

            JOptionPane.showMessageDialog(null, "No hay ningun elemento  en la Tabla de Venta");

        }

        else
    {
            try {
                    Factura Fac = new Factura();
                rowCount = Tlista.getRowCount();
                numfac=1;
               rs = con.Consulta("SELECT * FROM `facturas`");
                while (rs.next()){
                
                    numfac++;
                
                }
//                Fac.setNum(numfac);
                
                //int aux = Tlista.
                JTable t;
   //             t=Fac.getTabla();
                for(int k=0;k<j;k++)
                {
          //          t.setValueAt(Tlista.getValueAt(k, 0), k, 0);
          //          t.setValueAt(Tlista.getValueAt(k, 1), k, 1);
          //          t.setValueAt(Tlista.getValueAt(k, 2), k, 2);
                }
     //           Fac.setTabla(t);
       //         Fac.setTotal(jTtotal.getText());
        //        Fac.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    
    }
    


}//GEN-LAST:event_jBfacturaActionPerformed

private void jTvnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTvnombreKeyPressed
 
    try {
            // se comienza la conexion con la base de datos
        try {
                    con = new Conexion();


                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        String nom= jTvnombre.getText();
        String sql ="SELECT * FROM productos WHERE nombre_producto LIKE '"+nom+"%' AND existencia > 0";
        rs = con.Consulta(sql);
        
        if(rs==null)
            JOptionPane.showMessageDialog(null, "No se encontro: "+jTvnombre.getText()+" en la base de datos.");
        
         //Para establecer el modelo al JTable
 
        DefaultTableModel buscar = new DefaultTableModel(){
                        @Override
        public boolean isCellEditable(int rowIndex, int vColIndex) {
            return false;
        }};
        this.Tproductos.setModel(buscar);
        
        
        //Obteniendo la informacion de las columnas que estan siendo consultadas
         ResultSetMetaData rsMd = rs.getMetaData();
         //La cantidad de columnas que tiene la consulta
         int cantidadColumnas = rsMd.getColumnCount();
         //Establecer como cabezeras el nombre de las colimnas
         for (int i = 1; i <= cantidadColumnas; i++) {
          buscar.addColumn(rsMd.getColumnLabel(i));
         }
        
        int y=0;
        while (rs.next()) {
          Object[] fila = new Object[cantidadColumnas];
  
          for (int i = 0; i < cantidadColumnas; i++) {
             
            fila[i]=rs.getObject(i+1);
       
          }
          buscar.addRow(fila);
          for(int l=0;l<7;l++)
         buscar.isCellEditable(y, l);
         y++;
 }
 
        
 
         
                
                
                
                
                
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        
    
            
//            }
}//GEN-LAST:event_jTvnombreKeyPressed

private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed

    //BOTON PARA AGREGAR UN PRODUCTO A LA BASE DE DATOS 
    
    int aux=0;

        // validaciones para saber que no se deja algun campo en limpio
        if (jTnombre.getText().equals("")||jTyyyy.getText().equals("")||jTprecio.getText().equals("")
                ||jTexistencia.getText().equals("")||jTdescripcion.getText().equals("")||jTespecificaciones.getText().equals(""))
        {

            JOptionPane.showMessageDialog(null, "Faltan Datos: No Puede Dejar Cuadros en Blanco");

        }

        else

        {
            try {
                // se comienza la conexion con la base de datos
    try {
                con = new Conexion();


            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
            //se obtienen los valores de los jTextField
                String nombre = jTnombre.getText();
                String caducidad = jTyyyy.getText()+"-"+jTmm.getText()+"-"+jTdd.getText();
                String existencia = jTexistencia.getText();
                String precio = jTprecio.getText();
                String descripcion = jTdescripcion.getText();
                String especifica = jTespecificaciones.getText();
 
                String sql = "INSERT INTO `productos`(`nombre_producto`, `precio`, `caducidad`, `existencia`, `descripcion`, `especificaciones`) VALUES ('"+nombre+"','"+precio+"','"+caducidad+"','"+existencia+"','"+descripcion+"','"+especifica+"')";
                
                //funcion para ejecutar la query
                con.ejecutar(sql);

               JOptionPane.showMessageDialog(null, "Producto: "+nombre+" agregado.");
 
                //se limpian los campos de texto para seguir agregando mas datos
                jTnombre.setText("");
                jTprecio.setText("");
                jTyyyy.setText("");
                jTmm.setText("");
                jTdd.setText("");
                jTexistencia.setText("");
                jTdescripcion.setText("");
                jTespecificaciones.setText("");

                
            } catch (SQLException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }


        }
}//GEN-LAST:event_jBagregarActionPerformed

private void jBquitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBquitarActionPerformed

    total=0;
    jTtotal.setText("0.00");
    
    
    int x =Tlista.getRowCount()-1;
    
    
    {
    try
    {
        DefaultTableModel temp = (DefaultTableModel) Tlista.getModel();
        while(x>=0){
        temp.removeRow(x);
        x--;
        }
        
    }
        catch(ArrayIndexOutOfBoundsException e){}
    }
    
    
    j=0;
    
}//GEN-LAST:event_jBquitarActionPerformed

private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

            
}//GEN-LAST:event_jMenu1ActionPerformed

private void jMusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMusersActionPerformed
            Altas usu = new Altas();
             usu.setVisible(true);
}//GEN-LAST:event_jMusersActionPerformed

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

    Modificar mod = new Modificar();
    mod.id = IDusuario;
    System.out.println("id para modificar: "+mod.id);
    mod.setVisible(true);
    
    
    
    
}//GEN-LAST:event_jMenuItem2ActionPerformed

private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    if(JOptionPane.showConfirmDialog(rootPane, "Esta seguro de cerrar la sesion actual?","Cerrar sesión",1)==0){
        
        this.dispose();
        Inicio ini = new Inicio();
        Dimension pantall = Toolkit.getDefaultToolkit().getScreenSize();  
        //obtenemos el tamaño de la ventana  
        Dimension ventan = ini.getSize();  
        //para centrar la ventana lo hacemos con el siguiente calculo  
        ini.setLocation((pantall.width - ventan.width) / 2, (pantall.height - ventan.height) / 2);
        ini.setVisible(true);

    }
    
}//GEN-LAST:event_jMenuItem3ActionPerformed

private void jTbnombre2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTbnombre2KeyPressed
// TODO add your handling code here:
}//GEN-LAST:event_jTbnombre2KeyPressed

private void jTbnombre1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTbnombre1KeyPressed
 try {
            // se comienza la conexion con la base de datos
        try {
                    con = new Conexion();


                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        String nom= jTbnombre1.getText();
        String sql ="SELECT * FROM productos WHERE nombre_producto LIKE '%"+nom+"%'";
        rs = con.Consulta(sql);
        
        if(rs==null)
            JOptionPane.showMessageDialog(null, "No se encontro: "+jTbnombre1.getText()+" en la base de datos.");
        
         //Para establecer el modelo al JTable
 
        DefaultTableModel buscar = new DefaultTableModel(){
                        @Override
        public boolean isCellEditable(int rowIndex, int vColIndex) {
            return false;
        }};
        this.jTbuscar.setModel(buscar);
        
        //Obteniendo la informacion de las columnas que estan siendo consultadas
         ResultSetMetaData rsMd = rs.getMetaData();
         //La cantidad de columnas que tiene la consulta
         int cantidadColumnas = rsMd.getColumnCount();
         //Establecer como cabezeras el nombre de las colimnas
         for (int i = 1; i <= cantidadColumnas; i++) {
          buscar.addColumn(rsMd.getColumnLabel(i));
         }
        
        
        while (rs.next()) {
          Object[] fila = new Object[cantidadColumnas];
  
          for (int i = 0; i < cantidadColumnas; i++) {
             
            fila[i]=rs.getObject(i+1);
          }
          buscar.addRow(fila);
 } 
 
 } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
 
}//GEN-LAST:event_jTbnombre1KeyPressed

private void jTbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbuscarMouseClicked
int Opcion=this.jTbuscar.getSelectedRow();
        //muestra el no. de renglon
       // JOptionPane.showMessageDialog(rootPane,Opcion);
        id =  jTbuscar.getValueAt(Opcion,0).toString();
        this.jTproducto.setText(this.jTbuscar.getValueAt(Opcion, 1).toString());
        this.jTbprecio.setText(this.jTbuscar.getValueAt(Opcion, 2).toString());
        this.jTbcaducidad.setText(this.jTbuscar.getValueAt(Opcion, 3).toString());
        this.jTbexistencia.setText(this.jTbuscar.getValueAt(Opcion, 4).toString());
        this.jTbdescripcion2.setText(this.jTbuscar.getValueAt(Opcion, 5).toString());
        this.jTbespecificaciones.setText(this.jTbuscar.getValueAt(Opcion, 6).toString());
           
}//GEN-LAST:event_jTbuscarMouseClicked

private void jTbdescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTbdescripcionKeyPressed

    
    
    try {
            // se comienza la conexion con la base de datos
        try {
                    con = new Conexion();


                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        String nom= jTbdescripcion.getText();
        String sql ="SELECT * FROM productos WHERE descripcion LIKE '%"+nom+"%'";
        rs = con.Consulta(sql);
        
        if(rs==null)
            JOptionPane.showMessageDialog(null, "No se encontro: "+jTbdescripcion.getText()+" en la base de datos.");
        
         //Para establecer el modelo al JTable
 
        DefaultTableModel buscar = new DefaultTableModel(){
                        @Override
        public boolean isCellEditable(int rowIndex, int vColIndex) {
            return false;
        }};
        this.jTbuscar.setModel(buscar);
        
        //Obteniendo la informacion de las columnas que estan siendo consultadas
         ResultSetMetaData rsMd = rs.getMetaData();
         //La cantidad de columnas que tiene la consulta
         int cantidadColumnas = rsMd.getColumnCount();
         //Establecer como cabezeras el nombre de las colimnas
         for (int i = 1; i <= cantidadColumnas; i++) {
          buscar.addColumn(rsMd.getColumnLabel(i));
         }
        
        
        while (rs.next()) {
          Object[] fila = new Object[cantidadColumnas];
  
          for (int i = 0; i < cantidadColumnas; i++) {
             
            fila[i]=rs.getObject(i+1);
          }
          buscar.addRow(fila);
 }
  
    } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
  
}//GEN-LAST:event_jTbdescripcionKeyPressed

private void dc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dc1ActionPerformed

    jTproducto.setEditable(true);
    jTbprecio.setEditable(true);
    jTbcaducidad.setEditable(true);
    jTbexistencia.setEditable(true);
    jTbdescripcion2.setEditable(true);
    jTbespecificaciones.setEditable(true);
}//GEN-LAST:event_dc1ActionPerformed

private void jBmodificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificar1ActionPerformed
//BOTON PARA MODIFICAR LOS DATOS DE UN PRODUCTO EN LA BASE DE DATOS

 // validaciones para saber que no se deja algun campo en limpio
        if (jTproducto.getText().equals("")||jTbcaducidad.getText().equals("")||jTbprecio.getText().equals("")
                ||jTbexistencia.getText().equals("")||jTbdescripcion2.getText().equals("")||jTbespecificaciones.getText().equals(""))
        {

            JOptionPane.showMessageDialog(null, "Faltan Datos: No Puede Dejar Cuadros en Blanco");

        }

        else

        {
   
    String producto = jTproducto.getText();
    String precio = jTbprecio.getText();
    String caducidad = jTbcaducidad.getText();
    String existe = jTbexistencia.getText();
    String descri = jTbdescripcion2.getText();
    String especi = jTbespecificaciones.getText();


            try {
                //se crea la conexion y las consultas
                con = new Conexion();
                
                int id2 = Integer.parseInt(id);
                // se crea la sentecia sql y se ejecuta para hacer la modificacion
                 String modifica = "UPDATE `productos` SET `nombre_producto`='"+producto+"',`precio`='"+precio+"',`caducidad`='"+caducidad+"',`existencia`='"+existe+"',`descripcion`='"+descri+"',`especificaciones`='"+especi+"' WHERE id_producto = '"+id2+"'";
                 con.ejecutar(modifica);
                JOptionPane.showMessageDialog(null, "Datos Actualizados");


            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
}//GEN-LAST:event_jBmodificar1ActionPerformed

private void jTbcaducidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTbcaducidadActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTbcaducidadActionPerformed

private void TproductosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TproductosKeyPressed
int evento=evt.getKeyCode();
       
        if(evento==10 ){
             if (jTvnombre.getText().equals(""))
        {

            JOptionPane.showMessageDialog(null, "Escriba lo que desea buscar antes de presionar el boton.");

        }
             else {
                 
                 
    
    DefaultTableModel modelo = new DefaultTableModel(){
                        @Override
        public boolean isCellEditable(int rowIndex, int vColIndex) {
            return false;
        }};

    int aux = Tproductos.getSelectedRow();
    if (aux==-1)
        {

            JOptionPane.showMessageDialog(null, "No se a seleccionado nada de la tabla.");

        }

        else
    { 
        String nombre = Tproductos.getValueAt(aux, 1).toString();
            String precio = Tproductos.getValueAt(aux, 2).toString();
         
        String aux2 = precio;
        float tot = Float.parseFloat(aux2);
        String cant = JOptionPane.showInputDialog("Cantidad: ");
        
        
        float cantidad = Float.parseFloat(cant);
        tot=tot*cantidad;
        total=tot+total;
        String aux5 = String.valueOf(total);
        jTtotal.setText(aux5);
        DefaultTableModel temp = (DefaultTableModel) 
                Tlista.getModel();
        Object nuevo[]= {temp.getRowCount()+1,"",""};
        temp.addRow(nuevo);
        
           Tlista.setValueAt(nombre, j, 0);
           Tlista.setValueAt(precio, j, 1);
           Tlista.setValueAt(cant, j, 2);
           j++;//Aumenta el contador

        
        }
                 
             }
        
        
        } 
}//GEN-LAST:event_TproductosKeyPressed

private void jTbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTbuscarKeyPressed
int evento=evt.getKeyCode();
       
        if(evento==10 ){
    //DefaultTableModel modelo = new DefaultTableModel();
//        this.Tlista.setModel(modelo);

    
    DefaultTableModel modelo = new DefaultTableModel(){
                        @Override
        public boolean isCellEditable(int rowIndex, int vColIndex) {
            return false;
        }};

    int aux = jTbuscar.getSelectedRow();
    if (aux==-1)
        {

            JOptionPane.showMessageDialog(null, "No se a seleccionado nada de la tabla.");

        }

        else
    { 
        String nombre = jTbuscar.getValueAt(aux, 1).toString();
            String precio = jTbuscar.getValueAt(aux, 2).toString();
         
        String aux2 = precio;
        float tot = Float.parseFloat(aux2);
        String cant = JOptionPane.showInputDialog("Cantidad: ");
        
        float cantidad = Float.parseFloat(cant);
        tot=tot*cantidad;
        total=tot+total;
        String aux3 = String.valueOf(total);
        jTtotal.setText(aux3);
        DefaultTableModel temp = (DefaultTableModel) 
                Tlista.getModel();
        Object nuevo[]= {temp.getRowCount()+1,"",""};
        temp.addRow(nuevo);
        
           Tlista.setValueAt(nombre, j, 0);
           Tlista.setValueAt(precio, j, 1);
           Tlista.setValueAt(cant, j, 2);
           j++;//Aumenta el contador
                             
    }          
    
        }
        
    // TODO add your handling code here:
}//GEN-LAST:event_jTbuscarKeyPressed

private void jTprecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTprecioKeyPressed
 
}//GEN-LAST:event_jTprecioKeyPressed

private void jTprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTprecioKeyTyped
char caracter = evt.getKeyChar();
if(((caracter < '0') ||
(caracter > '9')) &&
(caracter != evt.VK_BACK_SPACE) && caracter != '.')
{
evt.consume();
}
// TODO add your handling code here:
}//GEN-LAST:event_jTprecioKeyTyped

private void jTbprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTbprecioKeyTyped
char caracter = evt.getKeyChar();
if(((caracter < '0') ||
(caracter > '9')) &&
(caracter != evt.VK_BACK_SPACE) && caracter != '.')
{
evt.consume();
}// TODO add your handling code here:
}//GEN-LAST:event_jTbprecioKeyTyped

private void jTyyyyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTyyyyKeyTyped
char caracter = evt.getKeyChar();
if(((caracter < '0') ||
(caracter > '9')) &&
(caracter != evt.VK_BACK_SPACE))
{
evt.consume();
}// TODO add your handling code here:
}//GEN-LAST:event_jTyyyyKeyTyped

private void jTmmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTmmKeyTyped
char caracter = evt.getKeyChar();
if(((caracter < '0') ||
(caracter > '9')) &&
(caracter != evt.VK_BACK_SPACE))
{
evt.consume();
}// TODO add your handling code here:
}//GEN-LAST:event_jTmmKeyTyped

private void jTddKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTddKeyTyped
char caracter = evt.getKeyChar();
if(((caracter < '0') ||
(caracter > '9')) &&
(caracter != evt.VK_BACK_SPACE))
{
evt.consume();
}// TODO add your handling code here:
}//GEN-LAST:event_jTddKeyTyped

private void jTexistenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTexistenciaKeyTyped
char caracter = evt.getKeyChar();
if(((caracter < '0') ||
(caracter > '9')) &&
(caracter != evt.VK_BACK_SPACE))
{
evt.consume();
}// TODO add your handling code here:
}//GEN-LAST:event_jTexistenciaKeyTyped

    private void jTnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnombreActionPerformed

    private void lbHora2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lbHora2PropertyChange
// TODO add your handling code here:
    }//GEN-LAST:event_lbHora2PropertyChange

    private void lbHora1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lbHora1PropertyChange
// TODO add your handling code here:
    }//GEN-LAST:event_lbHora1PropertyChange


public void setId(String id){
    id2 = id;
    jTID.setText(id);
  
}

public void setC(){
        try {
        
            rs=con.Consulta("SELECT * FROM usuarios WHERE nivel = '1' OR nivel = '0'");
            while(rs.next()){
                
            
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }

}
public void getT(String cad){
    aux3 = cad;
    System.out.println(aux3);
}

public void setT(String cad){
        String aux2 = cad;

}

public String getId(){
    cad = jTID.getText();
    return cad;
}

public String objectToString(Object o) {
        String st;
        st = (String) o;
        return st;
    }
public int getFactura(){
        return rowCount;
}

public int getNumFac(){
        return numfac;
}

public void calcula () {        
    Calendar calendario1 = new GregorianCalendar();
    Date fechaHoraActual = new Date();


    calendario1.setTime(fechaHoraActual);
    ampm = calendario1.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";

    if(ampm.equals("PM")){
         int h = calendario1.get(Calendar.HOUR_OF_DAY);
         hora = h>9?""+h:"0"+h;
    }else{
         hora = calendario1.get(Calendar.HOUR_OF_DAY)>9?""+calendario1.get(Calendar.HOUR_OF_DAY):"0"+calendario1.get(Calendar.HOUR_OF_DAY);            
    }
    minutos = calendario1.get(Calendar.MINUTE)>9?""+calendario1.get(Calendar.MINUTE):"0"+calendario1.get(Calendar.MINUTE);
    segundos = calendario1.get(Calendar.SECOND)>9?""+calendario1.get(Calendar.SECOND):"0"+calendario1.get(Calendar.SECOND); 
}


    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tlista;
    private javax.swing.JTable Tproductos;
    private javax.swing.JButton dc1;
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jBfactura;
    private javax.swing.JButton jBimprimir;
    private javax.swing.JButton jBmodificar1;
    private javax.swing.JButton jBquitar;
    private javax.swing.JButton jBventa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMusers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField jTID;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTbcaducidad;
    private javax.swing.JTextField jTbdescripcion;
    private javax.swing.JTextArea jTbdescripcion2;
    private javax.swing.JTextArea jTbespecificaciones;
    private javax.swing.JTextField jTbexistencia;
    private javax.swing.JTextField jTbnombre1;
    private javax.swing.JTextField jTbnombre2;
    private javax.swing.JTextField jTbprecio;
    private javax.swing.JTable jTbuscar;
    private javax.swing.JTextField jTdd;
    private javax.swing.JTextArea jTdescripcion;
    private javax.swing.JTextArea jTespecificaciones;
    private javax.swing.JTextField jTexistencia;
    private javax.swing.JTextField jTmm;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTprecio;
    private javax.swing.JTextField jTproducto;
    private javax.swing.JTextField jTtotal;
    private javax.swing.JTextField jTvnombre;
    private javax.swing.JTextField jTyyyy;
    private javax.swing.JLabel lbHora1;
    private javax.swing.JLabel lbHora2;
    // End of variables declaration//GEN-END:variables

    public void run() {
        Thread ct = Thread.currentThread();
         while(ct == h1) {   
          calcula();
          lbHora1.setText(hora + ":" + minutos + ":" + segundos + " "+ampm);
          lbHora1.setText(hora + ":" + minutos + ":" + segundos + " "+ampm);
          lbHora2.setText(hora + ":" + minutos + ":" + segundos + " "+ampm);
          try {
           Thread.sleep(1000);
          }catch(InterruptedException e) {}
         }
        throw new UnsupportedOperationException("Not supported yet.");
    }

}


