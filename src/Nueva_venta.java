
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.AbstractAction;
import javax.swing.AbstractListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan unu
 */
public class Nueva_venta extends javax.swing.JFrame {
    
    //listas
    
    DefaultListModel modlst_codigo=new DefaultListModel();
    DefaultListModel modlst_nomb_produc=new DefaultListModel();
    DefaultListModel modlst_categoria=new DefaultListModel();
    DefaultListModel modlst_cantidad=new DefaultListModel();
    DefaultListModel modlst_precio_cu=new DefaultListModel();
    DefaultListModel modlst_total=new DefaultListModel();
    //variables
    String producto="", nomb="", cat="";
    int cod, cant;
    double precio = 0, subtotal_cu=0;
    public static double suma=0;
    public static double igv, subtotal;
    public static int num_doc=0;
    public static String nomb_cliente="";
    public static int num_ventas;
    public static double monto_dia=0;
    int tipo_comp;
    
    /**
     * Creates new form Nueva_venta
     */
    public Nueva_venta() {
        initComponents();
        btn_nuevo.setEnabled(false);
        lbl_nuevo.setEnabled(false);
        
        this.setLocationRelativeTo(null);
        // Agregar listas al modal
        lst_cod.setModel(modlst_codigo);
        lst_nomb.setModel(modlst_nomb_produc);
        lst_cat.setModel(modlst_categoria);
        lst_precio.setModel(modlst_precio_cu);
        lst_cant.setModel(modlst_cantidad);
        lst_total.setModel(modlst_total);
        
        //combox
        cob_compro.addItem("BOLETA");
        cob_compro.addItem("FACTURA");
        //combox
        cob_doc.addItem("DNI");
        cob_doc.addItem("RUC");
    }
    
    void datos_producto(int nombre){
        switch (nombre){
            case 1: cod=100; nomb="Celecoxib"; cat="Analgésicos"; precio=2.40;break;
            case 2: cod=101; nomb="Rofecoxib"; cat="Analgésicos";precio=2;break;
            case 3: cod=102; nomb="Diclofenaco"; cat="Analgésicos"; precio=2.50;break;
            case 4: cod=103; nomb="Codeína"; cat="Analgésicos"; precio=2.20;break;
            case 5: cod=104; nomb="Paracetamol"; cat="Analgésicos"; precio=1.50;break;
            case 6: cod=105; nomb="Ácido acetil-salicílico"; cat="Analgésicos"; precio=7;break;
            case 7: cod=106; nomb="Esomeprazol"; cat="Antiácidos Y Antiulcerosos";precio=7;break;
            case 8: cod=107; nomb="Omeprazol"; cat="Antiácidos Y Antiulcerosos"; precio=4;break;
            case 9: cod=108; nomb="Gaviscon"; cat="Antiácidos Y Antiulcerosos";precio=3.50;break;
            case 10: cod=109; nomb="Cetirizina";cat="Antialérgicos"; precio=4.50;break;
            case 11: cod=110; nomb="Desloratadina";cat="Antialérgicos"; precio=5;break;
            case 12: cod=111; nomb="Fexofenadina";cat="Antialérgicos"; precio=3.20;break;
            case 13: cod=112; nomb="Levocetirizina";cat="Antialérgicos"; precio=7.50;break;
            case 14: cod=113; nomb="Subsalicilato de bismuto"; cat="Antidiarreicos Y Laxantes"; precio=1.50;break;
            case 15: cod=114; nomb="Clotrimazol"; cat="Antiinfeccioso";precio=4;break;
            case 16: cod=115; nomb="Miconazol";cat="Antiinfeccioso"; precio=8;break;
            case 17: cod=116; nomb="Econazol";cat="Antiinfeccioso"; precio=4.20;break;
            case 18: cod=117; nomb="Ketoconazol";cat="Antiinfeccioso"; precio=3.60;break;
            case 19: cod=118; nomb="Etodolaco";cat="Antiinflamatorios"; precio=7.10;break;
            case 20: cod=119; nomb="Naproxeno";cat="Antiinflamatorios"; precio=3.20;break;
            case 21: cod=120; nomb="Ibuprofeno";cat="Antiinflamatorios"; precio=1.90;break;
            case 22: cod=121; nomb="Nefopam"; cat="Antipiréticos";precio=5.50;break;
            case 23: cod=122; nomb="Metamizol";cat="Antipiréticos"; precio=3;break;
            case 24: cod=123; nomb="Salicilatos"; cat="Antipiréticos";precio=6;break;
            case 25: cod=124; nomb="Dextrometorfano"; cat="Antitusivos Y Mucolíticos";precio=4.30;break;
            case 26: cod=125; nomb="Dimemorfano"; cat="Antitusivos Y Mucolíticos";precio=5.30;break;
            case 27: cod=126; nomb="Cloperastina"; cat="Antitusivos Y Mucolíticos";precio=5.20;break;
            case 28: cod=127; nomb="Loperamida";cat="Antidiarreicos Y Laxantes"; precio=3.30;break;
        }
        
            
        
    }
    
    double hallar_subtotal_cu(double xcant, double xprecio){
        return xcant*xprecio;
    }
    
   public void producto(){
        producto=txt_produc.getText();
        cod=0;
        precio=0;
        switch (producto.toLowerCase()){
            case "celecoxib": datos_producto(1);break;
            case "rofecoxib": datos_producto(2);break;
            case "diclofenaco": datos_producto(3);break;
            case "codeina": datos_producto(4);break;
            case "paracetamol": datos_producto(5);break;
            case "acido acetil-salicilico": datos_producto(6);break;
            case "esomeprazol": datos_producto(7);break;
            case "omeprazol": datos_producto(8);break;
            case "gaviscon": datos_producto(9);break;
            case "cetirizina": datos_producto(10);break;
            case "desloratidina": datos_producto(11);break;
            case "fexofenadina": datos_producto(12);break;
            case "levocetirizina": datos_producto(13);break;
            case "subsalicilato de bismuto": datos_producto(14);break;
            case "clotrimazol": datos_producto(15);break;
            case "miconazol": datos_producto(16);break;
            case "econazol": datos_producto(17);break;
            case "ketoconazol": datos_producto(18);break;
            case "etodolaco": datos_producto(19);break;
            case "naproxeno": datos_producto(20);break;
            case "ibuprofeno": datos_producto(21);break;
            case "nefopam": datos_producto(22);break;
            case "metamizol": datos_producto(23);break;
            case "salicilatos": datos_producto(24);break;
            case "dextrometorfano": datos_producto(25);break;
            case "dimemorfano": datos_producto(26);break;
            case "cloperastina": datos_producto(27);break;
            case "loperamida": datos_producto(28);break;
        }
            if (cod>=1 && cod<128){
            JOptionPane.showMessageDialog(this, "Producto encontrado!");
            lbl_precio.setText("s/ "+precio);
        }
            else {
                 JOptionPane.showMessageDialog(this, "Producto no encontrado! :(");
                  lbl_precio.setText("");
            }
    }
    
    void mostrar_totales(){
        lbl_subtotal.setText("s/ "+subtotal);
        lbl_igv.setText("s/ "+igv);
        lbl_total.setText("s/ "+suma);
    }
    void mostrar_comprobante(int n){
        switch (n){
            case 1: Boleta bole=new Boleta();
                    bole.setVisible(true);
                    datos_compro(); break;
            case 2: Factura fac=new Factura();
                    fac.setVisible(true);
                    datos_compro(); break;
        }
        
    }
    void datos_compro(){
        num_ventas=num_ventas+1;
        monto_dia=monto_dia+suma;
        btn_nuevo.setEnabled(true);
        lbl_nuevo.setEnabled(true);
    }
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cob_compro = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_cant = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cob_doc = new javax.swing.JComboBox<>();
        txt_numdoc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        txt_produc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_total = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_cod = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lst_nomb = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lst_cat = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        lst_cant = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        lst_precio = new javax.swing.JList<>();
        lbl_precio = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_igv = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_nuevo = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        lbl_totalcant = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lbl_subtotal = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lbl_nuevo = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btn_volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva Venta");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cob_compro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cob_comproActionPerformed(evt);
            }
        });
        getContentPane().add(cob_compro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 110, 30));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NUEVA VENTA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(349, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(297, 297, 297))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 60));

        jLabel3.setText("Nombre del cliente / Razón Social:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 200, -1));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 210, 30));

        jLabel4.setText("Nombre del producto:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 150, -1));

        txt_cant.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_cant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 110, 30));

        jLabel5.setText("Documento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 130, -1));

        jLabel6.setText("Precio:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 90, -1));

        cob_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cob_docActionPerformed(evt);
            }
        });
        getContentPane().add(cob_doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 110, 30));

        txt_numdoc.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txt_numdoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 110, 30));

        jLabel8.setText("Tipo de comprobante:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 130, -1));

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lupa.png"))); // NOI18N
        btn_buscar.setBorder(null);
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 30, 30));

        txt_produc.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_produc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_producActionPerformed(evt);
            }
        });
        getContentPane().add(txt_produc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 160, 30));

        jLabel9.setText("Número:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 130, -1));

        lst_total.setBorder(javax.swing.BorderFactory.createTitledBorder("Total"));
        jScrollPane1.setViewportView(lst_total);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 80, 180));

        lst_cod.setBorder(javax.swing.BorderFactory.createTitledBorder("Código"));
        jScrollPane2.setViewportView(lst_cod);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 60, 180));

        lst_nomb.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre del producto"));
        jScrollPane3.setViewportView(lst_nomb);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 170, 180));

        lst_cat.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoría"));
        jScrollPane4.setViewportView(lst_cat);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 170, 180));

        lst_cant.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad"));
        jScrollPane5.setViewportView(lst_cant);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 80, 180));

        lst_precio.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio c/u"));
        jScrollPane6.setViewportView(lst_precio);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 80, 180));

        lbl_precio.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(lbl_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 100, 30));

        jLabel12.setText("Cantidad:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 130, -1));

        lbl_igv.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(lbl_igv, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 110, 30));

        jLabel14.setText("I.G.V.:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, 90, -1));

        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nuevo.png"))); // NOI18N
        btn_nuevo.setBorder(null);
        btn_nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 60, 40));

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Guardar.png"))); // NOI18N
        btn_guardar.setBorder(null);
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, 60, -1));

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cancelar.png"))); // NOI18N
        btn_cancelar.setBorder(null);
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 500, 70, -1));

        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Agregar.png"))); // NOI18N
        btn_agregar.setBorder(null);
        btn_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 40, 40));

        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Limpiar.png"))); // NOI18N
        btn_limpiar.setBorder(null);
        btn_limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 60, 50));

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eliminar.png"))); // NOI18N
        btn_eliminar.setBorder(null);
        btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 40, 40));

        lbl_totalcant.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(lbl_totalcant, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 100, 30));

        jLabel17.setText("Total:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 90, -1));

        lbl_total.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(lbl_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 560, 110, 30));

        jLabel19.setText("Total a pagar:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 540, 90, -1));

        lbl_subtotal.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(lbl_subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 110, 30));

        jLabel21.setText("Subtotal:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, 90, -1));

        jLabel22.setText("Limpiar");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, -1, -1));

        jLabel23.setText("Agregar");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, -1, -1));

        jLabel24.setText("Cancelar");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, 60, -1));

        jLabel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Venta"));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 100, 250));

        jLabel25.setText("Eliminar");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, -1, -1));

        lbl_nuevo.setText("Nuevo");
        getContentPane().add(lbl_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 60, -1));

        jLabel27.setText("Guardar");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 60, -1));

        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del cliente"));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 680, 110));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del producto"));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 680, 120));

        jLabel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 100, 240));

        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        getContentPane().add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cob_comproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cob_comproActionPerformed
        int orden;
        orden=cob_compro.getSelectedIndex();
        switch (orden){
            case 0: tipo_comp=1;break;
            case 1: tipo_comp=2;break;
        }
    }//GEN-LAST:event_cob_comproActionPerformed

    private void cob_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cob_docActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cob_docActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        producto();
        subtotal_cu=hallar_subtotal_cu(cant, precio);
        if (subtotal_cu>0)
        lbl_totalcant.setText("s/ "+subtotal_cu);
        else
            lbl_totalcant.setText("");

    }//GEN-LAST:event_btn_buscarActionPerformed

    private void txt_cantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantActionPerformed
        cant=Integer.parseInt(txt_cant.getText());
        subtotal_cu=hallar_subtotal_cu(cant, precio);
        lbl_totalcant.setText("s/ "+subtotal_cu);
    }//GEN-LAST:event_txt_cantActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        int respuesta;
        
        respuesta=JOptionPane.showConfirmDialog(this, "¿Desea agregar el registro?", "Nuevo registro",0);
        if (respuesta==0){
        modlst_codigo.addElement(cod);
        modlst_nomb_produc.addElement(nomb);
        modlst_categoria.addElement(cat);
        modlst_cantidad.addElement(cant);
        modlst_precio_cu.addElement(precio);
        modlst_total.addElement(subtotal_cu);
        }
        else
            JOptionPane.showMessageDialog(this, "No se agregaron los datos");
        while (subtotal_cu>0){
            suma=suma+subtotal_cu;break;
        }
        igv=suma*18/100;
        subtotal=suma-igv;
        mostrar_totales();
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int respuesta, orden_datos=lst_cod.getSelectedIndex();
        double registro_eliminado;
        respuesta=JOptionPane.showConfirmDialog(this, "¿Desea eliminar el registro?", "Eliminar registro",0);
        if (respuesta==0){
        registro_eliminado = (double) modlst_total.getElementAt(orden_datos);
        suma=suma-registro_eliminado;
        modlst_total.remove(orden_datos);
        modlst_precio_cu.remove(orden_datos);
        modlst_cantidad.remove(orden_datos);
        modlst_categoria.remove(orden_datos);
        modlst_nomb_produc.remove(orden_datos);
        modlst_codigo.remove(orden_datos);
        }
        else
            JOptionPane.showMessageDialog(this, "No se eliminaron los datos");
        
        igv=suma*18/100;
        subtotal=suma-igv;
        mostrar_totales();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
       
        
        int respuesta;
        respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar los registros?", "Eliminar registro",0);   
        if (respuesta==0){
        modlst_total.clear();
        modlst_precio_cu.clear();
        modlst_cantidad.clear();
        modlst_categoria.clear();
        modlst_nomb_produc.clear();
        modlst_codigo.clear();
        }
        else
            JOptionPane.showMessageDialog(this, "No se eliminaron los datos");
        
        suma=0;
        igv=0;
        subtotal=0;
        mostrar_totales();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        Icon icono = new ImageIcon(getClass().getResource("bocchi.png"));
        num_doc=Integer.parseInt(txt_numdoc.getText());
        nomb_cliente=txt_nombre.getText();
        
        int respuesta;
        respuesta=JOptionPane.showConfirmDialog(this, "Desea guardar la compra?", "Guardar", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, icono);
        if (respuesta==0){   
            mostrar_comprobante(tipo_comp);
            suma=0;
            igv=0;
            subtotal=0;
        }
        
        
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed

        this.dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        suma=0;
        btn_nuevo.setEnabled(false);
        modlst_total.clear();
        modlst_precio_cu.clear();
        modlst_cantidad.clear();
        modlst_categoria.clear();
        modlst_nomb_produc.clear();
        modlst_codigo.clear();
        lbl_total.setText("");
        lbl_igv.setText("");
        lbl_subtotal.setText("");
        lbl_precio.setText("");
        lbl_totalcant.setText("");
        txt_nombre.setText("");
        txt_numdoc.setText("");
        txt_cant.setText("");
        txt_produc.setText("");
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        int respuesta;
        respuesta=JOptionPane.showConfirmDialog(this, "¿Desea cancelar la venta?");
        if (respuesta==0){
            suma=0;
        modlst_total.clear();
        modlst_precio_cu.clear();
        modlst_cantidad.clear();
        modlst_categoria.clear();
        modlst_nomb_produc.clear();
        modlst_codigo.clear();
        lbl_total.setText("");
        lbl_igv.setText("");
        lbl_subtotal.setText("");
        lbl_precio.setText("");
        lbl_totalcant.setText("");
        txt_nombre.setText("");
        txt_numdoc.setText("");
        txt_cant.setText("");
        txt_produc.setText("");
        }
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void txt_producActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_producActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_producActionPerformed
        
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
            java.util.logging.Logger.getLogger(Nueva_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nueva_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nueva_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nueva_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nueva_venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_volver;
    private javax.swing.JComboBox<String> cob_compro;
    private javax.swing.JComboBox<String> cob_doc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lbl_igv;
    private javax.swing.JLabel lbl_nuevo;
    private javax.swing.JLabel lbl_precio;
    private javax.swing.JLabel lbl_subtotal;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JLabel lbl_totalcant;
    private javax.swing.JList<String> lst_cant;
    private javax.swing.JList<String> lst_cat;
    private javax.swing.JList<String> lst_cod;
    private javax.swing.JList<String> lst_nomb;
    private javax.swing.JList<String> lst_precio;
    private javax.swing.JList<String> lst_total;
    private javax.swing.JTextField txt_cant;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_numdoc;
    private javax.swing.JTextField txt_produc;
    // End of variables declaration//GEN-END:variables
}
