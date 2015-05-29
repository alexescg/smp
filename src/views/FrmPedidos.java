package views;

import controllers.Pedidos;
import controllers.PedidosProductos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.BaseModel;
import models.Pedido;
import models.Producto;
import oraclegeneral.Conexion;

/**
 * JFrame donde se agregan pedidos a la base de datos.
 * @author Daniela Santillanes Castro
 * @version 1.0
 * @since 26/05/2015
 */
public class FrmPedidos extends BaseFrame {

    private static Integer cantidad;
    private static String fechaEntrega;
    private Double total;
    private static List<Producto> productos = new ArrayList<Producto>();
    private DefaultTableModel model;
    private final static String id = "pedidos_seq.nextval";

    /**
     * Creates new form Login
     */
    public FrmPedidos() {
        initComponents();
        setTitle("Agregar Pedidos");
        super.iniciarVentana(panel);
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
        txtFechaEntrega = new javax.swing.JTextField();
        btnAgregarPro = new javax.swing.JButton();
        cmdAgregarP = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Hacer Pedido");

        jLabel3.setText("Fecha de Entrega: ");

        txtFechaEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaEntregaActionPerformed(evt);
            }
        });

        btnAgregarPro.setText("Agregar Producto");
        btnAgregarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProActionPerformed(evt);
            }
        });

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
                "Nombre del Producto", "Precio unitario", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        lblTotal.setText("0");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(166, 166, 166)
                                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addComponent(cmdAgregarP)
                                .addGap(18, 18, 18)))
                        .addComponent(btnCerrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarPro))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarPro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmdAgregarP)
                                .addGap(49, 49, 49))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnCerrar)
                        .addContainerGap())))
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
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAgregarPActionPerformed
        List<Pedido> pedidos= new ArrayList<>();
        Integer idPedido;
        if (Pedido.isFecha(txtFechaEntrega.getText()) 
                && Pedido.isNumeric(lblTotal.getText())) {
            fechaEntrega = txtFechaEntrega.getText();
            total = Double.parseDouble(lblTotal.getText());
            Pedidos.executeQuery(Conexion.getDBConexion(), String.format("insert into pedidos(id_pedido, fecha_pedido, total, fecha_entrega, estado) values(%s, %s, %s, (TO_DATE('%s', 'dd/mm/yyyy')), 'HACIENDO')", id, BaseModel.CURRENT_TIMESTAMP, total, fechaEntrega));
            pedidos= (List<Pedido>) Pedidos.select(Conexion.getDBConexion(), "select * from pedidos", Pedido.class);
            idPedido = pedidos.get(pedidos.size()-1).getId_pedido().intValue();
            productos.stream().forEach((producto)->{
                PedidosProductos.executeQuery(Conexion.getDBConexion(), String.format("insert into pedidos_producto values (%s,%s,%s)", idPedido, producto.getId_producto(), producto.getCantidad_disponible()));
                System.out.println("Si entro");
            });
            JOptionPane.showMessageDialog(rootPane, "Añadido exitosamente!");
            txtFechaEntrega.setText(Pedido.VACIO);
            
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Invalido");
        }
        
        
        
    }//GEN-LAST:event_cmdAgregarPActionPerformed

    private void txtFechaEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaEntregaActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnAgregarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProActionPerformed
        FrmPedidosProductos frmAgregarProducto = new FrmPedidosProductos(this);
        frmAgregarProducto.setVisible(true);
    }//GEN-LAST:event_btnAgregarProActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            new FrmPedidos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPro;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton cmdAgregarP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtFechaEntrega;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo para que te aparezcan los datos que recien acabas de agregar a la
     * tabla.
     */
    public void refrescarTabla(){
        List<String> list = new ArrayList<String>();
        list.add(productos.get(productos.size()-1).getNombre());
        list.add(productos.get(productos.size()-1).getPrecio_unitario().toString());
        list.add(productos.get(productos.size()-1).getCantidad_disponible().toString());
        model.addRow(list.toArray());
        total = Double.parseDouble(lblTotal.getText()) + (productos.get(productos.size()-1).getPrecio_unitario().floatValue() * Double.parseDouble(cantidad.toString()));
        lblTotal.setText(String.valueOf(total));
        tblProductos.setModel(model);
    }
    
    /**
     * Metodo que agrega un producto a la ventana actual dentro de la lista local.
     * @param productosNueva lista de productos que se manda del frame AgregarProducto con el nuevo producto
     * agregado
     * @param cantidad cantidad pedida del producto en cuestion.
     */
    public static void agregarProductos(List<Producto> productosNueva, Integer cantidad) {
        productos = productosNueva;
        cantidad = cantidad;
    }

    /**
     * Metodo donde obtienes una lista de productos.
     * @return productos que es la lista de productos.
     */
    public List<Producto> getProductos() {
        return productos;
    }

    /**
     * Método para asignar productos a una lista de productos.
     * @param productos que es la lista de productos.
     */
    public void setProductos(List<Producto> productos) {
        FrmPedidos.productos = productos;
    }
    
    /**
     * Método para obtener la cantidad que pidieron de ese producto.
     * @return cantidad que es la cantidad que se requiere.
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * Método para asignar la cantidad que pidieron de ese producto.
     * @param aCantidad que es la cantidad que se requiere
     */
    public void setCantidad(Integer aCantidad) {
        cantidad = aCantidad;
    }
    
}
