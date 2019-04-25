/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.ControlCliente;
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
import javax.swing.JButton;

/**
 *
 * @author Daniel Luna
 */
public class vistaCliente extends javax.swing.JFrame {
    
    
    private Conexion con;
    private ControlCliente controlC;
    //Estos son los botones que van en la tabla
    private JButton botonVerTabla;
    private JButton botonModificarTabla;
    private JButton botonEliminarTabla;
    
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;
    
     
     
     
    //Metodo para pasar la conexion
    public void setConexionVistaCliente(Conexion con1){
       con=con1;
    }
    
    public vistaCliente(Conexion con1) {
        
        this.setVisible(true);
        initComponents();
        this.setLocationRelativeTo(null);
        con=con1;
        //Se instancia un controlador donde se le pasa la conexion en el constructor, este cambio se dio por la idea
        //de mandar un ejecutable.
        
        controlC= new ControlCliente(con);
        //Cuando la vista cliente se crea, lo primero que se hara visible es el panel de crearCliente lo demas esta no visible
        
        panelCrearCliente.setVisible(true);
        panelTablaCliente.setVisible(false);
        panelModificarCliente.setVisible(false);
        
        //Esta parte es importante, porque establezco que la tabla va a poder contener botones
        tablaClientes.setDefaultRenderer(Object.class, new Render());
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
        tablaClientes.getColumnModel().getColumn(id);
        
    }
     
    void listar(){    
        modelo=(DefaultTableModel)tablaClientes.getModel();
        /*Se almacena la consulta sql en un string*/
        String sql="SELECT * "+"FROM Cliente";
        try{
            /*se establece coneccion con la base de datos y se le introduce la consulta*/
            cn=con.getConnection();
            st=cn.createStatement();
            rs=st.executeQuery(sql);   
            Object[] Datos= new Object[7]; /*Un array donde se almacenan las filas de la tabla. el tamaño del
            array debe ser el numero de columnas que tenga nuestra consulta*/
            while(rs.next()){
            Datos[0]=rs.getInt("idcliente");/*deben llamarse exactamente igual a como esta en la tabla*/
            Datos[1]=rs.getString("nombrecliente");/*deben llamarse exactamente igual a como esta en la tabla*/
            Datos[2]=rs.getString("direccioncliente");
            Datos[3]=rs.getString("telefonocliente");/*/*deben llamarse exactamente igual a como esta en la tabla*/
            Datos[4]=botonVerTabla;//En esta parte estoy añadiendo por cada fila los tres botones(ver,modificar,eliminar)
            Datos[5]=botonModificarTabla;
            Datos[6]=botonEliminarTabla;
            modelo.addRow(Datos);
            }    
        }catch(SQLException e){}
    }
        
    void limpiarTabla(){
        while(modelo.getRowCount()>0)modelo.removeRow(0);
    }
        
    public void limpiarCajasTexto(){
        cajaTextoNit.setText("");
        cajaTextoNombre.setText("");
        cajaTextoDireccion.setText("");
        cajaTextoTelefono.setText("");  
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCliente = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelTablaCliente = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaClientes = new rojerusan.RSTableMetro();
        panelCrearCliente = new javax.swing.JPanel();
        labelId = new javax.swing.JLabel();
        labelNombre1 = new javax.swing.JLabel();
        cajaTextoNit = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        labelNombre = new javax.swing.JLabel();
        cajaTextoNombre = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        labelTelefono = new javax.swing.JLabel();
        cajaTextoDireccion = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        cajaTextoTelefono = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        botonAñadir = new javax.swing.JButton();
        panelModificarCliente = new javax.swing.JPanel();
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
        panelMenuCliente = new javax.swing.JPanel();
        botonVer = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        botonCrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCliente.setBackground(new java.awt.Color(255, 255, 255));
        panelCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Decker", 0, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(102, 102, 102));
        labelTitulo.setText("Clientes");
        panelCliente.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, 40));

        panelTablaCliente.setBackground(new java.awt.Color(255, 255, 255));
        panelTablaCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Dirección", "Teléfono", "Ver", "Modificar", "Eliminar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClientes.setColorBackgoundHead(new java.awt.Color(51, 172, 234));
        tablaClientes.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        tablaClientes.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        tablaClientes.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        tablaClientes.setFuenteFilas(new java.awt.Font("Decker", 0, 18)); // NOI18N
        tablaClientes.setFuenteFilasSelect(new java.awt.Font("Decker", 1, 18)); // NOI18N
        tablaClientes.setFuenteHead(new java.awt.Font("Decker", 1, 18)); // NOI18N
        tablaClientes.setGridColor(new java.awt.Color(255, 255, 255));
        tablaClientes.setGrosorBordeFilas(0);
        tablaClientes.setGrosorBordeHead(0);
        tablaClientes.setRowHeight(25);
        tablaClientes.setRowMargin(0);
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaClientes);
        if (tablaClientes.getColumnModel().getColumnCount() > 0) {
            tablaClientes.getColumnModel().getColumn(0).setResizable(false);
            tablaClientes.getColumnModel().getColumn(1).setResizable(false);
            tablaClientes.getColumnModel().getColumn(2).setResizable(false);
            tablaClientes.getColumnModel().getColumn(3).setResizable(false);
            tablaClientes.getColumnModel().getColumn(4).setResizable(false);
            tablaClientes.getColumnModel().getColumn(5).setResizable(false);
            tablaClientes.getColumnModel().getColumn(6).setResizable(false);
        }

        panelTablaCliente.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 740, 390));

        panelCliente.add(panelTablaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 740, 470));

        panelCrearCliente.setBackground(new java.awt.Color(255, 255, 255));
        panelCrearCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelId.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelId.setText("NIT");
        panelCrearCliente.add(labelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, 20));

        labelNombre1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelNombre1.setText("Dirección");
        panelCrearCliente.add(labelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, 20));

        cajaTextoNit.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoNit.setBorder(null);
        panelCrearCliente.add(cajaTextoNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 230, 20));
        panelCrearCliente.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 230, 10));

        labelNombre.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelNombre.setText("Nombre");
        panelCrearCliente.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, 20));

        cajaTextoNombre.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoNombre.setBorder(null);
        panelCrearCliente.add(cajaTextoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 230, 20));
        panelCrearCliente.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 230, 10));

        labelTelefono.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelTelefono.setText("Telefono");
        panelCrearCliente.add(labelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, 20));

        cajaTextoDireccion.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoDireccion.setBorder(null);
        panelCrearCliente.add(cajaTextoDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 230, 20));
        panelCrearCliente.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 230, 10));

        cajaTextoTelefono.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoTelefono.setBorder(null);
        panelCrearCliente.add(cajaTextoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 230, 20));
        panelCrearCliente.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 230, 10));

        botonAñadir.setBackground(new java.awt.Color(64, 132, 253));
        botonAñadir.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        botonAñadir.setForeground(new java.awt.Color(255, 255, 255));
        botonAñadir.setText("Añadir Cliente");
        botonAñadir.setBorder(null);
        botonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirActionPerformed(evt);
            }
        });
        panelCrearCliente.add(botonAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 180, 40));

        panelCliente.add(panelCrearCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 740, 470));

        panelModificarCliente.setBackground(new java.awt.Color(255, 255, 255));
        panelModificarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajaTextoNitM.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoNitM.setBorder(null);
        cajaTextoNitM.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        panelModificarCliente.add(cajaTextoNitM, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 230, 20));

        labelId1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelId1.setText("NIT");
        panelModificarCliente.add(labelId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, 20));

        labelNombre2.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelNombre2.setText("Nombre");
        panelModificarCliente.add(labelNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, 20));
        panelModificarCliente.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 230, 10));

        cajaTextoNombreM.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoNombreM.setBorder(null);
        cajaTextoNombreM.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        panelModificarCliente.add(cajaTextoNombreM, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 230, 20));
        panelModificarCliente.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 230, 10));

        labelTelefono1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelTelefono1.setText("Telefono");
        panelModificarCliente.add(labelTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, 20));

        cajaTextoTelefonoM.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoTelefonoM.setBorder(null);
        cajaTextoTelefonoM.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        panelModificarCliente.add(cajaTextoTelefonoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 230, 20));
        panelModificarCliente.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 230, 10));

        labelNombre3.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelNombre3.setText("Dirección");
        panelModificarCliente.add(labelNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, 20));

        cajaTextoDireccionM.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoDireccionM.setBorder(null);
        cajaTextoDireccionM.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        panelModificarCliente.add(cajaTextoDireccionM, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 230, 20));
        panelModificarCliente.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 230, 10));

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
        panelModificarCliente.add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 180, 40));

        panelCliente.add(panelModificarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 740, 470));

        panelMenuCliente.setBackground(new java.awt.Color(0, 0, 0));
        panelMenuCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        panelMenuCliente.add(botonVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 130, 70));

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
        panelMenuCliente.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 150, 70));

        botonCrear.setBackground(new java.awt.Color(0, 0, 0));
        botonCrear.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        botonCrear.setForeground(new java.awt.Color(255, 255, 255));
        botonCrear.setText("Crear Cliente");
        botonCrear.setBorder(null);
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });
        panelMenuCliente.add(botonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 70));

        panelCliente.add(panelMenuCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 70));

        getContentPane().add(panelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirActionPerformed
        try{
            /*se le asignan los atribujos que se ingreso en las cajas de texto a un objeto usuario*/
            controlC.getCliente().setIdCliente(Integer.valueOf(cajaTextoNit.getText()));
            controlC.getCliente().setNombre(cajaTextoNombre.getText());
            controlC.getCliente().setTelefono(cajaTextoTelefono.getText());
            controlC.getCliente().setDireccion(cajaTextoDireccion.getText());
            controlC.agregar();/*se ejecuta el metodo que agrega un cliente a la base de datos*/
        }catch(Exception e){}
        JOptionPane.showMessageDialog(null,"Cliente registrado con exito");
        limpiarCajasTexto();
    }//GEN-LAST:event_botonAñadirActionPerformed
    
    private void botonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerActionPerformed
       //Para poder ver los clientes es necesario poner visible el panel tablaCliente, y el resto invisible
        panelCrearCliente.setVisible(false);
        panelModificarCliente.setVisible(false);
        panelTablaCliente.setVisible(true);
        limpiarTabla();
        listar();    
       
        
    }//GEN-LAST:event_botonVerActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        panelCrearCliente.setVisible(true);
        panelTablaCliente.setVisible(false);
        panelModificarCliente.setVisible(false);    
    }//GEN-LAST:event_botonCrearActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        //En esta parte creo dos variables las cualves van almacenar la posicion en X y Y donde he dado click
        int column = tablaClientes.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/tablaClientes.getRowHeight();
        
        //En esta parte me aseguro de que la posicion este dentro de los limites de la tabla
        if(row<tablaClientes.getRowCount() && row>=0 && column<tablaClientes.getColumnCount() && column >=0){
            //En esta parte se crea un objeto que toma el valor del componente que se clickio
            Object value = tablaClientes.getValueAt(row, column);
            //En esta parte me aseguro que ese objeto sea un boton.
            if(value instanceof JButton){
                ((JButton)value).doClick();
                //En esta parte creo un boton el cual va tomar los valores del objeto value.
                JButton boton= (JButton) value;
                //En esta parte diferencio cual boton fue presionado para que se ejecute los respectivos eventos.
                if(boton.getName().equals("v")){
                    panelCrearCliente.setVisible(false);
                    panelTablaCliente.setVisible(false);
                    panelModificarCliente.setVisible(true);
                    botonModificar.setVisible(false);
                    cajaTextoNitM.setEnabled(false);
                    cajaTextoNombreM.setEnabled(false);
                    cajaTextoDireccionM.setEnabled(false);
                    cajaTextoTelefonoM.setEnabled(false);
                    
                    cajaTextoNitM.setText(String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0))); 
                    cajaTextoNombreM.setText(String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 1))); 
                    cajaTextoDireccionM.setText(String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 2))); 
                    cajaTextoTelefonoM.setText(String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 3))); 
                }
                if(boton.getName().equals("m")){
                    panelCrearCliente.setVisible(false);
                    panelTablaCliente.setVisible(false);
                    panelModificarCliente.setVisible(true);
                    botonModificar.setVisible(true);
                    cajaTextoNitM.setEnabled(true);
                    cajaTextoNombreM.setEnabled(true);
                    cajaTextoDireccionM.setEnabled(true);
                    cajaTextoTelefonoM.setEnabled(true);
                    cajaTextoNitM.setText(String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0))); 
                    cajaTextoNombreM.setText(String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 1))); 
                    cajaTextoDireccionM.setText(String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 2))); 
                    cajaTextoTelefonoM.setText(String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 3)));                    
                }
                if(boton.getName().equals("e")){
                    //En esta parte la idea es que no se elimine sino que se cambie un atributo estado.
                   try{
                        //se le asignan los atribujos que se ingreso en las cajas de texto a un objeto usuario
                        controlC.getCliente().setIdCliente(Integer.valueOf(String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0))));
                        controlC.eliminar();//se ejecuta el metodo que agrega una cuenta a la base de datos
                        
                    }catch(Exception e){}
                    JOptionPane.showMessageDialog(null,"Cliente eliminado con exito");
                    limpiarTabla();
                    listar(); // TODO add your handling code here:
                }
            }      
        }  
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
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
    }//GEN-LAST:event_botonModificarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAñadir;
    private javax.swing.JButton botonCrear;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonVer;
    private javax.swing.JTextField cajaTextoDireccion;
    private javax.swing.JTextField cajaTextoDireccionM;
    private javax.swing.JTextField cajaTextoNit;
    private javax.swing.JTextField cajaTextoNitM;
    private javax.swing.JTextField cajaTextoNombre;
    private javax.swing.JTextField cajaTextoNombreM;
    private javax.swing.JTextField cajaTextoTelefono;
    private javax.swing.JTextField cajaTextoTelefonoM;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelId1;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombre1;
    private javax.swing.JLabel labelNombre2;
    private javax.swing.JLabel labelNombre3;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTelefono1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JPanel panelCrearCliente;
    private javax.swing.JPanel panelMenuCliente;
    private javax.swing.JPanel panelModificarCliente;
    private javax.swing.JPanel panelTablaCliente;
    private rojerusan.RSTableMetro tablaClientes;
    // End of variables declaration//GEN-END:variables
}
