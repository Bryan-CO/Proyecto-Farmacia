
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan unu
 */
public class Consultar_precios extends javax.swing.JFrame {
        DefaultListModel modlst_codigo=new DefaultListModel();
        DefaultListModel modlst_nomb=new DefaultListModel();
        DefaultListModel modlst_precio=new DefaultListModel();
        
        String producto, nomb;
        int cod;
        double precio;
    /**
     * Creates new form Consultar_precios
     */
    public Consultar_precios() {
        initComponents();
        this.setLocationRelativeTo(null);
        lst_cod.setModel(modlst_codigo);
        lst_nomb.setModel(modlst_nomb);
        lst_precio.setModel(modlst_precio);
    }
    
    void buscar(){
        producto=txt_produc.getText();
        cod=0;
        precio=0;
        switch (producto.toLowerCase()){
            case "celecoxib": cod=100; nomb="Celecoxib"; precio=2.40;break;
            case "rofecoxib": cod=101; nomb="Rofecoxib";precio=2;break;
            case "diclofenaco": cod=102; nomb="Diclofenaco";precio=2.50;break;
            case "codeina": cod=103; nomb="Codeína";precio=2.20;break;
            case "paracetamol": cod=104; nomb="Paracetamol";precio=1.50;break;
            case "acido acetil-salicílico": cod=105; nomb="Ácido acetil-salicílico";precio=7;break;
            case "esomeprazol": cod=106; nomb="Esomeprazol";precio=7;break;
            case "omeprazol": cod=107; nomb="Omeprazol"; precio=4;break;
            case "gaviscon": cod=108; nomb="Gaviscon";precio=3.50;break;
            case "cetirizina": cod=109; nomb="Cetirizina";precio=4.50;break;
            case "desloratadina": cod=110; nomb="Desloratadina";precio=5;break;
            case "fexofenadina": cod=111; nomb="Fexofenadina";precio=3.20;break;
            case "levocetirizina": cod=112; nomb="Levocetirizina"; precio=7.50;break;
            case "subsalicilato de bismuto": cod=113; nomb="Subsalicilato de bismuto"; precio=1.50;break;
            case "clotrimazol": cod=114; nomb="Clotrimazol";precio=4;break;
            case "miconazol": cod=115; nomb="Miconazol";precio=8;break;
            case "econazol": cod=116; nomb="Econazol";precio=4.20;break;
            case "ketoconazol": cod=117; nomb="Ketoconazol";precio=3.60;break;
            case "etodolaco": cod=118; nomb="Etodolaco";precio=7.10;break;
            case "naproxeno": cod=119; nomb="Naproxeno";precio=3.20;break;
            case "ibuprofeno": cod=120; nomb="Ibuprofeno"; precio=1.90;break;
            case "nefopam": cod=121; nomb="Nefopam"; precio=5.50;break;
            case "metamizol": cod=122; nomb="Metamizol";precio=3;break;
            case "salicilatos": cod=123; nomb="Salicilatos";;precio=6;break;
            case "dextrometorfano": cod=124; nomb="Dextrometorfano";;precio=4.30;break;
            case "dimemorfano": cod=125; nomb="Dimemorfano";;precio=5.30;break;
            case "cloperastina": cod=126; nomb="Cloperastina";;precio=5.20;break;
            case "loperamida": cod=127; nomb="Loperamida"; precio=3.30;break;
            
        }
        if (cod>=1 && cod<128){
            JOptionPane.showMessageDialog(this, "Producto encontrado!");
            llenar_datos();
        }
        else {
            JOptionPane.showMessageDialog(this, "Producto no encontrado! :(");
        }
    }
    void llenar_datos(){
        modlst_codigo.clear();
        modlst_nomb.clear();
        modlst_precio.clear();
        modlst_codigo.addElement(cod);
        modlst_nomb.addElement(nomb);
        modlst_precio.addElement(precio);
    }
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_cod = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lst_nomb = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        lst_precio = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_produc = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Precios");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        lst_cod.setBorder(javax.swing.BorderFactory.createTitledBorder("Código"));
        jScrollPane2.setViewportView(lst_cod);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 60, 60));

        lst_nomb.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre del producto"));
        jScrollPane3.setViewportView(lst_nomb);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 170, 60));

        lst_precio.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio c/u"));
        jScrollPane6.setViewportView(lst_precio);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 80, 60));

        jPanel1.setBackground(new java.awt.Color(10, 104, 145));
        jPanel1.setForeground(new java.awt.Color(0, 178, 173));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Consultar Precios");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 409, -1));

        jSeparator1.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator1.setForeground(new java.awt.Color(73, 181, 172));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 58, 330, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 100, 100));

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 670, 340));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 90));

        jLabel1.setText("Insertar Código O Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 150, 40));

        txt_produc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_produc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_producActionPerformed(evt);
            }
        });
        getContentPane().add(txt_produc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 110, 40));

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lupa.png"))); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 40, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo.jpg"))); // NOI18N
        jLabel4.setText("jLabel2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 650, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_producActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_producActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_producActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

       nomb=txt_produc.getText();
       buscar();     
       
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Consultar_precios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar_precios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar_precios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar_precios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar_precios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> lst_cod;
    private javax.swing.JList<String> lst_nomb;
    private javax.swing.JList<String> lst_precio;
    private javax.swing.JTextField txt_produc;
    // End of variables declaration//GEN-END:variables
}