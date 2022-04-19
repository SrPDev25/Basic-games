/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author satan
 */
public class WinGame extends javax.swing.JFrame {

    String[] gamers;//Gamers 1 and 2
    int[][] game; //The real game
    int activeGamer; //A que jugador le toca empezar
    boolean gameActive;//Juego en curso

    public WinGame() {
        initComponents();
        gamers = new String[]{"O", "X", ""};
        cleanGame();
        chargeView();
        activeGamer = 0;
        gameActive = true;
    }

    private void cleanGame() {
        //State 0=O 1=X 2=empty
        game = new int[][]{
            {2, 2, 2},
            {2, 2, 2},
            {2, 2, 2}
        };
    }

    private void chargeView() {
        txt11.setText(gamers[game[0][0]]);
        txt12.setText(gamers[game[0][1]]);
        txt13.setText(gamers[game[0][2]]);
        txt21.setText(gamers[game[1][0]]);
        txt22.setText(gamers[game[1][1]]);
        txt23.setText(gamers[game[1][2]]);
        txt31.setText(gamers[game[2][0]]);
        txt32.setText(gamers[game[2][1]]);
        txt33.setText(gamers[game[2][2]]);
    }

    private void ifWin(int x, int y) {
        boolean win=false;
        if (game[x][0]==game[x][1] && game[x][1]==game[x][2]){
            win=true;
        }
        
        if (game[0][y]==game[1][y] && game[1][y]==game[2][y]){
            win=true;
        }
        
        if (win) {
            gameActive=false;
            JOptionPane.showMessageDialog(this, "Winner is "+gamers[activeGamer], "Win", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt23 = new javax.swing.JTextField();
        txt22 = new javax.swing.JTextField();
        txt13 = new javax.swing.JTextField();
        txt32 = new javax.swing.JTextField();
        txt12 = new javax.swing.JTextField();
        txt11 = new javax.swing.JTextField();
        txt21 = new javax.swing.JTextField();
        txt33 = new javax.swing.JTextField();
        txt31 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt23.setEditable(false);
        txt23.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        txt23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt23.setMinimumSize(new java.awt.Dimension(60, 60));
        txt23.setPreferredSize(new java.awt.Dimension(60, 60));
        txt23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt23MouseClicked(evt);
            }
        });

        txt22.setEditable(false);
        txt22.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        txt22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt22.setMinimumSize(new java.awt.Dimension(60, 60));
        txt22.setPreferredSize(new java.awt.Dimension(60, 60));
        txt22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt22MouseClicked(evt);
            }
        });

        txt13.setEditable(false);
        txt13.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        txt13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt13.setMinimumSize(new java.awt.Dimension(60, 60));
        txt13.setPreferredSize(new java.awt.Dimension(60, 60));
        txt13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt13MouseClicked(evt);
            }
        });
        txt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt13ActionPerformed(evt);
            }
        });

        txt32.setEditable(false);
        txt32.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        txt32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt32.setMinimumSize(new java.awt.Dimension(60, 60));
        txt32.setPreferredSize(new java.awt.Dimension(60, 60));
        txt32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt32MouseClicked(evt);
            }
        });

        txt12.setEditable(false);
        txt12.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        txt12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt12.setMinimumSize(new java.awt.Dimension(60, 60));
        txt12.setPreferredSize(new java.awt.Dimension(60, 60));
        txt12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt12MouseClicked(evt);
            }
        });
        txt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt12ActionPerformed(evt);
            }
        });

        txt11.setEditable(false);
        txt11.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        txt11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt11.setMinimumSize(new java.awt.Dimension(60, 60));
        txt11.setPreferredSize(new java.awt.Dimension(60, 60));
        txt11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt11MouseClicked(evt);
            }
        });
        txt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt11ActionPerformed(evt);
            }
        });

        txt21.setEditable(false);
        txt21.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        txt21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt21.setMinimumSize(new java.awt.Dimension(60, 60));
        txt21.setPreferredSize(new java.awt.Dimension(60, 60));
        txt21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt21MouseClicked(evt);
            }
        });
        txt21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt21ActionPerformed(evt);
            }
        });

        txt33.setEditable(false);
        txt33.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        txt33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt33.setMinimumSize(new java.awt.Dimension(60, 60));
        txt33.setPreferredSize(new java.awt.Dimension(60, 60));
        txt33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt33MouseClicked(evt);
            }
        });

        txt31.setEditable(false);
        txt31.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        txt31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt31.setMinimumSize(new java.awt.Dimension(60, 60));
        txt31.setPreferredSize(new java.awt.Dimension(60, 60));
        txt31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt31MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel2.setText("TIC TAC TOE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel2)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt13ActionPerformed
        
    }//GEN-LAST:event_txt13ActionPerformed

    private void txt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt12ActionPerformed
        
    }//GEN-LAST:event_txt12ActionPerformed

    private void txt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt11ActionPerformed
        
    }//GEN-LAST:event_txt11ActionPerformed

    private void txt21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt21ActionPerformed

    private void txt13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt13MouseClicked
        if (gameActive && game[0][2]==2) {
            game[0][2] = activeGamer;
            chargeView();
            ifWin(0,2);
            changeTurn();
        }
    }//GEN-LAST:event_txt13MouseClicked

    private void txt12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt12MouseClicked
        if (gameActive && game[0][1]==2) {
            game[0][1] = activeGamer;
            chargeView();
            ifWin(0,1);
            changeTurn();
        }
    }//GEN-LAST:event_txt12MouseClicked

    private void txt11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt11MouseClicked
        if (gameActive && game[0][0]==2) {
            game[0][0] = activeGamer;
            chargeView();
            ifWin(0,0);
            changeTurn();
        }
    }//GEN-LAST:event_txt11MouseClicked

    private void txt23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt23MouseClicked
        if (gameActive && game[1][2]==2) {
            game[1][2] = activeGamer;
            chargeView();
            ifWin(1,2);
            changeTurn();
        }
    }//GEN-LAST:event_txt23MouseClicked

    private void txt22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt22MouseClicked
        if (gameActive && game[1][1]==2) {
            game[1][1] = activeGamer;
            chargeView();
            ifWin(1,1);
            changeTurn();
        }
    }//GEN-LAST:event_txt22MouseClicked

    private void txt21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt21MouseClicked
        if (gameActive && game[1][0]==2) {
            game[1][0] = activeGamer;
            chargeView();
            ifWin(1,0);
            changeTurn();
        }
    }//GEN-LAST:event_txt21MouseClicked

    private void txt33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt33MouseClicked
        if (gameActive && game[2][2]==2) {
            game[2][2] = activeGamer;
            chargeView();
            ifWin(2,2);
            changeTurn();
        }
    }//GEN-LAST:event_txt33MouseClicked

    private void txt32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt32MouseClicked
        if (gameActive && game[2][1]==2) {
            game[2][1] = activeGamer;
            chargeView();
            ifWin(2,1);
            changeTurn();
        }
    }//GEN-LAST:event_txt32MouseClicked

    private void txt31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt31MouseClicked
        if (gameActive && game[2][0]==2) {
            game[2][0] = activeGamer;
            chargeView();
            ifWin(2,0);
            changeTurn();
        }
    }//GEN-LAST:event_txt31MouseClicked

    /**
     * Change turn
     */
    private void changeTurn() {
        if (activeGamer == 0) {
            activeGamer = 1;
        } else {
            activeGamer = 0;
        }
    }

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
            java.util.logging.Logger.getLogger(WinGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt13;
    private javax.swing.JTextField txt21;
    private javax.swing.JTextField txt22;
    private javax.swing.JTextField txt23;
    private javax.swing.JTextField txt31;
    private javax.swing.JTextField txt32;
    private javax.swing.JTextField txt33;
    // End of variables declaration//GEN-END:variables
}
