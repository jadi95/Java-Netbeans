
package bakery.ms;

import javax.swing.JOptionPane;

public class UserMenu extends javax.swing.JFrame {

    public UserMenu() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Result = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        Result.setEditable(false);
        Result.setBackground(new java.awt.Color(51, 153, 255));
        Result.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        Result.setText(" Your bill includes:");
        Result.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultActionPerformed(evt);
            }
        });
        jScrollPane1.setViewportView(Result);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(39, 16, 12));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Jawad's Bakery ®");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 590, 70));

        jButton1.setBackground(new java.awt.Color(102, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 110, 70));

        jButton2.setBackground(new java.awt.Color(35, 12, 4));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("DONUT");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 170, 70));

        jButton3.setBackground(new java.awt.Color(35, 12, 4));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("PIZZA");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 170, 70));

        jButton4.setBackground(new java.awt.Color(35, 12, 4));
        jButton4.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("CAKE");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 170, 70));

        jButton5.setBackground(new java.awt.Color(35, 12, 4));
        jButton5.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("BREAD");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 170, 70));

        jButton6.setBackground(new java.awt.Color(35, 12, 4));
        jButton6.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("BISCUIT");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 170, 70));

        jButton7.setBackground(new java.awt.Color(35, 12, 4));
        jButton7.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("SNACKS");
        jButton7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 170, 70));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Total Rs.");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 4));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 110, 40));

        total.setEditable(false);
        total.setBackground(new java.awt.Color(51, 51, 51));
        total.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total.setText("0");
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakery/ms/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Result.setText("Your bill is: ");
        total.setText("0");
        BakeryMS.Scr1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int n = Integer.parseInt(JOptionPane.showInputDialog(this,"Enter number of Cakes to buy"));
        String Answer = BakeryMS.List.Buy("Cake", n);
        if(Answer.equalsIgnoreCase("NotAvailable"))
            JOptionPane.showMessageDialog(this,"Sorry, Cakes are currently Unavailable, they must be available soon","Product Unavailable", JOptionPane.INFORMATION_MESSAGE);
        else if (Answer.equalsIgnoreCase("OverFlow"))
        {
            if(n==1)
            JOptionPane.showMessageDialog(this,"Sorry, Just Sold Out. No more items left but will be available back soon","Product Unavailable", JOptionPane.INFORMATION_MESSAGE);
            else
            JOptionPane.showMessageDialog(this,"Sorry, Cakes are currently in Limited Stock, Please select less amount of items","Product Unavailable", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            Result.setText(Result.getText()+"\n\t"+n+" Cake/s: RS."+Answer);
            int price = Integer.parseInt(Answer);
            int Total = Integer.parseInt(total.getText());
            total.setText(""+(Total+price));
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int n = Integer.parseInt(JOptionPane.showInputDialog(this,"Enter number of Breads to buy"));
        String Answer = BakeryMS.List.Buy("Bread", n);
        if(Answer.equalsIgnoreCase("NotAvailable"))
            JOptionPane.showMessageDialog(this,"Sorry, Breads are currently Unavailable, they must be available soon","Product Unavailable", JOptionPane.INFORMATION_MESSAGE);
        else if (Answer.equalsIgnoreCase("OverFlow"))
        {
            if(n==1)
            JOptionPane.showMessageDialog(this,"Sorry, Just Sold Out. No more items left but will be available back soon","Product Unavailable", JOptionPane.INFORMATION_MESSAGE);
            else
            JOptionPane.showMessageDialog(this,"Sorry, Breads are currently in Limited Stock, Please select less amount of items","Product Unavailable", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            Result.setText(Result.getText()+"\n\t "+n+" Bread/s: RS."+Answer);
            int price = Integer.parseInt(Answer);
            int Total = Integer.parseInt(total.getText());
            total.setText(""+(Total+price));
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void ResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int n = Integer.parseInt(JOptionPane.showInputDialog(this,"Enter number of Pizza to buy"));
        String Answer = BakeryMS.List.Buy("Pizza", n);
        if(Answer.equalsIgnoreCase("NotAvailable"))
            JOptionPane.showMessageDialog(this,"Sorry, Pizza are currently Unavailable, they must be available soon","Product Unavailable", JOptionPane.INFORMATION_MESSAGE);
        else if (Answer.equalsIgnoreCase("OverFlow"))
        {
            if(n==1)
            JOptionPane.showMessageDialog(this,"Sorry, Just Sold Out. No more items left but will be available back soon","Product Unavailable", JOptionPane.INFORMATION_MESSAGE);
            else
            JOptionPane.showMessageDialog(this,"Sorry, Pizza are currently in Limited Stock, Please select less amount of items","Product Unavailable", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            Result.setText(Result.getText()+"\n\t "+n+" Pizza: RS."+Answer);
            int price = Integer.parseInt(Answer);
            int Total = Integer.parseInt(total.getText());
            total.setText(""+(Total+price));
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int n = Integer.parseInt(JOptionPane.showInputDialog(this,"Enter number of Donuts to buy"));
        String Answer = BakeryMS.List.Buy("Donut", n);
        if(Answer.equalsIgnoreCase("NotAvailable"))
            JOptionPane.showMessageDialog(this,"Sorry, Donuts are currently Unavailable, they must be available soon","Product Unavailable", JOptionPane.INFORMATION_MESSAGE);
        else if (Answer.equalsIgnoreCase("OverFlow"))
        {
            if(n==1)
            JOptionPane.showMessageDialog(this,"Sorry, Just Sold Out. No more items left but will be available back soon","Product Unavailable", JOptionPane.INFORMATION_MESSAGE);
            else
            JOptionPane.showMessageDialog(this,"Sorry, Donuts are currently in Limited Stock, Please select less amount of items","Product Unavailable", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            Result.setText(Result.getText()+"\n\t "+n+" Donut/s: RS."+Answer);
            int price = Integer.parseInt(Answer);
            int Total = Integer.parseInt(total.getText());
            total.setText(""+(Total+price));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int n = Integer.parseInt(JOptionPane.showInputDialog(this,"Enter number of Biscuits to buy"));
        String Answer = BakeryMS.List.Buy("Biscuit", n);
        if(Answer.equalsIgnoreCase("NotAvailable"))
            JOptionPane.showMessageDialog(this,"Sorry, Biscuits are currently Unavailable, they must be available soon","Product Unavailable", JOptionPane.INFORMATION_MESSAGE);
        else if (Answer.equalsIgnoreCase("OverFlow"))
        {
            if(n==1)
            JOptionPane.showMessageDialog(this,"Sorry, Just Sold Out. No more items left but will be available back soon","Product Unavailable", JOptionPane.INFORMATION_MESSAGE);
            else
            JOptionPane.showMessageDialog(this,"Sorry, Biscuits  are currently in Limited Stock, Please select less amount of items","Product Unavailable", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            Result.setText(Result.getText()+"\n\t "+n+" Biscuit/s: RS."+Answer);
            int price = Integer.parseInt(Answer);
            int Total = Integer.parseInt(total.getText());
            total.setText(""+(Total+price));
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int n = Integer.parseInt(JOptionPane.showInputDialog(this,"Enter number of Snacks to buy"));
        String Answer = BakeryMS.List.Buy("Snacks", n);
        if(Answer.equalsIgnoreCase("NotAvailable"))
            JOptionPane.showMessageDialog(this,"Sorry, Snacks are currently Unavailable, they must be available soon","Product Unavailable", JOptionPane.INFORMATION_MESSAGE);
        else if (Answer.equalsIgnoreCase("OverFlow"))
        {
            if(n==1)
            JOptionPane.showMessageDialog(this,"Sorry, Just Sold Out. No more items left but will be available back soon","Product Unavailable", JOptionPane.INFORMATION_MESSAGE);
            else
            JOptionPane.showMessageDialog(this,"Sorry, Snacks  are currently in Limited Stock, Please select less amount of items","Product Unavailable", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            Result.setText(Result.getText()+"\n\t "+n+" Snacks Pack: RS."+Answer);
            int price = Integer.parseInt(Answer);
            int Total = Integer.parseInt(total.getText());
            total.setText(""+(Total+price));
        }
    }//GEN-LAST:event_jButton7ActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Result;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
