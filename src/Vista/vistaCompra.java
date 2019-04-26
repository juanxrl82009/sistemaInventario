/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import Control.ControlCompras;
import Control.ControlLineaCompra;
import Modelo.Conexion;
import Modelo.Render;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author John Castro
 */
public class vistaCompra extends javax.swing.JFrame {

    /**
     * Creates new form vistaCompra
     */
    private Conexion con;
    private ControlCompras controlC;
    private ControlLineaCompra controlLineaC;
    private int NitProveedor;
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo,modelo1,modelo2;
    public static int nitProveedor;
    int totalsuma=0;
    int idCompra;
    JButton botonEliminarLinea;
    Date sistFecha=new Date();
    SimpleDateFormat formato= new SimpleDateFormat("dd-MM-yyyy");
    
    public static void cargarNit(String Nit, String Nombre, String Telefono, String Direccion){
        lblidproveedor.setText(Nit);
        lblproveedornombre.setText(Nombre);
        lbltelefono.setText(Telefono);
        lbldireccion.setText(Direccion);
        nitProveedor = Integer.parseInt(Nit);
        
    }
    public vistaCompra(Conexion con1) {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        con=con1;
        controlC= new ControlCompras(con);
        controlLineaC= new ControlLineaCompra(con);
        txtFecha.setText(formato.format(sistFecha));
        cargarNumCompra();
        listarArticulos();
        
         tablaLinea.setDefaultRenderer(Object.class, new Render());
        
        panelCompraTabla.setVisible(false);
        
        botonEliminarLinea = new JButton("Eliminar");
        botonEliminarLinea.setName("e"); 
        botonEliminarLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/eliminar.png")));
        botonEliminarLinea.setBackground(new java.awt.Color(255, 255, 255));
        botonEliminarLinea.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarLinea.setBorder(null);
        botonEliminarLinea.setBorderPainted(false);
    }
    public void listar(){    
        modelo=(DefaultTableModel)tablaCompras.getModel();
        /*Se almacena la consulta sql en un string*/
        String sql="SELECT * FROM Compra";
        try{
            /*se establece coneccion con la base de datos y se le introduce la consulta*/
            cn=con.getConnection();
            st=cn.createStatement();
            rs=st.executeQuery(sql);   
            Object[] Datos= new Object[4]; /*Un array donde se almacenan las filas de la tabla. el tamaño del
            array debe ser el numero de columnas que tenga nuestra consulta*/
            while(rs.next()){
            Datos[0]=rs.getInt("idcompra");/*deben llamarse exactamente igual a como esta en la tabla*/
            Datos[1]=rs.getString("idUsuario");/*deben llamarse exactamente igual a como esta en la tabla*/
            Datos[2]=rs.getString("nitproveedor");
            Datos[3]=rs.getString("totalcompra");/*/*deben llamarse exactamente igual a como esta en la tabla*/
            modelo.addRow(Datos);
            }    
        }catch(SQLException e){}
    }
    
    public void calcularTotal(){
        totalsuma=0;
        for(int i=0; i< tablaLinea.getRowCount(); i++){
            totalsuma =  totalsuma + Integer.parseInt(String.valueOf(tablaLinea.getValueAt(i, 4)));          
        }
        lblTotal.setText("$"+String.valueOf(totalsuma));
    }
        
    void limpiarTabla(){
        
        modelo=(DefaultTableModel)tablaCompras.getModel();
        while(modelo.getRowCount()>0)modelo.removeRow(0);
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
    void cargarNumCompra(){
        String sql="SELECT MAX(idcompra)FROM COMPRA;";
            try{
                /*se establece coneccion con la base de datos y se le introduce la consulta*/
                cn=con.getConnection();
                st=cn.createStatement();
                rs=st.executeQuery(sql);   /*Un array donde se almacenan las filas de la tabla. el tamaño del
                array debe ser el numero de columnas que tenga nuestra consulta*/
                while(rs.next()){
                idCompra=0;
                idCompra=rs.getInt(1)+1;
                IdCompraLabel.setText(String.valueOf(idCompra));
                }    
            }catch(SQLException e){}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCompra = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelCompraCrear = new javax.swing.JPanel();
        lbldireccion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        IdCompraLabel = new javax.swing.JLabel();
        lblproveedornombre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        botonCliente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtFactura = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblidproveedor = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaLinea = new rojerusan.RSTableMetro();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaArticulos = new rojerusan.RSTableMetro();
        botonAñadir = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        panelCompraTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCompras = new rojerusan.RSTableMetro();
        panelCompraMenu = new javax.swing.JPanel();
        botonCrear = new javax.swing.JButton();
        botonVer1 = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        botonVer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelCompra.setBackground(new java.awt.Color(255, 255, 255));
        panelCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Decker", 0, 36)); // NOI18N
        jLabel1.setText("Compras");
        panelCompra.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        panelCompraCrear.setBackground(new java.awt.Color(255, 255, 255));
        panelCompraCrear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbldireccion.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        lbldireccion.setText("-");
        panelCompraCrear.add(lbldireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 170, -1));

        jLabel3.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel3.setText("Factura N°:");
        panelCompraCrear.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        txtFecha.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        panelCompraCrear.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 110, 30));

        IdCompraLabel.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        IdCompraLabel.setText("-");
        panelCompraCrear.add(IdCompraLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        lblproveedornombre.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        lblproveedornombre.setText("-");
        panelCompraCrear.add(lblproveedornombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel6.setText("Compra N°");
        panelCompraCrear.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

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
        panelCompraCrear.add(botonCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 30, 30));

        jLabel7.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel7.setText("Fecha:");
        panelCompraCrear.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        txtFactura.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        panelCompraCrear.add(txtFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 110, 30));

        jLabel9.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel9.setText("Proveedor");
        panelCompraCrear.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel10.setText("Dirección:");
        panelCompraCrear.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel11.setText("NIT:");
        panelCompraCrear.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jLabel12.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel12.setText("Nombre:");
        panelCompraCrear.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, -1, -1));

        jLabel13.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel13.setText("Teléfono:");
        panelCompraCrear.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        lblidproveedor.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        lblidproveedor.setText("-");
        panelCompraCrear.add(lblidproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, -1, -1));

        lbltelefono.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        lbltelefono.setText("-");
        panelCompraCrear.add(lbltelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 110, -1));

        tablaLinea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Articulo", "Cantidad", "Costo", "Subtotal", "Eliminar"
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
        jScrollPane4.setViewportView(tablaLinea);

        panelCompraCrear.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 700, 330));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panelCompraCrear.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 390, 30));

        jLabel8.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel8.setText("Buscador");
        panelCompraCrear.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

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
        jScrollPane3.setViewportView(tablaArticulos);

        panelCompraCrear.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 490, 290));

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
        panelCompraCrear.add(botonAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 180, 40));

        lblTotal.setFont(new java.awt.Font("Decker", 0, 48)); // NOI18N
        lblTotal.setText("-");
        panelCompraCrear.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, -1, 40));

        jLabel4.setFont(new java.awt.Font("Decker", 0, 48)); // NOI18N
        jLabel4.setText("Total:");
        panelCompraCrear.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, -1, 40));

        botonGuardar.setBackground(new java.awt.Color(64, 132, 253));
        botonGuardar.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        botonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardar.setText("Guardar Factura");
        botonGuardar.setBorder(null);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        panelCompraCrear.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 500, 210, 40));

        panelCompra.add(panelCompraCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1270, 570));

        panelCompraTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id Compras", "Fecha", "Hora", "Cantidad"
            }
        ));
        tablaCompras.setColorBackgoundHead(new java.awt.Color(64, 132, 253));
        tablaCompras.setColorFilasBackgound2(new java.awt.Color(100, 182, 242));
        tablaCompras.setFont(new java.awt.Font("Decker", 0, 11)); // NOI18N
        tablaCompras.setFuenteHead(new java.awt.Font("Decker", 1, 15)); // NOI18N
        tablaCompras.setGrosorBordeFilas(0);
        tablaCompras.setGrosorBordeHead(0);
        tablaCompras.setRowHeight(20);
        jScrollPane1.setViewportView(tablaCompras);

        panelCompraTabla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 370));

        panelCompra.add(panelCompraTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 860, 370));

        panelCompraMenu.setBackground(new java.awt.Color(0, 0, 0));
        panelCompraMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonCrear.setBackground(new java.awt.Color(0, 0, 0));
        botonCrear.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        botonCrear.setForeground(new java.awt.Color(255, 255, 255));
        botonCrear.setText("Crear Compra");
        botonCrear.setBorder(null);
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });
        panelCompraMenu.add(botonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 70));

        botonVer1.setBackground(new java.awt.Color(0, 0, 0));
        botonVer1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        botonVer1.setForeground(new java.awt.Color(255, 255, 255));
        botonVer1.setText("Ver Compras");
        botonVer1.setBorder(null);
        botonVer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVer1ActionPerformed(evt);
            }
        });
        panelCompraMenu.add(botonVer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 190, 70));

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

        panelCompra.add(panelCompraMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 912, -1));

        botonVer.setBackground(new java.awt.Color(0, 0, 0));
        botonVer.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        botonVer.setForeground(new java.awt.Color(255, 255, 255));
        botonVer.setText("Ver Clientes");
        botonVer.setBorder(null);
        botonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerActionPerformed(evt);
            }
        });
        panelCompra.add(botonVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 130, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClienteActionPerformed
        
        vistaCompraProveedorSeleccion vCompraProveedorSeleccion= new vistaCompraProveedorSeleccion(con);

    }//GEN-LAST:event_botonClienteActionPerformed

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        panelCompraCrear.setVisible(true);
        panelCompraTabla.setVisible(false);
        cargarNumCompra();
    }//GEN-LAST:event_botonCrearActionPerformed

    private void botonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerActionPerformed
        //Para poder ver los clientes es necesario poner visible el panel tablaCliente, y el resto invisible
    
    }//GEN-LAST:event_botonVerActionPerformed

    private void botonVer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVer1ActionPerformed
        //Para poder ver los clientes es necesario poner visible el panel tablaCliente, y el resto invisible
        panelCompraCrear.setVisible(false);
        panelCompraTabla.setVisible(true);
        limpiarTabla();
        listar();
    }//GEN-LAST:event_botonVer1ActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

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

    private void botonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirActionPerformed
        modelo2=(DefaultTableModel)tablaLinea.getModel();
        String cantidad;
        String precio;
        //LineaFactura linea = new LineaFactura();
        cantidad=JOptionPane.showInputDialog("Ingrese la cantidad");
        precio=JOptionPane.showInputDialog("Ingrese precio por unidad");
        Object[] DatosL = new Object[6];
        DatosL[0]=String.valueOf(tablaArticulos.getValueAt(tablaArticulos.getSelectedRow(), 0));
        DatosL[1]=String.valueOf(tablaArticulos.getValueAt(tablaArticulos.getSelectedRow(), 1));
        DatosL[2]=String.valueOf(cantidad);
        DatosL[3]=String.valueOf(precio);
        DatosL[4]=String.valueOf(Integer.parseInt(cantidad)*Integer.parseInt(precio));
        DatosL[5]=botonEliminarLinea;
        modelo2.addRow(DatosL);
        calcularTotal();

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

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        try{
            /*se le asignan los atribujos que se ingreso en las cajas de texto a un objeto usuario*/
            controlC.getCompra().setIdFacturacompra(txtFactura.getText());
            controlC.getCompra().setIdUsuario(1107100224);
            controlC.getCompra().setNitProveedor(Integer.valueOf(lblidproveedor.getText()));
            controlC.getCompra().setFechaCompra(formato.format(sistFecha));
            controlC.getCompra().setTotalCompra(totalsuma);
            controlC.agregar();/*se ejecuta el metodo que agrega un cliente a la base de datos*/
        }catch(Exception e){}
        
        for(int i=0; i< tablaLinea.getRowCount(); i++){
            try{
            /*se le asignan los atribujos que se ingreso en las cajas de texto a un objeto usuario*/
            controlLineaC.getLineaCompra().setIdArticulo(Integer.parseInt(String.valueOf(tablaLinea.getValueAt(i, 0))));
            controlLineaC.getLineaCompra().setIdCompra(idCompra);
            controlLineaC.getLineaCompra().setCantidadArticulo(Integer.parseInt(String.valueOf(tablaLinea.getValueAt(i, 2))));
            controlLineaC.getLineaCompra().setCostoArticulo(Integer.parseInt(String.valueOf(tablaLinea.getValueAt(i, 3))));
            controlLineaC.getLineaCompra().setSubtotal(Integer.parseInt(String.valueOf(tablaLinea.getValueAt(i, 4))));
            controlLineaC.agregar();/*se ejecuta el metodo que agrega un cliente a la base de datos*/
        }catch(Exception e){}
        }
        
        JOptionPane.showMessageDialog(null,"Compra registrada con exito");
        //limpiarCajasTexto();
    }//GEN-LAST:event_botonGuardarActionPerformed
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdCompraLabel;
    private javax.swing.JButton botonAñadir;
    private javax.swing.JButton botonCliente;
    private javax.swing.JButton botonCrear;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonVer;
    private javax.swing.JButton botonVer1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblTotal;
    public static javax.swing.JLabel lbldireccion;
    public static javax.swing.JLabel lblidproveedor;
    public static javax.swing.JLabel lblproveedornombre;
    public static javax.swing.JLabel lbltelefono;
    private javax.swing.JPanel panelCompra;
    private javax.swing.JPanel panelCompraCrear;
    private javax.swing.JPanel panelCompraMenu;
    private javax.swing.JPanel panelCompraTabla;
    private rojerusan.RSTableMetro tablaArticulos;
    private rojerusan.RSTableMetro tablaCompras;
    private rojerusan.RSTableMetro tablaLinea;
    private javax.swing.JTextField txtFactura;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}