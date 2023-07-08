/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import conection.Conexion;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRSubreport;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Usuario
 */
public class factura extends javax.swing.JFrame {
    Conexion conexion = new Conexion();
    Connection co;
    DefaultTableModel modeloTabla = new DefaultTableModel();
    private float pre;
    private int cantidad;
    private ArrayList lista_codigos = new ArrayList();
    /**
     * Creates new form factura
     */
    public factura() {
        initComponents();
        llenarTabla();
        this.jtxtIva.setText("12");
        this.jtxtIva.setEditable(false);
        this.setLocationRelativeTo(null);
    }
    public void llenarTabla(){
        String [] val = {"Descripcion", "Cantidad", "Precio Unitario", "Importe"};
        for (int i = 0; i < val.length; i++) {
            modeloTabla.addColumn(val[i]);
        }
        this.tabla.setModel(modeloTabla);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtNumFac = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtFecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtCedula = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxtApellido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtxtDireccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtxtSubTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtIva = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtTotal = new javax.swing.JTextField();
        jbtnFacturar = new javax.swing.JButton();
        jbtnResetear = new javax.swing.JButton();
        producto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("# Factura:");

        jLabel2.setText("Fecha:");

        jLabel6.setText("Cedula:");

        jtxtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCedulaActionPerformed(evt);
            }
        });

        jLabel7.setText("Nombre:");

        jtxtNombre.setEditable(false);

        jLabel8.setText("Apellido:");

        jtxtApellido.setEditable(false);

        jLabel9.setText("Dirección:");

        jtxtDireccion.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtxtNumFac, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtDireccion)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtNumFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jtxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jtxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jtxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel3.setText("SubTotal: ");

        jLabel4.setText("IVA:");

        jLabel5.setText("Total:");

        jbtnFacturar.setBackground(new java.awt.Color(0, 123, 255));
        jbtnFacturar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnFacturar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnFacturar.setText("Facturar");
        jbtnFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFacturarActionPerformed(evt);
            }
        });

        jbtnResetear.setBackground(new java.awt.Color(0, 123, 255));
        jbtnResetear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnResetear.setForeground(new java.awt.Color(255, 255, 255));
        jbtnResetear.setText("Resetear");

        producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoActionPerformed(evt);
            }
        });
        producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                productoKeyReleased(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Codigo Producto:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(producto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbtnFacturar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnResetear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton1))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtSubTotal)
                            .addComponent(jtxtIva)
                            .addComponent(jtxtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                        .addGap(25, 25, 25))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnFacturar))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnResetear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFacturarActionPerformed
       //this.JJ.setText("ABC123");
       //this.JJ.requestFocus();
       for (int i = 0; i < lista_codigos.size(); i++) {
            System.out.println("Codigos: " +lista_codigos.get(i));
        }
    }//GEN-LAST:event_jbtnFacturarActionPerformed

    private void productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoActionPerformed
        //recuperarDatos_Productos();
    }//GEN-LAST:event_productoActionPerformed

    private void jtxtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCedulaActionPerformed
        recuperarDatos_Clientes();
    }//GEN-LAST:event_jtxtCedulaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
               try {
            // TODO add your handling code here:
            Conexion cn = new Conexion();
            URL resourceURL = getClass().getClassLoader().getResource("reporte/report1.jrxml");
            URL resourcesclav = getClass().getClassLoader().getResource("reporte/");
             
            Map parametros = new HashMap();
            parametros.put("NFactura", jtxtNumFac.getText());
             parametros.put("SUBREPORT_DIR", resourcesclav.getPath());
            JasperReport reporte =JasperCompileManager.compileReport(resourceURL.openStream());
            JasperPrint imprimir = JasperFillManager.fillReport(reporte, parametros,cn.getConexion());
            JasperViewer.viewReport(imprimir);
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void productoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productoKeyReleased
        if (evt.getKeyChar() == '\n') { // Verificar si se presionó la tecla "Enter"
                    String barcode = producto.getText();
                    // Aquí puedes realizar cualquier acción con el código de barras leído, como procesarlo o mostrarlo en otro lugar
                    System.out.println("Código de barras: " + barcode);
                    recuperarDatos_Productos();
                    this.producto.setText(null);
                }
    }//GEN-LAST:event_productoKeyReleased
    
    //////////Funcion para traer los datos del Producto/////////////
    public void recuperarDatos_Productos(){
        String sql = "Select * from PRODUCTOS WHERE COD_BAR_PRO=?";
        Object []list = new Object[5];
        Connection con = conexion.getConexion();
        //Statement st = null;
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.producto.getText());
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                list[4]=(rs.getString(1));
                list[0]=(rs.getString(2));
                list[2]= pre =(rs.getFloat(3));
                 
                
            }
            list[1] = cantidad  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos"));
            list[3] = cantidad * pre;
            verificarProductosFilas(list);
            //this.modeloTabla.addRow(list);
            System.out.println(pre);
            System.out.println(cantidad);
            
            this.jbtnFacturar.requestFocusInWindow();
            this.jtxtSubTotal.setText(String.valueOf(this.sumSubtotal()));
            //this.jtxtSubTotal.setText(String.valueOf(cantidad * pre));
            //this.jtxtTotal.setText(String.valueOf((Float.parseFloat(this.jtxtSubTotal.getText()) * Float.parseFloat(this.jtxtIva.getText()))/100)+
                    //Float.parseFloat(this.jtxtSubTotal.getText()));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al recuperar la lista");
           }
    }
    //////////Funcion para traer los datos del cliente/////////////
    public void recuperarDatos_Clientes(){
        String sql = "SELECT * FROM CLIENTES WHERE CED_CLI=?";
        Object []list = new Object[5];
        Connection con = conexion.getConexion();
        //Statement st = null;
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.jtxtCedula.getText());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            list[0] = (rs.getString(1));    
            this.jtxtNombre.setText(rs.getString(2));
            this.jtxtApellido.setText(rs.getString(3));
            this.jtxtDireccion.setText(rs.getString(4));
            this.jbtnFacturar.requestFocusInWindow();
            }
                
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al recuperar la lista");
           }
    }
    //////////Funcion para sumar los subtotales/////////////
    
    public float sumSubtotal(){
        float sumSub = 0;
        for (int i = 0; i < this.modeloTabla.getRowCount(); i++) {
            
                sumSub += Float.parseFloat(this.modeloTabla.getValueAt(i, 3).toString());
                
        }
        return sumSub;
    }
    
    
    //////////Funcion para verificar los productos de la tabla/////////////
    public void verificarProductosFilas(Object [] datos){
        boolean productExists = false;
        for (int i = 0; i < this.modeloTabla.getRowCount(); i++) {
            if (this.modeloTabla.getValueAt(i, 0).equals(datos[0])) {
                // Si el producto existe, suma la cantidad
                int cantidadActual = Integer.parseInt(this.modeloTabla.getValueAt(i, 1).toString());
                float montoActual = Float.parseFloat(this.modeloTabla.getValueAt(i, 3).toString());
                this.modeloTabla.setValueAt(cantidadActual + Integer.parseInt(datos[1].toString()), i, 1);
                this.modeloTabla.setValueAt(montoActual + Float.parseFloat(datos[3].toString()), i, 3);
                productExists = true;
                break;
            }
        }
        if(!productExists){
            lista_codigos.add(datos[4]);
            this.modeloTabla.addRow(datos);
        }
    }
    
    
    
    //////////Funcion para enviar los datos de la factura/////////////
    
    public void enviarDatosFactura(){
        String Sql = "INSERT INTO FACTURAS (FEC_FAC, CED_CLI, TOTAL) VALUES(?,?,?)";
        String Sql1 = "INSERT INTO (FEC_FAC, CED_CLI, TOTAL)";
    }
    
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
            java.util.logging.Logger.getLogger(factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnFacturar;
    private javax.swing.JButton jbtnResetear;
    private javax.swing.JTextField jtxtApellido;
    private javax.swing.JTextField jtxtCedula;
    private javax.swing.JTextField jtxtDireccion;
    private javax.swing.JTextField jtxtFecha;
    private javax.swing.JTextField jtxtIva;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtNumFac;
    private javax.swing.JTextField jtxtSubTotal;
    private javax.swing.JTextField jtxtTotal;
    private javax.swing.JTextField producto;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
