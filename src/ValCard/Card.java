/*
 * Nick Dernovsek
 * nider6687
 * This program promts the user to get a life outside of video games
 */
package ValCard;

/**
 *
 * @author nickd
 */
public class Card extends javax.swing.JFrame {
    int x = 1;
    int y = 1;
    int z = 1;
    /**
     * Creates new form Card
     */
    public Card() {
        initComponents();
        yesButton.setVisible(false);
        noButton.setVisible(false);
        restartButton.setVisible(false);
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
        cardLbl1 = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        cardLbl2 = new javax.swing.JLabel();
        questionLbl = new javax.swing.JLabel();
        yesButton = new javax.swing.JButton();
        noButton = new javax.swing.JButton();
        restartButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        cardLbl1.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        cardLbl1.setText("What to do on Valentine's Day");

        startButton.setText("Begin");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        cardLbl2.setText("Press button to begin");

        questionLbl.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        questionLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        yesButton.setText("Yes");
        yesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesButtonActionPerformed(evt);
            }
        });

        noButton.setText("No");
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });

        restartButton.setText("Restart");
        restartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(yesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noButton)
                .addGap(75, 75, 75))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cardLbl1)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cardLbl2)
                        .addGap(42, 42, 42)
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(questionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(restartButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(cardLbl1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yesButton)
                            .addComponent(noButton))
                        .addGap(82, 82, 82))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startButton)
                            .addComponent(cardLbl2))
                        .addGap(28, 28, 28)
                        .addComponent(questionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addComponent(restartButton)
                        .addGap(26, 26, 26))))
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

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        cardLbl2.setText(null);
        startButton.setVisible(false);
        yesButton.setVisible(true);
        noButton.setVisible(true);
        questionLbl.setText("Do you have a significant other?");
    }//GEN-LAST:event_startButtonActionPerformed
    public void visibleFalse() {
        yesButton.setVisible(false);
        noButton.setVisible(false);
        restartButton.setVisible(true);
    }
    private void yesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesButtonActionPerformed
        if (x==1 && y==1 && z==1) {
            questionLbl.setText("Do you go on dates with them?");
            x++;
            y++;
            }
        else if (x==2 && y==2 && z==1) {
            questionLbl.setText("Do you want to spend money?");
            x++;
            y++;
            yesButton.setText("why would I");
            noButton.setText("no lol");
            }
        else if (x==3 && y==3 && z==1) {
            questionLbl.setText("Didn't think so.");
            x++;
            y++;
            yesButton.setText("k");
            noButton.setText("cool");
        }
        else if (x==4 && y==4 && z==1) {
            questionLbl.setText("Now go be lonely.");
            x++;
            y++;
            visibleFalse();
        }
        else if (x==2 && y==1 && z==1) {
            questionLbl.setText("Do you like to play video games");
            x++;
            y++;
        }
        else if (x == 2 && y == 2 && z == 2) {
            questionLbl.setText("Do you play video games?");
            x++;
            y++;
            z++;
        } 
        else if (x == 3 && y == 3 && z == 3) {
            questionLbl.setText("Good, now go and play some.");
            visibleFalse();
        }
         else if (x==3 && y==2 && z==2) {
            questionLbl.setText("That's what I thought");
            visibleFalse();
        }
    }//GEN-LAST:event_yesButtonActionPerformed

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        if (x==1 && y ==1 && z==1) {
           questionLbl.setText("Do you have a PC?");
           x++;
           y++;
           z++;
        }
        else if (x==2 && y==2 && z==2) {
            questionLbl.setText("What are you doing with your life?");
            x++;
            yesButton.setText("idk");
            noButton.setText("not sure");
        }
        else if (x==3 && y==2 && z==2) {
            questionLbl.setText("That's what I thought");
            visibleFalse();
        }
        else if (x==2 && y==2 && z==1) {
            questionLbl.setText("Then go play video games instead.");
            visibleFalse();
        }
        else if (x==4 && y==4 && z==1) {
            questionLbl.setText("Now go be lonely.");
            x++;
            y++;
            visibleFalse();
        }
        else if (x==3 && y==3 && z==1) {
            questionLbl.setText("Didn't think so.");
            x++;
            y++;
            yesButton.setText("k");
            noButton.setText("cool");
        }
        else if (x==3 && y==3 && z==3) {
            questionLbl.setText("You should");
            visibleFalse();
        }
    }//GEN-LAST:event_noButtonActionPerformed

    private void restartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartButtonActionPerformed
      if(evt.getSource() == restartButton) {
        dispose();
        Card game = new Card();
        game.setVisible(true);
        }
    }//GEN-LAST:event_restartButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Card().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cardLbl1;
    private javax.swing.JLabel cardLbl2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton noButton;
    private javax.swing.JLabel questionLbl;
    private javax.swing.JButton restartButton;
    private javax.swing.JButton startButton;
    private javax.swing.JButton yesButton;
    // End of variables declaration//GEN-END:variables
}
