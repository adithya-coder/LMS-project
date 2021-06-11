
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import  java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruvinya
 */
public class UpdateDeleteStudents extends javax.swing.JFrame {
    
    
    public  void  clear(){
        
        jTextFieldStudentID.setEditable(true);
        jTextFieldName.setText(" ");
        jTextFieldDepartment.setText(" ");
        jTextFieldBatch.setText(" ");
        jTextFieldCourse.setText(" ");
       jTextFieldEmailAddress.setText(" ");
        jTextFieldPhoneNumber.setText(" ");
        
    }

    /**
     * Creates new form UpdateDeleteStudents
     */
    public UpdateDeleteStudents() {
        initComponents();
        setSize(1079,730);
        setLocation(570,170);
        setResizable(false);
        showDate();
        showTime();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
    }
    
        void showDate() {

        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        jLabelDate.setText(s.format(d));

    }

    void showTime() {

        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss");
                jLabelTime.setText(s.format(d));
            }

        }).start();

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelStudentID = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelDepartment = new javax.swing.JLabel();
        jLabelBatch = new javax.swing.JLabel();
        jLabelCourse = new javax.swing.JLabel();
        jLabelEmailAddress = new javax.swing.JLabel();
        jTextFieldStudentID = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldEmailAddress = new javax.swing.JTextField();
        jLabelPhoneNumber = new javax.swing.JLabel();
        jTextFieldPhoneNumber = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jLabelTime = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jTextFieldDepartment = new javax.swing.JTextField();
        jTextFieldBatch = new javax.swing.JTextField();
        jTextFieldCourse = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(140, 131, 129));

        jLabelStudentID.setBackground(new java.awt.Color(49, 47, 76));
        jLabelStudentID.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabelStudentID.setForeground(new java.awt.Color(49, 47, 76));
        jLabelStudentID.setText("Student  ID");

        jLabelName.setBackground(new java.awt.Color(49, 47, 76));
        jLabelName.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(49, 47, 76));
        jLabelName.setText("Name");

        jLabelDepartment.setBackground(new java.awt.Color(49, 47, 76));
        jLabelDepartment.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabelDepartment.setForeground(new java.awt.Color(49, 47, 76));
        jLabelDepartment.setText("Department");

        jLabelBatch.setBackground(new java.awt.Color(49, 47, 76));
        jLabelBatch.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabelBatch.setForeground(new java.awt.Color(49, 47, 76));
        jLabelBatch.setText("Batch");

        jLabelCourse.setBackground(new java.awt.Color(49, 47, 76));
        jLabelCourse.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabelCourse.setForeground(new java.awt.Color(49, 47, 76));
        jLabelCourse.setText("Course");

        jLabelEmailAddress.setBackground(new java.awt.Color(49, 47, 76));
        jLabelEmailAddress.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabelEmailAddress.setForeground(new java.awt.Color(49, 47, 76));
        jLabelEmailAddress.setText("Email  Address");

        jTextFieldStudentID.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldStudentID.setForeground(new java.awt.Color(102, 102, 102));

        jTextFieldName.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldName.setForeground(new java.awt.Color(102, 102, 102));

        jTextFieldEmailAddress.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldEmailAddress.setForeground(new java.awt.Color(102, 102, 102));

        jLabelPhoneNumber.setBackground(new java.awt.Color(49, 47, 76));
        jLabelPhoneNumber.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabelPhoneNumber.setForeground(new java.awt.Color(49, 47, 76));
        jLabelPhoneNumber.setText("Phone  Number");

        jTextFieldPhoneNumber.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldPhoneNumber.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhoneNumberActionPerformed(evt);
            }
        });

        jButtonSearch.setBackground(new java.awt.Color(208, 158, 167));
        jButtonSearch.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jButtonSearch.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-search-30 (1).png"))); // NOI18N
        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jButtonUpdate.setBackground(new java.awt.Color(49, 47, 76));
        jButtonUpdate.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-update-user-40.png"))); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setBackground(new java.awt.Color(209, 117, 89));
        jButtonDelete.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-delete-40.png"))); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonClear.setBackground(new java.awt.Color(49, 47, 76));
        jButtonClear.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-erase-40.png"))); // NOI18N
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/abcd.gif"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/unnamed (1).jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(209, 117, 89));
        jLabel3.setText("UPDATE  AND  DELETE  STUDENTS");

        jLabelDate.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabelDate.setForeground(new java.awt.Color(0, 204, 102));
        jLabelDate.setText("Date");

        jLabelTime.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabelTime.setForeground(new java.awt.Color(0, 204, 102));
        jLabelTime.setText("Time");

        jLabelClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-close-window-40.png"))); // NOI18N
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jTextFieldDepartment.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jTextFieldBatch.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jTextFieldCourse.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldCourse.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelClose))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelStudentID)
                            .addComponent(jLabelName)
                            .addComponent(jLabelDepartment)
                            .addComponent(jLabelBatch)
                            .addComponent(jLabelCourse)
                            .addComponent(jLabelEmailAddress)
                            .addComponent(jLabelPhoneNumber)
                            .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(473, 473, 473)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabelDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTime)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelClose)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelStudentID)
                            .addComponent(jTextFieldStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSearch))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelName)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDepartment)
                            .addComponent(jTextFieldDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBatch)
                            .addComponent(jTextFieldBatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCourse)
                            .addComponent(jTextFieldCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEmailAddress)
                            .addComponent(jTextFieldEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPhoneNumber)
                            .addComponent(jTextFieldPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonClear))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDate)
                    .addComponent(jLabelTime))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneNumberActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
       
        String studentID  =   jTextFieldStudentID.getText();
        
        try{
            
            Statement st = database.connect().createStatement();
            ResultSet  rs  = st.executeQuery("SELECT * FROM  student where studentID= '"+studentID+"' ");
            if(rs.first())
            {
                 jTextFieldStudentID.setEditable(false);
                 jTextFieldName.setText(rs.getString("name"));
                 jTextFieldDepartment.setText(rs.getString("department"));
                 jTextFieldBatch.setText(rs.getString("batch"));
                 jTextFieldCourse.setText(rs.getString("course"));
                 jTextFieldEmailAddress.setText(rs.getString("emailAddress"));
                 jTextFieldPhoneNumber.setText(rs.getString("phoneNumber"));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Student  does  not  Exist");
                clear( );
            }
        }
        catch(Exception e){
              JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
       String  studentID  =  jTextFieldStudentID.getText( );
       String  name  =   jTextFieldName.getText( );
       String  emailAddress  =   jTextFieldEmailAddress.getText( );
       String  phoneNumber  =  jTextFieldPhoneNumber.getText( );
       
       try{
            Statement s = database.connect().createStatement();
            
            
            s.executeUpdate("UPDATE  student  SET name='"+name+"',emailAddress='"+ emailAddress+"',phoneNumber='"+phoneNumber+"' where studentID='"+studentID+"' ");
            JOptionPane.showMessageDialog(null, "Successfully  Updated");
            clear();
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
           
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
       new Home().setVisible(true);this.dispose();
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
       String  studentID  = jTextFieldStudentID.getText();
       
       try
       {
           
            Statement st = database.connect().createStatement();
            st.executeUpdate("DELETE  FROM  student  WHERE  studentID = '"+studentID+"' ");
            JOptionPane.showMessageDialog(null, "Successfully  Deleted");
            clear();
       }
       catch(Exception e)
       {
            JOptionPane.showMessageDialog(null,e);
       }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        clear();
    }//GEN-LAST:event_jButtonClearActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateDeleteStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDeleteStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBatch;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelCourse;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelDepartment;
    private javax.swing.JLabel jLabelEmailAddress;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPhoneNumber;
    private javax.swing.JLabel jLabelStudentID;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldBatch;
    private javax.swing.JTextField jTextFieldCourse;
    private javax.swing.JTextField jTextFieldDepartment;
    private javax.swing.JTextField jTextFieldEmailAddress;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhoneNumber;
    private javax.swing.JTextField jTextFieldStudentID;
    // End of variables declaration//GEN-END:variables
}
