/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;

/**
 *
 * @author John Castro
 */
public class vistaFactura extends javax.swing.JFrame {

    /**
     * Creates new form vistaFactura
     */
    public vistaFactura() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        panelModificarFactura.setVisible(false);
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
        labelId = new javax.swing.JLabel();
        labelNombre1 = new javax.swing.JLabel();
        cajaTextoIdFac = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        labelNombre = new javax.swing.JLabel();
        cajaTextoNombreClie = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        labelTelefono = new javax.swing.JLabel();
        cajaTextoFecha = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        cajaTextNombreCajero = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        botonAñadir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojerusan.RSTableMetro();
        jLabel1 = new javax.swing.JLabel();
        panelTablaFactura = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaFacturas = new rojerusan.RSTableMetro();
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
        panelMenuCliente = new javax.swing.JPanel();
        botonVer = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        botonCrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFactura.setBackground(new java.awt.Color(255, 255, 255));
        panelFactura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Decker", 0, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(102, 102, 102));
        labelTitulo.setText("Facturación");
        panelFactura.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, 40));

        panelCrearFactura.setBackground(new java.awt.Color(255, 255, 255));
        panelCrearFactura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelId.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelId.setText("Id Factura");
        panelCrearFactura.add(labelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        labelNombre1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelNombre1.setText("Fecha");
        panelCrearFactura.add(labelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, 20));

        cajaTextoIdFac.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoIdFac.setBorder(null);
        panelCrearFactura.add(cajaTextoIdFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 230, 20));
        panelCrearFactura.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 230, 10));

        labelNombre.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelNombre.setText("Cliente");
        panelCrearFactura.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, 20));

        cajaTextoNombreClie.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoNombreClie.setBorder(null);
        panelCrearFactura.add(cajaTextoNombreClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 230, 20));
        panelCrearFactura.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 230, 10));

        labelTelefono.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelTelefono.setText("Cajero");
        panelCrearFactura.add(labelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        cajaTextoFecha.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextoFecha.setBorder(null);
        panelCrearFactura.add(cajaTextoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 230, 20));
        panelCrearFactura.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 230, 10));

        cajaTextNombreCajero.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cajaTextNombreCajero.setBorder(null);
        panelCrearFactura.add(cajaTextNombreCajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 230, 20));
        panelCrearFactura.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 230, 10));

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
        panelCrearFactura.add(botonAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 180, 40));

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Linea", "Articulo", "Cantidad", "Subtotal", "Modificar", "Eliminar"
            }
        ));
        rSTableMetro1.setFuenteHead(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(rSTableMetro1);

        panelCrearFactura.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 740, 280));

        jLabel1.setFont(new java.awt.Font("Decker", 0, 48)); // NOI18N
        jLabel1.setText("Total:");
        panelCrearFactura.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, 40));

        panelFactura.add(panelCrearFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 740, 470));

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

        panelFactura.add(panelModificarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 740, 470));

        panelMenuCliente.setBackground(new java.awt.Color(0, 0, 0));
        panelMenuCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        botonCrear.setText("Crear Factura");
        botonCrear.setBorder(null);
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });
        panelMenuCliente.add(botonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 70));

        panelFactura.add(panelMenuCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 70));

        getContentPane().add(panelFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 640));

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
    
    private void botonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerActionPerformed
        //Para poder ver los clientes es necesario poner visible el panel tablaCliente, y el resto invisible
        panelCrearFactura.setVisible(false);
        panelModificarFactura.setVisible(false);
        panelTablaFactura.setVisible(true);
       // limpiarTabla();
        //listar();

    }//GEN-LAST:event_botonVerActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        panelCrearFactura.setVisible(true);
        panelTablaFactura.setVisible(false);
        panelModificarFactura.setVisible(false);
    }//GEN-LAST:event_botonCrearActionPerformed

    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAñadir;
    private javax.swing.JButton botonCrear;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonVer;
    private javax.swing.JTextField cajaTextNombreCajero;
    private javax.swing.JTextField cajaTextoDireccionM;
    private javax.swing.JTextField cajaTextoFecha;
    private javax.swing.JTextField cajaTextoIdFac;
    private javax.swing.JTextField cajaTextoNitM;
    private javax.swing.JTextField cajaTextoNombreClie;
    private javax.swing.JTextField cajaTextoNombreM;
    private javax.swing.JTextField cajaTextoTelefonoM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JPanel panelCrearFactura;
    private javax.swing.JPanel panelFactura;
    private javax.swing.JPanel panelMenuCliente;
    private javax.swing.JPanel panelModificarFactura;
    private javax.swing.JPanel panelTablaFactura;
    private rojerusan.RSTableMetro rSTableMetro1;
    private rojerusan.RSTableMetro tablaFacturas;
    // End of variables declaration//GEN-END:variables
}