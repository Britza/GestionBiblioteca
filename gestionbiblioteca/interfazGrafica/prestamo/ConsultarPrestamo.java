/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbiblioteca.interfazGrafica.prestamo;

import gestionbiblioteca.ficheros.Escritura;
import gestionbiblioteca.interfazGrafica.socios.ListaUsuario;
import gestionbiblioteca.librosPrestados.LibrosPrestados;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author britz
 */
public class ConsultarPrestamo extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultarPrestamo
     */
        ArrayList<LibrosPrestados>prestamos =new ArrayList<>();

    public ConsultarPrestamo() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        Connection con = null;
   
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/gestiondebiblioteca", "root", "");
              Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM prestamos");
              if (rs.next()) {
            do {

              


                    String[] fila = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)};
                    modelo.addRow(fila);

                 } while (rs.next());
              }
                    else
                    JOptionPane.showMessageDialog(null, "No hay prestamos");
                jLabel1.setText("");

           
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarPrestamo.class.getName()).log(Level.SEVERE, null, ex);
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
        jTable = new javax.swing.JTable();
        tfBuscar = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        tfNombre2 = new javax.swing.JTextField();
        tfApellidos2 = new javax.swing.JTextField();
        tfDni2 = new javax.swing.JTextField();
        tfTitulo2 = new javax.swing.JTextField();
        tfPrestamo2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bModificar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btActualizar = new javax.swing.JButton();

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "ISBN", "Fecha Prestamo", "Nombre", "Apellidos", "DNI"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        tfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBuscarActionPerformed(evt);
            }
        });

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        tfTitulo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTitulo2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Titulo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("ISBN");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Fecha Prestamo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Apellidos");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("DNI");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Nombre");

        bModificar.setText("Modificar");
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Colsulta Prestamo");

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btActualizar.setText("Actualizar");
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(296, 296, 296)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bBuscar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfPrestamo2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(72, 72, 72)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(52, 52, 52)
                                                .addComponent(tfDni2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel4))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfApellidos2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(bModificar)
                                .addGap(119, 119, 119)
                                .addComponent(jButton1)
                                .addGap(81, 81, 81)
                                .addComponent(btActualizar)))
                        .addGap(0, 89, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar)
                    .addComponent(jLabel2))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfApellidos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfPrestamo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(tfDni2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bModificar)
                    .addComponent(jButton1)
                    .addComponent(btActualizar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfTitulo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTitulo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTitulo2ActionPerformed

    private void tfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBuscarActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestiondebiblioteca","root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM prestamos WHERE Isbn='"+tfBuscar.getText()+"'");
            
            
            if(rs.next()){
                
               tfTitulo2.setText("Titulo");
               tfPrestamo2.setText(rs.getString("FechaPrestamo"));
               tfNombre2.setText(rs.getString("Nombre"));
               tfApellidos2.setText(rs.getString("Apellidos"));
               tfDni2.setText(rs.getString("Dni"));
               
               
               }else{
                JOptionPane.showMessageDialog(null,"El libro no se encuentra en los registros de los prestamos");
                tfDni2.setText("");
           

            }
            
                
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tfBuscarActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
          try {
            // TODO add your handling code here:
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestiondebiblioteca","root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM prestamos WHERE Isbn='"+tfBuscar.getText()+"'");
            
            
            if(rs.next()){
                
               tfTitulo2.setText(rs.getString("Titulo"));
               tfNombre2.setText(rs.getString("Nombre"));
               tfApellidos2.setText(rs.getString("Apellidos"));
               tfPrestamo2.setText(rs.getString("FechaPrestamo"));
               tfDni2.setText(rs.getString("Dni"));
               
               
               }else{
                JOptionPane.showMessageDialog(null,"El libro no está registrado");
                tfBuscar.setText("");
           

            }
            
                
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarPrestamo.class.getName()).log(Level.SEVERE, null, ex);
    }//GEN-LAST:event_bBuscarActionPerformed
    }
    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        // TODO add your handling code here:
                
       String sql;
       Connection con;
       String isbn=tfBuscar.getText().trim();
       int atopado = 0;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestiondebiblioteca","root","");
            sql= "UPDATE prestamos SET Titulo=?, FechaPrestamo=? , Nombre=?, Apellidos=? ,Dni=? WHERE Isbn='"+isbn+"'";
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setString(1,tfTitulo2.getText().trim());
            ps.setString(2,tfPrestamo2.getText().trim());
            ps.setString(3,tfNombre2.getText().trim());
            ps.setString(4,tfApellidos2.getText().trim());
            ps.setString(5,tfDni2.getText().trim());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"El registro ha sido modificado");
               
        for (int i = 0; i < prestamos.size(); i++) {
            if (isbn.equalsIgnoreCase(prestamos.get(i).getIsbn())) {
                atopado = 1;
                prestamos.get(i).setTitulo(tfTitulo2.getText());
                prestamos.get(i).setFechaPrestamo(tfPrestamo2.getText());
                prestamos.get(i).setNombre(tfNombre2.getText());
                prestamos.get(i).setApellidos(tfApellidos2.getText());
                prestamos.get(i).setDni(tfDni2.getText());
            }

        }
        Escritura.BorrarFichero("rexitroPrestamos");
        Escritura.escribirObxetos("rexitroPrestamos", prestamos);
        if (atopado == 0) {

            System.out.println("O libro non está na lista de prestamos");
        }
            

        } catch (SQLException ex) {
            Logger.getLogger(ConsultarPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_bModificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         String sql;
       Connection con;
       boolean atopado=false;
       String isbn = tfBuscar.getText();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestiondebiblioteca","root","");
            sql= "delete from prestamos where Isbn = ?";
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setString(1,tfBuscar.getText().trim());
            ps.executeUpdate();
            tfBuscar.setText("");
            tfTitulo2.setText("");
            tfPrestamo2.setText("");
            tfNombre2.setText("");
            tfApellidos2.setText("");
            tfDni2.setText("");
            JOptionPane.showMessageDialog(null,"El libro  ha sido eliminado de la base de datos");
            Iterator it = prestamos.iterator();
            while(it.hasNext()){ //dice si hay elementos en la lista
            LibrosPrestados al = (LibrosPrestados) it.next();//el next devuelve un elemento de tipo object
            //if(al.getDni().equalsIgnoreCase(dni))
            if (((LibrosPrestados) it.next()).getIsbn().equalsIgnoreCase(isbn)){
                it.remove();
                atopado=true;
            }
        }
        if (atopado==false){
            System.out.println("Non está na lista");
        }


        } catch (SQLException ex) {
            Logger.getLogger(ConsultarPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed
        // TODO add your handling code here:
             try {

            DefaultTableModel modelo = (DefaultTableModel)jTable.getModel();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/gestiondebiblioteca","root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM prestamos");
            modelo.setRowCount(0);

            do{

                if(rs.next()){


                    String[] fila= {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)};
                    modelo.addRow(fila);

                } else
                    JOptionPane.showMessageDialog(null,"El libro no se ha encontrado");
                tfBuscar.setText("");

            }while(rs.next());

        } catch (SQLException ex) {
            Logger.getLogger(ListaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_btActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bModificar;
    private javax.swing.JButton btActualizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField tfApellidos2;
    private javax.swing.JTextField tfBuscar;
    private javax.swing.JTextField tfDni2;
    private javax.swing.JTextField tfNombre2;
    private javax.swing.JTextField tfPrestamo2;
    private javax.swing.JTextField tfTitulo2;
    // End of variables declaration//GEN-END:variables
}