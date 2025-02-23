/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.ClienteTableModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author TrixPs
 */
public class TelaCpf extends javax.swing.JFrame {

    /**
     * Creates new form TelaCpf
     */
    Model.VisualizarItensTableModel TelaFinal = new Model.VisualizarItensTableModel();
    Model.ClienteTableModel Client = new ClienteTableModel();
    private ArrayList<Model.Cliente> ListaCliente;
    public static double PrecoFinal;
    
    public TelaCpf() {
        
        this.ListaCliente = Client.ResultadoDaLista();
        initComponents();
        TabelaItensFinal.setModel(TelaFinal);
        PrecoFinal = 0;
        for (int i = 0; i < View.TelaVendas.ListaProdVendidos.size(); i++){
            PrecoFinal += View.TelaVendas.ListaProdVendidos.get(i).Total;
            }
        
        txtTotal.setText(String.valueOf(PrecoFinal));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomeClient = new javax.swing.JTextField();
        txtCpfClient = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEnderecoClient = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoClient = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaItensFinal = new javax.swing.JTable();
        btnViagem = new javax.swing.JButton();
        btnEstabelecimento = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pagamento");
        setResizable(false);

        txtNomeClient.setEditable(false);

        txtCpfClient.setEditable(false);
        try {
            txtCpfClient.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setText("Endereço:");

        txtEnderecoClient.setEditable(false);

        jLabel1.setText("Código:");

        jLabel2.setText("Nome do Cliente:");

        jLabel3.setText("CPF:");

        txtCodigoClient.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoClientFocusLost(evt);
            }
        });

        TabelaItensFinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TabelaItensFinal);

        btnViagem.setText("Para viagem (add a taxa de R$5)");
        btnViagem.setToolTipText("");
        btnViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViagemActionPerformed(evt);
            }
        });

        btnEstabelecimento.setText("Comer no estabelecimento");
        btnEstabelecimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstabelecimentoActionPerformed(evt);
            }
        });

        txtTotal.setEditable(false);

        jLabel5.setText("Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEnderecoClient)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtCodigoClient, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtNomeClient))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtCpfClient, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEstabelecimento, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnViagem)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpfClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEnderecoClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViagem)
                    .addComponent(btnEstabelecimento))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoClientFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoClientFocusLost
        // TODO add your handling code here: 
        for (int i = 0 ; i < this.ListaCliente.size();i++){
        if(Integer.parseInt(txtCodigoClient.getText()) == this.ListaCliente.get(i).Codigo){
            txtNomeClient.setText(this.ListaCliente.get(i).Nome);
            txtCpfClient.setText(this.ListaCliente.get(i).Cpf);
            txtEnderecoClient.setText(this.ListaCliente.get(i).Endereco);
            break;
            }
            else{
            txtNomeClient.setText("");
            txtCpfClient.setText("");
            txtEnderecoClient.setText(""); 
                    }
    }
        
    }//GEN-LAST:event_txtCodigoClientFocusLost

    private void btnEstabelecimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstabelecimentoActionPerformed
        // TODO add your handling code here:
        if("".equals(txtCodigoClient.getText()) || "".equals(txtNomeClient.getText()) || "".equals(txtCpfClient.getText()) || "".equals(txtEnderecoClient.getText())){
        JOptionPane.showMessageDialog(null, "Informe o cadastro do cliente");
        }
        else{
            if(PrecoFinal == 0){
                JOptionPane.showMessageDialog(null, "Escolha os produtos para realizar uma compra");
            }
        else{
        TelaEscolherPagamento TEP = new TelaEscolherPagamento();
        TEP.show();
    }//GEN-LAST:event_btnEstabelecimentoActionPerformed
    }
    }
    
    private void btnViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViagemActionPerformed
        // TODO add your handling code here:
        if("".equals(txtCodigoClient.getText()) || "".equals(txtNomeClient.getText()) || "".equals(txtCpfClient.getText()) || "".equals(txtEnderecoClient.getText())){
            JOptionPane.showMessageDialog(null, "Informe o cadastro do cliente");
        }
        else{
            if(PrecoFinal == 0){
                JOptionPane.showMessageDialog(null, "Escolha os produtos para realizar uma compra");
            }
        else{
        TelaEscolherPagamento TEP = new TelaEscolherPagamento();
        PrecoFinal += 5;
        TEP.show();
        }
        }
    }//GEN-LAST:event_btnViagemActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCpf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCpf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCpf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCpf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCpf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaItensFinal;
    private javax.swing.JButton btnEstabelecimento;
    private javax.swing.JButton btnViagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigoClient;
    private javax.swing.JFormattedTextField txtCpfClient;
    private javax.swing.JTextField txtEnderecoClient;
    private javax.swing.JTextField txtNomeClient;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
