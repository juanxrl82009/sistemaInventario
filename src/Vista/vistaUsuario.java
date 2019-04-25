/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.ControlUsuario;
import Modelo.Conexion;
import Modelo.Render;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author daniel
 */
public class vistaUsuario extends javax.swing.JFrame {
   
    
    private Conexion con;
    private ControlUsuario controlU;
    
    private JButton botonVerTabla;
    private JButton botonModificarTabla;
    private JButton botonEliminarTabla;
    
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;
    
     public void setConexionUsuario(Conexion con1){
       con=con1;
    }
    
    public vistaUsuario(Conexion con1) {
        
        
        this.setVisible(true);
        initComponents();
        this.setLocationRelativeTo(null);
          
        con=con1;
          
        controlU=new ControlUsuario(con);
          
        panelCrearUsuario.setVisible(true);
        panelTablaUsuario.setVisible(false);
        panelModificarUsuario.setVisible(false);
        
        //Esta parte es importante, porque establezco que la tabla va a poder contener botones
        tablaUsuarios.setDefaultRenderer(Object.class, new Render());
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
        tablaUsuarios.getColumnModel().getColumn(id);
          
         
    }
    
    
    /*Este metodo lo que hace es mostrar en una tabla el id de la cuenta, el nombre y la categoria de la cuenta*/
    void listar(){
        modelo=(DefaultTableModel)tablaUsuarios.getModel();
        /*Se almacena la consulta sql en un string*/
        String sql="SELECT * FROM Usuario;";
        try{
        /*se establece coneccion con la base de datos y se le introduce la consulta*/
         cn=con.getConnection();
         st=cn.createStatement();
         rs=st.executeQuery(sql);   
         Object[] Datos= new Object[7]; /*Un array donde se almacenan las filas de la tabla. el tamaño del
         array debe ser el numero de columnas que tenga nuestra consulta*/
         /*modelo=(DefaultTableModel)tablaUsuarios.getModel();*/
         while(rs.next()){
         Datos[0]=rs.getInt("idUsuario");/*deben llamarse exactamente igual a como esta en la tabla*/
         Datos[1]=rs.getString("nombreUsuario");/*deben llamarse exactamente igual a como esta en la tabla*/
         Datos[2]=rs.getString("passwordUsuario");
         Datos[3]=rs.getString("idCategoCuenta");
         
         if("1".equals(rs.getString("idCategoCuenta"))){
             Datos[3]="Administrador";
         }else{
             Datos[3]="Cajero";
         }
         
         Datos[4]=botonVerTabla;
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
        cajaTextoId.setText("");
        cajaTextoNombre.setText("");
        cajaTextoPassword.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUsuarios = new javax.swing.JPanel();
        panelTablaUsuario = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaUsuarios = new rojerusan.RSTableMetro();
        panelModificarUsuario = new javax.swing.JPanel();
        labelId1 = new javax.swing.JLabel();
        labelNombre1 = new javax.swing.JLabel();
        cajaTextoIdM = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        labelPassword1 = new javax.swing.JLabel();
        cajaTextoNombreM = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        labelCategoria1 = new javax.swing.JLabel();
        cajaTextoPasswordM = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        cajaComboCategoriaM = new javax.swing.JComboBox<>();
        botonModificar = new javax.swing.JButton();
        panelCrearUsuario = new javax.swing.JPanel();
        labelId = new javax.swing.JLabel();
        cajaTextoId = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        labelNombre = new javax.swing.JLabel();
        cajaTextoNombre = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        labelPassword = new javax.swing.JLabel();
        cajaTextoPassword = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        cajaComboCategoria = new javax.swing.JComboBox<>();
        labelCategoria = new javax.swing.JLabel();
        botonAñadir = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        panelMenuUsuario = new javax.swing.JPanel();
        botonVer = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        botonCrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panelUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        panelUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTablaUsuario.setBackground(new java.awt.Color(255, 255, 255));
        panelTablaUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Contraseña", "Categoria", "Ver", "Modificar", "Eliminar"
            }
        ));
        tablaUsuarios.setColorBackgoundHead(new java.awt.Color(51, 153, 255));
        tablaUsuarios.setFuenteFilas(new java.awt.Font("Decker", 0, 18)); // NOI18N
        tablaUsuarios.setFuenteFilasSelect(new java.awt.Font("Decker", 0, 18)); // NOI18N
        tablaUsuarios.setFuenteHead(new java.awt.Font("Decker", 0, 18)); // NOI18N
        tablaUsuarios.setRowHeight(25);
        tablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaUsuarios);

        panelTablaUsuario.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 350));

        panelUsuarios.add(panelTablaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 740, 350));

        panelModificarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        panelModificarUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelId1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelId1.setText("ID");
        panelModificarUsuario.add(labelId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        labelNombre1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelNombre1.setText("Nombre");
        panelModificarUsuario.add(labelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        cajaTextoIdM.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoIdM.setBorder(null);
        panelModificarUsuario.add(cajaTextoIdM, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 230, 20));
        panelModificarUsuario.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 230, 10));

        labelPassword1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelPassword1.setText("Password");
        panelModificarUsuario.add(labelPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        cajaTextoNombreM.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoNombreM.setBorder(null);
        panelModificarUsuario.add(cajaTextoNombreM, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 230, 20));
        panelModificarUsuario.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 230, 10));

        labelCategoria1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelCategoria1.setText("Categoria");
        panelModificarUsuario.add(labelCategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        cajaTextoPasswordM.setFont(new java.awt.Font("Quicksand", 0, 18)); // NOI18N
        cajaTextoPasswordM.setBorder(null);
        cajaTextoPasswordM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaTextoPasswordMActionPerformed(evt);
            }
        });
        panelModificarUsuario.add(cajaTextoPasswordM, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 230, 20));
        panelModificarUsuario.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 230, 10));

        cajaComboCategoriaM.setBackground(new java.awt.Color(64, 132, 253));
        cajaComboCategoriaM.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        cajaComboCategoriaM.setForeground(new java.awt.Color(255, 255, 255));
        cajaComboCategoriaM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cajero" }));
        panelModificarUsuario.add(cajaComboCategoriaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        botonModificar.setBackground(new java.awt.Color(51, 172, 234));
        botonModificar.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        botonModificar.setForeground(new java.awt.Color(255, 255, 255));
        botonModificar.setText("Modificar");
        botonModificar.setBorder(null);
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        panelModificarUsuario.add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 180, 40));

        panelUsuarios.add(panelModificarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 740, 520));

        panelCrearUsuario.setBackground(new java.awt.Color(255, 255, 255));
        panelCrearUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelId.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelId.setText("ID");
        panelCrearUsuario.add(labelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        cajaTextoId.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoId.setBorder(null);
        panelCrearUsuario.add(cajaTextoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 230, 20));
        panelCrearUsuario.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 230, 10));

        labelNombre.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelNombre.setText("Nombre");
        panelCrearUsuario.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        cajaTextoNombre.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoNombre.setBorder(null);
        panelCrearUsuario.add(cajaTextoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 230, 20));
        panelCrearUsuario.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 230, 10));

        labelPassword.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelPassword.setText("Password");
        panelCrearUsuario.add(labelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        cajaTextoPassword.setFont(new java.awt.Font("Quicksand", 0, 18)); // NOI18N
        cajaTextoPassword.setBorder(null);
        cajaTextoPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaTextoPasswordActionPerformed(evt);
            }
        });
        panelCrearUsuario.add(cajaTextoPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 230, 20));
        panelCrearUsuario.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 230, 10));

        cajaComboCategoria.setBackground(new java.awt.Color(64, 132, 253));
        cajaComboCategoria.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        cajaComboCategoria.setForeground(new java.awt.Color(255, 255, 255));
        cajaComboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cajero" }));
        panelCrearUsuario.add(cajaComboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));
        cajaComboCategoria.getAccessibleContext().setAccessibleName("cajaComboCategoria");
        cajaComboCategoria.getAccessibleContext().setAccessibleDescription("");

        labelCategoria.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelCategoria.setText("Categoria");
        panelCrearUsuario.add(labelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        botonAñadir.setBackground(new java.awt.Color(51, 172, 234));
        botonAñadir.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        botonAñadir.setForeground(new java.awt.Color(255, 255, 255));
        botonAñadir.setText("Añadir Usuario");
        botonAñadir.setBorder(null);
        botonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirActionPerformed(evt);
            }
        });
        panelCrearUsuario.add(botonAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 180, 40));

        panelUsuarios.add(panelCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 740, 520));

        labelTitulo.setFont(new java.awt.Font("Decker", 0, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(102, 102, 102));
        labelTitulo.setText("usuarios");
        panelUsuarios.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, 40));

        panelMenuUsuario.setBackground(new java.awt.Color(0, 0, 0));
        panelMenuUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonVer.setBackground(new java.awt.Color(0, 0, 0));
        botonVer.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        botonVer.setForeground(new java.awt.Color(255, 255, 255));
        botonVer.setText("Ver Usuario");
        botonVer.setBorder(null);
        botonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerActionPerformed(evt);
            }
        });
        panelMenuUsuario.add(botonVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 130, 70));

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
        panelMenuUsuario.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 150, 70));

        botonCrear.setBackground(new java.awt.Color(0, 0, 0));
        botonCrear.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        botonCrear.setForeground(new java.awt.Color(255, 255, 255));
        botonCrear.setText("Crear Usuario");
        botonCrear.setBorder(null);
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });
        panelMenuUsuario.add(botonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 70));

        panelUsuarios.add(panelMenuUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        try{
            /*se le asignan los atribujos que se ingreso en las cajas de texto a un objeto usuario*/
            controlU.getUsuario().setIdUsuario(Integer.valueOf(cajaTextoId.getText()));
            controlU.getUsuario().setNombreUsuario(cajaTextoNombre.getText());
            controlU.getUsuario().setPassword(cajaTextoPassword.getText());
            if ("Administrador".equals(String.valueOf(cajaComboCategoria.getSelectedItem()))){
                controlU.getUsuario().setIdCategoCuenta(1);
            }else{
                controlU.getUsuario().setIdCategoCuenta(2);
            }
            controlU.modificar();/*se ejecuta el metodo que agrega una cuenta a la base de datos*/
            limpiarTabla();

        }catch(Exception e){}
        JOptionPane.showMessageDialog(null,"Usuario modificado con exito");
        listar();
        // TODO add your handling code here:
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirActionPerformed
        try{
            /*se le asignan los atribujos que se ingreso en las cajas de texto a un objeto usuario*/
            controlU.getUsuario().setIdUsuario(Integer.valueOf(cajaTextoId.getText()));
            controlU.getUsuario().setNombreUsuario(cajaTextoNombre.getText());
            controlU.getUsuario().setPassword(cajaTextoPassword.getText());
            if ("Administrador".equals(String.valueOf(cajaComboCategoria.getSelectedItem()))){
                controlU.getUsuario().setIdCategoCuenta(1);
            }else{
                controlU.getUsuario().setIdCategoCuenta(2);
            }
            controlU.agregar();/*se ejecuta el metodo que agrega un usuario a la base de datos*/

        }catch(Exception e){}
        JOptionPane.showMessageDialog(null,"Usuario registrado con exito");
        limpiarCajasTexto();
    }//GEN-LAST:event_botonAñadirActionPerformed

    private void cajaTextoPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaTextoPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaTextoPasswordActionPerformed

    private void botonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerActionPerformed
        //Para poder ver los clientes es necesario poner visible el panel tablaCliente, y el resto invisible
        panelCrearUsuario.setVisible(false);
        panelModificarUsuario.setVisible(false);
        panelTablaUsuario.setVisible(true);
        limpiarTabla();
        listar();

    }//GEN-LAST:event_botonVerActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        panelCrearUsuario.setVisible(true);
        panelTablaUsuario.setVisible(false);
        panelModificarUsuario.setVisible(false);
    }//GEN-LAST:event_botonCrearActionPerformed

    private void cajaTextoPasswordMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaTextoPasswordMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaTextoPasswordMActionPerformed

    private void tablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuariosMouseClicked
        //En esta parte creo dos variables las cualves van almacenar la posicion en X y Y donde he dado click
        int column = tablaUsuarios.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/tablaUsuarios.getRowHeight();
        
        //En esta parte me aseguro de que la posicion este dentro de los limites de la tabla
        if(row<tablaUsuarios.getRowCount() && row>=0 && column<tablaUsuarios.getColumnCount() && column >=0){
            //En esta parte se crea un objeto que toma el valor del componente que se clickio
            Object value = tablaUsuarios.getValueAt(row, column);
            //En esta parte me aseguro que ese objeto sea un boton.
            if(value instanceof JButton){
                ((JButton)value).doClick();
                //En esta parte creo un boton el cual va tomar los valores del objeto value.
                JButton boton= (JButton) value;
                //En esta parte diferencio cual boton fue presionado para que se ejecute los respectivos eventos.
                if(boton.getName().equals("v")){
                    panelCrearUsuario.setVisible(false);
                    panelTablaUsuario.setVisible(false);
                    panelModificarUsuario.setVisible(true);
                    botonModificar.setVisible(false);
                    cajaTextoIdM.setEnabled(false);
                    cajaTextoNombreM.setEnabled(false);
                    cajaTextoPasswordM.setEnabled(false);
                    cajaComboCategoriaM.setEnabled(false);
                    
                    cajaTextoIdM.setText(String.valueOf(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0))); 
                    cajaTextoNombreM.setText(String.valueOf(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 1))); 
                    cajaTextoPasswordM.setText(String.valueOf(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 2))); 
                    if(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(),3)=="Administrador"){
                        cajaComboCategoriaM.setSelectedIndex(0);
                    }
                    else{
                        cajaComboCategoriaM.setSelectedIndex(1);
                    }
                    //Para borrar sino funciona lo de arriba
                    //cajaComboCategoriaM.setText(String.valueOf(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 3))); 
                   // "Administrador".equals(String.valueOf(cajaComboCategoria.getSelectedItem()))
                            
                }
                
                if(boton.getName().equals("m")){
                    panelCrearUsuario.setVisible(false);
                    panelTablaUsuario.setVisible(false);
                    panelModificarUsuario.setVisible(true);
                    botonModificar.setVisible(true);
                    cajaTextoIdM.setEnabled(true);
                    cajaTextoNombreM.setEnabled(true);
                    cajaTextoPasswordM.setEnabled(true);
                    cajaComboCategoriaM.setEnabled(true);
         
                    
                    cajaTextoIdM.setText(String.valueOf(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0))); 
                    cajaTextoNombreM.setText(String.valueOf(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 1))); 
                    cajaTextoPasswordM.setText(String.valueOf(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 2))); 
                    if(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(),3)=="Administrador"){
                        cajaComboCategoriaM.setSelectedIndex(0);
                    }
                    else{
                        cajaComboCategoriaM.setSelectedIndex(1);
                    }                  
                }
                if(boton.getName().equals("e")){
                    
                      //En esta parte la idea es que no se elimine sino que se cambie un atributo estado.
                   try{
                        //se le asignan los atribujos que se ingreso en las cajas de texto a un objeto usuario
                        controlU.getUsuario().setIdUsuario(Integer.valueOf(String.valueOf(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0))));
                        controlU.eliminar();//se ejecuta el metodo que agrega una cuenta a la base de datos
                        
                    }catch(Exception e){}
                    JOptionPane.showMessageDialog(null,"Usuario eliminado con exito");
                    limpiarTabla();
                    listar(); 
                   
                }
            }      
        } 
    }//GEN-LAST:event_tablaUsuariosMouseClicked

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAñadir;
    private javax.swing.JButton botonCrear;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonVer;
    private javax.swing.JComboBox<String> cajaComboCategoria;
    private javax.swing.JComboBox<String> cajaComboCategoriaM;
    private javax.swing.JTextField cajaTextoId;
    private javax.swing.JTextField cajaTextoIdM;
    private javax.swing.JTextField cajaTextoNombre;
    private javax.swing.JTextField cajaTextoNombreM;
    private javax.swing.JTextField cajaTextoPassword;
    private javax.swing.JTextField cajaTextoPasswordM;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelCategoria1;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelId1;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombre1;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPassword1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelCrearUsuario;
    private javax.swing.JPanel panelMenuUsuario;
    private javax.swing.JPanel panelModificarUsuario;
    private javax.swing.JPanel panelTablaUsuario;
    private javax.swing.JPanel panelUsuarios;
    private rojerusan.RSTableMetro tablaUsuarios;
    // End of variables declaration//GEN-END:variables
}




