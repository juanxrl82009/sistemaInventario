/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.ControlCategoria;
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
public class vistaCategoria extends javax.swing.JFrame {
    
    
    private Conexion con;
    private ControlCategoria controlC;
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
    public void setConexionVistaCategoria(Conexion con1){
       con=con1;
    }
    
    public vistaCategoria(Conexion con1) {
        
        this.setVisible(true);
        initComponents();
        this.setLocationRelativeTo(null);
        con=con1;
        //Se instancia un controlador donde se le pasa la conexion en el constructor, este cambio se dio por la idea
        //de mandar un ejecutable.
        
        controlC= new ControlCategoria(con);
        //Cuando la vista categoria se crea, lo primero que se hara visible es el panel de crearCategorialo demas esta no visible
        
        panelCrearCategoria.setVisible(true);
        panelTablaCategoria.setVisible(false);
        panelModificarCategoria.setVisible(false);
        
        //Esta parte es importante, porque establezco que la tabla va a poder contener botones
        tablaCategorias.setDefaultRenderer(Object.class, new Render());
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
        tablaCategorias.getColumnModel().getColumn(id);
        
    }
     
    void listar(){    
        modelo=(DefaultTableModel)tablaCategorias.getModel();
        /*Se almacena la consulta sql en un string*/
        String sql="SELECT * "+"FROM CategoriaArticulo";
        try{
            /*se establece coneccion con la base de datos y se le introduce la consulta*/
            cn=con.getConnection();
            st=cn.createStatement();
            rs=st.executeQuery(sql);   
            Object[] Datos= new Object[5]; /*Un array donde se almacenan las filas de la tabla. el tamaño del
            array debe ser el numero de columnas que tenga nuestra consulta*/
            while(rs.next()){
            Datos[0]=rs.getInt("idCategoriaArticulo");/*deben llamarse exactamente igual a como esta en la tabla*/
            Datos[1]=rs.getString("descripcionCategArticulo");/*deben llamarse exactamente igual a como esta en la tabla*/
            Datos[2]=botonVerTabla;//En esta parte estoy añadiendo por cada fila los tres botones(ver,modificar,eliminar)
            Datos[3]=botonModificarTabla;
            Datos[4]=botonEliminarTabla;
            modelo.addRow(Datos);
            }    
        }catch(SQLException e){}
    }
        
    void limpiarTabla(){
        while(modelo.getRowCount()>0)modelo.removeRow(0);
    }
        
    public void limpiarCajasTexto(){
        cajaTextoID.setText("");
        cajaTextoDescrip.setText("");
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCategoria = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelTablaCategoria = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCategorias = new rojerusan.RSTableMetro();
        panelCrearCategoria = new javax.swing.JPanel();
        labelId = new javax.swing.JLabel();
        cajaTextoID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        labelNombre = new javax.swing.JLabel();
        cajaTextoDescrip = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        botonAñadir = new javax.swing.JButton();
        panelModificarCategoria = new javax.swing.JPanel();
        cajaTextoID1 = new javax.swing.JTextField();
        labelId1 = new javax.swing.JLabel();
        labelNombre2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        cajaTextoDescrip1 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        botonModificar = new javax.swing.JButton();
        panelMenuCategoria = new javax.swing.JPanel();
        botonVer = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        botonCrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCategoria.setBackground(new java.awt.Color(255, 255, 255));
        panelCategoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Decker", 0, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(102, 102, 102));
        labelTitulo.setText("Categorias");
        panelCategoria.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, 40));

        panelTablaCategoria.setBackground(new java.awt.Color(255, 255, 255));
        panelTablaCategoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Descripcion", "Ver", "Modificar", "Eliminar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCategorias.setColorBackgoundHead(new java.awt.Color(51, 172, 234));
        tablaCategorias.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        tablaCategorias.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        tablaCategorias.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        tablaCategorias.setFuenteFilas(new java.awt.Font("Decker", 0, 18)); // NOI18N
        tablaCategorias.setFuenteFilasSelect(new java.awt.Font("Decker", 1, 18)); // NOI18N
        tablaCategorias.setFuenteHead(new java.awt.Font("Decker", 1, 18)); // NOI18N
        tablaCategorias.setGridColor(new java.awt.Color(255, 255, 255));
        tablaCategorias.setGrosorBordeFilas(0);
        tablaCategorias.setGrosorBordeHead(0);
        tablaCategorias.setRowHeight(25);
        tablaCategorias.setRowMargin(0);
        tablaCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCategoriasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaCategorias);
        if (tablaCategorias.getColumnModel().getColumnCount() > 0) {
            tablaCategorias.getColumnModel().getColumn(0).setResizable(false);
            tablaCategorias.getColumnModel().getColumn(1).setResizable(false);
            tablaCategorias.getColumnModel().getColumn(2).setResizable(false);
            tablaCategorias.getColumnModel().getColumn(3).setResizable(false);
            tablaCategorias.getColumnModel().getColumn(4).setResizable(false);
        }

        panelTablaCategoria.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 740, 390));

        panelCategoria.add(panelTablaCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 740, 470));

        panelCrearCategoria.setBackground(new java.awt.Color(255, 255, 255));
        panelCrearCategoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelId.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelId.setText("Id");
        panelCrearCategoria.add(labelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, 20));

        cajaTextoID.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoID.setBorder(null);
        panelCrearCategoria.add(cajaTextoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 230, 20));
        panelCrearCategoria.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 230, 10));

        labelNombre.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelNombre.setText("Nombre");
        panelCrearCategoria.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, 20));

        cajaTextoDescrip.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoDescrip.setBorder(null);
        panelCrearCategoria.add(cajaTextoDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 230, 20));
        panelCrearCategoria.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 230, 10));

        botonAñadir.setBackground(new java.awt.Color(64, 132, 253));
        botonAñadir.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        botonAñadir.setForeground(new java.awt.Color(255, 255, 255));
        botonAñadir.setText("Añadir Categoria");
        botonAñadir.setBorder(null);
        botonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirActionPerformed(evt);
            }
        });
        panelCrearCategoria.add(botonAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 180, 40));

        panelCategoria.add(panelCrearCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 740, 470));

        panelModificarCategoria.setBackground(new java.awt.Color(255, 255, 255));
        panelModificarCategoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajaTextoID1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoID1.setBorder(null);
        cajaTextoID1.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        panelModificarCategoria.add(cajaTextoID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 230, 20));

        labelId1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelId1.setText("NIT");
        panelModificarCategoria.add(labelId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, 20));

        labelNombre2.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelNombre2.setText("Nombre");
        panelModificarCategoria.add(labelNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, 20));
        panelModificarCategoria.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 230, 10));

        cajaTextoDescrip1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoDescrip1.setBorder(null);
        cajaTextoDescrip1.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        panelModificarCategoria.add(cajaTextoDescrip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 230, 20));
        panelModificarCategoria.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 230, 10));

        botonModificar.setBackground(new java.awt.Color(64, 132, 253));
        botonModificar.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        botonModificar.setForeground(new java.awt.Color(255, 255, 255));
        botonModificar.setText("Modificar Categoria");
        botonModificar.setBorder(null);
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        panelModificarCategoria.add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 180, 40));

        panelCategoria.add(panelModificarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 740, 470));

        panelMenuCategoria.setBackground(new java.awt.Color(0, 0, 0));
        panelMenuCategoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonVer.setBackground(new java.awt.Color(0, 0, 0));
        botonVer.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        botonVer.setForeground(new java.awt.Color(255, 255, 255));
        botonVer.setText("Ver Categoria");
        botonVer.setBorder(null);
        botonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerActionPerformed(evt);
            }
        });
        panelMenuCategoria.add(botonVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 130, 70));

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
        panelMenuCategoria.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 150, 70));

        botonCrear.setBackground(new java.awt.Color(0, 0, 0));
        botonCrear.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        botonCrear.setForeground(new java.awt.Color(255, 255, 255));
        botonCrear.setText("Crear Categoria");
        botonCrear.setBorder(null);
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });
        panelMenuCategoria.add(botonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 70));

        panelCategoria.add(panelMenuCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 70));

        getContentPane().add(panelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerActionPerformed
       //Para poder ver las categorias es necesario poner visible el panel tablaCategoria, y el resto invisible
        panelCrearCategoria.setVisible(false);
        panelModificarCategoria.setVisible(false);
        panelTablaCategoria.setVisible(true);
        limpiarTabla();
        listar();    
       
        
    }//GEN-LAST:event_botonVerActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        panelCrearCategoria.setVisible(true);
        panelTablaCategoria.setVisible(false);
        panelModificarCategoria.setVisible(false);    
    }//GEN-LAST:event_botonCrearActionPerformed

    private void tablaCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCategoriasMouseClicked
        //En esta parte creo dos variables las cualves van almacenar la posicion en X y Y donde he dado click
        int column = tablaCategorias.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/tablaCategorias.getRowHeight();
        
        //En esta parte me aseguro de que la posicion este dentro de los limites de la tabla
        if(row<tablaCategorias.getRowCount() && row>=0 && column<tablaCategorias.getColumnCount() && column >=0){
            //En esta parte se crea un objeto que toma el valor del componente que se clickio
            Object value = tablaCategorias.getValueAt(row, column);
            //En esta parte me aseguro que ese objeto sea un boton.
            if(value instanceof JButton){
                ((JButton)value).doClick();
                //En esta parte creo un boton el cual va tomar los valores del objeto value.
                JButton boton= (JButton) value;
                //En esta parte diferencio cual boton fue presionado para que se ejecute los respectivos eventos.
                if(boton.getName().equals("v")){
                    panelCrearCategoria.setVisible(false);
                    panelTablaCategoria.setVisible(false);
                    panelModificarCategoria.setVisible(true);
                    botonModificar.setVisible(false);
                    cajaTextoID1.setEnabled(false);
                    cajaTextoDescrip1.setEnabled(false);
                
                    
                    cajaTextoID1.setText(String.valueOf(tablaCategorias.getValueAt(tablaCategorias.getSelectedRow(), 0))); 
                    cajaTextoDescrip1.setText(String.valueOf(tablaCategorias.getValueAt(tablaCategorias.getSelectedRow(), 1))); 
          
                }
                if(boton.getName().equals("m")){
                    panelCrearCategoria.setVisible(false);
                    panelTablaCategoria.setVisible(false);
                    panelModificarCategoria.setVisible(true);
                    botonModificar.setVisible(true);
                    cajaTextoID1.setEnabled(true);
                    cajaTextoDescrip1.setEnabled(true);
                 
                    cajaTextoID1.setText(String.valueOf(tablaCategorias.getValueAt(tablaCategorias.getSelectedRow(), 0))); 
                    cajaTextoDescrip1.setText(String.valueOf(tablaCategorias.getValueAt(tablaCategorias.getSelectedRow(), 1))); 
                                 
                }
                if(boton.getName().equals("e")){
                    //En esta parte la idea es que no se elimine sino que se cambie un atributo estado.
                   try{
                        //se le asignan los atribujos que se ingreso en las cajas de texto a un objeto usuario
                        controlC.getCategoria().setIdCategoria(Integer.valueOf(String.valueOf(tablaCategorias.getValueAt(tablaCategorias.getSelectedRow(), 0))));
                        controlC.eliminar();//se ejecuta el metodo que agrega una cuenta a la base de datos
                        
                    }catch(Exception e){}
                    JOptionPane.showMessageDialog(null,"Categoria eliminada con exito");
                    limpiarTabla();
                    listar(); // TODO add your handling code here:
                }
            }      
        }  
    }//GEN-LAST:event_tablaCategoriasMouseClicked

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        try{        
            //Cuando se hagan las respectivas modificaciones en los Jtext, y se presione el boton modificar, se ejecuta el siguiente
            controlC.getCategoria().setIdCategoria(Integer.valueOf(cajaTextoID1.getText()));
            controlC.getCategoria().setDescripcion(cajaTextoDescrip1.getText());
        
            controlC.modificar();//se ejecuta el metodo que agrega una cuenta a la base de datos                        
        }catch(Exception e){}
        JOptionPane.showMessageDialog(null,"Categoria modificada con exito");
        //Falta verificar que no se modifique a categorias con la misma identificacion;
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirActionPerformed
        try{
            /*se le asignan los atribujos que se ingreso en las cajas de texto a un objeto usuario*/
            controlC.getCategoria().setIdCategoria(Integer.valueOf(cajaTextoID.getText()));
            controlC.getCategoria().setDescripcion(cajaTextoDescrip.getText());
            controlC.agregar();/*se ejecuta el metodo que agrega un categoria a la base de datos*/
        }catch(Exception e){}
        JOptionPane.showMessageDialog(null,"Categoria registrado con exito");
        limpiarCajasTexto();
    }//GEN-LAST:event_botonAñadirActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAñadir;
    private javax.swing.JButton botonCrear;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonVer;
    private javax.swing.JTextField cajaTextoDescrip;
    private javax.swing.JTextField cajaTextoDescrip1;
    private javax.swing.JTextField cajaTextoID;
    private javax.swing.JTextField cajaTextoID1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelId1;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombre2;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelCategoria;
    private javax.swing.JPanel panelCrearCategoria;
    private javax.swing.JPanel panelMenuCategoria;
    private javax.swing.JPanel panelModificarCategoria;
    private javax.swing.JPanel panelTablaCategoria;
    private rojerusan.RSTableMetro tablaCategorias;
    // End of variables declaration//GEN-END:variables
}
