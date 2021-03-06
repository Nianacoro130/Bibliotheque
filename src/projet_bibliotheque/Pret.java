/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_bibliotheque;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author nianacoro
 */
public class Pret extends javax.swing.JFrame {


    
   
    /**
     * 
     * 
     * Creates new form Pret
     */
    public Pret() {
        initComponents();
        this.Liste();    
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
        numcarte = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFcodeo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFdate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFnbO = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        Menu = new javax.swing.JMenuBar();
        jMenuAccueil = new javax.swing.JMenu();
        jMenuAchat = new javax.swing.JMenu();
        jMenuPret = new javax.swing.JMenu();
        jMenuRetour = new javax.swing.JMenu();
        jMenuInscription = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("EMPRUNT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("NUMERO DE CARTE");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("VALIDER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("CODE DE L'OUVRAGE");

        jTextFcodeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFcodeoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("DATE DE RETOUR");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("NB OUVRAGES SELECTIONNES ");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jMenuAccueil.setText("Accueil");
        jMenuAccueil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAccueilMouseClicked(evt);
            }
        });
        Menu.add(jMenuAccueil);

        jMenuAchat.setText("Achat");
        jMenuAchat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAchatMouseClicked(evt);
            }
        });
        Menu.add(jMenuAchat);

        jMenuPret.setText("Pret");
        jMenuPret.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuPretMouseClicked(evt);
            }
        });
        Menu.add(jMenuPret);

        jMenuRetour.setText("Retour");
        jMenuRetour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuRetourMouseClicked(evt);
            }
        });
        Menu.add(jMenuRetour);

        jMenuInscription.setText("Inscription");
        jMenuInscription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuInscriptionMouseClicked(evt);
            }
        });
        Menu.add(jMenuInscription);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFcodeo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numcarte, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFdate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(147, 147, 147)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jTextFnbO, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numcarte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFcodeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFnbO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String resultat = "";
        Statement stmt = null;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
         Date semaine = new Date(date.getTime() + (1000 * 60 * 60 * 504));
        
        try{
            //chargement du pilote
            Class.forName("com.mysql.jdbc.Driver");
            //Creer la connection
            Connection conn = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/projet_bibliotheque", "root", "");
            
          
            
           PreparedStatement ps =conn.prepareStatement ("INSERT INTO Emprunt (CodeBarreExemplaire,CodeBarreEmprunteur,DateRetourMax,DateRetour)"
                    + "VALUES ('"+this.jTextFcodeo.getText()+"','"+this.numcarte.getText()+"','"+dateFormat.format(semaine)+"','"+this.jTextFdate.getText()+"')");
            //ps.executeUpdate();
            
           
            if(ps.executeUpdate()!=1){
			    	JOptionPane.showMessageDialog(null, "une erreur est apparu lors de l'emprunt!", 
                            "Error Message",
                            JOptionPane.ERROR_MESSAGE);}
			    else{JOptionPane.showMessageDialog(null, "L'emprunt a bien ete valide !", 
                        "Information Message",
                        JOptionPane.INFORMATION_MESSAGE);}
            
            conn.close();
            ps.close();
          
            
           }catch(Exception e){
               System.out.println(e);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFcodeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFcodeoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFcodeoActionPerformed

    private void jMenuAccueilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAccueilMouseClicked
         // menu Accueil
        Accueil accueil = new Accueil();
        accueil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuAccueilMouseClicked

    private void jMenuAchatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAchatMouseClicked
         // menu Achat
        Achat achat = new Achat();
        achat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuAchatMouseClicked

    private void jMenuPretMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuPretMouseClicked
         // menu Pret
        Pret pret = new Pret();
        pret.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuPretMouseClicked

    private void jMenuRetourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuRetourMouseClicked
         // menu Retour
        Retour retour = new Retour();
        retour.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuRetourMouseClicked

    private void jMenuInscriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuInscriptionMouseClicked
        // // menu Inscription
        Inscription inscription = new Inscription();
         inscription.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuInscriptionMouseClicked

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
            java.util.logging.Logger.getLogger(Pret.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pret.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pret.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pret.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pret().setVisible(true);
            }
        });
    }
     public void Liste(){ 
          
        int i;
        String resultat = "";
        Statement stt = null;
        try {
                String url = "jdbc:mysql://localhost:3306/projet_bibliotheque";
                String user = "root";
                String mdp = "";
                
                
                Connection cnt = DriverManager.getConnection(url,user,mdp);
                
                 //Préparer la requette 
            PreparedStatement ps=cnt.prepareStatement("SELECT * FROM `ouvrage`");
            
            ResultSet rs=ps.executeQuery();
            
            ResultSetMetaData rsmd=rs.getMetaData();
            
            DefaultListModel<String> liste = new DefaultListModel<>();
           
            while(rs.next()){
                liste.addElement("Code ouvrage:" +rs.getString("codebarre")+" ,Titre:" +rs.getString("Titre")+" ,Auteur:" + rs.getString("Auteur"));

            }
            
             jList1.setModel(liste);
            
           /* jList1.getSelectionModel().addListSelectionListener(e-> {
                //if ( !e.getValueIsAdjusting() ) { 
                   DefaultListModel<String> Livres = new DefaultListModel<>();
                
                   for(String selected : jList1.getSelectedValuesList()) {
                      Livres.addElement(selected);  
                   }
                   jList2.setModel(Livres);
                   
              
        
                    
               setVisible(true);
                //}
            });*/
 
            rs.close();
            ps.close();
            cnt.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
 
    }
     
     public void Emprunter(){
      int i;
      
        String resultat = "";
        Statement stmt = null;
        try{
            //chargement du pilote
            Class.forName("com.mysql.jdbc.Driver");
            //Creer la connection
            Connection conn = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/projet_bibliotheque", "root", "");
            
            //Préparer la requette 
            PreparedStatement ps=conn.prepareStatement("SELECT * FROM `Emprunteur` where  CodeBarre = "+this.numcarte+"");
            
            ResultSet rs=ps.executeQuery();
            
            
      
           DefaultListModel<String> liste = new DefaultListModel<>();
           
            while(rs.next()){
                
                liste.addElement(rs.getString("CodeBarre")+", "+rs.getString("Titre")+" , "+ rs.getString("Auteur"));
                
            }
            

            rs.close();
            ps.close();
            conn.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
     
     
     

     
 
    
     
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenuAccueil;
    private javax.swing.JMenu jMenuAchat;
    private javax.swing.JMenu jMenuInscription;
    private javax.swing.JMenu jMenuPret;
    private javax.swing.JMenu jMenuRetour;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFcodeo;
    private javax.swing.JTextField jTextFdate;
    private javax.swing.JTextField jTextFnbO;
    private javax.swing.JTextField numcarte;
    // End of variables declaration//GEN-END:variables
}
