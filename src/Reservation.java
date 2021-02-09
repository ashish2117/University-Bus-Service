
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Reservation extends javax.swing.JFrame {
      private String username;
      String vehicleid=null;
    /**
     * Creates new form Reservation
     */
    public Reservation() {
        initComponents();
    }
     public Reservation(String s) {
        initComponents();
        username=s;
        loggedin.setText(loggedin.getText()+username);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        dest = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        depdate = new javax.swing.JTextField();
        staff_id = new javax.swing.JTextField();
        deptime = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vehtype = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        updest = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        updepdate = new javax.swing.JTextField();
        upstaff = new javax.swing.JTextField();
        updeptime = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        upveh = new javax.swing.JComboBox<>();
        update = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        upres = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        delresno = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        loggedin = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        jLabel1.setText("Reservation");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("Vehicle Type");

        jLabel3.setText("Departure Date");

        jLabel4.setText("Departure Time");

        jLabel5.setText("Destination");

        jLabel2.setText("Staff  ID");

        vehtype.setEditable(true);
        vehtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sedan", "station wagon", "utility vehicle", "minivan", "minibus" }));
        vehtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehtypeActionPerformed(evt);
            }
        });

        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(depdate, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deptime, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dest, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(staff_id, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vehtype, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jButton1)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(staff_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(deptime, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(vehtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(depdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("New Reservation", jPanel1);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        updest.setEditable(false);

        jLabel22.setText("Vehicle Type");

        jLabel23.setText("Departure Date");

        jLabel24.setText("Departure Time");

        updepdate.setEditable(false);

        upstaff.setEditable(false);

        updeptime.setEditable(false);

        jLabel25.setText("Destination");

        jLabel26.setText("Staff  ID");

        upveh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "station wagon", "utility vehicle", "minivan", "minibus", "sedan" }));
        upveh.setEnabled(false);

        update.setText("Update>>");
        update.setEnabled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel27.setText("Reservation No.");

        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel27)
                            .addComponent(jLabel24))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upres, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(upveh, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(updest, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(updepdate, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(updeptime, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(upstaff, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(update))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jButton6)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(upres, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(upstaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(updest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updeptime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upveh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(updepdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(update)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Edit Reservation", jPanel7);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        delresno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delresnoActionPerformed(evt);
            }
        });

        jLabel28.setText("Reservation No.");

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel28)
                        .addGap(52, 52, 52)
                        .addComponent(delresno, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(delete)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delresno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(37, 37, 37)
                .addComponent(delete)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cancel reservation", jPanel2);

        loggedin.setText("logged In as:");

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(156, 156, 156)
                            .addComponent(jLabel1)
                            .addGap(85, 85, 85)
                            .addComponent(loggedin))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(loggedin)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            Calendar cal=Calendar.getInstance();
            cal.roll(Calendar.DATE, -1);
            String date11[]=(depdate.getText().trim().split("-"));
            int yyy=Integer.parseInt(date11[0]);
            int ddd=Integer.parseInt(date11[1]);
            int mmm=Integer.parseInt(date11[2]);
             Date logd=new Date(yyy,mmm,ddd);
             if(logd.before(cal.getTime()))
                 throw new Exception("Invalid date");
            Connection c=MyConnection.createCon();
            PreparedStatement p=c.prepareStatement("insert into reservation(staff_id,v_type,dep_date,dep_time,destination,v_no) values(?,?,?,?,?,?);");
            PreparedStatement ps=c.prepareStatement("select v_no from vehicle where v_type=?");
            ps.setString(1, vehtype.getSelectedItem().toString());
            ResultSet r=ps.executeQuery();
            if(!r.next())
            throw new Exception("No vehicle available of this type");
            vehicleid=r.getString(1);
            p.setString(1, staff_id.getText().trim());
            p.setString(2, vehtype.getSelectedItem().toString());
            p.setString(3, depdate.getText().trim());
            p.setString(4, deptime.getText().trim());
            p.setString(5, dest.getText().trim());
            p.setString(6, vehicleid);
            int rows=p.executeUpdate();
            if(rows==0)
            throw new Exception("Failed!");
            else
            {
                Statement p1=c.createStatement();
                ResultSet rrr=p1.executeQuery("select max(res_no) from reservation");
                rrr.next();
                String ss=rrr.getString(1);
               PreparedStatement pre=c.prepareStatement("update vehicle set reserved=true where v_no=?");
               pre.setString(1, vehicleid);
               pre.executeUpdate();
               JOptionPane.showMessageDialog(null,"Reserved,Your Reservation number is:"+ss+" and Vehicle number is:"+vehicleid);
               
            }
        }
        catch(Exception e)
        {
            if(e.getMessage().substring(0, 6).equals("Cannot"))
              JOptionPane.showMessageDialog(null, "Enter Valid Staff Id");
            else
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try
        {
            Connection cc=MyConnection.createCon();
            PreparedStatement st=cc.prepareStatement("select * from reservation where res_no=?;");
            st.setString(1, upres.getText().trim());
            ResultSet res=st.executeQuery();
            if(res.next()==false)
            throw new Exception("Not found!!");
            upstaff.setEditable(true);
            upveh.enable();
            updepdate.setEditable(true);
            updeptime.setEditable(true);
            updest.setEditable(true);
            update.setEnabled(true);
            
            upstaff.setText(res.getString(2));
            upveh.setSelectedItem(res.getString(3));
            updepdate.setText(res.getString(4));
            updeptime.setText(res.getString(5));
            updest.setText(res.getString(6));

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed
        
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try
        {

            Connection c=MyConnection.createCon();
            PreparedStatement ps=c.prepareStatement("select v_no from vehicle where v_type=?");
            ps.setString(1, upveh.getSelectedItem().toString());
            ResultSet r=ps.executeQuery();
            if(!r.next())
            throw new Exception("No vehicle available of this type");
            vehicleid=r.getString(1);
            PreparedStatement p=c.prepareStatement("update reservation set staff_id=?,v_type=?,dep_date=?,dep_time=?,destination=?,v_no=? where res_no=?");
            p.setString(1, upstaff.getText().trim());
            p.setString(2, upveh.getSelectedItem().toString());
            p.setString(3, updepdate.getText().trim());
            p.setString(4, updeptime.getText().trim());
            p.setString(5, updest.getText().trim());
            p.setString(6, vehicleid);
            p.setString(7, upres.getText().trim());
            int rows=p.executeUpdate();
            if(rows==0)
            throw new Exception("Failed!");
            else
            JOptionPane.showMessageDialog(null,"Updated, your vehicle Id is "+vehicleid );
        }
        catch(Exception e)
        {
            if(e.getMessage().substring(0, 6).equals("Cannot"))
              JOptionPane.showMessageDialog(null, "Enter Valid Staff Id");
            else
            JOptionPane.showMessageDialog(null, e.getMessage());
        }// TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try
        {
            Connection c=MyConnection.createCon();
            PreparedStatement p1=c.prepareStatement("select * from reservation where res_no=?");
            p1.setString(1, delresno.getText().trim());
            ResultSet rr=p1.executeQuery();
            if(rr.next()==false)
            throw new Exception("Not Found!!");
            PreparedStatement pp=c.prepareStatement("delete from  tripcompletion where res_no=?");
            pp.setString(1, delresno.getText().trim());
            int rowss=pp.executeUpdate();
            PreparedStatement p=c.prepareStatement("delete from reservation where res_no=?");
            p.setString(1, delresno.getText().trim());
            int rows=p.executeUpdate();
            if(rows==0)
            throw new Exception("Failed!");
            else
            JOptionPane.showMessageDialog(null,"Deleted" );
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void delresnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delresnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delresnoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Homepage hm=new Homepage(username);
              hm.setLocationRelativeTo(null);
              hm.setVisible(true);
              dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void vehtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehtypeActionPerformed

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
                if ("Wondows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JTextField delresno;
    private javax.swing.JTextField depdate;
    private javax.swing.JTextField deptime;
    private javax.swing.JTextField dest;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel loggedin;
    private javax.swing.JTextField staff_id;
    private javax.swing.JButton update;
    private javax.swing.JTextField updepdate;
    private javax.swing.JTextField updeptime;
    private javax.swing.JTextField updest;
    private javax.swing.JTextField upres;
    private javax.swing.JTextField upstaff;
    private javax.swing.JComboBox<String> upveh;
    private javax.swing.JComboBox<String> vehtype;
    // End of variables declaration//GEN-END:variables
}
