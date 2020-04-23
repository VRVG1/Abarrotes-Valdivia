/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import javax.swing.JOptionPane;


/**
 *
 * @author vival
 */
public class AddProducto extends javax.swing.JDialog {

    static int contGlobal = 0, eleccion;
    static boolean pressProducto = true, pressPrice = true;
    static String nameProduct;
    static String price;
    Producto productito, p;
    public AddProducto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        txtProducto = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        labelTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        txtProducto.setText("Producto");
        txtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductoKeyTyped(evt);
            }
        });

        txtPrecio.setText("Precio");
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        btnSave.setText("jButton1");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        labelTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("Modificar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProducto)
                            .addComponent(txtPrecio)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductoKeyTyped
        char c = evt.getKeyChar();
        if(pressProducto){
           txtProducto.setText("");
           pressProducto = false;
        }
        if(c == '\b'){
            if(txtProducto.getText().equals("")){
                txtProducto.setText("Producto");
                pressProducto = true;
            }
        }
    }//GEN-LAST:event_txtProductoKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char c = evt.getKeyChar();
        if(pressPrice){
           txtPrecio.setText("");
           pressPrice = false;
        }
        if(c == '\b'){
            if(txtPrecio.getText().equals("")){
                txtPrecio.setText("Precio");
                pressPrice = true;
            }
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        switch (eleccion) {
            case 1:
                agregar();
                break;
            case 2:
                modificar();
                break;
            case 3:
                delete();
                break;
            default:
                throw new AssertionError();
        }
        txtPrecio.setText("Precio");
        pressPrice = true;
        txtProducto.setText("Producto");
        pressProducto = true;
        contGlobal = 0;
        this.dispose();
    }//GEN-LAST:event_btnSaveActionPerformed

    public void title(int num){
        switch (num) {
            case 1:
                labelTitle.setText("Agregar");
                btnSave.setText("Agregar");
                eleccion = 1;
                break;
            case 2:
                labelTitle.setText("Modificar");
                btnSave.setText("Modificar");
                eleccion = 2;
                break;
            case 3:
                labelTitle.setText("Eliminar");
                btnSave.setText("Eliminar");
                eleccion = 3;
                break;
            default:
                JOptionPane.showMessageDialog(this, "Se a producido un error inesperado\nVuelva a interntarlo", "Vuelva a intentarlo", JOptionPane.ERROR_MESSAGE);
                this.dispose();
                break;
        }
    }
    
    public void setTextProducto(String nameProduct){
        txtProducto.setText(nameProduct);
    }
    public void setTextPrice(String Price){
        txtPrecio.setText(Price);
    }
    public void setContGlobal(int num){
        contGlobal = num;
    }
    public Producto getProducto(){
        return p;
    }
    public void setProducto(Producto pro){
        productito = pro;
    }
    
    public void modificar(){
        p = new Producto(contGlobal, txtProducto.getText(), Double.valueOf(txtPrecio.getText()), 0);
        int res = JOptionPane.showConfirmDialog(this, "El proucto:\n" + productito.toString() + "\nSera modificado por el nuevo producto:\n" + p.toString(), "Modificar Producto",JOptionPane.YES_NO_OPTION);
        if(res == 0){//YES = 0
            System.out.println("Le apachurre a si");
        }else{//NO = 1
           p = null;
        }
    }
    
    public void agregar(){
        p = new Producto(contGlobal, txtProducto.getText(), Double.valueOf(txtPrecio.getText()), 0);
    }
    
    public void delete(){
        int res = JOptionPane.showConfirmDialog(this, "Seguro que desea eliminar el producto:\n" + productito.toString(), "Eliminar Producto",JOptionPane.YES_NO_OPTION);
        if(res == 0){//YES = 0

        }else{//NO = 1
           p = null;
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
