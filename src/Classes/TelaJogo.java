
package Classes;

/**
 *
 * @author Vinícius Dev
 */
public class TelaJogo extends javax.swing.JFrame {

    public TelaJogo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtValor = new javax.swing.JSpinner();
        btnJogar = new javax.swing.JButton();
        txtSaida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 505));
        setPreferredSize(new java.awt.Dimension(725, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(218, 211, 238));
        jLabel2.setText("ADVINHE O NÚMERO DE 1 A 5");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 160, 304, -1));

        txtValor.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtValor.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 208, 80, -1));

        btnJogar.setBackground(new java.awt.Color(153, 0, 0));
        btnJogar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnJogar.setForeground(new java.awt.Color(255, 255, 255));
        btnJogar.setText("JOGAR");
        btnJogar.setToolTipText("");
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 272, 144, 32));

        txtSaida.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtSaida.setForeground(new java.awt.Color(212, 205, 233));
        txtSaida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSaida.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txtSaida.setFocusable(false);
        txtSaida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtSaida.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 320, 208, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/telaJogo1.1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -16, 720, 496));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed
        
        double n = 1 + Math.random() * (6 - 1); //Sorteia um numero double de 1 a 5
        int valor = (int) n; // Recebe o número inteiro sorteado                
        int numUsuario = (int) txtValor.getValue(); // Recebe o númeor informado do usuario
        String acertou = "<html>Acertou na mosca</html>";
        String errou = "<html>Que pena você errou! Sorteamos o número " + valor + " </html>";
        
        String textoSaida = (numUsuario == valor)? acertou : errou; // Lógica errou ou acertou o número sorteado 
         
        txtSaida.setText(textoSaida); // Usuario recebe a informação se errou ou acertou
        System.out.println("");
    }//GEN-LAST:event_btnJogarActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJogar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel txtSaida;
    private javax.swing.JSpinner txtValor;
    // End of variables declaration//GEN-END:variables
}
