/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author ACER
 */
public class Window extends javax.swing.JFrame {

    /**
     * Creates new form Window
     */
    public Window() {
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

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("ABRIR UNA GALLETA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 230, 40));

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 102)));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 400, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Desktop\\CM\\galletasfortuna.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-420, 0, 920, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String[] premios = new String[5];
        premios[0] = "que en exactamente 10 años, tu pack se filtrará por accidente y se volverá viral," +
                "lo que te traerá muchas oportunidades como poder tener tu propio reality show," +
                "lo cual rechazarás porque siempre dign@, nunca indign@.";
        premios[1] = "que el 30 de Junio tocarán a tu puerta para fumigar, así que te irás " +
                "a la tienda de la esquina por una cocacola. " +
                "De repente entrará tu crush a la tienda, ignorándote " +
                "por completo y le preguntará al tendero si hay Nutella.";
        premios[2]= "en el 2,040 tú y tu familia huirán de Guatemala debido a la debacle político y económico que ha provocado la dictadura" +
                "de Neto Bran y para cubrir los gastos venderás tu cuerpo a una corporación para que realice experimentos." +
                "Te transformarán en un cyborg, lo que extenderá tu tiempo de vida por 500 años más, de los cuales utilizarás los primeros" +
                "20 prestando servicio militar para ayudar a establecer un nuevo orden mundial.";
        premios[3]= "esta noche no dormirás porque necesitas estudiar para tu próximo parcial, pero pasarás la mitad de la noche" +
                "viendo videos de bromas a gatos y stalkeando el instagram de tu crush.";
        premios[4]= "ganaste un ¡CÓMODÍN! Felicidades, has ganado la oportunidad de elegir un fragmento de tu futuro. Escribe a continuación" +
                "las cosas que quisieras que te sucedieran. Debes ser específico sobre en cuánto tiempo van a suceder. A disfrutar de la" +
                "vida se ha dicho.";
        int random = (int)(Math.random()*5);
        jLabel2.setText(premios[random]);
        
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
