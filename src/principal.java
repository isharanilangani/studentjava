
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.runtime.Debug.id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class principal extends javax.swing.JFrame {
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        con = databaseconnection.connection();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        imageicon = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        select = new javax.swing.JButton();
        past = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        birthday = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        mainmenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Principal");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Age");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Address");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Gender");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Birthday");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("Contact Number");

        imageicon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        imageicon.setForeground(new java.awt.Color(153, 0, 0));
        imageicon.setText("image");

        search.setBackground(new java.awt.Color(153, 0, 0));
        search.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        search.setForeground(new java.awt.Color(153, 0, 0));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        select.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        select.setForeground(new java.awt.Color(153, 0, 0));
        select.setText("Select Pane");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        past.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        past.setForeground(new java.awt.Color(153, 0, 0));
        past.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "past", "present" }));

        add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(153, 0, 0));
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(153, 0, 0));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(153, 0, 0));

        age.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        age.setForeground(new java.awt.Color(153, 0, 0));

        birthday.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        birthday.setForeground(new java.awt.Color(153, 0, 0));

        contact.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        contact.setForeground(new java.awt.Color(153, 0, 0));

        address.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        address.setForeground(new java.awt.Color(153, 0, 0));

        gender.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(153, 0, 0));
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Male", "Female" }));

        mainmenu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mainmenu.setForeground(new java.awt.Color(153, 0, 0));
        mainmenu.setText("Main/Menu");
        mainmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(199, 199, 199)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(select)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(imageicon, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(13, 13, 13)))
                                        .addGap(92, 92, 92)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(search))
                                    .addComponent(past, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(add)
                                        .addGap(29, 29, 29)
                                        .addComponent(update))))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainmenu)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(search))
                    .addComponent(imageicon, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select)
                    .addComponent(past, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(update)
                    .addComponent(jLabel3)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(birthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(mainmenu)
                .addContainerGap())
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

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        try{
           
            stmt = con.createStatement();
            
            int sid = Integer.parseInt(id.getText());
            String sname = name.getText();
            String saddress = address.getText();
            int sage = Integer.parseInt(age.getText());
            String sbirthday = birthday.getText();
            String sgender = (String) gender.getSelectedItem();
            int scontact = Integer.parseInt(contact.getText());
            String pastpresent = (String)past.getSelectedItem();
            
            
            String query = "INSERT INTO princi (id,name,address,age,birthday,gender,contact,image,pastpresent)VALUES(?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement preparedstmt =con.prepareStatement(query);
            
            preparedstmt.setInt(1,sid);
            preparedstmt.setString(2,sname);
            preparedstmt.setString(3, saddress);
            preparedstmt.setInt(4, sage);
            preparedstmt.setString(5, sbirthday);
            preparedstmt.setString(6, sgender);
            preparedstmt.setInt(7, scontact);
            preparedstmt.setBytes(8, photo);
            preparedstmt.setString(9, pastpresent);
            
   
            preparedstmt.execute();
            JOptionPane.showMessageDialog(null, "ADDED");
        }
        catch(Exception e){
            System.out.println(e);
        }                                       
    }//GEN-LAST:event_addActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        imageicon.setIcon(new ImageIcon(file.toString()));
        filename = file.getAbsolutePath();
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            
            for(int readnum;(readnum = fis.read(buf)) != -1;){
            bos.write(buf,0,readnum);
        }
            photo = bos.toByteArray();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_selectActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        try{
            stmt = con.createStatement();
            
            int sid = Integer.parseInt(id.getText());
            
            String query = "SELECT * FROM princi";
            
            rs = stmt.executeQuery(query);
            
            while(rs.next()){
                if(sid == rs.getInt("id")){
                    name.setText(rs.getString("name"));
                    address.setText(rs.getString("address"));
                    age.setText(String.format("%s",rs.getInt("age")));
                    birthday.setText(rs.getString("birthday"));
                    gender.setSelectedItem(rs.getString("gender"));
                    contact.setText(String.format(0+ "%s",rs.getInt("contact")));
                    past.setSelectedItem(rs.getString("pastpresent"));
                    
                    BufferedImage image = ImageIO.read(rs.getBinaryStream("image"));
                    imageicon.setIcon(new ImageIcon(image));
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try{
            stmt = con.createStatement();
            
            int sid = Integer.parseInt(id.getText());
            String sname = name.getText();
            String saddress = address.getText();
            int sage = Integer.parseInt(age.getText());
            String sbirthday = birthday.getText();
            String sgender = (String) gender.getSelectedItem();
            int scontact = Integer.parseInt(contact.getText());
            String pastpresent = (String)past.getSelectedItem();
            
            String query = "UPDATE princi SET name=?,address=?,age=?,birthday=?,gender=?,contact=?,image=?,pastpresent=? WHERE id=?";
            
            PreparedStatement preparedstmt =con.prepareStatement(query);
            
            preparedstmt.setString(1,sname);
            preparedstmt.setString(2, saddress);
            preparedstmt.setInt(3, sage);
            preparedstmt.setString(4, sbirthday);
            preparedstmt.setString(5, sgender);
            preparedstmt.setInt(6, scontact);
            preparedstmt.setBytes(7, photo);
            preparedstmt.setString(8,pastpresent);
            preparedstmt.setInt(9,sid);
   
            preparedstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "UPDATED");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void mainmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenuActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        home view = new home();
        view.setVisible(true);
    }//GEN-LAST:event_mainmenuActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTextField birthday;
    private javax.swing.JTextField contact;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField id;
    private javax.swing.JLabel imageicon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mainmenu;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> past;
    private javax.swing.JButton search;
    private javax.swing.JButton select;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
private byte[] photo;
String filename =null;
}
