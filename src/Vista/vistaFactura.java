/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import Control.ControlCompras;
import Modelo.Conexion;
import Modelo.LineaFactura;
import Modelo.Render;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author John Castro
 */
public class vistaFactura extends javax.swing.JFrame {

    /**
     * Creates new form vistaFactura
     */
    
    private Conexion con;
    private ControlCompras controlC;
    private int NitProveedor;
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo,modelo1,modelo2;
    public static int nitProveedor;
    int numLinea=1;
    JButton botonEliminarLinea;
    
    public vistaFactura(Conexion con1) {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        con=con1;
        Date sistFecha=new Date();
        SimpleDateFormat formato= new SimpleDateFormat("dd-MM-yyyy");
        txtFecha.setText(formato.format(sistFecha));
        cargarNumFactura();
        listarArticulos();
        
        tablaLinea.setDefaultRenderer(Object.class, new Render());
        
        panelModificarFactura.setVisible(false);
        panelTablaFactura.setVisible(false);
        
        botonEliminarLinea = new JButton("Eliminar");
        botonEliminarLinea.setName("e"); 
        botonEliminarLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/eliminar.png")));
        botonEliminarLinea.setBackground(new java.awt.Color(255, 255, 255));
        botonEliminarLinea.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarLinea.setBorder(null);
        botonEliminarLinea.setBorderPainted(false);
    }
    
    
    
    void listarArticulos(){    
        modelo1=(DefaultTableModel)tablaArticulos.getModel();
        /*Se almacena la consulta sql en un string*/
        String sql="SELECT * "+"FROM Articulo";
        try{
            /*se establece coneccion con la base de datos y se le introduce la consulta*/
            cn=con.getConnection();
            st=cn.createStatement();
            rs=st.executeQuery(sql);   
            Object[] Datos= new Object[9]; /*Un array donde se almacenan las filas de la tabla. el tamaño del
            array debe ser el numero de columnas que tenga nuestra consulta*/
            while(rs.next()){
            Datos[0]=rs.getInt("idarticulo");/*deben llamarse exactamente igual a como esta en la tabla*/
            Datos[1]=rs.getString("nombrearticulo");/*deben llamarse exactamente igual a como esta en la tabla*/
            modelo1.addRow(Datos);
            }    
        }catch(SQLException e){}
    }
    
    void cargarNumFactura(){
        String sql="SELECT MAX(idfactura)FROM FACTURA;";
            try{
                /*se establece coneccion con la base de datos y se le introduce la consulta*/
                cn=con.getConnection();
                st=cn.createStatement();
                rs=st.executeQuery(sql);   /*Un array donde se almacenan las filas de la tabla. el tamaño del
                array debe ser el numero de columnas que tenga nuestra consulta*/
                while(rs.next()){
                IdCompraLabel.setText(String.valueOf(rs.getInt(1)+1));
                }    
            }catch(SQLException e){}
    }
    
    public void listar(){    
        modelo=(DefaultTableModel)tablaFacturas.getModel();
        /*Se almacena la consulta sql en un string*/
        String sql="SELECT * FROM Factura";
        try{
            /*se establece coneccion con la base de datos y se le introduce la consulta*/
            cn=con.getConnection();
            st=cn.createStatement();
            rs=st.executeQuery(sql);   
            Object[] Datos= new Object[5]; /*Un array donde se almacenan las filas de la tabla. el tamaño del
            array debe ser el numero de columnas que tenga nuestra consulta*/
            while(rs.next()){
            Datos[0]=rs.getInt("idfactura");/*deben llamarse exactamente igual a como esta en la tabla*/
            Datos[1]=rs.getString("idcliente");/*deben llamarse exactamente igual a como esta en la tabla*/
            Datos[2]=rs.getString("idusuario");
            Datos[3]=rs.getString("fechafactura");/*/*deben llamarse exactamente igual a como esta en la tabla*/
            Datos[4]=rs.getString("totalfactura");
            modelo.addRow(Datos);
            }    
        }catch(SQLException e){}
    }
        
    void limpiarTabla(){
        
        modelo=(DefaultTableModel)tablaFacturas.getModel();
        while(modelo.getRowCount()>0)modelo.removeRow(0);
    }
    
    

    public static void cargarCliente(String Nit, String Nombre, String Telefono, String Direccion){
        lblidproveedor.setText(Nit);
        lblproveedornombre.setText(Nombre);
        lbltelefono.setText(Telefono);
        lbldireccion.setText(Direccion);
        nitProveedor = Integer.parseInt(Nit);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFactura = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelCrearFactura = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaArticulos = new rojerusan.RSTableMetro();
        botonCliente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblidproveedor = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        lbldireccion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        IdCompraLabel = new javax.swing.JLabel();
        lblproveedornombre = new javax.swing.JLabel();
        botonAñadir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaLinea = new rojerusan.RSTableMetro();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        panelModificarFactura = new javax.swing.JPanel();
        cajaTextoNitM = new javax.swing.JTextField();
        labelId1 = new javax.swing.JLabel();
        labelNombre2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        cajaTextoNombreM = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        labelTelefono1 = new javax.swing.JLabel();
        cajaTextoTelefonoM = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        labelNombre3 = new javax.swing.JLabel();
        cajaTextoDireccionM = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        botonModificar = new javax.swing.JButton();
        panelTablaFactura = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaFacturas = new rojerusan.RSTableMetro();
        panelCompraMenu = new javax.swing.JPanel();
        botonCrear = new javax.swing.JButton();
        botonVer = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFactura.setBackground(new java.awt.Color(255, 255, 255));
        panelFactura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Decker", 0, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(102, 102, 102));
        labelTitulo.setText("Facturación");
        panelFactura.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, 40));

        panelCrearFactura.setBackground(new java.awt.Color(255, 255, 255));
        panelCrearFactura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelCrearFactura.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 100, 10));

        tablaArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Articulo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaArticulos.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        tablaArticulos.setFuenteFilas(new java.awt.Font("Decker", 0, 18)); // NOI18N
        tablaArticulos.setFuenteFilasSelect(new java.awt.Font("Decker", 0, 18)); // NOI18N
        tablaArticulos.setFuenteHead(new java.awt.Font("Decker", 0, 18)); // NOI18N
        tablaArticulos.setRowHeight(20);
        tablaArticulos.setRowMargin(0);
        jScrollPane1.setViewportView(tablaArticulos);
        if (tablaArticulos.getColumnModel().getColumnCount() > 0) {
            tablaArticulos.getColumnModel().getColumn(0).setResizable(false);
            tablaArticulos.getColumnModel().getColumn(1).setResizable(false);
        }

        panelCrearFactura.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 490, 290));

        botonCliente.setBackground(new java.awt.Color(255, 255, 255));
        botonCliente.setForeground(new java.awt.Color(255, 255, 255));
        botonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/busqueda.png"))); // NOI18N
        botonCliente.setBorder(null);
        botonCliente.setBorderPainted(false);
        botonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClienteActionPerformed(evt);
            }
        });
        panelCrearFactura.add(botonCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 30, 30));

        jLabel7.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel7.setText("Buscador");
        panelCrearFactura.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel10.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel10.setText("Dirección:");
        panelCrearFactura.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel11.setText("NIT:");
        panelCrearFactura.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        jLabel12.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel12.setText("Nombre:");
        panelCrearFactura.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 40, -1, -1));

        jLabel13.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel13.setText("Teléfono:");
        panelCrearFactura.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        lblidproveedor.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        lblidproveedor.setText("-");
        panelCrearFactura.add(lblidproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        lbltelefono.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        lbltelefono.setText("-");
        panelCrearFactura.add(lbltelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 110, -1));

        lbldireccion.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        lbldireccion.setText("-");
        panelCrearFactura.add(lbldireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 90, 170, -1));

        jLabel3.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel3.setText("Factura N°:");
        panelCrearFactura.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        txtFecha.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtFecha.setBorder(null);
        panelCrearFactura.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 100, 20));

        IdCompraLabel.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        IdCompraLabel.setText("-");
        panelCrearFactura.add(IdCompraLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 40, -1));

        lblproveedornombre.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        lblproveedornombre.setText("-");
        panelCrearFactura.add(lblproveedornombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 40, -1, -1));

        botonAñadir.setBackground(new java.awt.Color(64, 132, 253));
        botonAñadir.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        botonAñadir.setForeground(new java.awt.Color(255, 255, 255));
        botonAñadir.setText("Agregar Articulo");
        botonAñadir.setBorder(null);
        botonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirActionPerformed(evt);
            }
        });
        panelCrearFactura.add(botonAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 180, 40));

        tablaLinea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Linea", "Código", "Articulo", "Cantidad", "Subtotal", "Eliminar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaLinea.setFuenteHead(new java.awt.Font("Decker", 0, 18)); // NOI18N
        tablaLinea.setRowHeight(30);
        tablaLinea.setRowMargin(0);
        tablaLinea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaLineaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaLinea);
        if (tablaLinea.getColumnModel().getColumnCount() > 0) {
            tablaLinea.getColumnModel().getColumn(0).setResizable(false);
            tablaLinea.getColumnModel().getColumn(1).setResizable(false);
            tablaLinea.getColumnModel().getColumn(2).setResizable(false);
            tablaLinea.getColumnModel().getColumn(3).setResizable(false);
            tablaLinea.getColumnModel().getColumn(5).setResizable(false);
        }

        panelCrearFactura.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 700, 330));

        jLabel1.setFont(new java.awt.Font("Decker", 0, 48)); // NOI18N
        jLabel1.setText("Total:");
        panelCrearFactura.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, -1, 40));

        jLabel8.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel8.setText("Fecha:");
        panelCrearFactura.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panelCrearFactura.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 390, 30));

        panelFactura.add(panelCrearFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1270, 560));

        panelModificarFactura.setBackground(new java.awt.Color(255, 255, 255));
        panelModificarFactura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajaTextoNitM.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoNitM.setBorder(null);
        cajaTextoNitM.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        panelModificarFactura.add(cajaTextoNitM, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 230, 20));

        labelId1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelId1.setText("NIT");
        panelModificarFactura.add(labelId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, 20));

        labelNombre2.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelNombre2.setText("Nombre");
        panelModificarFactura.add(labelNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, 20));
        panelModificarFactura.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 230, 10));

        cajaTextoNombreM.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoNombreM.setBorder(null);
        cajaTextoNombreM.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        panelModificarFactura.add(cajaTextoNombreM, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 230, 20));
        panelModificarFactura.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 230, 10));

        labelTelefono1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelTelefono1.setText("Telefono");
        panelModificarFactura.add(labelTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, 20));

        cajaTextoTelefonoM.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoTelefonoM.setBorder(null);
        cajaTextoTelefonoM.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        panelModificarFactura.add(cajaTextoTelefonoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 230, 20));
        panelModificarFactura.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 230, 10));

        labelNombre3.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelNombre3.setText("Dirección");
        panelModificarFactura.add(labelNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, 20));

        cajaTextoDireccionM.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoDireccionM.setBorder(null);
        cajaTextoDireccionM.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        panelModificarFactura.add(cajaTextoDireccionM, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 230, 20));
        panelModificarFactura.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 230, 10));

        botonModificar.setBackground(new java.awt.Color(64, 132, 253));
        botonModificar.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        botonModificar.setForeground(new java.awt.Color(255, 255, 255));
        botonModificar.setText("Modificar Cliente");
        botonModificar.setBorder(null);
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        panelModificarFactura.add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 180, 40));

        panelFactura.add(panelModificarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 740, 340));

        panelTablaFactura.setBackground(new java.awt.Color(255, 255, 255));
        panelTablaFactura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Factura", "Id Cliente", "Id Usuario", "Fecha ", "Total", "Ver", "Modificar", "Eliminar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaFacturas.setColorBackgoundHead(new java.awt.Color(51, 172, 234));
        tablaFacturas.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        tablaFacturas.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        tablaFacturas.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        tablaFacturas.setFuenteFilas(new java.awt.Font("Decker", 0, 18)); // NOI18N
        tablaFacturas.setFuenteFilasSelect(new java.awt.Font("Decker", 1, 18)); // NOI18N
        tablaFacturas.setFuenteHead(new java.awt.Font("Decker", 1, 18)); // NOI18N
        tablaFacturas.setGridColor(new java.awt.Color(255, 255, 255));
        tablaFacturas.setGrosorBordeFilas(0);
        tablaFacturas.setGrosorBordeHead(0);
        tablaFacturas.setRowHeight(25);
        tablaFacturas.setRowMargin(0);
        tablaFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaFacturasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaFacturas);

        panelTablaFactura.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 740, 390));

        panelFactura.add(panelTablaFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 740, 470));

        panelCompraMenu.setBackground(new java.awt.Color(0, 0, 0));
        panelCompraMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonCrear.setBackground(new java.awt.Color(0, 0, 0));
        botonCrear.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        botonCrear.setForeground(new java.awt.Color(255, 255, 255));
        botonCrear.setText("Crear Factura");
        botonCrear.setBorder(null);
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });
        panelCompraMenu.add(botonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 70));

        botonVer.setBackground(new java.awt.Color(0, 0, 0));
        botonVer.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        botonVer.setForeground(new java.awt.Color(255, 255, 255));
        botonVer.setText("Ver Facturas");
        botonVer.setBorder(null);
        botonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerActionPerformed(evt);
            }
        });
        panelCompraMenu.add(botonVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 190, 70));

        botonRegresar.setBackground(new java.awt.Color(0, 0, 0));
        botonRegresar.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        botonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresar.setText("Regresar");
        botonRegresar.setBorder(null);
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        panelCompraMenu.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 150, 70));

        panelFactura.add(panelCompraMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, -1));

        getContentPane().add(panelFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     
    private void tablaFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFacturasMouseClicked
        //En esta parte creo dos variables las cualves van almacenar la posicion en X y Y donde he dado click
        int column = tablaFacturas.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/tablaFacturas.getRowHeight();

        //En esta parte me aseguro de que la posicion este dentro de los limites de la tabla
        if(row<tablaFacturas.getRowCount() && row>=0 && column<tablaFacturas.getColumnCount() && column >=0){
            //En esta parte se crea un objeto que toma el valor del componente que se clickio
            Object value = tablaFacturas.getValueAt(row, column);
            //En esta parte me aseguro que ese objeto sea un boton.
            if(value instanceof JButton){
                ((JButton)value).doClick();
                //En esta parte creo un boton el cual va tomar los valores del objeto value.
                JButton boton= (JButton) value;
                //En esta parte diferencio cual boton fue presionado para que se ejecute los respectivos eventos.
                if(boton.getName().equals("v")){
                    panelCrearFactura.setVisible(false);
                    panelTablaFactura.setVisible(false);
                    panelModificarFactura.setVisible(true);
                    botonModificar.setVisible(false);
                    cajaTextoNitM.setEnabled(false);
                    cajaTextoNombreM.setEnabled(false);
                    cajaTextoDireccionM.setEnabled(false);
                    cajaTextoTelefonoM.setEnabled(false);

                    cajaTextoNitM.setText(String.valueOf(tablaFacturas.getValueAt(tablaFacturas.getSelectedRow(), 0)));
                    cajaTextoNombreM.setText(String.valueOf(tablaFacturas.getValueAt(tablaFacturas.getSelectedRow(), 1)));
                    cajaTextoDireccionM.setText(String.valueOf(tablaFacturas.getValueAt(tablaFacturas.getSelectedRow(), 2)));
                    cajaTextoTelefonoM.setText(String.valueOf(tablaFacturas.getValueAt(tablaFacturas.getSelectedRow(), 3)));
                }
                if(boton.getName().equals("m")){
                    panelCrearFactura.setVisible(false);
                    panelTablaFactura.setVisible(false);
                    panelModificarFactura.setVisible(true);
                    botonModificar.setVisible(true);
                    cajaTextoNitM.setEnabled(true);
                    cajaTextoNombreM.setEnabled(true);
                    cajaTextoDireccionM.setEnabled(true);
                    cajaTextoTelefonoM.setEnabled(true);
                    cajaTextoNitM.setText(String.valueOf(tablaFacturas.getValueAt(tablaFacturas.getSelectedRow(), 0)));
                    cajaTextoNombreM.setText(String.valueOf(tablaFacturas.getValueAt(tablaFacturas.getSelectedRow(), 1)));
                    cajaTextoDireccionM.setText(String.valueOf(tablaFacturas.getValueAt(tablaFacturas.getSelectedRow(), 2)));
                    cajaTextoTelefonoM.setText(String.valueOf(tablaFacturas.getValueAt(tablaFacturas.getSelectedRow(), 3)));
                }
                
                if(boton.getName().equals("e")){
                    //En esta parte la idea es que no se elimine sino que se cambie un atributo estado.
                    try{
                        //se le asignan los atribujos que se ingreso en las cajas de texto a un objeto usuario
                        //controlC.getCliente().setIdCliente(Integer.valueOf(String.valueOf(tablaFacturas.getValueAt(tablaFacturas.getSelectedRow(), 0))));
                        //controlC.eliminar();//se ejecuta el metodo que agrega una cuenta a la base de datos

                    }catch(Exception e){}
                   // JOptionPane.showMessageDialog(null,"Cliente eliminado con exito");
                    //limpiarTabla();
                    //listar(); // TODO add your handling code here:
                }
                
            }
        }
    }//GEN-LAST:event_tablaFacturasMouseClicked

    
    private void botonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirActionPerformed
        modelo2=(DefaultTableModel)tablaLinea.getModel();
        String cantidad;
        //LineaFactura linea = new LineaFactura();
        cantidad=JOptionPane.showInputDialog("Ingrese la cantidad");
        Object[] DatosL = new Object[6];
        DatosL[0]=String.valueOf(numLinea);
        DatosL[1]=String.valueOf(tablaArticulos.getValueAt(tablaArticulos.getSelectedRow(), 0));
        DatosL[2]=String.valueOf(tablaArticulos.getValueAt(tablaArticulos.getSelectedRow(), 1));
        DatosL[3]=String.valueOf(cantidad);
        DatosL[4]=String.valueOf(29000);
        DatosL[5]=botonEliminarLinea;
        modelo2.addRow(DatosL);

        
      /*  
        void listar(){    
        modelo=(DefaultTableModel)tablaArticulos.getModel();
        //Se almacena la consulta sql en un string
        String sql="SELECT * "+"FROM Articulo";
        try{
            //se establece coneccion con la base de datos y se le introduce la consulta
            cn=con.getConnection();
            st=cn.createStatement();
            rs=st.executeQuery(sql);   
            Object[] Datos= new Object[9]; //Un array donde se almacenan las filas de la tabla. el tamaño del
            //array debe ser el numero de columnas que tenga nuestra consulta
            while(rs.next()){
            Datos[0]=rs.getInt("idarticulo");//deben llamarse exactamente igual a como esta en la tabla//
            Datos[1]=rs.getString("nombrearticulo");//deben llamarse exactamente igual a como esta en la tabla
            Datos[2]=rs.getString("idcategoarticulo");
            Datos[3]=rs.getString("nitproveedor");//deben llamarse exactamente igual a como esta en la tabla
            Datos[4]=rs.getString("codbarraarticulo");
            Datos[5]=rs.getString("costoarticulo");
            Datos[6]=botonVerTabla;//En esta parte estoy añadiendo por cada fila los tres botones(ver,modificar,eliminar)
            Datos[7]=botonModificarTabla;
            Datos[8]=botonEliminarTabla;
            modelo.addRow(Datos);
            }    
        }catch(SQLException e){}
    }

*/
        
        
        
        
        /*
        try{
            //se le asignan los atribujos que se ingreso en las cajas de texto a un objeto usuario
            
            controlC.getCliente().setIdCliente(Integer.valueOf(cajaTextoIdFac.getText()));
            controlC.getCliente().setNombre(cajaTextoNombreClie.getText());
            controlC.getCliente().setTelefono(cajaTextNombreCajero.getText());
            controlC.getCliente().setDireccion(cajaTextoFecha.getText());
            controlC.agregar();//se ejecuta el metodo que agrega un cliente a la base de datos
        }catch(Exception e){}
        JOptionPane.showMessageDialog(null,"Cliente registrado con exito");
        limpiarCajasTexto();
        */
    }//GEN-LAST:event_botonAñadirActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        /*
        try{
            //Cuando se hagan las respectivas modificaciones en los Jtext, y se presione el boton modificar, se ejecuta el siguiente
            controlC.getCliente().setIdCliente(Integer.valueOf(cajaTextoNitM.getText()));
            controlC.getCliente().setNombre(cajaTextoNombreM.getText());
            controlC.getCliente().setTelefono(cajaTextoTelefonoM.getText());
            controlC.getCliente().setDireccion(cajaTextoDireccionM.getText());
            controlC.modificar();//se ejecuta el metodo que agrega una cuenta a la base de datos
        }catch(Exception e){}
        JOptionPane.showMessageDialog(null,"Cliente modificado con exito");
        //Falta verificar que no se modifique a clientes con la misma identificacion;
        */
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        panelCrearFactura.setVisible(true);
        panelTablaFactura.setVisible(false);
        cargarNumFactura();
    }//GEN-LAST:event_botonCrearActionPerformed

    private void botonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerActionPerformed
        //Para poder ver los clientes es necesario poner visible el panel tablaCliente, y el resto invisible
        panelCrearFactura.setVisible(false);
        panelTablaFactura.setVisible(true);
        //limpiarTabla();
        //listar();
    }//GEN-LAST:event_botonVerActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClienteActionPerformed

        vistaFacturaClienteSeleccion vFacturaClienteSeleccion= new vistaFacturaClienteSeleccion(con);
    }//GEN-LAST:event_botonClienteActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void tablaLineaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaLineaMouseClicked
        int column = tablaLinea.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/tablaLinea.getRowHeight();

        //En esta parte me aseguro de que la posicion este dentro de los limites de la tabla
        if(row<tablaLinea.getRowCount() && row>=0 && column<tablaLinea.getColumnCount() && column >=0){
            //En esta parte se crea un objeto que toma el valor del componente que se clickio
            Object value = tablaLinea.getValueAt(row, column);
            //En esta parte me aseguro que ese objeto sea un boton.
            if(value instanceof JButton){
                ((JButton)value).doClick();
                //En esta parte creo un boton el cual va tomar los valores del objeto value.
                JButton boton= (JButton) value;
                //En esta parte diferencio cual boton fue presionado para que se ejecute los respectivos eventos.
                if(boton.getName().equals("e")){
                    modelo2.removeRow(row);
                    
                }
                }
        }
        

    }//GEN-LAST:event_tablaLineaMouseClicked
    
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdCompraLabel;
    private javax.swing.JButton botonAñadir;
    private javax.swing.JButton botonCliente;
    private javax.swing.JButton botonCrear;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonVer;
    private javax.swing.JTextField cajaTextoDireccionM;
    private javax.swing.JTextField cajaTextoNitM;
    private javax.swing.JTextField cajaTextoNombreM;
    private javax.swing.JTextField cajaTextoTelefonoM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelId1;
    private javax.swing.JLabel labelNombre2;
    private javax.swing.JLabel labelNombre3;
    private javax.swing.JLabel labelTelefono1;
    private javax.swing.JLabel labelTitulo;
    public static javax.swing.JLabel lbldireccion;
    public static javax.swing.JLabel lblidproveedor;
    public static javax.swing.JLabel lblproveedornombre;
    public static javax.swing.JLabel lbltelefono;
    private javax.swing.JPanel panelCompraMenu;
    private javax.swing.JPanel panelCrearFactura;
    private javax.swing.JPanel panelFactura;
    private javax.swing.JPanel panelModificarFactura;
    private javax.swing.JPanel panelTablaFactura;
    private rojerusan.RSTableMetro tablaArticulos;
    private rojerusan.RSTableMetro tablaFacturas;
    private rojerusan.RSTableMetro tablaLinea;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
