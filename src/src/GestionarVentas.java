/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author vival
 */
public class GestionarVentas extends javax.swing.JPanel {

    DefaultListModel<Producto> modeloLista;
    DefaultTableModel modeloTablaAlmacen;
    static String[] cabeceraTablaAlmacen = {"ID", "Nombre", "Precio", "Existencia", "Stock", "Unidad de Medida"};
    static double total = 0;
    static String pagoS = "0";
    /**
     * Creates new form GestionarVentas
     */
    public GestionarVentas() {
        initComponents();
        GrupoBtnRadio.add(btnRadioID);
        GrupoBtnRadio.add(btnRadioCantidad);
        GrupoBtnRadio.add(btnRadioNombre);
        GrupoBtnRadio.add(btnRadioPrecio);
        
        btnRadioID.setSelected(true);
        
        modeloTablaAlmacen = new DefaultTableModel(null,cabeceraTablaAlmacen);
        tablaAlmacen.setModel(modeloTablaAlmacen);
        tablaAlmacen.getTableHeader().setReorderingAllowed(false);
        modeloLista = new DefaultListModel<Producto>();
        ListaVenta.setModel(modeloLista);
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBtnRadio = new javax.swing.ButtonGroup();
        txtPago = new javax.swing.JTextField();
        searchBar = new javax.swing.JTextField();
        scrollSeleccionado = new javax.swing.JScrollPane();
        ListaVenta = new javax.swing.JList<>();
        btnClean = new javax.swing.JButton();
        btnAgregarlist2 = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();
        labelTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnNewC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlmacen = new javax.swing.JTable();
        ConsCompra = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRadioID = new javax.swing.JRadioButton();
        btnRadioNombre = new javax.swing.JRadioButton();
        btnRadioPrecio = new javax.swing.JRadioButton();
        btnRadioCantidad = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtCambio = new javax.swing.JTextField();

        setLayout(null);

        txtPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPagoKeyTyped(evt);
            }
        });
        add(txtPago);
        txtPago.setBounds(50, 570, 490, 30);

        searchBar.setText("Buscar");
        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchBarKeyTyped(evt);
            }
        });
        add(searchBar);
        searchBar.setBounds(540, 40, 570, 24);

        ListaVenta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        scrollSeleccionado.setViewportView(ListaVenta);

        add(scrollSeleccionado);
        scrollSeleccionado.setBounds(0, 0, 540, 520);

        btnClean.setText("X");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });
        add(btnClean);
        btnClean.setBounds(1120, 40, 50, 32);

        btnAgregarlist2.setText("Agregar");
        btnAgregarlist2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarlist2ActionPerformed(evt);
            }
        });
        add(btnAgregarlist2);
        btnAgregarlist2.setBounds(540, 110, 90, 32);

        btnQuitar.setText("Quitar");
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });
        add(btnQuitar);
        btnQuitar.setBounds(540, 70, 90, 32);

        labelTotal.setText("Total");
        add(labelTotal);
        labelTotal.setBounds(0, 550, 28, 16);

        txtTotal.setEditable(false);
        txtTotal.setText("$");
        add(txtTotal);
        txtTotal.setBounds(50, 540, 490, 30);

        btnNewC.setText("Finalizar compra");
        btnNewC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewCActionPerformed(evt);
            }
        });
        add(btnNewC);
        btnNewC.setBounds(0, 630, 540, 32);

        jLabel1.setText("Pago");
        add(jLabel1);
        jLabel1.setBounds(0, 580, 29, 16);

        tablaAlmacen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaAlmacen);

        add(jScrollPane1);
        jScrollPane1.setBounds(540, 150, 710, 510);

        ConsCompra.setText("Consultar Ventas");
        ConsCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsCompraActionPerformed(evt);
            }
        });
        add(ConsCompra);
        ConsCompra.setBounds(1030, 90, 140, 32);

        jLabel3.setText("Filtrar por:");
        add(jLabel3);
        jLabel3.setBounds(640, 70, 80, 16);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gestionar Ventas");
        add(jLabel4);
        jLabel4.setBounds(780, 0, 200, 40);

        btnRadioID.setText("ID");
        add(btnRadioID);
        btnRadioID.setBounds(640, 90, 50, 28);

        btnRadioNombre.setText("Nombre");
        add(btnRadioNombre);
        btnRadioNombre.setBounds(640, 120, 90, 28);

        btnRadioPrecio.setText("Precio");
        add(btnRadioPrecio);
        btnRadioPrecio.setBounds(730, 90, 80, 28);

        btnRadioCantidad.setText("Cantidad");
        add(btnRadioCantidad);
        btnRadioCantidad.setBounds(730, 120, 120, 28);

        jLabel2.setText("Cambio");
        add(jLabel2);
        jLabel2.setBounds(0, 610, 50, 16);

        txtCambio.setText("$");
        add(txtCambio);
        txtCambio.setBounds(50, 600, 490, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void searchBarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyTyped

    }//GEN-LAST:event_searchBarKeyTyped

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed

    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnAgregarlist2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarlist2ActionPerformed
        if (tablaAlmacen.getSelectedRow() != -1 ) {
            String[] aux = new String[modeloTablaAlmacen.getColumnCount()];
           for (int i = 0; i < aux.length; i++) {
               aux[i] = modeloTablaAlmacen.getValueAt(tablaAlmacen.getSelectedRow(), i).toString();
           }
           /* Errores para realizar commit, quitar coment
           Producto producto = new Producto(Integer.parseInt(aux[0]), aux[1], Double.valueOf(aux[2]), Integer.parseInt(aux[3]), Integer.parseInt(aux[4]), aux[5]);
           total += producto.getPrice();
           modeloLista.addElement(producto);
           */
        } else {
            JOptionPane.showMessageDialog(this, "Favor de seleccionar un producto de la tabla", "Sin seleccion", JOptionPane.INFORMATION_MESSAGE);
        }
        actualizarTotal();
        actualizarCambio();
    }//GEN-LAST:event_btnAgregarlist2ActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        if(ListaVenta.getSelectedValue() != null && ListaVenta.getSelectedValue() instanceof Producto) {
            total -= modeloLista.get(ListaVenta.getSelectedIndex()).getPrice();//Estoy tomando el dinero que se va a quitar del total
            modeloLista.removeElementAt(ListaVenta.getSelectedIndex());
        } else {
            JOptionPane.showMessageDialog(this, "Favor de seleccionar un producto de la lista", "Sin seleccion", JOptionPane.INFORMATION_MESSAGE);
        }
        actualizarTotal();
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnNewCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewCActionPerformed
        if (!txtPago.getText().equals("")) {
            JOptionPane.showConfirmDialog(this, "Jajajajajajaj, no se como hacer la tabla que contendra lo de ventas, se pone ventas detalladas o ventas en general ya ni se",
                    String.valueOf(Double.valueOf(txtPago.getText()) - total),JOptionPane.ERROR_MESSAGE);
            modeloLista.removeAllElements();
            txtPago.setText("");
            total = 0;
            pagoS = "0";
            actualizarTotal();
            actualizarCambio();
        }
    }//GEN-LAST:event_btnNewCActionPerformed

    private void ConsCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsCompraActionPerformed
        ConsultarVenta consultarVenta = new ConsultarVenta(100);
        consultarVenta.setVisible(true);
    }//GEN-LAST:event_ConsCompraActionPerformed

    private void txtPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagoKeyTyped
        char c = evt.getKeyChar();
        if (c >= 48 && c <= 57 || c == 8) {
            if( c == 8) {
                pagoS = pagoS.substring(0, pagoS.length()-1);
            } else {
                pagoS = pagoS.concat(String.valueOf(c));
            }
        } else {
            JOptionPane.showMessageDialog(this, "El caracter " + c + " no es valido", "Caracter Invalido", JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }
        actualizarCambio();
    }//GEN-LAST:event_txtPagoKeyTyped

    //-----------------Metodos-----------------------------
    
    //--------------Metodo llenar tabla-------------------
    public void llenarTabla() {
        /**
         * No estoy seguro de como se va a llenar la tabla tando de ventas como de almacen y cualquier otra tabla
         * Asi que por el no saber, lo que voy a hacer es poner productos modelo para simular que ya hay productos en la tabla
         */
        String[] datos1 = {"1","Pepsi", "20", "10", "10", "Empaquetado"};
        String[] datos2 = {"2","Sabritas", "13", "5", "10", "Empaquetado"};
        modeloTablaAlmacen.addRow(datos1);
        modeloTablaAlmacen.addRow(datos2);
        
    }
    
    //-------------------Metodo para poner el total dinamicamente----------------------
    public void actualizarTotal() {
        txtTotal.setText("$ " + total);
    }
    //----------------------Cambio actualizado----------------------------
    public void actualizarCambio() {
        txtCambio.setText("$ " + (Double.valueOf(pagoS) - total));
    }

    
    //--------------Fin Metodos----------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsCompra;
    private javax.swing.ButtonGroup GrupoBtnRadio;
    private javax.swing.JList<Producto> ListaVenta;
    private javax.swing.JButton btnAgregarlist2;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnNewC;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JRadioButton btnRadioCantidad;
    private javax.swing.JRadioButton btnRadioID;
    private javax.swing.JRadioButton btnRadioNombre;
    private javax.swing.JRadioButton btnRadioPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JScrollPane scrollSeleccionado;
    private javax.swing.JTextField searchBar;
    private javax.swing.JTable tablaAlmacen;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtPago;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
