package graficos;
public class Traductor extends javax.swing.JFrame {
    public Traductor() {
        initComponents();
        this.setLocationRelativeTo(null);
	System.out.printl("En colaboración con Joel Camacho"): 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        busqueda = new javax.swing.JTextPane();
        traducir = new javax.swing.JButton();
        traduccion = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("TRADUCTOR");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("Introduce la palara");

        busqueda.setBackground(new java.awt.Color(255, 255, 204));
        busqueda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(busqueda);

        traducir.setText("Traducir");
        traducir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        traducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traducirActionPerformed(evt);
            }
        });

        traduccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        traduccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\End User\\Pictures\\iconos (3).jpg")); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel3.setText("Limpiar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(traduccion, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(traducir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel3)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(traducir)
                .addGap(30, 30, 30)
                .addComponent(traduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(25, Short.MAX_VALUE))
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

    private void traducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traducirActionPerformed
        String[] español= {"Habla en tu lengua materna frente a los niños","No olvides tu lengua materna","Nuestra lengua es la que habla nustro corazon","Donde quiera que andes habla tu lengua materna","Trabaja bien este mes","Trabaja bien esta semana","Trabaja bien este dia","Buen dia","TONTO","PAPÁ","OJO","NO","NIÑA","MAMÁ","LUZ","KILO","JARRO","PIERNA","GALLINA","CUELLO","CEPILLAR","CABEZA","BOCA","BESOS","BEBE PEQUEÑO","AHIJADO","AGUA","AGOTADO","ABIERTO","ABUELA","ABUELO","ABUELITO","AFUERA","AMARILLO","AMOR","BLANCO","ARBOL","CABALLO","CABELLO","CARNE","COMER","CONEJO","CUATRO","COMIDA","DAR","DIA","DIENTE","DIEZ","DOS","ELLA","EMPEZAR","FIESTA","GATO","GORDO","GRANDE","HERMANA","HERMANO","HIERBA"};
        String[] otomi= {"Ña ri hñaki","O gi pumfri ma hñaki ju","Ma hñaje hña ma ndate","Gatho habu gi y'o ña ri ña","Hoga befi gatho ra zana","Hoga tsaya, ga hiandiju nonxi","Hoga befi gatho ra pa","Hoga pa","ngongo","PALE","DO","HJINA","SHUHJTZI","MALE","TZIBI","KILO","SHARÓ","Xinthe","Guade","YUGA","Xachki","ÑA","NE","Tzutane","Tziuene","Thexakjä","DEJE","Xoborokue","SHOHJKI","NGANDE","WELO","Tsindeta","ATHJÍ","T'-ÁSHKI","MADI","T'-ÁSHI","ZZÁ","FANI","SHTA","NGA","TZÍ","KJUÁ","GÓ","HJÑUNI","ÚNI","MPÁ","TZ-Í","URETA","YOHJO","GUEGUE","PHJUHJTI","TZONIGO","MISHI","NOHJKI","NDA","KJUE","KJUADA","PASHI"};
        byte n,pos=0;
        boolean band;
        String bus= busqueda.getText();
        n=0;
        band=false;
        do{
            if(bus.equalsIgnoreCase (español[n]))
                {
                    band=true;
                    pos=n;
                    if(band==true)
                        traduccion.setText(String.valueOf(otomi[pos]));
                }
            else
                if(bus.equalsIgnoreCase (otomi[n]))
                    {
                        band=true;
                        pos=n;
                        if(band==true)
                            traduccion.setText(String.valueOf(español[pos]));
                    }
                else  
                    traduccion.setText("No existe vuelve a intentar");          
        n++; 
        }while(band==false & n<58);
    }//GEN-LAST:event_traducirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        busqueda.setText(null);
        traduccion.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Traductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Traductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Traductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Traductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Traductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane busqueda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel traduccion;
    private javax.swing.JButton traducir;
    // End of variables declaration//GEN-END:variables
}
