/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

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
        initComponents();
        setVisible(true);
      
        /* En estas lineas se crea un objeto de tipo fecha, se le cambia el formato y
        se le implementa al label de la fecha*/
        Date sistFecha=new Date();
        SimpleDateFormat formato= new SimpleDateFormat("dd-MMM-YYY");
        labelFecha.setText(formato.format(sistFecha));
         Timer tiempo=new Timer(100, new vistaMenu.horas());
         tiempo.start();
         
    }
    
    /*Se crea esta clase para poder implementar la hora en tiempo real*/
    class horas implements ActionListener{
   
    public void actionPerformed(ActionEvent e){
       Date sistHora=new Date();
       String pmAm="hh:mm:ss a";
       SimpleDateFormat format=new SimpleDateFormat(pmAm);
       Calendar hoy=Calendar.getInstance();
       labelHora.setText(String.format(format.format(sistHora), hoy));
   
    
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

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        botonCliente = new javax.swing.JButton();
        botonProveedores = new javax.swing.JButton();
        botonCompras = new javax.swing.JButton();
        botonFacturacion = new javax.swing.JButton();
        botonReportes = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        labelCliente = new javax.swing.JLabel();
        labelProveedores = new javax.swing.JLabel();
        labelCompras = new javax.swing.JLabel();
        labelFacturacion = new javax.swing.JLabel();
        labelReportes = new javax.swing.JLabel();
        labelSalir = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelFecha = new javax.swing.JLabel();
        labelHora = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelTitulo.setFont(new java.awt.Font("Quicksand", 0, 36)); // NOI18N
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

        botonCompras.setBackground(new java.awt.Color(255, 255, 255));
        botonCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/carro-de-la-compra.png"))); // NOI18N
        botonCompras.setBorder(null);

        botonFacturacion.setBackground(new java.awt.Color(255, 255, 255));
        botonFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/caja.png"))); // NOI18N
        botonFacturacion.setBorder(null);

        botonReportes.setBackground(new java.awt.Color(255, 255, 255));
        botonReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/perfiles.png"))); // NOI18N
        botonReportes.setBorder(null);
        botonReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReportesActionPerformed(evt);
            }
        });

        botonSalir.setBackground(new java.awt.Color(255, 255, 255));
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/desconectarte.png"))); // NOI18N
        botonSalir.setBorder(null);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        labelCliente.setFont(new java.awt.Font("Quicksand", 0, 18)); // NOI18N
        labelCliente.setForeground(new java.awt.Color(102, 102, 102));
        labelCliente.setText("Clientes");

        labelProveedores.setFont(new java.awt.Font("Quicksand", 0, 18)); // NOI18N
        labelProveedores.setForeground(new java.awt.Color(102, 102, 102));
        labelProveedores.setText("Proveedores");

        labelCompras.setFont(new java.awt.Font("Quicksand", 0, 18)); // NOI18N
        labelCompras.setForeground(new java.awt.Color(102, 102, 102));
        labelCompras.setText("Compras");

        labelFacturacion.setFont(new java.awt.Font("Quicksand", 0, 18)); // NOI18N
        labelFacturacion.setForeground(new java.awt.Color(102, 102, 102));
        labelFacturacion.setText("Facturación");

        labelReportes.setFont(new java.awt.Font("Quicksand", 0, 18)); // NOI18N
        labelReportes.setForeground(new java.awt.Color(102, 102, 102));
        labelReportes.setText("Reportes");

        labelSalir.setFont(new java.awt.Font("Quicksand", 0, 18)); // NOI18N
        labelSalir.setForeground(new java.awt.Color(102, 102, 102));
        labelSalir.setText("Salir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelCliente)
                                .addGap(159, 159, 159)
                                .addComponent(labelProveedores))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(botonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(168, 168, 168)
                                        .addComponent(botonProveedores))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(botonFacturacion)
                                        .addGap(168, 168, 168)
                                        .addComponent(botonReportes))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelFacturacion)
                                        .addGap(126, 126, 126)
                                        .addComponent(labelReportes)))
                                .addGap(162, 162, 162)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonCompras)
                                    .addComponent(botonSalir)
                                    .addComponent(labelCompras)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(labelSalir))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(labelTitulo)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonCompras)
                        .addGap(18, 18, 18)
                        .addComponent(labelCompras))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonCliente)
                            .addComponent(botonProveedores))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCliente)
                            .addComponent(labelProveedores))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(botonSalir)
                        .addGap(18, 18, 18)
                        .addComponent(labelSalir)))
                .addGap(10, 81, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 700, 440));

        jPanel2.setBackground(new java.awt.Color(64, 132, 253));

        labelFecha.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(255, 255, 255));
        labelFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/calendario.png"))); // NOI18N
        labelFecha.setText("Fecha");

        labelHora.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        labelHora.setForeground(new java.awt.Color(255, 255, 255));
        labelHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/reloj.png"))); // NOI18N
        labelHora.setText("Hora");

        labelUsuario.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/usuarioSmall.png"))); // NOI18N
        labelUsuario.setText("Usuario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFecha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 493, Short.MAX_VALUE)
                .addComponent(labelUsuario)
                .addGap(47, 47, 47))
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
    }//GEN-LAST:event_botonClienteActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        
        if(evt.getSource()==botonSalir){
            frmLogin login = new frmLogin();
            this.setVisible(false);
        }
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReportesActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==botonReportes){
            vistaReportes reportes = new vistaReportes();
            this.setVisible(false);
        }
    }//GEN-LAST:event_botonReportesActionPerformed

    
        
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCliente;
    private javax.swing.JButton botonCompras;
    private javax.swing.JButton botonFacturacion;
    private javax.swing.JButton botonProveedores;
    private javax.swing.JButton botonReportes;
    private javax.swing.JButton botonSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelCompras;
    private javax.swing.JLabel labelFacturacion;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel labelProveedores;
    private javax.swing.JLabel labelReportes;
    private javax.swing.JLabel labelSalir;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUsuario;
    // End of variables declaration//GEN-END:variables
}
