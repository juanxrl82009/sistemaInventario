/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author John Castro
 */
public class frmLogin extends javax.swing.JFrame {
Conexion con=new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    int id;
    boolean verificacion;/*boleano que nos ayudara a identificar si el login es correocto o incorrecto*/
    /**
     * Creates new form frmLogin
     */
    public frmLogin() {
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        initComponents();
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
        labelIniciarSesion = new javax.swing.JLabel();
        labelContrasenna = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        cajaTextoUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        cajaTextoContrasenna = new javax.swing.JPasswordField();
        labelImagen1 = new javax.swing.JLabel();
        labelImagen2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelFotoUsuario = new javax.swing.JLabel();
        botonLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelIniciarSesion.setFont(new java.awt.Font("Quicksand", 0, 24)); // NOI18N
        labelIniciarSesion.setForeground(new java.awt.Color(102, 102, 102));
        labelIniciarSesion.setText("Iniciar Sesión");
        jPanel1.add(labelIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 190, 30));

        labelContrasenna.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        labelContrasenna.setForeground(new java.awt.Color(102, 102, 102));
        labelContrasenna.setText("Contraseña");
        jPanel1.add(labelContrasenna, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 110, 20));

        labelUsuario.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(102, 102, 102));
        labelUsuario.setText("Usuario");
        jPanel1.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 80, 20));

        cajaTextoUsuario.setFont(new java.awt.Font("Quicksand", 0, 18)); // NOI18N
        cajaTextoUsuario.setBorder(null);
        cajaTextoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaTextoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(cajaTextoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 210, 30));

        jSeparator1.setForeground(new java.awt.Color(64, 132, 253));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 210, -1));

        jSeparator2.setForeground(new java.awt.Color(64, 132, 253));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 210, 10));

        cajaTextoContrasenna.setFont(new java.awt.Font("Quicksand", 0, 18)); // NOI18N
        cajaTextoContrasenna.setBorder(null);
        jPanel1.add(cajaTextoContrasenna, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 210, 30));

        labelImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bloquear.png"))); // NOI18N
        jPanel1.add(labelImagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 30, 30));

        labelImagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/entrar.png"))); // NOI18N
        jPanel1.add(labelImagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, 30));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        labelFotoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/usuario.png"))); // NOI18N
        jPanel1.add(labelFotoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        botonLogin.setText("Log in");
        botonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(botonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    void verificarLogin(){
         int usuarioBD=0;
    String b="";
     String usuarioCajaTexto= new String();
     String contrasenna= new String();
     int usuarioInt;
     usuarioCajaTexto=cajaTextoUsuario.getText();/*Obtiene lo que hay en la caja de texto*/
      contrasenna=String.valueOf(cajaTextoContrasenna.getPassword());
     /*Obtiene lo que hay en la caja de texto*/
     /*contrasenna=cajaTextoContrasenna.getPassword(); solo se puede en array de caracteres*/
      
    //String sql="SELECT idCuenta, idPassCuenta FROM Cuenta WHERE idCuenta=" + usuarioCajaTexto;
    /*Consulta en postgresql
    donde busca el usuario que se ingreso en la caja de texto en la base de datos*/
    String sql="SELECT * FROM Cuenta WHERE idCuenta = " + usuarioCajaTexto + "AND idPassCuenta = crypt('" + contrasenna + "', idPassCuenta)";
    try{
   
        cn=con.getConnection();
        st=cn.createStatement();
        rs=st.executeQuery(sql);   
       
        while(rs.next()){
        usuarioBD=rs.getInt("idCuenta");/*deben llamarse exactamente igual a como esta en la tabla*/
       /* b=rs.getString("idPassCuenta"); deben llamarse exactamente igual a como esta en la tabla*/
        }
  usuarioInt=Integer.valueOf(usuarioCajaTexto);/*Convierte lo de la el usuario ingresado en la caja de texto y lo convierte
  a int para poderlo comparar con el de la base de datos*/
    if(usuarioInt==usuarioBD && usuarioBD!=0)
    {
        verificacion=true;
    }else 
        verificacion=false;
   
    }catch(SQLException e){}
   
    }
    
    private void cajaTextoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaTextoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaTextoUsuarioActionPerformed

    private void botonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLoginActionPerformed
       verificarLogin();
       
        if(Boolean.TRUE.equals(verificacion)){
            vistaMenu menu = new vistaMenu();
            this.setVisible(false);
        }
        else JOptionPane.showMessageDialog(jPanel1,"Datos Erroneos, ingreselos de nuevo");
// TODO add your handling code here:
    }//GEN-LAST:event_botonLoginActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonLogin;
    private javax.swing.JPasswordField cajaTextoContrasenna;
    private javax.swing.JTextField cajaTextoUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelContrasenna;
    private javax.swing.JLabel labelFotoUsuario;
    private javax.swing.JLabel labelImagen1;
    private javax.swing.JLabel labelImagen2;
    private javax.swing.JLabel labelIniciarSesion;
    private javax.swing.JLabel labelUsuario;
    // End of variables declaration//GEN-END:variables
}
