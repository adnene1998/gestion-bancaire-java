/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.awt.Color;
import java.awt.Menu;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.JOptionPane;
import java.sql.* ; 
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author ASUS
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    
    private boolean verifdonner() {
       return(tcin.getText().equals("")||password.getText().equals(""));
    }
    public login() {
        initComponents();
          Border boderpanel = BorderFactory.createMatteBorder(3, 3, 3, 3, Color.green);
       panel_login.setBorder(boderpanel);
       Border boderlabel = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
       lblfermer.setBorder(boderlabel);
       lbreduit.setBorder(boderlabel);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblfermer = new javax.swing.JLabel();
        lbreduit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        tcin = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();
        lbregistre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_login.setBackground(new java.awt.Color(204, 204, 204));
        panel_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 0, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("login");
        jLabel1.setOpaque(true);
        panel_login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 210, 60));

        lblfermer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblfermer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfermer.setText("X");
        lblfermer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblfermerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblfermerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblfermerMouseExited(evt);
            }
        });
        panel_login.add(lblfermer, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 20, 20));

        lbreduit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbreduit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbreduit.setText("-");
        lbreduit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbreduitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbreduitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbreduitMouseExited(evt);
            }
        });
        panel_login.add(lbreduit, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 20, 20));

        getContentPane().add(panel_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 100));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText(" password : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 170, 40));

        jLabel5.setBackground(new java.awt.Color(51, 51, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("cin : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 170, 40));

        password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 240, 40));

        tcin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tcin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcinActionPerformed(evt);
            }
        });
        getContentPane().add(tcin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 240, 40));

        btnlogin.setBackground(new java.awt.Color(0, 255, 102));
        btnlogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnlogin.setText("login");
        btnlogin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnloginMouseMoved(evt);
            }
        });
        btnlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnloginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnloginMouseExited(evt);
            }
        });
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 310, 60));

        lbregistre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbregistre.setForeground(new java.awt.Color(255, 51, 0));
        lbregistre.setText(" >> vous n'avez pas compte , inscrivez vous");
        lbregistre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbregistreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbregistreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbregistreMouseExited(evt);
            }
        });
        getContentPane().add(lbregistre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 320, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
     if(verifdonner()){
         JOptionPane.showMessageDialog(null, "SVP remplissez le champ vide ");
     }
     else {
         PreparedStatement ps ; 
         ResultSet rs ; 
         String cin = tcin.getText() ; 
         String motdepasse =  password.getText() ;
         String query = ("SELECT cin,motdepasse,image FROM users.client WHERE cin =? AND motdepasse=?") ; 
         try {
             ps = ConnectionBd.getconnection().prepareStatement(query) ; 
             ps.setString(1, cin);
             ps.setString(2, motdepasse);
             rs=ps.executeQuery() ; 
             if(rs.next()){
                  try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
            /*for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }*/
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(liste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(liste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(liste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(liste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            liste liste=new liste();
             
               liste.setLocationRelativeTo(null);
               liste.getLblbienvenu().setText(rs.getString(1));
               String image1 =rs.getString(3);
               liste.setIndex(image1);
               System.out.println(image1);
            liste.setImage(image1);
               
                int width = 138;    //width of the image
           int height = 103;   //height of the image
           BufferedImage image = null;
           
           try
             {
                File input_file = new File("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\projet\\src\\images\\"+image1); //image file path
                image = new BufferedImage(width, height,
                                     BufferedImage.TYPE_INT_ARGB);
                image = ImageIO.read(input_file);
                System.out.println("Reading complete.");
                  liste.setVisible(true);
             }
        catch(IOException ex)
          {
          ex.printStackTrace(); 
    }
           liste.getLblimage().setIcon(new ImageIcon(image));
 
               this.dispose(); 
             }
             else  {
           //JOptionPane.showMessageDialog(null, "il nexiste pas un utilisateur avec ses coordonnés ", "information incorrect ",JOptionPane.ERROR_MESSAGE);
                 PreparedStatement ps1 ; 
         ResultSet rs1 ; 
         String cin1 = tcin.getText() ; 
         String motdepasse1 =  password.getText() ;
         String query1 = ("SELECT cin,motdepasse FROM users.agent WHERE cin =? AND motdepasse=?") ; 
          ps1 = ConnectionBd.getconnection().prepareStatement(query1) ; 
             ps1.setString(1, cin1);
             ps1.setString(2, motdepasse1);
             rs1=ps1.executeQuery() ; 
             if(rs1.next()){
                  try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
            /*for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }*/
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(liste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(liste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(liste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(liste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
                 
            banquier banquier = new banquier() ; 
      banquier.setVisible(true);
     banquier.setLocationRelativeTo(null);
     this.dispose();
             }
             else 
              JOptionPane.showMessageDialog(null, "il nexiste pas un utilisateur avec ses coordonnés ", "information incorrect ",JOptionPane.ERROR_MESSAGE);   
                 
         
         
         
             }

         }catch(Exception ex) {
           JOptionPane.showMessageDialog(null, "connexion echoué ", " ",JOptionPane.ERROR_MESSAGE);  
         }
     }
    
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnloginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseMoved
    }//GEN-LAST:event_btnloginMouseMoved

    private void btnloginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseExited
        btnlogin.setBackground(new Color(0,255,102));

    }//GEN-LAST:event_btnloginMouseExited

    private void btnloginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseEntered
       btnlogin.setBackground(new Color(0,255,204));
       
    }//GEN-LAST:event_btnloginMouseEntered

    private void lblfermerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfermerMouseEntered
Border br = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
lblfermer.setBorder(br);
lblfermer.setForeground(Color.white);
    }//GEN-LAST:event_lblfermerMouseEntered

    private void lbreduitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbreduitMouseEntered

Border br1 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
lbreduit.setBorder(br1);
lbreduit.setForeground(Color.white);
    }//GEN-LAST:event_lbreduitMouseEntered

    private void lblfermerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfermerMouseExited
 
    Border br1 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
lblfermer.setBorder(br1);
lblfermer.setForeground(Color.black);
    }//GEN-LAST:event_lblfermerMouseExited

    private void lbreduitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbreduitMouseExited
Border br1 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
lbreduit.setBorder(br1);
lbreduit.setForeground(Color.black);
        
    }//GEN-LAST:event_lbreduitMouseExited

    private void lblfermerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfermerMouseClicked
       System.exit(0);
    }//GEN-LAST:event_lblfermerMouseClicked

    private void lbreduitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbreduitMouseClicked
         this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lbreduitMouseClicked

    private void lbregistreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbregistreMouseClicked
      inscription inscription = new inscription() ; 
      inscription.setVisible(true);
     inscription.setLocationRelativeTo(null);
     this.dispose();
    }//GEN-LAST:event_lbregistreMouseClicked

    private void lbregistreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbregistreMouseEntered
lbregistre.setForeground(Color.white);
    }//GEN-LAST:event_lbregistreMouseEntered

    private void lbregistreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbregistreMouseExited
    lbregistre.setForeground(new Color(255,51,0));
    }//GEN-LAST:event_lbregistreMouseExited

    private void tcinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcinActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
        
        login login=new login() ; 
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblfermer;
    private javax.swing.JLabel lbreduit;
    private javax.swing.JLabel lbregistre;
    private javax.swing.JPanel panel_login;
    private javax.swing.JTextField password;
    private javax.swing.JTextField tcin;
    // End of variables declaration//GEN-END:variables
}
