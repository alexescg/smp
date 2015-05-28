package views;

import controllers.BaseController;
import controllers.Pedidos;
import controllers.PedidosProductos;
import controllers.Productos;
import controllers.Proveedores;
import java.awt.Dialog;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.BaseModel;
import models.Pedido;
import models.PedidoProducto;
import models.Producto;
import models.Proveedor;
import oraclegeneral.Conexion;

/**
 * JFrame donde se agregan pedidos a la base de datos.
 * @author Daniela Santillanes Castro
 * @version 1.0
 * @since 26/05/2015
 */
public class FrmVerPedidos extends BaseFrame {

    private String query = ("(0");
    private static Integer cantidad;
    private static String fechaEntrega;
    private Double total;
    private DefaultTableModel model;
    private final static String id = "pedidos_seq.nextval";
    List<PedidoProducto> pedidosProducto;
    List<Pedido> pedidosCombo;
    List<Producto> productos;
    /**
     * Creates new form Login
     */
    
    public FrmVerPedidos() {
        initComponents();
        super.iniciarVentana(panel);
        pedidosCombo =(List<Pedido>) Pedidos.select(Conexion.getDBConexion(), "select * from pedidos", Pedido.class);
        try {
            Pedidos.fillCombo(comboPedidos, pedidosCombo, "id_pedido", Pedido.class);
        } catch (Exception ex) {
            Logger.getLogger(FrmPedidosProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        model = (DefaultTableModel) tblProductos.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmdAgregarP = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();
        lblFechaEntrega = new javax.swing.JLabel();
        comboPedidos = new javax.swing.JComboBox();
        btnRefrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ver pedido");

        jLabel3.setText("Fecha de Entrega: ");

        cmdAgregarP.setText("Agregar");
        cmdAgregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAgregarPActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jLabel4.setText("Total:");

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del Producto", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        lblTotal.setText("0");

        lblFechaEntrega.setText("jLabel2");

        comboPedidos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPedidosActionPerformed(evt);
            }
        });

        btnRefrescar.setText("Refrescar Tabla");
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(comboPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnRefrescar))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(lblFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(166, 166, 166)
                                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(cmdAgregarP)
                                        .addGap(147, 147, 147)
                                        .addComponent(btnCerrar))
                                    .addComponent(jLabel4))))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefrescar))
                .addGap(14, 14, 14)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblFechaEntrega))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar)
                    .addComponent(cmdAgregarP))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAgregarPActionPerformed
//        List<Pedido> pedidos= new ArrayList<>();
//        Integer idPedido, productosSize;
//        if (Pedido.isFecha(txtFechaEntrega.getText()) 
//                && Pedido.isNumeric(lblTotal.getText())) {
//            fechaEntrega = txtFechaEntrega.getText();
//            total = Double.parseDouble(lblTotal.getText());
//            Pedidos.executeQuery(Conexion.getDBConexion(), String.format("insert into pedidos(id_pedido, fecha_pedido, total, fecha_entrega, estado) values(%s, %s, %s, (TO_DATE('%s', 'dd/mm/yyyy')), 'HACIENDO')", id, BaseModel.CURRENT_TIMESTAMP, total, fechaEntrega));
//            pedidos= (List<Pedido>) Pedidos.select(Conexion.getDBConexion(), "select * from pedidos", Pedido.class);
//            idPedido = pedidos.get(pedidos.size()-1).getId_pedido().intValue();
//            productos.stream().forEach((producto)->{
//                PedidosProductos.executeQuery(Conexion.getDBConexion(), String.format("insert into pedidos_producto values (%s,%s,%s)", idPedido, producto.getId_producto(), producto.getCantidad_disponible()));
//                System.out.println("Si entro");
//            });
//            JOptionPane.showMessageDialog(rootPane, "Añadido exitosamente!");
//            txtFechaEntrega.setText(Pedido.VACIO);
//            
//            
//        }else{
//            JOptionPane.showMessageDialog(rootPane, "Invalido");
//        }
//        
        
        
    }//GEN-LAST:event_cmdAgregarPActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void comboPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPedidosActionPerformed
        
    }//GEN-LAST:event_comboPedidosActionPerformed

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        accionRefrescar();
    }//GEN-LAST:event_btnRefrescarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVerPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVerPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVerPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVerPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmVerPedidos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JButton cmdAgregarP;
    private javax.swing.JComboBox comboPedidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFechaEntrega;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables

    public void accionRefrescar(){
        lblFechaEntrega.setText(pedidosCombo.get(comboPedidos.getSelectedIndex()).getFecha_entrega().toString());
        total = pedidosCombo.get(comboPedidos.getSelectedIndex()).getTotal().doubleValue();
        lblTotal.setText(String.valueOf(total));
        pedidosProducto =(List<PedidoProducto>) PedidosProductos.select(Conexion.getDBConexion(), String.format("select * from pedidos_producto where id_pedido=%s", pedidosCombo.get(comboPedidos.getSelectedIndex()).getId_pedido()), PedidoProducto.class);
        pedidosProducto.stream().forEach((pedidoPro)->{
            query= query + (","+ pedidoPro.getId_producto().toString());
            System.out.println(query);
        });
        query+=")";
        productos=(List<Producto>) Productos.select(Conexion.getDBConexion(), String.format("select * from productos where id_producto in %s", query), Producto.class);
        mostrarTabla();
    }
    public void mostrarTabla(){
        pedidosProducto.stream().forEach((tablaProductos)->{
            List<String> list = new ArrayList<String>();
            productos.stream().forEach((producto)->{
                if(producto.getId_producto().equals(tablaProductos.getId_producto())){
                    list.add(producto.getNombre());
                }
            });
            list.add(tablaProductos.getCantidad().toString());
            model.addRow(list.toArray());
            
               
        });
        
            tblProductos.setModel(model);
       
    }
    
    
   

    public List<Producto> getProductos() {
        return productos;
    }

    
    
    
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer aCantidad) {
        cantidad = aCantidad;
    }
    
}
