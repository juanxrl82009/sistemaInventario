/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.ControlCliente;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

/**
 *
 * @author Daniel Luna
 */
public class vistaCliente extends javax.swing.JFrame {
    Conexion con=new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;
    ControlCliente controlC=new ControlCliente();/*un objeto control para manejar los usuarios*/
    /**
     * Creates new form vistaProvedor
     */
    public vistaCliente() {
        this.setUndecorated(true);
        this.setVisible(true);
        initComponents();
        this.setLocationRelativeTo(null);
        listar();
    }

        void listar(){
        modelo=(DefaultTableModel)tablaClientes.getModel();
        /*Se almacena la consulta sql en un string*/
        String sql="SELECT * " +
               "FROM Cliente";
    try{
       /*se establece coneccion con la base de datos y se le introduce la consulta*/
        cn=con.getConnection();
        st=cn.createStatement();
        rs=st.executeQuery(sql);   
        Object[] Datos= new Object[4]; /*Un array donde se almacenan las filas de la tabla. el tamaño del
        array debe ser el numero de columnas que tenga nuestra consulta*/
        /*modelo=(DefaultTableModel)tablaUsuarios.getModel();*/
        while(rs.next()){
        Datos[0]=rs.getInt("idcliente");/*deben llamarse exactamente igual a como esta en la tabla*/
        Datos[1]=rs.getString("nombrecliente");/*deben llamarse exactamente igual a como esta en la tabla*/
        Datos[2]=rs.getString("direccioncliente");
        Datos[3]=rs.getString("telefonocliente");/*/*deben llamarse exactamente igual a como esta en la tabla*/
        modelo.addRow(Datos);
        }
        
      /*  modelo.addRow(Datos);
        tablaUsuarios.setModel(modelo);*/
    }catch(SQLException e){}
    }
        
        void limpiarTabla(){
        
        for(int i=0; i<=tablaClientes.getRowCount(); i++){
            
            modelo.removeRow(i);
            i=i-1;
        
        }
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        labelTitulo = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        cajaTextoNit = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        cajaTextoNombre = new javax.swing.JTextField();
        labelTelefono = new javax.swing.JLabel();
        cajaTextoTelefono = new javax.swing.JTextField();
        botonAñadir = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        cajaTextoDireccion = new javax.swing.JTextField();
        labelNombre1 = new javax.swing.JLabel();
        BotonCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tablaClientes.setFont(new java.awt.Font("Quicksand", 0, 11)); // NOI18N
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nit", "Nombre", "Dirección", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClientes.setFocusable(false);
        tablaClientes.setGridColor(new java.awt.Color(153, 153, 153));
        tablaClientes.getTableHeader().setReorderingAllowed(false);
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaClientesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        labelTitulo.setFont(new java.awt.Font("Quicksand", 0, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(102, 102, 102));
        labelTitulo.setText("Clientes");

        labelId.setText("NIT");

        labelNombre.setText("Nombre");

        labelTelefono.setText("Telefono");

        botonAñadir.setBackground(new java.awt.Color(51, 172, 234));
        botonAñadir.setText("Añadir");
        botonAñadir.setBorder(null);
        botonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirActionPerformed(evt);
            }
        });

        botonModificar.setBackground(new java.awt.Color(51, 172, 234));
        botonModificar.setText("Modificar");
        botonModificar.setBorder(null);
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonEliminar.setBackground(new java.awt.Color(51, 172, 234));
        botonEliminar.setText("Eliminar");
        botonEliminar.setBorder(null);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        labelNombre1.setText("Dirección");

        BotonCerrar.setText("X");
        BotonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombre)
                            .addComponent(labelId))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cajaTextoNit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(labelTelefono)
                                        .addGap(27, 27, 27))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelNombre1)
                                        .addGap(26, 26, 26)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cajaTextoDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cajaTextoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cajaTextoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelId)
                        .addComponent(cajaTextoNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cajaTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefono)
                    .addComponent(cajaTextoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirActionPerformed
        // TODO add your handling code here:

        try{
            /*se le asignan los atribujos que se ingreso en las cajas de texto a un objeto usuario*/
            controlC.getCliente().setIdCliente(Integer.valueOf(cajaTextoNit.getText()));
            controlC.getCliente().setNombre(cajaTextoNombre.getText());
            controlC.getCliente().setTelefono(cajaTextoTelefono.getText());
            controlC.getCliente().setDireccion(cajaTextoDireccion.getText());
            controlC.agregar();/*se ejecuta el metodo que agrega una cuenta a la base de datos*/
            limpiarTabla();

        }catch(Exception e){}
        JOptionPane.showMessageDialog(null,"Cliente registrado con exito");
        listar();
    }//GEN-LAST:event_botonAñadirActionPerformed
    
    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        try{
            /*se le asignan los atribujos que se ingreso en las cajas de texto a un objeto usuario*/
            controlC.getCliente().setIdCliente(Integer.valueOf(cajaTextoNit.getText()));
            controlC.getCliente().setNombre(cajaTextoNombre.getText());
            controlC.getCliente().setTelefono(cajaTextoTelefono.getText());
            controlC.getCliente().setDireccion(cajaTextoDireccion.getText());
            controlC.modificar();/*se ejecuta el metodo que agrega una cuenta a la base de datos*/
            limpiarTabla();

        }catch(Exception e){}
        JOptionPane.showMessageDialog(null,"Cliente modificado con exito");
        listar();
        // TODO add your handling code here:
    }//GEN-LAST:event_botonModificarActionPerformed

    private void tablaClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMousePressed
        cajaTextoNit.setText(String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0)));
        cajaTextoNombre.setText(String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 1)));
        cajaTextoTelefono.setText(String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 2)));
        cajaTextoDireccion.setText(String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 3)));
    }//GEN-LAST:event_tablaClientesMousePressed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        try{
            /*se le asignan los atribujos que se ingreso en las cajas de texto a un objeto usuario*/
            controlC.getCliente().setIdCliente(Integer.valueOf(cajaTextoNit.getText()));
            controlC.getCliente().setNombre(cajaTextoNombre.getText());
            controlC.getCliente().setTelefono(cajaTextoTelefono.getText());
            controlC.getCliente().setDireccion(cajaTextoDireccion.getText());
            controlC.eliminar();/*se ejecuta el metodo que agrega una cuenta a la base de datos*/
            limpiarTabla();

        }catch(Exception e){}
        JOptionPane.showMessageDialog(null,"Cliente eliminado con exito");
        listar();// TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void BotonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_BotonCerrarActionPerformed
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vistaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCerrar;
    private javax.swing.JButton botonAñadir;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField cajaTextoDireccion;
    private javax.swing.JTextField cajaTextoNit;
    private javax.swing.JTextField cajaTextoNombre;
    private javax.swing.JTextField cajaTextoTelefono;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombre1;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tablaClientes;
    // End of variables declaration//GEN-END:variables
}