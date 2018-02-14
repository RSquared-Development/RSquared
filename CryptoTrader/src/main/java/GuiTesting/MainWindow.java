/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiTesting;

import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author rubenr
 */
public class MainWindow extends javax.swing.JFrame {

    static Point compCoords;
    /**
     * Creates new form MainWindow
     */
    
    private static JPanel home;
    private static JPanel settings;
    private static JPanel account;
    private static JFrame frame;

    
    public MainWindow() {
        initComponents();
        
        
        //static accessors
        frame = this;
        home     = content_Home;
        settings = content_Settings;
        account  = content_Accounts;
        frame.setContentPane(content_Home);
        frame.pack();
        frame.setVisible(true);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content_Settings = new javax.swing.JPanel();
        content_Settings2 = new GuiTesting.Content_Settings();
        sidePanel1 = new GuiTesting.SidePanel();
        content_Home = new javax.swing.JPanel();
        sidePanel4 = new GuiTesting.SidePanel();
        content_Home1 = new GuiTesting.Content_Home();
        content_Accounts = new javax.swing.JPanel();
        sidePanel5 = new GuiTesting.SidePanel();
        content_Accounts1 = new GuiTesting.Content_Accounts();

        content_Settings.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout content_SettingsLayout = new javax.swing.GroupLayout(content_Settings);
        content_Settings.setLayout(content_SettingsLayout);
        content_SettingsLayout.setHorizontalGroup(
            content_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_SettingsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sidePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content_Settings2, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        content_SettingsLayout.setVerticalGroup(
            content_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content_Settings2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addComponent(sidePanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        content_Home.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout content_HomeLayout = new javax.swing.GroupLayout(content_Home);
        content_Home.setLayout(content_HomeLayout);
        content_HomeLayout.setHorizontalGroup(
            content_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_HomeLayout.createSequentialGroup()
                .addComponent(sidePanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content_Home1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        content_HomeLayout.setVerticalGroup(
            content_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(content_Home1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        content_Accounts.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout content_AccountsLayout = new javax.swing.GroupLayout(content_Accounts);
        content_Accounts.setLayout(content_AccountsLayout);
        content_AccountsLayout.setHorizontalGroup(
            content_AccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_AccountsLayout.createSequentialGroup()
                .addComponent(sidePanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(content_Accounts1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        content_AccountsLayout.setVerticalGroup(
            content_AccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
            .addComponent(content_Accounts1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1270, 720));
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1270, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    
    public static void setContent(boolean[] content){
    
        if(content[0]) {
            frame.setContentPane(home);
            frame.pack();
            frame.setVisible(true);
        }
        else if(content[1]) {
            frame.setContentPane(settings);
            frame.pack();
            frame.setVisible(true);
        }
        else if(content[2]) {
            frame.setContentPane(account);
            frame.pack();
            frame.setVisible(true);
        }
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content_Accounts;
    private GuiTesting.Content_Accounts content_Accounts1;
    private javax.swing.JPanel content_Home;
    private GuiTesting.Content_Home content_Home1;
    private javax.swing.JPanel content_Settings;
    private GuiTesting.Content_Settings content_Settings2;
    private GuiTesting.SidePanel sidePanel1;
    private GuiTesting.SidePanel sidePanel4;
    private GuiTesting.SidePanel sidePanel5;
    // End of variables declaration//GEN-END:variables
}