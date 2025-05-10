package com.mycompany.praticaprojetoswing.Telas;

import com.mycompany.praticaprojetoswing.ModuloConexao.ModuloConexao;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaOs extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaOs() {
        initComponents();
        conexao = ModuloConexao.conector();
    }

    //Método Consultar 
    public void consultar_cliente() {
        //String sql = "select b.os, b.data_os, b.equipamento, b.defeito, b.servico, b.tecnico, b.valor, a.idcli, a.nomecli, a.fonecli from tbclientes a, tbos b where nomecli =  ? and  a.idcli= b.idcli"; 
        String sql = "select a.idcli, a.nomecli, a.fonecli from tbclientes a where nomecli=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtCliPesquisa.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                txtCliId.setText(rs.getString(1));
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não possui ordem de serviço");
                //as linhas abaixo limpam os campos 
                txtOs.setText(null);
                txtOsDef.setText(null);
                //txtCliId.setText(null); 
                txtOsEquip.setText(null);
                txtOsDef.setText(null);
                txtOsServ.setText(null);
                txtOsTec.setText(null);
                txtOsValor.setText(null);
                //txtCliPesquisa.setText(null); 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Método Adicionar OS 
    private void adicionar_os() {
        String sql = "insert into tbos (equipamento, defeito, servico, tecnico, valor, idcli) values (?,?,?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtOsEquip.getText());
            pst.setString(2, txtOsDef.getText());
            pst.setString(3, txtOsServ.getText());
            pst.setString(4, txtOsTec.getText());
            pst.setString(5, txtOsValor.getText());
            pst.setString(6, txtCliId.getText());

            //validação dos campos obrigatórios  
            if ((txtCliId.getText().isEmpty()) || (txtOsEquip.getText().isEmpty())
                    || txtOsDef.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencher todos os campos obrigatórios");
            } else {
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "OS adiocionada com sucesso !");
                    txtOsEquip.setText(null);
                    txtOsDef.setText(null);
                    txtOsServ.setText(null);
                    txtOsTec.setText(null);
                    txtOsValor.setText(null);
                    txtCliId.setText(null);
                    txtCliPesquisa.setText(null);

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Método Consultar OS 
    public void consultar_os() {
        String sql = "select a.os, a.data_os, a.equipamento, a.defeito, a.servico, a.tecnico, a.valor, a.idcli, b.nomecli from tbos a, tbclientes b where os =  ? and  a.idcli = b.idcli";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtOs.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                txtOs.setText(rs.getString(1));
                txtOsDef.setText(rs.getString(2));
                txtOsEquip.setText(rs.getString(3));
                txtOsDef.setText(rs.getString(4));
                txtOsServ.setText(rs.getString(5));
                txtOsTec.setText(rs.getString(6));
                txtOsValor.setText(rs.getString(7));
                txtCliId.setText(rs.getString(8));
                txtCliPesquisa.setText(rs.getString(9));
            } else {
                JOptionPane.showMessageDialog(null, "OS não cadastrado.");
                //as linhas abaixo limpam os campos 
                txtOs.setText(null);
                txtOsDef.setText(null);
                txtOsEquip.setText(null);
                txtOsDef.setText(null);
                txtOsServ.setText(null);
                txtOsTec.setText(null);
                txtOsValor.setText(null);
                txtCliId.setText(null);
                txtCliPesquisa.setText(null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Método Alterar OS 
    private void alterar_os() {
        String sql = "update tbos set equipamento=?, defeito=?, servico=?, tecnico=?, valor=? where os =  ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtOsEquip.getText());
            pst.setString(2, txtOsDef.getText());
            pst.setString(3, txtOsServ.getText());
            pst.setString(4, txtOsTec.getText());
            pst.setString(5, txtOsValor.getText());

            //validação dos campos obrigatórios  
            if ((txtOsEquip.getText().isEmpty()) || (txtCliId.getText().isEmpty())
                    || txtOsDef.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencher todos os campos obrigatórios");
            } else {
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Dados da OS alterados com sucesso !");
                    txtOs.setText(null);
                    txtOsDef.setText(null);
                    txtOsEquip.setText(null);
                    txtOsDef.setText(null);
                    txtOsServ.setText(null);
                    txtOsTec.setText(null);
                    txtOsValor.setText(null);
                    txtCliId.setText(null);
                    txtCliPesquisa.setText(null);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Método Remover 
    private void remover_os() {
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover a OS ? ", "  Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from tbos where os=?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtOs.getText());
                int apagado = pst.executeUpdate();
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "OS removida com sucesso !");
                    txtOs.setText(null);
                    txtOsDef.setText(null);
                    txtCliId.setText(null);
                    txtCliPesquisa.setText(null);
                    txtOsEquip.setText(null);
                    txtOsDef.setText(null);
                    txtOsServ.setText(null);
                    txtOsTec.setText(null);
                    txtOsValor.setText(null);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    //método para pesquisar OS 
    private void pesquisar_os() {
        String sql = "select * from tbos where os like ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtCliPesquisa.getText() + "%");
            rs = pst.executeQuery();

            //tblClientes.setModel(DbUtils.resultSetToTableModel(rs)); 
            //DefaultTableModel modelo = (DefaultTableModel) tblOs.getModel;
            modelo.setRowCount(0);

            ResultSetMetaData metaData = rs.getMetaData();
            int colunas = metaData.getColumnCount();
            modelo.setColumnCount(0);
            for (int i = 1; i <= colunas; i++) {
                modelo.addColumn(metaData.getColumnName(i));
            }
            while (rs.next()) {
                Object[] linha = new Object[colunas];
                for (int i = 1; i <= colunas; i++) {
                    linha[i - 1] = rs.getObject(i);
                }
                modelo.addRow(linha);
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void limpa_pesquisa() {
        txtOs.setText(null);
        txtOsDef.setText(null);
        txtOsEquip.setText(null);
        txtOsDef.setText(null);
        txtOsServ.setText(null);
        txtOsTec.setText(null);
        txtOsValor.setText(null);
        txtCliId.setText(null);
        txtCliPesquisa.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtOs = new javax.swing.JTextField();
        txtOsDef = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCliId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCliPesquisa = new javax.swing.JTextField();
        txtOsEquip = new javax.swing.JTextField();
        txtOsServ = new javax.swing.JTextField();
        txtOsTec = new javax.swing.JTextField();
        txtOsValor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOs = new javax.swing.JTable();
        btnOsAdicionar = new javax.swing.JButton();
        btnOsAlterar = new javax.swing.JButton();
        btnOsExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("OS");

        jLabel1.setText("Nº OS");

        jLabel2.setText("Data");

        txtOs.setEditable(false);

        txtOsDef.setEditable(false);

        jLabel3.setText("*ID");

        txtCliId.setEditable(false);

        jLabel4.setText("Nome");

        txtData.setEditable(false);

        jButton1.setText("Pesquisa OS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpar OS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Pesquisar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("*Equipamento");

        jLabel6.setText("*Defeito");

        jLabel7.setText("Serviço");

        jLabel8.setText("Técnico");

        jLabel9.setText("Valor Total");

        txtCliPesquisa.setEditable(false);

        txtOsEquip.setEditable(false);

        txtOsServ.setEditable(false);

        txtOsTec.setEditable(false);

        txtOsValor.setEditable(false);

        tblOs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "OS", "Data", "Equipamento", "Defeito", "Serviço", "Técnico", "Valor", "ID Cliente"
            }
        ));
        jScrollPane2.setViewportView(tblOs);

        btnOsAdicionar.setText("Adicionar");

        btnOsAlterar.setText("Alterar");

        btnOsExcluir.setText("Remover");

        btnAtualizar.setText("Atualizar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btnOsAdicionar)
                        .addGap(18, 18, 18)
                        .addComponent(btnOsAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnOsExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOs, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCliId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jButton1))
                                    .addComponent(txtCliPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2)
                                    .addComponent(jButton3)))
                            .addComponent(txtOsEquip)
                            .addComponent(txtOsDef)
                            .addComponent(txtOsServ)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtOsTec, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtOsValor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtOs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtCliId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtCliPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtOsEquip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtOsDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtOsServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtOsTec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOsValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOsAdicionar)
                    .addComponent(btnOsAlterar)
                    .addComponent(btnOsExcluir)
                    .addComponent(btnAtualizar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnOsAdicionar;
    private javax.swing.JButton btnOsAlterar;
    private javax.swing.JButton btnOsExcluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblOs;
    private javax.swing.JTextField txtCliId;
    private javax.swing.JTextField txtCliPesquisa;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtOs;
    private javax.swing.JTextField txtOsDef;
    private javax.swing.JTextField txtOsEquip;
    private javax.swing.JTextField txtOsServ;
    private javax.swing.JTextField txtOsTec;
    private javax.swing.JTextField txtOsValor;
    // End of variables declaration//GEN-END:variables
}
