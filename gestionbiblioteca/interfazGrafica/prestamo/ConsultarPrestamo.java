/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbiblioteca.interfazGrafica.prestamo;

import gestionbiblioteca.ficheros.Escritura;
import gestionbiblioteca.interfazGrafica.socios.ListaUsuario;
import gestionbiblioteca.librosPrestados.Libros;
import gestionbiblioteca.librosPrestados.LibrosPrestados;
import gestionbiblioteca.librosPrestados.Socios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import libreria.Metodos;

/**
 *
 * @author britz
 */
public class ConsultarPrestamo extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultarPrestamo
     */
        //ArrayList<LibrosPrestados>prestamos =new ArrayList<>();
        
    public ConsultarPrestamo() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        Connection con = null;
   
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/gestiondebiblioteca", "root", "");
              Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM prestamos");
          //  modelo.setRowCount(0);
              if (rs.next()) {
            do {

              


                    String[] fila = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7)};
                    modelo.addRow(fila);

                 } while (rs.next());
              }
                    else
                  
                  //  JOptionPane.showMessageDialog(null, "No hay prestamos");
                tfCodigo.setText("");

           
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
        jLabel9 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "ISBN", "Fecha Prestamo", "Nombre", "Apellidos", "DNI", "Codigo"
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

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Título");

        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("Código");

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
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(35, 35, 35)
                                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bBuscar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(tfTitulo2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                                .addComponent(tfPrestamo2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                                            .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel5))
                                                .addGap(27, 27, 27))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfApellidos2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfDni2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(bModificar)
                                .addGap(115, 115, 115)
                                .addComponent(jButton1)
                                .addGap(129, 129, 129)
                                .addComponent(btActualizar)))
                        .addGap(0, 102, Short.MAX_VALUE)))
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
                    .addComponent(bBuscar)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPrestamo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(tfApellidos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(tfNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDni2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(66, 66, 66)
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
                
               tfTitulo2.setText(rs.getString("Titulo"));
               tfPrestamo2.setText(rs.getString("FechaPrestamo"));
               tfNombre2.setText(rs.getString("Nombre"));
               tfApellidos2.setText(rs.getString("Apellidos"));
               tfDni2.setText(rs.getString("Dni"));
               
               
               }else{
                Metodos.mostrarPorVentana("El libro no se encuentra en los registros de los prestamos");
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
            ResultSet rs = stmt.executeQuery("SELECT * FROM prestamos WHERE Codigo='"+tfCodigo.getText()+"'");
            
            
            if(rs.next()){
                
               tfTitulo2.setText(rs.getString("Titulo"));
               tfNombre2.setText(rs.getString("Nombre"));
               tfApellidos2.setText(rs.getString("Apellidos"));
               tfPrestamo2.setText(rs.getString("FechaPrestamo"));
               tfDni2.setText(rs.getString("Dni"));
               tfBuscar.setText(rs.getString("Isbn"));
               
               }else{
                Metodos.mostrarPorVentana("El libro no está registrado");
                tfCodigo.setText("");
           

            }
            
                
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarPrestamo.class.getName()).log(Level.SEVERE, null, ex);
    }//GEN-LAST:event_bBuscarActionPerformed
    }
    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        // TODO add your handling code here:
       String email = null;
       String direccion = null;
       String telefono =null; 
       String autor =null;
       String genero =null;
       String idioma =null;
       int unidades =0;
       String sql;
       Connection con;
       String codigo=tfCodigo.getText().trim();
       int atopado = 0;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestiondebiblioteca","root","");
            sql= "UPDATE prestamos SET Titulo=?, FechaPrestamo=? , Nombre=?, Apellidos=? ,Dni=? ,Isbn=? WHERE Codigo='"+codigo+"'";
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setString(1,tfTitulo2.getText().trim());
            ps.setString(2,tfPrestamo2.getText().trim());
            ps.setString(3,tfNombre2.getText().trim());
            ps.setString(4,tfApellidos2.getText().trim());
            ps.setString(5,tfDni2.getText().trim());
            ps.setString(6,tfBuscar.getText().trim());
            ps.executeUpdate();
            Metodos.mostrarPorVentana("El registro ha sido modificado");
            Statement stmt = con.createStatement();
            ResultSet rs1 =stmt.executeQuery("SELECT Email, Direccion, Telefono FROM usuarios WHERE DNI IN (SELECT Dni FROM prestamos WHERE Codigo='"+tfCodigo.getText()+"')");
            if(rs1.next()){
                email = rs1.getString("Email");
                direccion =rs1.getString("Direccion");
                telefono = rs1.getString("Telefono");
            }
            ResultSet rs2 = stmt.executeQuery("SELECT Autor, Genero,Idioma,Unidades FROM libros WHERE ISBN IN  (SELECT Isbn FROM prestamos WHERE Codigo='"+tfCodigo.getText()+"')");

            if (rs2.next()){
                autor = rs2.getString("Autor");
                genero = rs2.getString("Genero");
                idioma = rs2.getString("Idioma");
                unidades =rs2.getInt("Unidades");
                
            }
             
       
       for(LibrosPrestados al : InsertarPrestamo.prestamos){
           if(al.getCodigo().equalsIgnoreCase(codigo)){
                atopado=1;
                Libros libro =new Libros(tfTitulo2.getText(),tfBuscar.getText(),autor,genero,idioma,unidades);
                Socios socio =new Socios(tfNombre2.getText(),tfApellidos2.getText(),tfDni2.getText(),email,direccion,telefono);
                al.setLibros(libro);
                al.setFechaPrestamo(tfPrestamo2.getText());
                al.setSocios(socio);
                Escritura.BorrarFichero("rexistroPrestamos");
                Escritura.escribirObxetos("rexistroPrestamos",InsertarPrestamo.prestamos);
            }

        }

        
        if (atopado == 0) {
            Metodos.mostrarPorConsola("O libro non está na lista de prestamos");
        }
            

        } catch (SQLException ex) {
            Logger.getLogger(ConsultarPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_bModificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
      String sql;
      Connection con;
      Iterator it = InsertarPrestamo.prestamos.iterator();
      boolean atopado=false;
       String codigo = tfCodigo.getText();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestiondebiblioteca","root","");
            Statement stmt = con.createStatement();
            sql= "delete from prestamos where Codigo = ?";
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setString(1,tfCodigo.getText().trim());
            ps.executeUpdate();
            tfCodigo.setText("");
            tfTitulo2.setText("");
            tfPrestamo2.setText("");
            tfNombre2.setText("");
            tfApellidos2.setText("");
            tfDni2.setText("");
            String isbn =tfBuscar.getText();
            stmt.executeUpdate("UPDATE libros SET Unidades = (Unidades + 1) WHERE ISBN='"+isbn+"'");
            tfBuscar.setText("");
            Metodos.mostrarPorVentana("El libro  ha sido eliminado de la base de datos");
       
            while(it.hasNext()){ //dice si hay elementos en la lista
            //LibrosPrestados al = (LibrosPrestados) it.next();//el next devuelve un elemento de tipo object
            if (((LibrosPrestados) it.next()).getCodigo().equalsIgnoreCase(codigo)){
                it.remove();
                atopado=true;
                Metodos.mostrarPorConsola("El libro ha sido eliminado del ArrayList");
            Escritura.BorrarFichero("rexistroPrestamos");
            Escritura.escribirObxetos("rexistroPrestamos",InsertarPrestamo.prestamos);
            }
            
        }
        if (atopado==false){
            Metodos.mostrarPorConsola("Non está na lista");
        }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed
        // TODO add your handling code here:
             try {

            DefaultTableModel modelo = (DefaultTableModel)jTable.getModel();
            modelo.setRowCount(0);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/gestiondebiblioteca","root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM prestamos");

            

                if(rs.next()){
                 do{

                    String[] fila= {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)};
                    modelo.addRow(fila);
                    }while(rs.next());
                 Metodos.mostrarPorVentana("La base de datos ha sido actualizada");

                } else
                    Metodos.mostrarPorVentana("El libro no se ha encontrado");
                tfBuscar.setText("");

            

        } catch (SQLException ex) {
            Logger.getLogger(ListaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_btActualizarActionPerformed

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bModificar;
    private javax.swing.JButton btActualizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField tfApellidos2;
    private javax.swing.JTextField tfBuscar;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDni2;
    private javax.swing.JTextField tfNombre2;
    private javax.swing.JTextField tfPrestamo2;
    private javax.swing.JTextField tfTitulo2;
    // End of variables declaration//GEN-END:variables
}
