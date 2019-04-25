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
import javax.swing.JButton;

/**
 *
 * @author Braian Morales
 */
public class VistaInventario extends javax.swing.JFrame {
    
    
    private Conexion con;
    private ControlArticulo controlA;
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
    public void setConexionVistaArticulo(Conexion con1){
       con=con1;
    }
    
    public VistaInventario(Conexion con1) {
        
        this.setVisible(true);
        initComponents();
        this.setLocationRelativeTo(null);
        con=con1;
        //Se instancia un controlador donde se le pasa la conexion en el constructor, este cambio se dio por la idea
        //de mandar un ejecutable.
        
        controlA= new ControlArticulo(con);
        //Cuando la vista cliente se crea, lo primero que se hara visible es el panel de crearCliente lo demas esta no visible
        
  
        
        panelTablaInventario.setVisible(true);
        panelModificarInventario.setVisible(false);
        
        //Esta parte es importante, porque establezco que la tabla va a poder contener botones
        tablaInventario.setDefaultRenderer(Object.class, new Render());
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
        tablaInventario.getColumnModel().getColumn(id);
        
    }
     
    void listar(){    
        modelo=(DefaultTableModel)tablaInventario.getModel();
        /*Se almacena la consulta sql en un string*/
        String sql="SELECT articulo.idArticulo, articulo.nombreArticulo, registroinventario.cantidadArticulo\n" +
"FROM articulo, registroinventario\n" +
"WHERE (registroinventario.idArticulo= articulo.idArticulo)";
        try{
            /*se establece coneccion con la base de datos y se le introduce la consulta*/
            cn=con.getConnection();
            st=cn.createStatement();
            rs=st.executeQuery(sql);   
            Object[] Datos= new Object[6]; /*Un array donde se almacenan las filas de la tabla. el tamaño del
            array debe ser el numero de columnas que tenga nuestra consulta*/
            while(rs.next()){
            Datos[0]=rs.getInt("idarticulo");/*deben llamarse exactamente igual a como esta en la tabla*/
            Datos[1]=rs.getString("nombrearticulo");/*deben llamarse exactamente igual a como esta en la tabla*/
            Datos[2]=rs.getInt("cantidadarticulo");
            Datos[3]=botonVerTabla;//En esta parte estoy añadiendo por cada fila los tres botones(ver,modificar,eliminar)
           
            modelo.addRow(Datos);
            }    
        }catch(SQLException e){}
    }
        
    void limpiarTabla(){
        while(modelo.getRowCount()>0)modelo.removeRow(0);
    }
        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInventario = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelTablaInventario = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaInventario = new rojerusan.RSTableMetro();
        panelMenuArticulo = new javax.swing.JPanel();
        botonVer = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        panelModificarInventario = new javax.swing.JPanel();
        labelNombre2 = new javax.swing.JLabel();
        cajaTextoNombreM = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        labelCantidad = new javax.swing.JLabel();
        cajaTextoCategoriaM = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        botonModificar = new javax.swing.JButton();
        cajaTextoCantidadM = new javax.swing.JTextField();
        labelId2 = new javax.swing.JLabel();
        cajaTextoIDm = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInventario.setBackground(new java.awt.Color(255, 255, 255));
        panelInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Decker", 0, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(102, 102, 102));
        labelTitulo.setText("Inventario");
        panelInventario.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, 40));

        panelTablaInventario.setBackground(new java.awt.Color(255, 255, 255));
        panelTablaInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Cantidad", "Ver"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaInventario.setColorBackgoundHead(new java.awt.Color(51, 172, 234));
        tablaInventario.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        tablaInventario.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        tablaInventario.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        tablaInventario.setFuenteFilas(new java.awt.Font("Decker", 0, 18)); // NOI18N
        tablaInventario.setFuenteFilasSelect(new java.awt.Font("Decker", 1, 18)); // NOI18N
        tablaInventario.setFuenteHead(new java.awt.Font("Decker", 1, 18)); // NOI18N
        tablaInventario.setGridColor(new java.awt.Color(255, 255, 255));
        tablaInventario.setGrosorBordeFilas(0);
        tablaInventario.setGrosorBordeHead(0);
        tablaInventario.setRowHeight(25);
        tablaInventario.setRowMargin(0);
        tablaInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaInventarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaInventario);
        if (tablaInventario.getColumnModel().getColumnCount() > 0) {
            tablaInventario.getColumnModel().getColumn(0).setResizable(false);
            tablaInventario.getColumnModel().getColumn(1).setResizable(false);
            tablaInventario.getColumnModel().getColumn(2).setResizable(false);
            tablaInventario.getColumnModel().getColumn(3).setResizable(false);
        }

        panelTablaInventario.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 740, 420));

        panelInventario.add(panelTablaInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 740, 470));

        panelMenuArticulo.setBackground(new java.awt.Color(0, 0, 0));
        panelMenuArticulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonVer.setBackground(new java.awt.Color(0, 0, 0));
        botonVer.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        botonVer.setForeground(new java.awt.Color(255, 255, 255));
        botonVer.setText("Ver Inventario");
        botonVer.setBorder(null);
        botonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerActionPerformed(evt);
            }
        });
        panelMenuArticulo.add(botonVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 70));

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
        panelMenuArticulo.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 150, 70));

        panelInventario.add(panelMenuArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 70));

        panelModificarInventario.setBackground(new java.awt.Color(255, 255, 255));
        panelModificarInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombre2.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelNombre2.setText("Nombre");
        panelModificarInventario.add(labelNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, 20));

        cajaTextoNombreM.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoNombreM.setBorder(null);
        cajaTextoNombreM.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        panelModificarInventario.add(cajaTextoNombreM, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 230, 20));
        panelModificarInventario.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 230, 10));

        labelCantidad.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelCantidad.setText("Cantidad");
        panelModificarInventario.add(labelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, 20));

        cajaTextoCategoriaM.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoCategoriaM.setBorder(null);
        cajaTextoCategoriaM.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        cajaTextoCategoriaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaTextoCategoriaMActionPerformed(evt);
            }
        });
        panelModificarInventario.add(cajaTextoCategoriaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 230, 20));
        panelModificarInventario.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 230, 10));

        botonModificar.setBackground(new java.awt.Color(64, 132, 253));
        botonModificar.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        botonModificar.setForeground(new java.awt.Color(255, 255, 255));
        botonModificar.setText("Modificar Proveedor");
        botonModificar.setBorder(null);
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        panelModificarInventario.add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 180, 40));

        cajaTextoCantidadM.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoCantidadM.setBorder(null);
        cajaTextoCantidadM.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        panelModificarInventario.add(cajaTextoCantidadM, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 230, 20));

        labelId2.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelId2.setText("ID");
        panelModificarInventario.add(labelId2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, 20));

        cajaTextoIDm.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoIDm.setBorder(null);
        cajaTextoIDm.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        cajaTextoIDm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaTextoIDmActionPerformed(evt);
            }
        });
        panelModificarInventario.add(cajaTextoIDm, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 230, 20));
        panelModificarInventario.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 230, 10));

        panelInventario.add(panelModificarInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 740, 470));

        getContentPane().add(panelInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerActionPerformed
        //Para poder ver los clientes es necesario poner visible el panel tablaCliente, y el resto invisible
      
        panelModificarInventario.setVisible(false);
        panelTablaInventario.setVisible(true);
        limpiarTabla();
        listar();

    }//GEN-LAST:event_botonVerActionPerformed

    private void tablaInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaInventarioMouseClicked
        //En esta parte creo dos variables las cualves van almacenar la posicion en X y Y donde he dado click
        int column = tablaInventario.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/tablaInventario.getRowHeight();

        //En esta parte me aseguro de que la posicion este dentro de los limites de la tabla
        if(row<tablaInventario.getRowCount() && row>=0 && column<tablaInventario.getColumnCount() && column >=0){
            //En esta parte se crea un objeto que toma el valor del componente que se clickio
            Object value = tablaInventario.getValueAt(row, column);
            //En esta parte me aseguro que ese objeto sea un boton.
            if(value instanceof JButton){
                ((JButton)value).doClick();
                //En esta parte creo un boton el cual va tomar los valores del objeto value.
                JButton boton= (JButton) value;
                //En esta parte diferencio cual boton fue presionado para que se ejecute los respectivos eventos.
                if(boton.getName().equals("v")){
                 
                    panelTablaInventario.setVisible(false);
                    panelModificarInventario.setVisible(true);
                    botonModificar.setVisible(false);
                    cajaTextoNombreM.setEnabled(false);
                    cajaTextoCategoriaM.setEnabled(false);

                    cajaTextoIDm.setText(String.valueOf(tablaInventario.getValueAt(tablaInventario.getSelectedRow(), 0)));
                    cajaTextoCategoriaM.setText(String.valueOf(tablaInventario.getValueAt(tablaInventario.getSelectedRow(), 1)));
                    cajaTextoCantidadM.setText(String.valueOf(tablaInventario.getValueAt(tablaInventario.getSelectedRow(), 2)));
                
                    
                }
                
            }
        }
    }//GEN-LAST:event_tablaInventarioMouseClicked

    private void cajaTextoIDmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaTextoIDmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaTextoIDmActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        try{
            //Cuando se hagan las respectivas modificaciones en los Jtext, y se presione el boton modificar, se ejecuta el siguiente
            controlA.getArticulo().setIdArticulo(Integer.valueOf(cajaTextoIDm.getText()));
            controlA.getArticulo().setNombre(cajaTextoNombreM.getText());
            controlA.getArticulo().setCategoria(Integer.valueOf(cajaTextoCategoriaM.getText()));
            controlA.getArticulo().setNitProveedor(Integer.valueOf(cajaTextoCantidadM.getText()));
            controlA.modificar();/*se ejecuta el metodo que agrega una cuenta a la base de datos*/
        }catch(Exception e){}
        JOptionPane.showMessageDialog(null,"Articulo modificado con exito");
        //Falta verificar que no se modifique a clientes con la misma identificacion;
    }//GEN-LAST:event_botonModificarActionPerformed

    private void cajaTextoCategoriaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaTextoCategoriaMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaTextoCategoriaMActionPerformed
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonVer;
    private javax.swing.JTextField cajaTextoCantidadM;
    private javax.swing.JTextField cajaTextoCategoriaM;
    private javax.swing.JTextField cajaTextoIDm;
    private javax.swing.JTextField cajaTextoNombreM;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelId2;
    private javax.swing.JLabel labelNombre2;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelInventario;
    private javax.swing.JPanel panelMenuArticulo;
    private javax.swing.JPanel panelModificarInventario;
    private javax.swing.JPanel panelTablaInventario;
    private rojerusan.RSTableMetro tablaInventario;
    // End of variables declaration//GEN-END:variables
}
