/**
Craindo a tela para inserção de novos jogos, lembrando que por ser dialog
significa que a parte de trás não será acessível.
 */
package View;

import Controller.Controller;
import Model.Jogo;
import java.util.List;
import javax.swing.JOptionPane;

public class NovoJogo extends javax.swing.JDialog {

/**Criando uma variável para o controlador*/
    Controller controlando;
    
    public NovoJogo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        controlando = new Controller();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PainelDoTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Salvar = new javax.swing.JToggleButton();
        PainelInformacoes = new javax.swing.JPanel();
        NumeroDoJogo = new javax.swing.JLabel();
        NumeroDoPlacar = new javax.swing.JLabel();
        jTextFieldPlacar = new javax.swing.JTextField();
        Limpar = new javax.swing.JButton();
        jTextFieldJogo = new javax.swing.JTextField();
        MínimoDaTemporada = new javax.swing.JLabel();
        Vazio1 = new javax.swing.JLabel();
        MáximoDaTemporada = new javax.swing.JLabel();
        Vazio2 = new javax.swing.JLabel();
        QuebraRecordeMínimo = new javax.swing.JLabel();
        Vazio3 = new javax.swing.JLabel();
        QuebraRecordeMáximo = new javax.swing.JLabel();
        Vazio4 = new javax.swing.JLabel();
        Calcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(122, 204, 255));

        PainelDoTitulo.setBackground(new java.awt.Color(95, 191, 238));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Novo Jogo");

        Salvar.setBackground(new java.awt.Color(255, 255, 255));
        Salvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Salvar.setText("Salvar");
        Salvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalvarMouseClicked(evt);
            }
        });
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelDoTituloLayout = new javax.swing.GroupLayout(PainelDoTitulo);
        PainelDoTitulo.setLayout(PainelDoTituloLayout);
        PainelDoTituloLayout.setHorizontalGroup(
            PainelDoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDoTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salvar)
                .addContainerGap())
        );
        PainelDoTituloLayout.setVerticalGroup(
            PainelDoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDoTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelDoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salvar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PainelInformacoes.setBackground(new java.awt.Color(95, 191, 238));

        NumeroDoJogo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NumeroDoJogo.setForeground(new java.awt.Color(255, 255, 255));
        NumeroDoJogo.setText("Jogo");

        NumeroDoPlacar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NumeroDoPlacar.setForeground(new java.awt.Color(255, 255, 255));
        NumeroDoPlacar.setText("Placar");

        jTextFieldPlacar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldPlacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlacarActionPerformed(evt);
            }
        });

        Limpar.setBackground(new java.awt.Color(255, 255, 255));
        Limpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Limpar.setText("Limpar");
        Limpar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Limpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LimparMouseClicked(evt);
            }
        });
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        jTextFieldJogo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJogoActionPerformed(evt);
            }
        });

        MínimoDaTemporada.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MínimoDaTemporada.setForeground(new java.awt.Color(255, 255, 255));
        MínimoDaTemporada.setText("Mínimo da Temporada");

        Vazio1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Vazio1.setText("Vazio");

        MáximoDaTemporada.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MáximoDaTemporada.setForeground(new java.awt.Color(255, 255, 255));
        MáximoDaTemporada.setText("Máximo da Temporada");

        Vazio2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Vazio2.setText("Vazio");

        QuebraRecordeMínimo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        QuebraRecordeMínimo.setForeground(new java.awt.Color(255, 255, 255));
        QuebraRecordeMínimo.setText("Quebra Recorde Mínimo");

        Vazio3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Vazio3.setText("Vazio");

        QuebraRecordeMáximo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        QuebraRecordeMáximo.setForeground(new java.awt.Color(255, 255, 255));
        QuebraRecordeMáximo.setText("Quebra Recorde Máximo");

        Vazio4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Vazio4.setText("Vazio");

        Calcular.setBackground(new java.awt.Color(255, 255, 255));
        Calcular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Calcular.setText("Calcular");
        Calcular.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CalcularMouseClicked(evt);
            }
        });
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelInformacoesLayout = new javax.swing.GroupLayout(PainelInformacoes);
        PainelInformacoes.setLayout(PainelInformacoesLayout);
        PainelInformacoesLayout.setHorizontalGroup(
            PainelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelInformacoesLayout.createSequentialGroup()
                .addGroup(PainelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelInformacoesLayout.createSequentialGroup()
                        .addGroup(PainelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelInformacoesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PainelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PainelInformacoesLayout.createSequentialGroup()
                                        .addGroup(PainelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PainelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(PainelInformacoesLayout.createSequentialGroup()
                                                    .addGroup(PainelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(NumeroDoJogo)
                                                        .addComponent(Vazio3))
                                                    .addGap(184, 184, 184))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelInformacoesLayout.createSequentialGroup()
                                                    .addComponent(QuebraRecordeMínimo)
                                                    .addGap(18, 18, 18)))
                                            .addGroup(PainelInformacoesLayout.createSequentialGroup()
                                                .addGroup(PainelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Vazio1)
                                                    .addComponent(MínimoDaTemporada))
                                                .addGap(33, 33, 33)))
                                        .addGroup(PainelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Vazio2)
                                            .addComponent(Vazio4)
                                            .addComponent(MáximoDaTemporada)
                                            .addComponent(NumeroDoPlacar)
                                            .addComponent(jTextFieldPlacar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(QuebraRecordeMáximo)))))
                            .addGroup(PainelInformacoesLayout.createSequentialGroup()
                                .addGap(410, 410, 410)
                                .addComponent(Limpar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelInformacoesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Calcular)))
                .addContainerGap())
        );
        PainelInformacoesLayout.setVerticalGroup(
            PainelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelInformacoesLayout.createSequentialGroup()
                .addGroup(PainelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumeroDoJogo)
                    .addComponent(NumeroDoPlacar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPlacar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(Limpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MáximoDaTemporada)
                    .addComponent(MínimoDaTemporada))
                .addGap(31, 31, 31)
                .addGroup(PainelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vazio1)
                    .addComponent(Vazio2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(PainelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuebraRecordeMáximo)
                    .addComponent(QuebraRecordeMínimo))
                .addGap(18, 18, 18)
                .addGroup(PainelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vazio3)
                    .addComponent(Vazio4))
                .addGap(11, 11, 11)
                .addComponent(Calcular)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PainelInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelDoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelDoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    
    
    /**Configurando o botão "salvar". */
    private void SalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalvarMouseClicked
/** Precisa ainda inserir quais informações queremos pegar, salvar o jogo novo,
 * apresentar a mensagem de salvamento e fechar a janela.
 */
        try {
            if(!jTextFieldPlacar.getText().equals("")){
            Jogo jogo= new Jogo();
        
        jogo.setJogo(jTextFieldJogo.getText());
        jogo.setPlacar(jTextFieldPlacar.getText());
        jogo.setMinTemp(Integer.parseInt(Vazio1.getText()));
        jogo.setMaxTemp(Integer.parseInt(Vazio2.getText()));
        jogo.setQuebraRecMin(Integer.parseInt(Vazio3.getText()));
        jogo.setQuebraRecMax(Integer.parseInt(Vazio4.getText()));
        
        controlando.save(jogo);
        JOptionPane.showMessageDialog(rootPane,"Jogo salvo com sucesso"); 
         this.dispose();
        }else{
           JOptionPane.showMessageDialog(rootPane, "O Jogo não foi salvo, pois o"
                   + " campo Placar não foi preenchido. Lembre de apertar calcular depois!");     
            }  
        } catch (Exception e) {
           JOptionPane.showMessageDialog(rootPane, e.getMessage()); 
        }

        
    }//GEN-LAST:event_SalvarMouseClicked

    private void jTextFieldPlacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlacarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPlacarActionPerformed

    private void LimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimparMouseClicked
       jTextFieldPlacar.setText("");
       jTextFieldJogo.setText("");
       jTextFieldJogo.requestFocus();
    }//GEN-LAST:event_LimparMouseClicked

    private void jTextFieldJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJogoActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LimparActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalvarActionPerformed

    private void CalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalcularMouseClicked
        
        /** Calculando as informações automaticamente a partir do placar*/
       List<Jogo> jogos = Controller.getAll();
       int placarJogo;
       int placarMin = 0;
       int placarMax = 0;
       int placarMinTemp = 0;
       int placarMaxTemp = 0;
       int contQuebraRecMin = 0;
       int contQuebraRecMax = 0;
       
       
       for (int i = 0; i < jogos.size(); i++) {
            placarJogo = Integer.parseInt(jogos.get(i).Placar);
            if  (i > 0) {
                if (placarJogo > placarMax) {
                    contQuebraRecMax++;
                    placarMax = placarJogo;
                }
                
                if (placarJogo < placarMin) {
                    contQuebraRecMin++;
                    placarMin = placarJogo;
                }
            }
            
            if (placarJogo > placarMax) {
                placarMax = placarJogo;
            }
            if (placarMin > placarJogo || placarMin == 0)  {
                placarMin = placarJogo;
            }
       
            
        }
       int placar = Integer.parseInt(jTextFieldPlacar.getText());
        
       if (placar > placarMax) {
           contQuebraRecMax++;
           placarMax = placar;
       }
       
       if (placar < placarMin) {
           contQuebraRecMin++;
           placarMin = placar;
       }
        Vazio1.setText(String.valueOf(placarMin));
        Vazio2.setText(String.valueOf(placarMax));
        Vazio3.setText(String.valueOf(contQuebraRecMin)); 
        Vazio4.setText(String.valueOf(contQuebraRecMax)); 
        
    }//GEN-LAST:event_CalcularMouseClicked

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CalcularActionPerformed

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
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NovoJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NovoJogo dialog = new NovoJogo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JButton Limpar;
    private javax.swing.JLabel MáximoDaTemporada;
    private javax.swing.JLabel MínimoDaTemporada;
    private javax.swing.JLabel NumeroDoJogo;
    private javax.swing.JLabel NumeroDoPlacar;
    private javax.swing.JPanel PainelDoTitulo;
    private javax.swing.JPanel PainelInformacoes;
    private javax.swing.JLabel QuebraRecordeMáximo;
    private javax.swing.JLabel QuebraRecordeMínimo;
    private javax.swing.JToggleButton Salvar;
    private javax.swing.JLabel Vazio1;
    private javax.swing.JLabel Vazio2;
    private javax.swing.JLabel Vazio3;
    private javax.swing.JLabel Vazio4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldJogo;
    private javax.swing.JTextField jTextFieldPlacar;
    // End of variables declaration//GEN-END:variables
}
