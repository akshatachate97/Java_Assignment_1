/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author rbc
 */
public class reportcard extends javax.swing.JFrame {

    /**
     * Creates new form reportcard
     */
    public reportcard() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        roll = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        cl = new javax.swing.JTextField();
        phy = new javax.swing.JTextField();
        math = new javax.swing.JTextField();
        chem = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(text);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 318, 490));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("  REPORT");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 180, 30));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel3.setText("   ID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 40, -1));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel4.setText("Roll Number:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel5.setText("Name:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel6.setText("Class:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel7.setText("Marks:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel8.setText("Physics:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel9.setText("Math:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        jLabel10.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel10.setText("Chemistry:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        jLabel11.setText("***************************************************************************");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 157, -1));
        getContentPane().add(roll, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 157, -1));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 157, -1));
        getContentPane().add(cl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 157, -1));
        getContentPane().add(phy, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 159, -1));
        getContentPane().add(math, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 159, -1));
        getContentPane().add(chem, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 159, -1));

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, -1, -1));

        jLabel12.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("BACK");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 50, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\rbc\\Downloads\\student-grades.png")); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 60, 70));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "");
        String sql="insert into reportcard values (?,?,?,?,?,?,?,?)";
        String p= phy.getText();
        double s1= Double.parseDouble(p);
        String m= math.getText();
        double s2= Double.parseDouble(m);
        String c= chem.getText();
        double s3= Double.parseDouble(c);
        
        double total=((s1+s2+s3)*100)/300;
        
        String grade;
        
        if(total>= 80){
        grade= "A+";
        }
        else if(total>=70 && total <80){
        grade="A";
        }
        
        else if(total>=60 && total <70){
        grade="B";
        }
        
        else if(total>=50 && total <60){
        grade="C";
        }
        
        else if(total>=40 && total <50){
        grade="D";
        }
        else
        { grade="Fail";
        }
        
        String n= name.getText();
        String r=roll.getText();
        String cla= cl.getText();
        String ph= phy.getText();
        String mt= math.getText();
        String ch= chem.getText();
        
        
            PreparedStatement ptst= conn.prepareStatement(sql);
            ptst.setString(1, id.getText());
            ptst.setString(2, n);
            ptst.setString(3, cla);
            ptst.setString(4, ph);
            ptst.setString(5, ch);
            ptst.setString(6, mt);
            ptst.setString(7, r);
            ptst.setString(8, grade);
            
            ptst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data has been saved");
            
            text.setText("REPORT CARD\n\n Student Name: "+n+"\nClass: "+cla+"\n\n*************************\nMarks\n\nPhysics: "+ph+"\nChemistry: "+ch+
                    "\nMath: "+mt+"\nGrade: "+grade);
            conn.close();
         
        
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        welcome obj =new welcome();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

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
            java.util.logging.Logger.getLogger(reportcard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reportcard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reportcard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reportcard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reportcard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField chem;
    private javax.swing.JTextField cl;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField math;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phy;
    private javax.swing.JTextField roll;
    private javax.swing.JTextPane text;
    // End of variables declaration//GEN-END:variables
}
