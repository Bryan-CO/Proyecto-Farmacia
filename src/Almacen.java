
import javax.swing.DefaultListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan unu
 */
public class Almacen extends javax.swing.JFrame {
    DefaultListModel modlst_farmacia=new DefaultListModel();
    int orden;
    /**DefaultListModel modlst_farmacia=new DefaultListModel();
     */
    public Almacen() {
        initComponents();
        this.setLocationRelativeTo(null);
        cbo_farmacia.addItem("Analgésicos");
        cbo_farmacia.addItem("Antiácidos Y Antiulcerosos");
        cbo_farmacia.addItem("Antialérgicos");
        cbo_farmacia.addItem("Antidiarreicos Y Laxantes");
        cbo_farmacia.addItem("Antiinfecciosos");
        cbo_farmacia.addItem("Antiinflamatorios");
        cbo_farmacia.addItem("Antipiréticos");
        cbo_farmacia.addItem("Antitusivos Y Mucolíticos");
        
        lst_farmaciatipo.setModel(modlst_farmacia);
        //combo box  
    }
    void llenar_analgesicos(){
        modlst_farmacia.addElement("Celecoxib");
        modlst_farmacia.addElement("Rofecoxib");
        modlst_farmacia.addElement("Diclofenaco");
        modlst_farmacia.addElement("Codeína");
        modlst_farmacia.addElement("Paracetamol");
        modlst_farmacia.addElement("Ácido acetil-salicílico");
    }
    void llenar_antiácidos_y_antiulcerosos(){
        modlst_farmacia.addElement("Esomeprazol");
        modlst_farmacia.addElement("omeprazol");
        modlst_farmacia.addElement("gaviscon");
    }
    void llenar_antialergicos(){
        modlst_farmacia.addElement("Cetirizina");
        modlst_farmacia.addElement("Desloratidina");
        modlst_farmacia.addElement("Fexofenadina");
        modlst_farmacia.addElement("Levocetirizina");
    }
    void llenar_antidiarreicos_y_laxantes(){
        modlst_farmacia.addElement("Loperamida");
        modlst_farmacia.addElement("Subsalicilato de bismuto");
    }
    void llenar_antiinfecciosos(){
        modlst_farmacia.addElement("Clotrimazol");
        modlst_farmacia.addElement("Miconazol");
        modlst_farmacia.addElement("Econazol");
        modlst_farmacia.addElement("Ketoconazol");
    }
    
    void llenar_antiinflamatorios(){
        modlst_farmacia.addElement("Etodolaco");
        modlst_farmacia.addElement("Naproxeno");
        modlst_farmacia.addElement("Ibuprofeno");
    }
    
    void llenar_antipireticos(){
        modlst_farmacia.addElement("Nefopam");
        modlst_farmacia.addElement("Metamizol");
        modlst_farmacia.addElement("Salicilatos");
    }
    
    void llenar_antitusivos_y_mucoliticos(){
        modlst_farmacia.addElement("Dextrometorfano");
        modlst_farmacia.addElement("Dimemorfano");
        modlst_farmacia.addElement("Cloperastina");
    }
        String llenar_descripcion(int orden1,int orden2){
        switch (orden1){
            case 0: switch (orden2){
                case 0: return "El celecoxib es un medicamento antiinflamatorio\n"
                        + "no esteroideo indicado para el alivio del dolor\n"
                        + "en pacientes con osteoartritis, dismenorrea y artritis\n"
                        + "reumatoide, aunque también es utilizado para el alivio\n"
                        + "de los síntomas en pacientes mayores de dos años que sufran\n"
                        + "artritis reumatoide juvenil.";
                case 1: return "Rofecoxib es un fármaco antiinflamatorio\n"
                        + "no esteroideo que fue retirado del mercado\n"
                        + "por razones de seguridad.";
                case 2: return "El diclofenaco es un fármaco inhibidor relativamente\n"
                        + "no selectivo de la ciclooxigenasa y miembro de la familia\n"
                        + "de los antiinflamatorios no esteroideos.";
                case 3: return "La codeína o metilmorfina es un alcaloide que\n"
                        + "se encuentra de forma natural en el opio.";
                case 4: return "El paracetamol es un medicamento de venta\n"
                        + "sin receta médica que se da para aliviar la fiebre y el dolor.";
                case 5: return "El ácido acetilsalicílico (aspirin) ayuda a lograr que\n"
                        + "haya mayor flujo de sangre a las piernas.";
            }
            case 1: switch(orden2){
                case 0: return "El esomeprazol es un fármaco del grupo de los inhibidores\n"
                        + "de la bomba de protones que actúa en el tracto gastrointestinal\n"
                        + ", reduciendo la secreción del ácido gástrico al inhibir la ATPasa\n"
                        + "de la membrana celular de las células parietales del estómago.";
                case 1: return "El omeprazol se utiliza en el tratamiento\n"
                        + "de la dispepsia, úlcera péptica, enfermedades\n"
                        + "por reflujo gastroesofágico y el síndrome de Zollinger-Ellison.";
                case 2: return "El alginato de sodio junto con el hidrogenocarbonato\n"
                        + "(bicarbonato) de sodio, y el carbonato de calcio forman\n"
                        + "una barrera protectora en el estómago para evitar el reflujo\n"
                        + "gástrico calmando el ardor en la boca del estómago.";
            }
            case 2: switch(orden2){
                case 0: return "La cetirizina es un fármaco utilizado para\n"
                        + "el tratamiento de la alergia.";
                case 1: return "La desloratadina es un fármaco antihistamínico utilizado\n"
                        + "para tratar alergias.";
                case 2: return "La fexofenadina, que se vende bajo la marca Allegra®,\n"
                        + "entre otras, ? es un fármaco antihistamínico utilizado\n"
                        + "en el tratamiento de los síntomas de alergia, como la\n"
                        + "fiebre del heno y la urticaria.";
                case 3: return "La Levocetirizina, que se vende comúnmente bajo\n"
                        + "el nombre de Xuzal, es un antihistamínico utilizado\n"
                        + "para el tratamiento de la rinitis alérgica y urticaria\n"
                        + "de largo plazo con causas poco clara.";
            }
            case 3: switch(orden2){
                case 0: return "La loperamida es un fármaco opioide sintético,\n"
                        + "derivado de la piperidina.";
                case 1: return "El subsalicilato de bismuto es usado para tratar la diarrea,\n"
                        + "pirosis (acidez estomacal) y malestar estomacal, en adultos\n"
                        + "y niños mayores de 12 años.";
            }
            case 4: switch(orden2){
                case 0: return "El clotrimazol pertenece a una clase de medicamentos\n"
                        + "antimicóticos llamados imidazoles. Su acción consiste\n"
                        + "en detener el crecimiento de los hongos que ocasionan la infección.";
                case 1: return "El miconazol es un derivado imidazólico que se\n"
                        + "utiliza en medicina como antifúngico.";
                case 2: return "El econazol es un fármaco antifúngico de uso tópico\n"
                        + "derivado del imidazol.";
                case 3: return "El ketoconazol en tableta es indicado para tratar\n"
                        + "infecciones graves causadas por hongos y debe utilizarse\n"
                        + "solamente en caso de que no exista otra terapia o en caso\n"
                        + "de que el paciente no la tolere.";
            }
            case 5: switch(orden2){
                case 0: return "El etodolaco se usa para aliviar el dolor producido\n"
                        + "por diferentes afecciones. También reduce el dolor,\n"
                        + "la inflamación y la rigidez de las articulaciones\n"
                        + "producidos por la artritis.";
                case 1: return "El naproxeno de venta libre se usa para reducir la\n"
                        + "fiebre y aliviar los dolores leves por cefaleas,\n"
                        + "dolores musculares, artritis, periodos menstruales,\n"
                        + "resfriado común; dolor de muelas y dolor de espalda.";
                case 2: return "El ibuprofeno de venta libre se utiliza para reducir\n"
                        + "la fiebre y aliviar los dolores menores por de cefalea,\n"
                        + "dolor muscular, artritis, periodos menstruales, resfriado\n"
                        + "común, dolor de muelas y dolor de espalda.";
            }
            case 6: switch(orden2){
                case 0: return "Nefopam, vendido bajo la marca Acupan, entre otros,\n"
                        + "es un medicamento analgésico no opioide de acción central,\n"
                        + "que se usa principalmente para tratar el dolor moderado a intenso.";
                case 1: return "El metamizol, también conocido como dipirona o novalgina,\n"
                        + "es un AINE perteneciente a la familia de las pirazolonas,\n"
                        + "cuyo prototipo es el piramidón. Es utilizado en muchos países\n"
                        + "como un potente analgésico, antipirético y espasmolítico.";
                case 2: return "Los salicilatos son un tipo de fármaco presente en muchos\n"
                        + "medicamentos de venta con receta y libre.";
            }
            case 7: switch(orden2){
                case 0: return "El dextrometorfano se usa para aliviar temporalmente la tos\n"
                        + "causada por el resfriado común, la gripe u otras afecciones.";
                case 1: return "El dimemorfan, o dimemorfan fosfato, también conocido\n"
                        + "como 3,17-dimetilmorfinano, es un antitusivo de la familia\n"
                        + "de los morfinanos que se utiliza mucho en Japón y también\n"
                        + "se comercializa en España e Italia. Fue desarrollado por\n"
                        + "Yamanouchi Pharmaceutical e introducido en Japón en 1975.";
                case 2: return "La cloperastina es un fármaco antitusígeno que actúa\n"
                        + "sobre el sistema nervioso central.";
            }
        }
     return null;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_farmaciatipo = new javax.swing.JList<>();
        cbo_farmacia = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Almacén");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Descripción:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Seleccione el tipo de medicamento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Seleccione el medicamento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        txt_descripcion.setEditable(false);
        txt_descripcion.setColumns(20);
        txt_descripcion.setRows(5);
        jScrollPane2.setViewportView(txt_descripcion);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 340, 110));

        lst_farmaciatipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lst_farmaciatipoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lst_farmaciatipo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 210, 120));

        cbo_farmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_farmaciaActionPerformed(evt);
            }
        });
        getContentPane().add(cbo_farmacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 220, 40));

        jPanel1.setBackground(new java.awt.Color(10, 104, 145));
        jPanel1.setForeground(new java.awt.Color(0, 178, 173));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ALMACÉN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 409, -1));

        jSeparator1.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator1.setForeground(new java.awt.Color(73, 181, 172));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 58, 330, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -10, 110, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 700, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbo_farmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_farmaciaActionPerformed
        // TODO add your handling code here:
        modlst_farmacia.clear();
        
        orden=cbo_farmacia.getSelectedIndex();
        switch (orden){
            case 0: llenar_analgesicos();break;
            case 1: llenar_antiácidos_y_antiulcerosos();break;
            case 2: llenar_antialergicos();break;
            case 3: llenar_antidiarreicos_y_laxantes();break;
            case 4: llenar_antiinfecciosos();break;
            case 5: llenar_antiinflamatorios();break;
            case 6: llenar_antipireticos();break;
            case 7: llenar_antitusivos_y_mucoliticos();break;
        }
    }//GEN-LAST:event_cbo_farmaciaActionPerformed

    private void lst_farmaciatipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lst_farmaciatipoMouseClicked
        // TODO add your handling code here:
        String descripcion;
        descripcion=llenar_descripcion(orden,lst_farmaciatipo.getSelectedIndex());
        txt_descripcion.setText(descripcion);
    }//GEN-LAST:event_lst_farmaciatipoMouseClicked

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
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Almacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbo_farmacia;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> lst_farmaciatipo;
    private javax.swing.JTextArea txt_descripcion;
    // End of variables declaration//GEN-END:variables
}
