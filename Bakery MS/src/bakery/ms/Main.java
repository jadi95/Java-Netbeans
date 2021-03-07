
package bakery.ms;

import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sweetest Place Around!");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 270, 30));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(39, 16, 12));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Jawad's Bakery ®");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 590, 70));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sweet treat and good to eat. ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 270, 30));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Take a break, buy a cake.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 270, 30));

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("The best bread under the sky");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 270, 30));

        jButton1.setBackground(new java.awt.Color(102, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("EXIT");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 100, 70));

        jButton2.setBackground(new java.awt.Color(35, 12, 4));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("BUY NOW");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 170, 70));

        jButton3.setBackground(new java.awt.Color(35, 12, 4));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ADMIN");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 150, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakery/ms/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        BakeryMS.Scr2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        String Pass = JOptionPane.showInputDialog(this,"Enter Admin's Password");
        if(Pass.equalsIgnoreCase("jawad"))
        {
            BakeryMS.Scr3.setVisible(true);
            this.setVisible(false);
        }
        else{
             JOptionPane.showMessageDialog(this,"Incorrect Admin's Password","Incorrect Password", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
