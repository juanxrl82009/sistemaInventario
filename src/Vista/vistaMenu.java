
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author John Castro
 */
public class vistaMenu extends javax.swing.JFrame {

    /**
     * Creates new form vistaMenu
     */
    public vistaMenu() {
        
        //this.setUndecorated(true);
        this.setVisible(true);
        initComponents();
        this.setLocationRelativeTo(null);
        

      
        /* En estas lineas se crea un objeto de tipo fecha, se le cambia el formato y
        se le implementa al label de la fecha*/
        Date sistFecha=new Date();
        SimpleDateFormat formato= new SimpleDateFormat("dd-MMM-YYY");
        labelFecha.setText(formato.format(sistFecha));
        Timer tiempo=new Timer(100, new vistaMenu.horas());
        tiempo.start();
         
    }
    
    
     public void setConexionMenu(Conexion con1){
       con=con1;
    }
    /*Se crea esta clase para poder implementar la hora en tiempo real*/
    class horas implements ActionListener{
   
        public void actionPerformed(ActionEvent e){
           Date sistHora=new Date();
           String pmAm="hh:mm:ss a";
           SimpleDateFormat format=new SimpleDateFormat(pmAm);
           Calendar hoy=Calendar.getInstance();
           labelHora.setText(String.format(format.format(sistHora), hoy));
           jPopupMenu1.add(jButton1);
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        botonCliente = new javax.swing.JButton();
        botonProveedores = new javax.swing.JButton();
        botonCompras = new javax.swing.JButton();
        botonFacturacion = new javax.swing.JButton();
        botonReportes = new javax.swing.JButton();
        botonUsuarios = new javax.swing.JButton();
        labelCliente = new javax.swing.JLabel();
        labelProveedores = new javax.swing.JLabel();
        labelCompras = new javax.swing.JLabel();
        labelFacturacion = new javax.swing.JLabel();
        labelReportes = new javax.swing.JLabel();
        labelUsuarios = new javax.swing.JLabel();
        botonArticulo = new javax.swing.JButton();
        labelFacturacion1 = new javax.swing.JLabel();
        botonInventario = new javax.swing.JButton();
        labelReportes1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelFecha = new javax.swing.JLabel();
        labelHora = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();

        jPopupMenu1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.setAlignmentX(0.5F);
        jButton1.setBorder(null);
        jButton1.setMaximumSize(new java.awt.Dimension(30, 20));
        jButton1.setPreferredSize(new java.awt.Dimension(40, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.getAccessibleContext().setAccessibleDescription("Salir");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelTitulo.setFont(new java.awt.Font("Decker", 0, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(102, 102, 102));
        labelTitulo.setText("Menú");

        botonCliente.setBackground(new java.awt.Color(255, 255, 255));
        botonCliente.setForeground(new java.awt.Color(255, 255, 255));
        botonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cliente.png"))); // NOI18N
        botonCliente.setBorder(null);
        botonCliente.setBorderPainted(false);
        botonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClienteActionPerformed(evt);
            }
        });

        botonProveedores.setBackground(new java.awt.Color(255, 255, 255));
        botonProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/camion-de-reparto.png"))); // NOI18N
        botonProveedores.setBorder(null);
        botonProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProveedoresActionPerformed(evt);
            }
        });

        botonCompras.setBackground(new java.awt.Color(255, 255, 255));
        botonCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/carro-de-la-compra.png"))); // NOI18N
        botonCompras.setBorder(null);
        botonCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprasActionPerformed(evt);
            }
        });

        botonFacturacion.setBackground(new java.awt.Color(255, 255, 255));
        botonFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/caja.png"))); // NOI18N
        botonFacturacion.setBorder(null);
        botonFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFacturacionActionPerformed(evt);
            }
        });

        botonReportes.setBackground(new java.awt.Color(255, 255, 255));
        botonReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/perfiles.png"))); // NOI18N
        botonReportes.setBorder(null);
        botonReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReportesActionPerformed(evt);
            }
        });

        botonUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        botonUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/usuario.png"))); // NOI18N
        botonUsuarios.setBorder(null);
        botonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUsuariosActionPerformed(evt);
            }
        });

        labelCliente.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelCliente.setForeground(new java.awt.Color(102, 102, 102));
        labelCliente.setText("Clientes");

        labelProveedores.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelProveedores.setForeground(new java.awt.Color(102, 102, 102));
        labelProveedores.setText("Proveedores");

        labelCompras.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelCompras.setForeground(new java.awt.Color(102, 102, 102));
        labelCompras.setText("Compras");

        labelFacturacion.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelFacturacion.setForeground(new java.awt.Color(102, 102, 102));
        labelFacturacion.setText("Facturación");

        labelReportes.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelReportes.setForeground(new java.awt.Color(102, 102, 102));
        labelReportes.setText("Reportes");

        labelUsuarios.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelUsuarios.setForeground(new java.awt.Color(102, 102, 102));
        labelUsuarios.setText("Usuarios");

        botonArticulo.setBackground(new java.awt.Color(255, 255, 255));
        botonArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cola-en-lata.png"))); // NOI18N
        botonArticulo.setBorder(null);
        botonArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArticuloActionPerformed(evt);
            }
        });

        labelFacturacion1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelFacturacion1.setForeground(new java.awt.Color(102, 102, 102));
        labelFacturacion1.setText("Artículo");

        botonInventario.setBackground(new java.awt.Color(255, 255, 255));
        botonInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/almacenamiento.png"))); // NOI18N
        botonInventario.setBorder(null);
        botonInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInventarioActionPerformed(evt);
            }
        });

        labelReportes1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelReportes1.setForeground(new java.awt.Color(102, 102, 102));
        labelReportes1.setText("Inventario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(labelTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(166, 166, 166)
                                .addComponent(botonProveedores))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelCliente)
                                .addGap(167, 167, 167)
                                .addComponent(labelProveedores))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonFacturacion)
                                    .addComponent(labelFacturacion))
                                .addGap(136, 136, 136)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelReportes)
                                    .addComponent(botonReportes)
                                    .addComponent(labelReportes1)
                                    .addComponent(botonInventario))))
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonUsuarios)
                            .addComponent(botonCompras)
                            .addComponent(labelCompras)
                            .addComponent(labelUsuarios)))
                    .addComponent(botonArticulo)
                    .addComponent(labelFacturacion1))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonUsuarios)
                        .addGap(18, 18, 18)
                        .addComponent(labelUsuarios))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonCliente)
                            .addComponent(botonProveedores))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCliente)
                            .addComponent(labelProveedores))))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonFacturacion)
                            .addComponent(botonReportes))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFacturacion)
                            .addComponent(labelReportes)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonCompras)
                        .addGap(18, 18, 18)
                        .addComponent(labelCompras)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonArticulo)
                        .addGap(18, 18, 18)
                        .addComponent(labelFacturacion1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonInventario)
                        .addGap(18, 18, 18)
                        .addComponent(labelReportes1)))
                .addGap(38, 38, 38))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 700, 600));

        jPanel2.setBackground(new java.awt.Color(64, 132, 253));

        labelFecha.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(255, 255, 255));
        labelFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/calendario.png"))); // NOI18N
        labelFecha.setText("Fecha");

        labelHora.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        labelHora.setForeground(new java.awt.Color(255, 255, 255));
        labelHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/reloj.png"))); // NOI18N
        labelHora.setText("Hora");

        labelUsuario.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/usuarioSmall.png"))); // NOI18N
        labelUsuario.setText("Usuario");
        labelUsuario.setComponentPopupMenu(jPopupMenu1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFecha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 518, Short.MAX_VALUE)
                .addComponent(labelUsuario)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(labelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelHora)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClienteActionPerformed
        // TODO add your handling code here:
        vistaCliente vCliente= new vistaCliente(con);
        
        //vistaUsuario vUsuario= new vistaUsuario();
         
    }//GEN-LAST:event_botonClienteActionPerformed

    private void botonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUsuariosActionPerformed
        // TODO add your handling code here:
        
        vistaUsuario vUsuario= new vistaUsuario(con);
        //vUsuario.setConexionUsuario(con);
          
    }//GEN-LAST:event_botonUsuariosActionPerformed

    private void botonProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProveedoresActionPerformed
        vistaProveedor vProveedor= new vistaProveedor(con);        // TODO add your handling code here:
    }//GEN-LAST:event_botonProveedoresActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         frmLogin login = new frmLogin();
         this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprasActionPerformed
        vistaCompra vCompra = new vistaCompra(con);
          // TODO add your handling code here:
    }//GEN-LAST:event_botonComprasActionPerformed

    private void botonReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReportesActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_botonReportesActionPerformed

    private void botonInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonInventarioActionPerformed

    private void botonArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArticuloActionPerformed
        VistaArticulo vArticulo = new VistaArticulo(con);                // TODO add your handling code here:
    }//GEN-LAST:event_botonArticuloActionPerformed

    private void botonFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFacturacionActionPerformed
        vistaFactura vFactura = new vistaFactura(con);
        // TODO add your handling code here:
    }//GEN-LAST:event_botonFacturacionActionPerformed
       /**
     * @param args the command line arguments
     */
    private Conexion con;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonArticulo;
    private javax.swing.JButton botonCliente;
    private javax.swing.JButton botonCompras;
    private javax.swing.JButton botonFacturacion;
    private javax.swing.JButton botonInventario;
    private javax.swing.JButton botonProveedores;
    private javax.swing.JButton botonReportes;
    private javax.swing.JButton botonUsuarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelCompras;
    private javax.swing.JLabel labelFacturacion;
    private javax.swing.JLabel labelFacturacion1;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel labelProveedores;
    private javax.swing.JLabel labelReportes;
    private javax.swing.JLabel labelReportes1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel labelUsuarios;
    // End of variables declaration//GEN-END:variables
}
