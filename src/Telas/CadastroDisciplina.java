/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import Model.Disciplina;
import DAO.DisciplinaDAO;
import DAO.Serializador;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gustavo Girardon
 */
public class CadastroDisciplina extends javax.swing.JFrame {

    /**
     * Creates new form CadastroDisciplina
     */
    public CadastroDisciplina() {
        initComponents();
        this.setLocationRelativeTo(null);
        popularComboDisciplina();
        exibirInformacoes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbCurso = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisciplina = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtTurma = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSemestre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Disciplina");

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel1.setText("Nome");

        txtNome.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel2.setText("Curso");

        cmbCurso.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        cmbCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCursoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblDisciplina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Curso", "Semestre", "Turma"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisciplina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDisciplinaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDisciplina);
        if (tblDisciplina.getColumnModel().getColumnCount() > 0) {
            tblDisciplina.getColumnModel().getColumn(0).setPreferredWidth(2);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
        );

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel3.setText("Turma");

        txtTurma.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel4.setText("Semestre");

        txtSemestre.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(txtTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(txtSemestre)))
                                .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpar)
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(txtTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5)
                        .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCursoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtNome.getText() != null && txtNome.getText().trim().length() > 0
                && cmbCurso.getSelectedItem() != null && cmbCurso.getSelectedItem().toString().trim().length() > 0) {

            Disciplina c = new Disciplina();
            Serializador s = new Serializador();

            c.setNome(txtNome.getText());
            c.setCurso(cmbCurso.getSelectedItem().toString());
            c.setSemestre(txtSemestre.getText());
            c.setTurma(txtTurma.getText());

            DisciplinaDAO pd = new DisciplinaDAO();
            boolean salvou = pd.salvarDisciplina(c);
            //aqui chamamos a classe Serializador para serializar o arquivo
            try {
                //atualizar o path para o caminho da sua maquina onde quer salvar
                s.serializar("C:\\Faculdade\\disciplina", c);
            } catch (Exception ex) {
                System.err.println("Falha ao serializar! - " + ex.toString());
            }
            //fim do método de serialização
            salvar(salvou);

        } else {
            JOptionPane.showMessageDialog(null, "Todas as informações precisam ser preenchidas!", "Dados incompletos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        if (txtNome.getText() != null && txtNome.getText().trim().length() > 0
                && cmbCurso.getSelectedItem() != null && cmbCurso.getSelectedItem().toString().trim().length() > 0) {

            Object Codigo = tblDisciplina.getModel().getValueAt(tblDisciplina.getSelectedRow(), 0);
            int cod = Integer.parseInt(Codigo.toString());

            Disciplina c = new Disciplina();
            c.setDisciplinaID(cod);
            c.setNome(txtNome.getText());
            c.setCurso(cmbCurso.getSelectedItem().toString());
            c.setSemestre(txtSemestre.getText());
            c.setTurma(txtTurma.getText());

            DisciplinaDAO pd = new DisciplinaDAO();
            boolean atualizou = pd.atualizarDisciplina(c);

            salvar(atualizou);

        } else {
            JOptionPane.showMessageDialog(null, "Todas as informações precisam ser preenchidas!", "Dados incompletos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void tblDisciplinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDisciplinaMouseClicked
        if (tblDisciplina.getSelectedRow() > 0) {

            Object nome = tblDisciplina.getModel().getValueAt(tblDisciplina.getSelectedRow(), 1);
            String n = nome.toString();
            txtNome.setText(n);

            Object periodo = tblDisciplina.getModel().getValueAt(tblDisciplina.getSelectedRow(), 2);
            String e = periodo.toString();
            cmbCurso.setSelectedItem(e);

            Object Semestre = tblDisciplina.getModel().getValueAt(tblDisciplina.getSelectedRow(), 3);
            String s = Semestre.toString();
            txtSemestre.setText(s);

            Object turma = tblDisciplina.getModel().getValueAt(tblDisciplina.getSelectedRow(), 4);
            String t = turma.toString();
            txtTurma.setText(t);

        }
    }//GEN-LAST:event_tblDisciplinaMouseClicked

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tblDisciplina.getSelectedRow() >= 0) {
            Object Codigo = tblDisciplina.getModel().getValueAt(tblDisciplina.getSelectedRow(), 0);
            Codigo.toString();
            String c = Codigo.toString();
            int cod = Integer.parseInt(c);
            DisciplinaDAO cd = new DisciplinaDAO();
            boolean excluiu = cd.excluirDisciplina(cod);

            if (excluiu) {
                atualizarTabela();
                JOptionPane.showMessageDialog(null, "Disciplina apagada com sucesso!.",
                        "Apagar Disciplina", JOptionPane.INFORMATION_MESSAGE);
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Disciplina não foi apagada.",
                        "Apagar Disciplina", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha.",
                    "Dados incompletos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDisciplina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDisciplina;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSemestre;
    private javax.swing.JTextField txtTurma;
    // End of variables declaration//GEN-END:variables
    public final void popularComboDisciplina() {
        DisciplinaDAO a = new DisciplinaDAO();
        Connection conn = null;

        try {
            conn = a.abrirConexao();
            //BUSCA DE TODOS OS NOMES CONTIDOS NA TABELA
            if (conn != null) {
                String Consulta = "SELECT DISTINCT nome FROM Curso ORDER BY nome";
                Statement stm = conn.createStatement();
                ResultSet resultado = stm.executeQuery(Consulta);

                int cont = 0;
                List<String> list = new ArrayList<String>();
                //LOOP REALIZADO PARA PREENCHER A LIST COM OS VALORES RETORNADOS
                while (resultado.next()) {
                    cont++;

                    String nome = resultado.getString("Nome");

                    list.add(nome);
                    DefaultComboBoxModel defaultComboModel = new DefaultComboBoxModel(list.toArray());
                    cmbCurso.setModel(defaultComboModel);

                }

            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar os dados do BD.");
        } finally {
            a.fecharConexao(conn);
        }

    }

    public final void exibirInformacoes() {
        DisciplinaDAO p = new DisciplinaDAO();
        Connection conn = null;

        try {
            conn = p.abrirConexao();

            if (conn != null) {
                String Consulta = "SELECT * FROM Disciplina ORDER BY NOME";
                Statement stm = conn.createStatement();
                ResultSet resultado = stm.executeQuery(Consulta);

                int cont = 0;

                while (resultado.next()) {
                    cont++;

                    String DisciplinaID = resultado.getString("DisciplinaID");
                    String nome = resultado.getString("Nome");
                    String nomeCurso = resultado.getString("NomeCurso");
                    //alterando aqui
                    String semestre = resultado.getString("Semestre");
                    String turma = resultado.getString("Turma");

                    DefaultTableModel modelo = (DefaultTableModel) tblDisciplina.getModel();
                    String[] coluna = new String[]{
                        resultado.getString("DisciplinaID"),
                        resultado.getString("Nome"),
                        resultado.getString("NomeCurso"),
                        resultado.getString("Semestre"),
                        resultado.getString("Turma")};
                    modelo.addRow(coluna);
                }

            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar os dados do BD.");
        } finally {
            p.fecharConexao(conn);
        }

    }

    public void salvar(boolean s) {
        if (s) {
            limparCampos();
            atualizarTabela();
            JOptionPane.showMessageDialog(null, "Curso salvo com sucesso!", "Cadastrar curso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar professor(a)!", "Atualizar Professor(a)", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void atualizarTabela() {
        esconderInfomacoes();
        exibirInformacoes();
    }

    public void limparCampos() {
        txtNome.setText("");
        txtTurma.setText("");
        txtSemestre.setText("");
        cmbCurso.setSelectedIndex(0);
    }

    public void esconderInfomacoes() {
        DefaultTableModel modelo = (DefaultTableModel) tblDisciplina.getModel();
        modelo.setNumRows(0);
    }
}
