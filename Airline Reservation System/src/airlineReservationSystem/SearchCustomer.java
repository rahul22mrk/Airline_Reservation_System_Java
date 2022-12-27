
package airlineReservationSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class SearchCustomer extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddCustomer
     */
    public SearchCustomer()   {
        
            initComponents();
          
            
            // con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "root", "root@123RK");
       
        
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
        jTextArea1 = new javax.swing.JTextArea();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        custID = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        firstNamE = new javax.swing.JLabel();
        fdhd = new javax.swing.JLabel();
        hdfhf = new javax.swing.JLabel();
        hh = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        aadharNo = new javax.swing.JTextField();
        passportNo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        doB = new javax.swing.JLabel();
        ehsa = new javax.swing.JLabel();
        rhdsdhr = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        address_ = new javax.swing.JTextArea();
        contactNo = new javax.swing.JTextField();
        dob_ = new com.toedter.calendar.JDateChooser();
        gender = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        dsh8gsd = new javax.swing.JLabel();
        custIDs = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        custID.setText("jLabel9");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        firstNamE.setForeground(new java.awt.Color(255, 255, 255));
        firstNamE.setText("First Name");

        fdhd.setForeground(new java.awt.Color(255, 255, 255));
        fdhd.setText("Last Name");

        hdfhf.setForeground(new java.awt.Color(255, 255, 255));
        hdfhf.setText("Aadhar No");

        hh.setForeground(new java.awt.Color(255, 255, 255));
        hh.setText("Passport No");

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hh)
                    .addComponent(hdfhf, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fdhd, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstNamE, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fname, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(lname)
                    .addComponent(aadharNo)
                    .addComponent(passportNo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNamE)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fdhd)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hdfhf)
                    .addComponent(aadharNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hh)
                    .addComponent(passportNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        doB.setForeground(new java.awt.Color(255, 255, 255));
        doB.setText("DOB");

        ehsa.setForeground(new java.awt.Color(255, 255, 255));
        ehsa.setText("Contact No");

        rhdsdhr.setForeground(new java.awt.Color(255, 255, 255));
        rhdsdhr.setText("Address");

        address_.setColumns(20);
        address_.setRows(5);
        jScrollPane2.setViewportView(address_);

        gender.setForeground(new java.awt.Color(255, 255, 255));
        gender.setText("Gender");

        male.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        male.setText("Male");

        female.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        female.setText("Female");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ehsa)
                    .addComponent(doB)
                    .addComponent(rhdsdhr)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(gender)))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(contactNo)
                    .addComponent(dob_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(rhdsdhr)
                        .addGap(33, 33, 33)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(doB, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dob_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ehsa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender)
                    .addComponent(male)
                    .addComponent(female))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        dsh8gsd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dsh8gsd.setText("Customer ID");

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(dsh8gsd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(custIDs, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dsh8gsd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(custIDs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //update
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            // this.setVisible(false);
            String id=custIDs.getText();
            String first=fname.getText();
            String last=lname.getText();
            String aadharno=aadharNo.getText();
            String passportno=passportNo.getText();
            String addrs=address_.getText();
            String contactno=contactNo.getText();
            
            DateFormat da=new SimpleDateFormat("yyyy-MM-dd");
            String date=da.format(dob_.getDate());
            //System.out.println(date);
            String gender;
            if(male.isSelected())
            {
                 gender="Male";
            }else{
                 gender="Female";
            }
            Connection con;
            PreparedStatement pt;
          
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","root@123RK");
            pt = con.prepareStatement("update customer set  firstname=?, lastname=?, aadhar=?, passport=?, address=?, dob=?, gender=?, contact=? where custId=?") ;
            pt.setString(9, id);
            pt.setString(1, first);
            pt.setString(2, last);
            pt.setString(3, aadharno);
            pt.setString(4, passportno);
            pt.setString(5, addrs);
            pt.setString(6, date);
            pt.setString(7, gender);
            pt.setString(8, contactno);
            int i=pt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Updated Successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
            
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    //search
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            
            String id=custIDs.getText();

            Connection con;
            PreparedStatement pt;
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE, null, ex);
            }
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","root@123RK");
            pt=con.prepareStatement("select * from customer where custid = ?");
            pt.setString(1, id);
            ResultSet rs=pt.executeQuery();
            if(rs.next()==false)
            {
                JOptionPane.showMessageDialog(null,"The Customer does not exist");
            }else{
                String firstname=rs.getString("firstname");
                String lastname=rs.getString("lastname");
                String aadhar=rs.getString("aadhar");
                String passport=rs.getString("passport");
                String address=rs.getString("address");
                String dob=rs.getString("dob");
                Date date= new SimpleDateFormat("yyyy-MM-dd").parse(dob);
               
                
                String gender=rs.getString("gender");
                if(gender.equals("female"))
                {
                    male.setSelected(false);
                    female.setSelected(true);
                }else{
                    female.setSelected(false);
                    male.setSelected(true);
                }
                String contact=rs.getString("contact");
                fname.setText(firstname);
                lname.setText(lastname);
                aadharNo.setText(aadhar);
                passportNo.setText(passport);
                address_.setText(address);
                dob_.setDate(date);
                contactNo.setText(contact);
            }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadharNo;
    private javax.swing.JTextArea address_;
    private javax.swing.JTextField contactNo;
    private javax.swing.JLabel custID;
    private javax.swing.JTextField custIDs;
    private javax.swing.JLabel doB;
    private com.toedter.calendar.JDateChooser dob_;
    private javax.swing.JLabel dsh8gsd;
    private javax.swing.JLabel ehsa;
    private javax.swing.JLabel fdhd;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel firstNamE;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel hdfhf;
    private javax.swing.JLabel hh;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField lname;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField passportNo;
    private javax.swing.JLabel rhdsdhr;
    // End of variables declaration//GEN-END:variables
}
