/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projet;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.Border;

/**
 *
 * @author ASUS
 */
public class liste extends javax.swing.JFrame {
    private String cin ; 
private String index ;
    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setIndex(String index) {
        this.index = index;
    }
    

  
    

    /**
     * Creates new form liste
     */
    public liste() {
        initComponents();
    }

    public JLabel getLblbienvenu() {
        return lblbienvenu;
    }

    public JLabel getLblimage() {
        return lblimage;
    }
    
    private String image ; 

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbienvenu = new javax.swing.JLabel();
        btnretrait = new javax.swing.JButton();
        btndeposer = new javax.swing.JButton();
        btnconsulter = new javax.swing.JButton();
        btnvirement = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblfermer = new javax.swing.JLabel();
        lbreduit = new javax.swing.JLabel();
        lblimage = new javax.swing.JLabel();
        btndeconnexion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        lblbienvenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblbienvenu.setText("aa");

        btnretrait.setBackground(new java.awt.Color(0, 255, 102));
        btnretrait.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnretrait.setText("retrait ");
        btnretrait.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnretraitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnretraitMouseExited(evt);
            }
        });
        btnretrait.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnretraitActionPerformed(evt);
            }
        });

        btndeposer.setBackground(new java.awt.Color(0, 255, 102));
        btndeposer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btndeposer.setText("deposer ");
        btndeposer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btndeposerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btndeposerMouseExited(evt);
            }
        });
        btndeposer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeposerActionPerformed(evt);
            }
        });

        btnconsulter.setBackground(new java.awt.Color(0, 255, 102));
        btnconsulter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnconsulter.setText("consulter solde ");
        btnconsulter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnconsulterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnconsulterMouseExited(evt);
            }
        });
        btnconsulter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsulterActionPerformed(evt);
            }
        });

        btnvirement.setBackground(new java.awt.Color(0, 255, 102));
        btnvirement.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnvirement.setText("virement ");
        btnvirement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnvirementMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnvirementMouseExited(evt);
            }
        });
        btnvirement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvirementActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("opération disponible ");

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

        lblimage.setMaximumSize(new java.awt.Dimension(185, 156));
        lblimage.setMinimumSize(new java.awt.Dimension(185, 156));
        lblimage.setPreferredSize(new java.awt.Dimension(185, 156));

        btndeconnexion.setBackground(new java.awt.Color(51, 51, 255));
        btndeconnexion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btndeconnexion.setText("deconnexion");
        btndeconnexion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btndeconnexionMouseMoved(evt);
            }
        });
        btndeconnexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btndeconnexionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btndeconnexionMouseExited(evt);
            }
        });
        btndeconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeconnexionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbreduit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblfermer, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btndeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(btndeposer, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnconsulter, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnretrait, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnvirement, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblbienvenu, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblfermer, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbreduit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblbienvenu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btndeposer, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnconsulter, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnretrait, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnvirement, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(btndeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnvirementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvirementActionPerformed
        
          formulaire_virement formulaire = new formulaire_virement() ; 
      formulaire.setVisible(true);
     formulaire.setLocationRelativeTo(null);
        String a = lblbienvenu.getText();
    formulaire.setNom(a);
    formulaire.setImage(index);
    
     this.dispose();
    }//GEN-LAST:event_btnvirementActionPerformed

    private void btndeposerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeposerMouseExited
         btndeposer.setBackground(new Color(0,255,102));
        
    }//GEN-LAST:event_btndeposerMouseExited

    private void lblfermerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfermerMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblfermerMouseClicked

    private void lblfermerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfermerMouseEntered
        Border br = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        lblfermer.setBorder(br);
        lblfermer.setForeground(Color.white);
    }//GEN-LAST:event_lblfermerMouseEntered

    private void lblfermerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfermerMouseExited

        Border br1 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        lblfermer.setBorder(br1);
        lblfermer.setForeground(Color.black);
    }//GEN-LAST:event_lblfermerMouseExited

    private void lbreduitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbreduitMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lbreduitMouseClicked

    private void lbreduitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbreduitMouseEntered

        Border br1 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        lbreduit.setBorder(br1);
        lbreduit.setForeground(Color.white);
    }//GEN-LAST:event_lbreduitMouseEntered

    private void lbreduitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbreduitMouseExited
        Border br1 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        lbreduit.setBorder(br1);
        lbreduit.setForeground(Color.black);
    }//GEN-LAST:event_lbreduitMouseExited

    private void btnconsulterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnconsulterMouseExited
      btnconsulter.setBackground(new Color(0,255,102));
        
    }//GEN-LAST:event_btnconsulterMouseExited

    private void btnretraitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnretraitMouseExited
       btnretrait.setBackground(new Color(0,255,102));
        
    }//GEN-LAST:event_btnretraitMouseExited

    private void btnvirementMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvirementMouseExited
       btnvirement.setBackground(new Color(0,255,102));
        
    }//GEN-LAST:event_btnvirementMouseExited

    private void btndeposerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeposerMouseEntered
        btndeposer.setBackground(new Color(255,51,0));
    }//GEN-LAST:event_btndeposerMouseEntered

    private void btnconsulterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnconsulterMouseEntered
         btnconsulter.setBackground(new Color(255,51,0));
        
    }//GEN-LAST:event_btnconsulterMouseEntered

    private void btnretraitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnretraitMouseEntered
   btnretrait.setBackground(new Color(255,51,0));
        
        
    }//GEN-LAST:event_btnretraitMouseEntered

    private void btnvirementMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvirementMouseEntered
   btnvirement.setBackground(new Color(255,51,0));
    }//GEN-LAST:event_btnvirementMouseEntered

    private void btndeposerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeposerActionPerformed
           formulaire formulaire = new formulaire() ; 
      formulaire.setVisible(true);
     formulaire.setLocationRelativeTo(null);
        String a = lblbienvenu.getText();
    formulaire.setCin(a);
    formulaire.setImage(index);
     this.dispose();
         
    }//GEN-LAST:event_btndeposerActionPerformed

    private void btnconsulterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsulterActionPerformed
           csolde csolde = new csolde() ; 
      csolde.setVisible(true);
     csolde.setLocationRelativeTo(null);
     this.dispose();
     try {
            
            Statement ps ;
            ResultSet rs ;
             cin =lblbienvenu.getText();
            String query = ("SELECT solde FROM users.client WHERE cin ='" + cin + "'") ;
            
             ps = ConnectionBd.getconnection().createStatement() ; 
              
               System.out.println(query);
               rs = ps.executeQuery(query);
            float solde=-1;
           boolean exist=false;
               if(rs.next())
               {
                   exist =true;
                    solde = Float.parseFloat(rs.getString(1)) ;
               }
               System.out.println(solde);
            
           csolde.getLblsolde().setText(solde+" TND");
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                        
                    }
     
     String a = lblbienvenu.getText();
     csolde.setNom(a);
     csolde.setImage(index);
     this.dispose();
     
    }//GEN-LAST:event_btnconsulterActionPerformed

    private void btnretraitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnretraitActionPerformed
          formulaire1 formulaire1 = new formulaire1() ; 
      formulaire1.setVisible(true);
     formulaire1.setLocationRelativeTo(null);
     String a = lblbienvenu.getText();
     formulaire1.setCin(a);
     formulaire1.setImage(index);
     this.dispose();
     
     
    }//GEN-LAST:event_btnretraitActionPerformed

    private void btndeconnexionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeconnexionMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btndeconnexionMouseMoved

    private void btndeconnexionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeconnexionMouseEntered
        btndeconnexion.setBackground(new Color(255,51,0));
    }//GEN-LAST:event_btndeconnexionMouseEntered

    private void btndeconnexionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeconnexionMouseExited
        btndeconnexion.setBackground(new Color(102,255,204));
    }//GEN-LAST:event_btndeconnexionMouseExited

    private void btndeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeconnexionActionPerformed
        this.dispose();
        JOptionPane.showMessageDialog(null, "a bientot  ", "ok ", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btndeconnexionActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new liste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconsulter;
    private javax.swing.JButton btndeconnexion;
    private javax.swing.JButton btndeposer;
    private javax.swing.JButton btnretrait;
    private javax.swing.JButton btnvirement;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblbienvenu;
    private javax.swing.JLabel lblfermer;
    private javax.swing.JLabel lblimage;
    private javax.swing.JLabel lbreduit;
    // End of variables declaration//GEN-END:variables
}