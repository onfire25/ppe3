/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppe3;

import com.karimandco.auth.Utilisateur;
import com.karimandco.cv.CreationDuCV;
import com.karimandco.pdf.VoirPdf;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;

/**
 *
 * @author Galdr
 */
public class CV extends javax.swing.JFrame {

    /**
     * Creates new form CV
     */
    public CV() {
        super();
        initComponents();
        jPanelConnexionChiffre1.lienCV = this;
        jLayeredPaneInscription.hide();
        jLayeredPaneCreationCV.hide();
        jLayeredPaneAdministrateur.hide();
        creationCV.hide();
        administrateur.hide();
        jPanelConnexionChiffre1.getPanneauIdentifiant().getChamp2().setText("testtest");
        jPanelConnexionChiffre1.getPanneauMdp().getChampSecret1().setText("1234567890");
    }

    public JMenu getAdministrateur() {
        return administrateur;
    }

    public JMenu getCreationCV() {
        return creationCV;
    }

    public JMenu getConnexion() {
        return connexion;
    }

    public JMenu getInscription() {
        return inscription;
    }

    public CreationDuCV getCreationDuCV2() {
        return creationDuCV2;
    }

    public JLayeredPane getjLayeredPaneInscription() {
        return jLayeredPaneInscription;
    }

    public JPanelConnexionChiffre getjPanelConnexionChiffre1() {
        return jPanelConnexionChiffre1;
    }

    public JLayeredPane getjLayeredPaneCreationCV() {
        return jLayeredPaneCreationCV;
    }

    public VoirPdf getVoirPdf2() {
        return voirPdf2;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanelConnexion = new javax.swing.JPanel();
        jPanelConnexionChiffre1 = new ppe3.JPanelConnexionChiffre();
        jLayeredPaneInscription = new javax.swing.JLayeredPane();
        panneauFormInscription2 = new com.karimandco.auth.PanneauFormInscription();
        jLayeredPaneCreationCV = new javax.swing.JLayeredPane();
        creationDuCV2 = new com.karimandco.cv.CreationDuCV();
        voirPdf2 = new com.karimandco.pdf.VoirPdf();
        xML1 = new xml.XML1();
        jLayeredPaneAdministrateur = new javax.swing.JLayeredPane();
        panneauAdministration2 = new com.karimandco.admin.PanneauAdministration();
        jMenuBar1 = new javax.swing.JMenuBar();
        connexion = new javax.swing.JMenu();
        inscription = new javax.swing.JMenu();
        creationCV = new javax.swing.JMenu();
        administrateur = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanelConnexionLayout = new javax.swing.GroupLayout(jPanelConnexion);
        jPanelConnexion.setLayout(jPanelConnexionLayout);
        jPanelConnexionLayout.setHorizontalGroup(
            jPanelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConnexionLayout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(jPanelConnexionChiffre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(724, Short.MAX_VALUE))
        );
        jPanelConnexionLayout.setVerticalGroup(
            jPanelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConnexionLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jPanelConnexionChiffre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        jLayeredPaneInscription.setLayer(panneauFormInscription2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPaneInscriptionLayout = new javax.swing.GroupLayout(jLayeredPaneInscription);
        jLayeredPaneInscription.setLayout(jLayeredPaneInscriptionLayout);
        jLayeredPaneInscriptionLayout.setHorizontalGroup(
            jLayeredPaneInscriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneInscriptionLayout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(panneauFormInscription2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(875, Short.MAX_VALUE))
        );
        jLayeredPaneInscriptionLayout.setVerticalGroup(
            jLayeredPaneInscriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneInscriptionLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(panneauFormInscription2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jLayeredPaneCreationCV.setLayer(creationDuCV2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneCreationCV.setLayer(voirPdf2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneCreationCV.setLayer(xML1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPaneCreationCVLayout = new javax.swing.GroupLayout(jLayeredPaneCreationCV);
        jLayeredPaneCreationCV.setLayout(jLayeredPaneCreationCVLayout);
        jLayeredPaneCreationCVLayout.setHorizontalGroup(
            jLayeredPaneCreationCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneCreationCVLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(creationDuCV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jLayeredPaneCreationCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPaneCreationCVLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(xML1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPaneCreationCVLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(voirPdf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jLayeredPaneCreationCVLayout.setVerticalGroup(
            jLayeredPaneCreationCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPaneCreationCVLayout.createSequentialGroup()
                .addComponent(creationDuCV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPaneCreationCVLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voirPdf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xML1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        jLayeredPaneAdministrateur.setLayer(panneauAdministration2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPaneAdministrateurLayout = new javax.swing.GroupLayout(jLayeredPaneAdministrateur);
        jLayeredPaneAdministrateur.setLayout(jLayeredPaneAdministrateurLayout);
        jLayeredPaneAdministrateurLayout.setHorizontalGroup(
            jLayeredPaneAdministrateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPaneAdministrateurLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panneauAdministration2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPaneAdministrateurLayout.setVerticalGroup(
            jLayeredPaneAdministrateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneAdministrateurLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(panneauAdministration2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        connexion.setText("Connexion");
        connexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                connexionMouseClicked(evt);
            }
        });
        jMenuBar1.add(connexion);

        inscription.setText("Inscription");
        inscription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inscriptionMouseClicked(evt);
            }
        });
        jMenuBar1.add(inscription);

        creationCV.setText("Création du CV");
        creationCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creationCVMouseClicked(evt);
            }
        });
        jMenuBar1.add(creationCV);

        administrateur.setText("Administrateur");
        administrateur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                administrateurMouseClicked(evt);
            }
        });
        jMenuBar1.add(administrateur);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelConnexion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPaneInscription))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPaneCreationCV))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPaneAdministrateur, javax.swing.GroupLayout.Alignment.TRAILING))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelConnexion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPaneInscription))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPaneCreationCV, javax.swing.GroupLayout.Alignment.TRAILING))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPaneAdministrateur))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connexionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connexionMouseClicked
        jLayeredPaneInscription.hide();
        jPanelConnexion.show();
        jLayeredPaneCreationCV.hide();
        jLayeredPaneAdministrateur.hide();
    }//GEN-LAST:event_connexionMouseClicked

    private void inscriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inscriptionMouseClicked
        jLayeredPaneInscription.show();
        jPanelConnexion.hide();
        jLayeredPaneCreationCV.hide();
        jLayeredPaneAdministrateur.hide();
    }//GEN-LAST:event_inscriptionMouseClicked

    private void creationCVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creationCVMouseClicked
        jLayeredPaneInscription.hide();
        jPanelConnexion.hide();
        jLayeredPaneCreationCV.show();
        jLayeredPaneAdministrateur.hide();
        creationDuCV2.setIdUtilisateur(Utilisateur.getInstance().getId());

    }//GEN-LAST:event_creationCVMouseClicked

    private void administrateurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_administrateurMouseClicked
        jLayeredPaneInscription.hide();
        jPanelConnexion.hide();
        jLayeredPaneCreationCV.hide();
        jLayeredPaneAdministrateur.show();
    }//GEN-LAST:event_administrateurMouseClicked

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
            java.util.logging.Logger.getLogger(CV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CV().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu administrateur;
    private javax.swing.JMenu connexion;
    private javax.swing.JMenu creationCV;
    private com.karimandco.cv.CreationDuCV creationDuCV2;
    private javax.swing.JMenu inscription;
    private javax.swing.JLayeredPane jLayeredPaneAdministrateur;
    private javax.swing.JLayeredPane jLayeredPaneCreationCV;
    private javax.swing.JLayeredPane jLayeredPaneInscription;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelConnexion;
    private ppe3.JPanelConnexionChiffre jPanelConnexionChiffre1;
    private com.karimandco.admin.PanneauAdministration panneauAdministration2;
    private com.karimandco.auth.PanneauFormInscription panneauFormInscription2;
    private com.karimandco.pdf.VoirPdf voirPdf2;
    private xml.XML1 xML1;
    // End of variables declaration//GEN-END:variables
}