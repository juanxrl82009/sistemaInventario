/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.ControlArticulo;
import Modelo.Conexion;
import Modelo.Render;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Braian Morales
 */
public class VistaArticulo extends javax.swing.JFrame {
    
    
    private Conexion con;
    private ControlArticulo controlA;
    //Estos son los botones que van en la tabla
    private JButton botonVerTabla;
    private JButton botonModificarTabla;
    private JButton botonEliminarTabla;
    private boolean bandera = true;
    
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;

     
     
     
    //Metodo para pasar la conexion
    public void setConexionVistaArticulo(Conexion con1){
       con=con1;
    }
    
    public VistaArticulo(Conexion con1) {
        
        this.setVisible(true);
        initComponents();
        this.setLocationRelativeTo(null);
        con=con1;
        //Se instancia un controlador donde se le pasa la conexion en el constructor, este cambio se dio por la idea
        //de mandar un ejecutable.
        
        controlA= new ControlArticulo(con);
        //Cuando la vista cliente se crea, lo primero que se hara visible es el panel de crearCliente lo demas esta no visible
        
        panelCrearArticulo.setVisible(true);
        panelTablaArticulo.setVisible(false);
        panelModificarArticulo.setVisible(false);
        
        //Esta parte es importante, porque establezco que la tabla va a poder contener botones
        tablaArticulos.setDefaultRenderer(Object.class, new Render());
        //Es para cambiarle el fondo de la parte inferior de la tabla
        jScrollPane2.getViewport().setBackground(Color.WHITE);
        
        
        //En esta parte instancio los botones de la tabla con sus respectivos valores.
        botonVerTabla = new JButton("Ver");
        botonVerTabla.setName("v");
        botonVerTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/busqueda.png")));
        botonVerTabla.setBackground(new java.awt.Color(255, 255, 255));
        botonVerTabla.setForeground(new java.awt.Color(255, 255, 255));  
        botonVerTabla.setBorder(null);
        botonVerTabla.setBorderPainted(false);
        
        botonModificarTabla = new JButton("Modificar");
        botonModificarTabla.setName("m");
        botonModificarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/girar.png")));
        botonModificarTabla.setBackground(new java.awt.Color(255, 255, 255));
        botonModificarTabla.setForeground(new java.awt.Color(255, 255, 255));
        botonModificarTabla.setBorder(null);
        botonModificarTabla.setBorderPainted(false);
        
        botonEliminarTabla = new JButton("Eliminar");
        botonEliminarTabla.setName("e"); 
        botonEliminarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/eliminar.png")));
        botonEliminarTabla.setBackground(new java.awt.Color(255, 255, 255));
        botonEliminarTabla.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarTabla.setBorder(null);
        botonEliminarTabla.setBorderPainted(false);
        listar();     
        //Nada importante modificaciones por hacer en la tabla.
        tablaArticulos.getColumnModel().getColumn(id);
        
    }
     
    void listar(){    
        modelo=(DefaultTableModel)tablaArticulos.getModel();
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
            Datos[2]=rs.getString("idcategoriaarticulo");
            Datos[3]=rs.getString("nitproveedor");/*deben llamarse exactamente igual a como esta en la tabla*/
            Datos[4]=rs.getString("codbarraarticulo");
            Datos[5]=rs.getString("precioarticulo");
            Datos[6]=botonVerTabla;//En esta parte estoy añadiendo por cada fila los tres botones(ver,modificar,eliminar)
            Datos[7]=botonModificarTabla;
            Datos[8]=botonEliminarTabla;
            modelo.addRow(Datos);
            }    
        }catch(SQLException e){}
    }
    
    void listarCategorias(){
        String sql = "SELECT * FROM CategoriaArticulo";
     
        try {
            st=cn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                CBOcategoria.addItem(rs.getString(2));
                CBOcategoria1.addItem(rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(VistaArticulo.class.getName()).log(Level.SEVERE, null, ex);
        }
             
    }
    
    
        
    void limpiarTabla(){
        while(modelo.getRowCount()>0)modelo.removeRow(0);
    }
        
    public void limpiarCajasTexto(){
        cajaTextoid.setText("");
        cajaTextoNombre.setText("");
        cajaTextoProveedor.setText("");
        cajaTextoCodigo.setText("");
        cajaTextoCosto.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelArticulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelTablaArticulo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaArticulos = new rojerusan.RSTableMetro();
        panelModificarArticulo = new javax.swing.JPanel();
        cajaTextoCostoM = new javax.swing.JTextField();
        labelId1 = new javax.swing.JLabel();
        labelNombre2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        cajaTextoNombreM = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        labelNombre3 = new javax.swing.JLabel();
        cajaTextoCodigoM = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        botonModificar = new javax.swing.JButton();
        labelNombre4 = new javax.swing.JLabel();
        cajaTextoProveedorM = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        labelId2 = new javax.swing.JLabel();
        cajaTextoIDm = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        CBOcategoria1 = new javax.swing.JComboBox<>();
        labelTelefono3 = new javax.swing.JLabel();
        panelCrearArticulo = new javax.swing.JPanel();
        labelNombre1 = new javax.swing.JLabel();
        cajaTextoid = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        labelNombre = new javax.swing.JLabel();
        cajaTextoNombre = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        labelTelefono = new javax.swing.JLabel();
        cajaTextoCodigo = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        botonAñadir = new javax.swing.JButton();
        labelId3 = new javax.swing.JLabel();
        labelId4 = new javax.swing.JLabel();
        labelId5 = new javax.swing.JLabel();
        cajaTextoCosto = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        cajaTextoProveedor = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        CBOcategoria = new javax.swing.JComboBox<>();
        panelMenuArticulo = new javax.swing.JPanel();
        botonVer = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        botonCrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelArticulo.setBackground(new java.awt.Color(255, 255, 255));
        panelArticulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Decker", 0, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(102, 102, 102));
        labelTitulo.setText("Articulos");
        panelArticulo.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, 40));

        panelTablaArticulo.setBackground(new java.awt.Color(255, 255, 255));
        panelTablaArticulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Categoria", "Proveedor", "Codigo Barras", "costo", "Ver", "Modificar", "Eliminar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaArticulos.setColorBackgoundHead(new java.awt.Color(51, 172, 234));
        tablaArticulos.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        tablaArticulos.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        tablaArticulos.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        tablaArticulos.setFuenteFilas(new java.awt.Font("Decker", 0, 18)); // NOI18N
        tablaArticulos.setFuenteFilasSelect(new java.awt.Font("Decker", 1, 18)); // NOI18N
        tablaArticulos.setFuenteHead(new java.awt.Font("Decker", 1, 18)); // NOI18N
        tablaArticulos.setGridColor(new java.awt.Color(255, 255, 255));
        tablaArticulos.setGrosorBordeFilas(0);
        tablaArticulos.setGrosorBordeHead(0);
        tablaArticulos.setRowHeight(25);
        tablaArticulos.setRowMargin(0);
        tablaArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaArticulosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaArticulos);
        if (tablaArticulos.getColumnModel().getColumnCount() > 0) {
            tablaArticulos.getColumnModel().getColumn(0).setResizable(false);
            tablaArticulos.getColumnModel().getColumn(1).setResizable(false);
            tablaArticulos.getColumnModel().getColumn(2).setResizable(false);
            tablaArticulos.getColumnModel().getColumn(3).setResizable(false);
            tablaArticulos.getColumnModel().getColumn(6).setResizable(false);
            tablaArticulos.getColumnModel().getColumn(7).setResizable(false);
            tablaArticulos.getColumnModel().getColumn(8).setResizable(false);
        }

        panelTablaArticulo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 740, 420));

        panelArticulo.add(panelTablaArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 740, 470));

        panelModificarArticulo.setBackground(new java.awt.Color(255, 255, 255));
        panelModificarArticulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajaTextoCostoM.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoCostoM.setBorder(null);
        cajaTextoCostoM.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        cajaTextoCostoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaTextoCostoMActionPerformed(evt);
            }
        });
        panelModificarArticulo.add(cajaTextoCostoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 230, 20));

        labelId1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelId1.setText("Costo");
        panelModificarArticulo.add(labelId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, 20));

        labelNombre2.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelNombre2.setText("Nombre");
        panelModificarArticulo.add(labelNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, 20));
        panelModificarArticulo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 230, 10));

        cajaTextoNombreM.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoNombreM.setBorder(null);
        cajaTextoNombreM.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        panelModificarArticulo.add(cajaTextoNombreM, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 230, 20));
        panelModificarArticulo.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 230, 10));

        labelNombre3.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelNombre3.setText("Codigo barra");
        panelModificarArticulo.add(labelNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, 20));

        cajaTextoCodigoM.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoCodigoM.setBorder(null);
        cajaTextoCodigoM.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        panelModificarArticulo.add(cajaTextoCodigoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 230, 20));
        panelModificarArticulo.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 230, 10));

        botonModificar.setBackground(new java.awt.Color(64, 132, 253));
        botonModificar.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        botonModificar.setForeground(new java.awt.Color(255, 255, 255));
        botonModificar.setText("Modificar Articulo");
        botonModificar.setBorder(null);
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        panelModificarArticulo.add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 180, 40));

        labelNombre4.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelNombre4.setText("Proveedor");
        panelModificarArticulo.add(labelNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, 20));

        cajaTextoProveedorM.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoProveedorM.setBorder(null);
        cajaTextoProveedorM.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        panelModificarArticulo.add(cajaTextoProveedorM, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 230, 20));
        panelModificarArticulo.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 230, 10));

        labelId2.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelId2.setText("ID");
        panelModificarArticulo.add(labelId2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, 20));

        cajaTextoIDm.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoIDm.setBorder(null);
        cajaTextoIDm.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        cajaTextoIDm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaTextoIDmActionPerformed(evt);
            }
        });
        panelModificarArticulo.add(cajaTextoIDm, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 230, 20));
        panelModificarArticulo.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 230, 10));

        CBOcategoria1.setBackground(new java.awt.Color(64, 132, 253));
        CBOcategoria1.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        CBOcategoria1.setForeground(new java.awt.Color(255, 255, 255));
        CBOcategoria1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        CBOcategoria1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBOcategoria1MouseClicked(evt);
            }
        });
        panelModificarArticulo.add(CBOcategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, -1, -1));

        labelTelefono3.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelTelefono3.setText("Categoria");
        panelModificarArticulo.add(labelTelefono3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, 20));

        panelArticulo.add(panelModificarArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 740, 470));

        panelCrearArticulo.setBackground(new java.awt.Color(255, 255, 255));
        panelCrearArticulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombre1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelNombre1.setText("Proveedor");
        panelCrearArticulo.add(labelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, 20));

        cajaTextoid.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoid.setBorder(null);
        panelCrearArticulo.add(cajaTextoid, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 230, 20));
        panelCrearArticulo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 230, 10));

        labelNombre.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelNombre.setText("Nombre");
        panelCrearArticulo.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, 20));

        cajaTextoNombre.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoNombre.setBorder(null);
        panelCrearArticulo.add(cajaTextoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 230, 20));
        panelCrearArticulo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 230, 10));

        labelTelefono.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelTelefono.setText("Categoria");
        panelCrearArticulo.add(labelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, 20));

        cajaTextoCodigo.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoCodigo.setBorder(null);
        panelCrearArticulo.add(cajaTextoCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 230, 20));
        panelCrearArticulo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 230, 10));

        botonAñadir.setBackground(new java.awt.Color(64, 132, 253));
        botonAñadir.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        botonAñadir.setForeground(new java.awt.Color(255, 255, 255));
        botonAñadir.setText("Añadir Articulo");
        botonAñadir.setBorder(null);
        botonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirActionPerformed(evt);
            }
        });
        panelCrearArticulo.add(botonAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 180, 40));

        labelId3.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelId3.setText("Costo");
        panelCrearArticulo.add(labelId3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, 20));

        labelId4.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelId4.setText("Codigo Barras");
        panelCrearArticulo.add(labelId4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, 20));

        labelId5.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelId5.setText("ID");
        panelCrearArticulo.add(labelId5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, 20));

        cajaTextoCosto.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoCosto.setBorder(null);
        panelCrearArticulo.add(cajaTextoCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 230, 20));
        panelCrearArticulo.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 230, 10));

        cajaTextoProveedor.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoProveedor.setBorder(null);
        panelCrearArticulo.add(cajaTextoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 230, 20));
        panelCrearArticulo.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 230, 10));

        CBOcategoria.setBackground(new java.awt.Color(64, 132, 253));
        CBOcategoria.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        CBOcategoria.setForeground(new java.awt.Color(255, 255, 255));
        CBOcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        CBOcategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBOcategoriaMouseClicked(evt);
            }
        });
        panelCrearArticulo.add(CBOcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        panelArticulo.add(panelCrearArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 740, 470));

        panelMenuArticulo.setBackground(new java.awt.Color(0, 0, 0));
        panelMenuArticulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonVer.setBackground(new java.awt.Color(0, 0, 0));
        botonVer.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        botonVer.setForeground(new java.awt.Color(255, 255, 255));
        botonVer.setText("Ver Articulo");
        botonVer.setBorder(null);
        botonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerActionPerformed(evt);
            }
        });
        panelMenuArticulo.add(botonVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 140, 70));

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
        panelMenuArticulo.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 150, 70));

        botonCrear.setBackground(new java.awt.Color(0, 0, 0));
        botonCrear.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        botonCrear.setForeground(new java.awt.Color(255, 255, 255));
        botonCrear.setText("Crear Articulo");
        botonCrear.setBorder(null);
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });
        panelMenuArticulo.add(botonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 70));

        panelArticulo.add(panelMenuArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 70));
        panelMenuArticulo.getAccessibleContext().setAccessibleParent(panelCrearArticulo);

        getContentPane().add(panelArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        panelCrearArticulo.setVisible(true);
        panelTablaArticulo.setVisible(false);
        panelModificarArticulo.setVisible(false);
    }//GEN-LAST:event_botonCrearActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerActionPerformed
        //Para poder ver los clientes es necesario poner visible el panel tablaCliente, y el resto invisible
        panelCrearArticulo.setVisible(false);
        panelModificarArticulo.setVisible(false);
        panelTablaArticulo.setVisible(true);
        limpiarTabla();
        listar();

    }//GEN-LAST:event_botonVerActionPerformed

    private void cajaTextoIDmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaTextoIDmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaTextoIDmActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        try{
            //Cuando se hagan las respectivas modificaciones en los Jtext, y se presione el boton modificar, se ejecuta el siguiente
            controlA.getArticulo().setIdArticulo(Integer.valueOf(cajaTextoIDm.getText()));
            controlA.getArticulo().setNombre(cajaTextoNombreM.getText());
            controlA.getArticulo().setCategoria(CBOcategoria1.getSelectedIndex());
            controlA.getArticulo().setNitProveedor(Integer.valueOf(cajaTextoProveedorM.getText()));
            controlA.getArticulo().setCodBarra(Integer.valueOf(cajaTextoCodigoM.getText()));
            controlA.getArticulo().setCosto(Integer.valueOf(cajaTextoCostoM.getText()));
            controlA.modificar();/*se ejecuta el metodo que agrega una cuenta a la base de datos*/
        }catch(Exception e){}
        JOptionPane.showMessageDialog(null,"Articulo modificado con exito");
        //Falta verificar que no se modifique a clientes con la misma identificacion;
    }//GEN-LAST:event_botonModificarActionPerformed

    private void cajaTextoCostoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaTextoCostoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaTextoCostoMActionPerformed

    private void tablaArticulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaArticulosMouseClicked
        //En esta parte creo dos variables las cualves van almacenar la posicion en X y Y donde he dado click
        int column = tablaArticulos.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/tablaArticulos.getRowHeight();

        //En esta parte me aseguro de que la posicion este dentro de los limites de la tabla
        if(row<tablaArticulos.getRowCount() && row>=0 && column<tablaArticulos.getColumnCount() && column >=0){
            //En esta parte se crea un objeto que toma el valor del componente que se clickio
            Object value = tablaArticulos.getValueAt(row, column);
            //En esta parte me aseguro que ese objeto sea un boton.
            if(value instanceof JButton){
                ((JButton)value).doClick();
                //En esta parte creo un boton el cual va tomar los valores del objeto value.
                JButton boton= (JButton) value;
                //En esta parte diferencio cual boton fue presionado para que se ejecute los respectivos eventos.
                if(boton.getName().equals("v")){
                
                  
                    
                    panelCrearArticulo.setVisible(false);
                    panelTablaArticulo.setVisible(false);
                    panelModificarArticulo.setVisible(true);
                    botonModificar.setVisible(false);
                    cajaTextoCostoM.setEnabled(false);
                    cajaTextoNombreM.setEnabled(false);
                    cajaTextoCodigoM.setEnabled(false);
                    

                    cajaTextoIDm.setText(String.valueOf(tablaArticulos.getValueAt(tablaArticulos.getSelectedRow(), 0)));
                    cajaTextoNombreM.setText(String.valueOf(tablaArticulos.getValueAt(tablaArticulos.getSelectedRow(), 1)));
                    cajaTextoProveedorM.setText(String.valueOf(tablaArticulos.getValueAt(tablaArticulos.getSelectedRow(), 3)));
                    cajaTextoCodigoM.setText(String.valueOf(tablaArticulos.getValueAt(tablaArticulos.getSelectedRow(), 4)));
                    cajaTextoCostoM.setText(String.valueOf(tablaArticulos.getValueAt(tablaArticulos.getSelectedRow(), 5)));
                    CBOcategoria1.setEnabled(false);
                    
                }
                if(boton.getName().equals("m")){
         
                    panelCrearArticulo.setVisible(false);
                    panelTablaArticulo.setVisible(false);
                    panelModificarArticulo.setVisible(true);
                    botonModificar.setVisible(true);
                    cajaTextoCostoM.setEnabled(true);
                    cajaTextoIDm.setEnabled(true);
                    cajaTextoNombreM.setEnabled(true);
                    cajaTextoCodigoM.setEnabled(true);
                    cajaTextoCodigoM.setEnabled(true);
     
                    cajaTextoIDm.setText(String.valueOf(tablaArticulos.getValueAt(tablaArticulos.getSelectedRow(), 0)));
                    cajaTextoNombreM.setText(String.valueOf(tablaArticulos.getValueAt(tablaArticulos.getSelectedRow(), 1)));
                    cajaTextoProveedorM.setText(String.valueOf(tablaArticulos.getValueAt(tablaArticulos.getSelectedRow(), 3)));
                    cajaTextoCodigoM.setText(String.valueOf(tablaArticulos.getValueAt(tablaArticulos.getSelectedRow(), 4)));
                    cajaTextoCostoM.setText(String.valueOf(tablaArticulos.getValueAt(tablaArticulos.getSelectedRow(), 5)));
                }
                if(boton.getName().equals("e")){
                    //En esta parte la idea es que no se elimine sino que se cambie un atributo estado.
                    try{
                        //se le asignan los atribujos que se ingreso en las cajas de texto a un objeto usuario
                        controlA.getArticulo().setIdArticulo(Integer.valueOf(String.valueOf(tablaArticulos.getValueAt(tablaArticulos.getSelectedRow(), 0))));
                        controlA.eliminar();//se ejecuta el metodo que agrega una cuenta a la base de datos

                    }catch(Exception e){}
                    JOptionPane.showMessageDialog(null,"Articulo eliminado con exito");
                    limpiarTabla();
                    listar(); // TODO add your handling code here:

                }
            }
        }
    }//GEN-LAST:event_tablaArticulosMouseClicked

    private void botonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirActionPerformed
        try{
            /*se le asignan los atribujos que se ingreso en las cajas de texto a un objeto usuario*/
            controlA.getArticulo().setIdArticulo(Integer.valueOf(cajaTextoid.getText()));
            controlA.getArticulo().setNombre(cajaTextoNombre.getText());
            controlA.getArticulo().setCategoria(CBOcategoria.getSelectedIndex());
            controlA.getArticulo().setNitProveedor(Integer.valueOf( cajaTextoProveedor.getText()));
            controlA.getArticulo().setCodBarra(Integer.valueOf(cajaTextoCodigo.getText()));
            controlA.getArticulo().setCosto(Integer.valueOf(cajaTextoCosto.getText()));
            controlA.agregar();/*se ejecuta el metodo que agrega una cuenta a la base de datos*/
        }catch(Exception e){}
        JOptionPane.showMessageDialog(null,"Articulo registrado con exito");
        limpiarCajasTexto();
    }//GEN-LAST:event_botonAñadirActionPerformed

    private void CBOcategoria1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBOcategoria1MouseClicked
        // TODO add your handling code here:
       if(bandera==true){
        listarCategorias();
       bandera=false;
       }
    }//GEN-LAST:event_CBOcategoria1MouseClicked

    private void CBOcategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBOcategoriaMouseClicked
        // TODO add your handling code here:
        if(bandera==true){
        listarCategorias();
       bandera=false;
       }
    }//GEN-LAST:event_CBOcategoriaMouseClicked
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBOcategoria;
    private javax.swing.JComboBox<String> CBOcategoria1;
    private javax.swing.JButton botonAñadir;
    private javax.swing.JButton botonCrear;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonVer;
    private javax.swing.JTextField cajaTextoCodigo;
    private javax.swing.JTextField cajaTextoCodigoM;
    private javax.swing.JTextField cajaTextoCosto;
    private javax.swing.JTextField cajaTextoCostoM;
    private javax.swing.JTextField cajaTextoIDm;
    private javax.swing.JTextField cajaTextoNombre;
    private javax.swing.JTextField cajaTextoNombreM;
    private javax.swing.JTextField cajaTextoProveedor;
    private javax.swing.JTextField cajaTextoProveedorM;
    private javax.swing.JTextField cajaTextoid;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel labelId1;
    private javax.swing.JLabel labelId2;
    private javax.swing.JLabel labelId3;
    private javax.swing.JLabel labelId4;
    private javax.swing.JLabel labelId5;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombre1;
    private javax.swing.JLabel labelNombre2;
    private javax.swing.JLabel labelNombre3;
    private javax.swing.JLabel labelNombre4;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTelefono3;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelArticulo;
    private javax.swing.JPanel panelCrearArticulo;
    private javax.swing.JPanel panelMenuArticulo;
    private javax.swing.JPanel panelModificarArticulo;
    private javax.swing.JPanel panelTablaArticulo;
    private rojerusan.RSTableMetro tablaArticulos;
    // End of variables declaration//GEN-END:variables
}
