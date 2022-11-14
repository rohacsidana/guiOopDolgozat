package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;

public class dolgozatGui extends javax.swing.JFrame {

    JButton[] gombok;
    private String[] modell;
    private boolean kever = false;

    public dolgozatGui() {
        initComponents();
        setLocationRelativeTo(null);
        gombok = new JButton[10];
        gombok[0] = jButton1;
        gombok[1] = jButton2;
        gombok[2] = jButton3;
        gombok[3] = jButton4;
        gombok[4] = jButton5;
        gombok[5] = jButton6;
        gombok[6] = jButton7;
        gombok[7] = jButton8;
        gombok[8] = jButton9;
        gombok[9] = jButton10;

        for (JButton b : gombok) {
            b.addActionListener(new KattintasListener());
        }
    }

    class KattintasListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton gomb = (JButton) e.getSource();
            textPin.setText(textPin.getText() + gomb.getText());
            pinLength();
        }

        public void pinLength() {
            if (textPin.getText().length() == 4) {
                for (JButton gomb : gombok) {
                    gomb.setEnabled(false);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPinBevitel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        chckKever = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        textPin = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuProgram = new javax.swing.JMenu();
        menuItemUjra = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuItemKilep = new javax.swing.JMenuItem();
        menuJatekElrend = new javax.swing.JMenu();
        menuChckVizszintes = new javax.swing.JCheckBoxMenuItem();
        menuChckFuggoleges = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GUI - OOP 1. dolgozat");
        setPreferredSize(new java.awt.Dimension(410, 350));

        panelPinBevitel.setBorder(javax.swing.BorderFactory.createTitledBorder("Pin kód"));

        jButton1.setText("0");

        jButton2.setText("1");

        jButton3.setText("2");

        jButton4.setText("3");

        jButton5.setText("4");

        jButton6.setText("5");

        jButton7.setText("6");

        jButton8.setText("7");

        jButton9.setText("8");

        jButton10.setText("9");

        javax.swing.GroupLayout panelPinBevitelLayout = new javax.swing.GroupLayout(panelPinBevitel);
        panelPinBevitel.setLayout(panelPinBevitelLayout);
        panelPinBevitelLayout.setHorizontalGroup(
            panelPinBevitelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPinBevitelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPinBevitelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPinBevitelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(panelPinBevitelLayout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6))
                    .addGroup(panelPinBevitelLayout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9))
                    .addComponent(jButton10))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panelPinBevitelLayout.setVerticalGroup(
            panelPinBevitelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPinBevitelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelPinBevitelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPinBevitelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPinBevitelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Beállítás"));

        chckKever.setText("kever");
        chckKever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckKeverActionPerformed(evt);
            }
        });

        jLabel1.setText("kód:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(chckKever)
                    .addComponent(textPin, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chckKever)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        menuProgram.setText("Program");

        menuItemUjra.setText("Újra");
        menuItemUjra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUjraActionPerformed(evt);
            }
        });
        menuProgram.add(menuItemUjra);
        menuProgram.add(jSeparator1);

        menuItemKilep.setText("Kilép");
        menuItemKilep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemKilepActionPerformed(evt);
            }
        });
        menuProgram.add(menuItemKilep);

        jMenuBar1.add(menuProgram);

        menuJatekElrend.setText("Játék elrendezése");

        menuChckVizszintes.setSelected(true);
        menuChckVizszintes.setText("vízszintes");
        menuJatekElrend.add(menuChckVizszintes);

        menuChckFuggoleges.setText("függőleges");
        menuJatekElrend.add(menuChckFuggoleges);

        jMenuBar1.add(menuJatekElrend);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPinBevitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPinBevitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(256, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemKilepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemKilepActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemKilepActionPerformed

    private void menuItemUjraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUjraActionPerformed
        textPin.setText("");
        for (JButton gomb : gombok) {
            gomb.setEnabled(true);
        }
    }//GEN-LAST:event_menuItemUjraActionPerformed

    private void szamAllitas(JButton[] gombokLekerve, int[] keveres) {
        for (int i = 0; i < gombokLekerve.length; i++) {
            gombokLekerve[i].setText(Integer.toString(keveres[i]));
        }
    }
    private void chckKeverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckKeverActionPerformed
        kever = !kever;
        int[] kevert = new int[10];
        int[] keveretlen = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Random rnd = new Random();
        
        for (int i = 0; i < kevert.length; i++) {
            int hozzadando = rnd.nextInt(9);
            kevert[i] = hozzadando;
        }
        Component[] gombokLeker = panelPinBevitel.getComponents();
        JButton[] gombokLekerve = new JButton[gombokLeker.length];
        for (int i = 0; i < gombokLeker.length; i++) {
            gombokLekerve[i] = (JButton) gombokLeker[i];
        }
        if (kever) {
            szamAllitas(gombokLekerve, kevert);
        } else {
            szamAllitas(gombokLekerve, keveretlen);
        }
    }//GEN-LAST:event_chckKeverActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dolgozatGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dolgozatGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dolgozatGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dolgozatGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dolgozatGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chckKever;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JCheckBoxMenuItem menuChckFuggoleges;
    private javax.swing.JCheckBoxMenuItem menuChckVizszintes;
    private javax.swing.JMenuItem menuItemKilep;
    private javax.swing.JMenuItem menuItemUjra;
    private javax.swing.JMenu menuJatekElrend;
    private javax.swing.JMenu menuProgram;
    private javax.swing.JPanel panelPinBevitel;
    private javax.swing.JTextField textPin;
    // End of variables declaration//GEN-END:variables

}
