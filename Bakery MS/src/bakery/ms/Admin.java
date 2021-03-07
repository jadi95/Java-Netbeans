
package bakery.ms;

import javax.swing.JOptionPane;

public class Admin extends javax.swing.JFrame {
    Object[] options = {"CAKE",
                        "BREAD",
                        "PIZZA",
                        "DONUT",
                        "BISCUIT",
                        "SNACKS"};
    public Admin() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        jButton4.setBackground(new java.awt.Color(35, 12, 4));
        jButton4.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("REMOVE");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 150, 70));

        jButton5.setBackground(new java.awt.Color(35, 12, 4));
        jButton5.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("ADD NEW");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 160, 70));

        jButton6.setBackground(new java.awt.Color(35, 12, 4));
        jButton6.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("UPDATE");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 150, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakery/ms/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        BakeryMS.Scr1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
            int i = JOptionPane.showOptionDialog(this,"Select Product to Add",
                "Adding New Product",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);
        String n;
        switch (i)
        {
            case 0:
                n="Cake";
                break;
            case 1:
                n="Bread";
                break;
            case 2:
                n="Pizza";
                break;
            case 3:
                n="Donut";
                break;
            case 4:
                n="Biscuit";
                break;
            case 5:
                n="Snacks";
                break;
            default:
                n = "";
        }
        if(BakeryMS.List.Search(n))
            JOptionPane.showMessageDialog(this,"This product Already Exsists. Try Update Option Instead","Product Not Added", JOptionPane.INFORMATION_MESSAGE);
        else{
        int p = Integer.parseInt(JOptionPane.showInputDialog(this,"Enter New Product Price: "));
        int s = Integer.parseInt(JOptionPane.showInputDialog(this,"Enter Number of New Product Items in Stock: "));
        BakeryMS.List.InsertNew(n, p, s);
        JOptionPane.showMessageDialog(this,n+" is now available for Customers to buy","Product Added", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      
        int i = JOptionPane.showOptionDialog(this,"Select Product to Update",
            "Updating Product",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[2]);
        String n;
        switch (i)
        {
            case 0:
                n="Cake";
                break;
            case 1:
                n="Bread";
                break;
            case 2:
                n="Pizza";
                break;
            case 3:
                n="Donut";
                break;
            case 4:
                n="Biscuit";
                break;
            case 5:
                n="Snacks";
                break;
            default:
                n = "";
        }
        if(!BakeryMS.List.Search(n))
            JOptionPane.showMessageDialog(this,"This product Does not Exsists. Try Add New Option Instead","Product Not Found", JOptionPane.INFORMATION_MESSAGE);
        else{
             int p = Integer.parseInt(JOptionPane.showInputDialog(this,"Enter Product New Price: "));
        int s = Integer.parseInt(JOptionPane.showInputDialog(this,"Enter Number of Product Items in Stock: "));
        BakeryMS.List.Update(n, p, s);
        JOptionPane.showMessageDialog(this,n+"'s Details Updated ","Product Updated", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        int i = JOptionPane.showOptionDialog(this,"Select Product to Remove",
            "Removing Product",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[2]);
        String n;
        switch (i)
        {
            case 0:
                n="Cake";
                break;
            case 1:
                n="Bread";
                break;
            case 2:
                n="Pizza";
                break;
            case 3:
                n="Donut";
                break;
            case 4:
                n="Biscuit";
                break;
            case 5:
                n="Snacks";
                break;
            default:
                n = "";
        }
        if(!BakeryMS.List.Search(n))
            JOptionPane.showMessageDialog(this,"This product does not Exsists.SS","Product Not Found", JOptionPane.INFORMATION_MESSAGE);
        else{
            BakeryMS.List.Delete(n);
            JOptionPane.showMessageDialog(this,n+" has been removed from System","Product Updated", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
