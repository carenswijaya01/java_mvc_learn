package View;

import Control.DAOMahasiswa;
import Model.Mahasiswa;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TabelMahasiswa extends javax.swing.JFrame {

    boolean cekUpdate = false;
    List<Mahasiswa> ls;
    Mahasiswa m;

    public TabelMahasiswa() {
        initComponents();
        btnCancel.setVisible(false);
        LoadData();
    }

    void LoadData() {
        ls = new DAOMahasiswa().getAll();
        String data[][] = new String[ls.size()][4];
        for (int i = 0; i < ls.size(); i++) {
            data[i][0] = ls.get(i).getNim();
            data[i][1] = ls.get(i).getNama();
            data[i][2] = ls.get(i).getUmur() + "";
            data[i][3] = ls.get(i).getGender() + "";
        }
        tblMahasiswa.setModel(new DefaultTableModel(data, new String[]{"NIM", "Nama", "Umur", "Jenis Kelamin"}));
    }

    void clearField() {
        btnDelete.setVisible(true);
        btnInsert.setVisible(true);
        btnCancel.setVisible(false);
        tblMahasiswa.setEnabled(true);
        txtNIM.setEnabled(true);
        txtNIM.setText("");
        txtNama.setText("");
        txtUmur.setValue(0);
        rbLk.setSelected(false);
        rbPrp.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupGender = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNIM = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtUmur = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMahasiswa = new javax.swing.JTable();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        rbLk = new javax.swing.JRadioButton();
        rbPrp = new javax.swing.JRadioButton();
        btnUpdate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nama");

        jLabel2.setText("NIM");

        jLabel3.setText("Umur");

        tblMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "Nama", "Umur", "Jenis Kelamin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMahasiswa);

        btnInsert.setText("Insert");
        btnInsert.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        GroupGender.add(rbLk);
        rbLk.setText("Laku Laki");

        GroupGender.add(rbPrp);
        rbPrp.setText("Perempuan");

        btnUpdate.setText("Update");
        btnUpdate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtUmur, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInsert)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNIM)
                                    .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbLk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbPrp)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbLk)
                    .addComponent(rbPrp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnDelete)
                                .addComponent(btnInsert)
                                .addComponent(btnUpdate)
                                .addComponent(btnCancel))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtUmur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnDelete.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            int row = tblMahasiswa.getSelectedRow();
            ls.remove(row);
            new DAOMahasiswa().updateMhs(ls);
            LoadData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Pilih Data Dalam Tabel");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        m = new Mahasiswa();
        m.setNim(txtNIM.getText());
        m.setNama(txtNama.getText());
        m.setUmur(Integer.parseInt(txtUmur.getValue().toString()));
        if (rbLk.isSelected()) {
            m.setGender('L');
        }
        if (rbPrp.isSelected()) {
            m.setGender('P');
        }
        ls.add(m);
        new DAOMahasiswa().updateMhs(ls);
        LoadData();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            int row = tblMahasiswa.getSelectedRow();
            if (cekUpdate) {
                ls.get(row).setNama(txtNama.getText());
                ls.get(row).setUmur(Integer.parseInt(txtUmur.getValue().toString()));
                if (rbLk.isSelected()) {
                    ls.get(row).setGender('L');
                }
                if (rbPrp.isSelected()) {
                    ls.get(row).setGender('P');
                }

                new DAOMahasiswa().updateMhs(ls);
                LoadData();
                clearField();
                cekUpdate = false;

            } else {

                m = ls.get(row);
                txtNIM.setEnabled(false);
                tblMahasiswa.setEnabled(false);
                btnDelete.setVisible(false);
                btnInsert.setVisible(false);
                btnCancel.setVisible(true);
                txtNIM.setText(m.getNim());
                txtNama.setText(m.getNama());
                txtUmur.setValue(m.getUmur());
                if (m.getGender() == 'L') {
                    rbLk.setSelected(true);
                } else {
                    rbPrp.setSelected(true);
                }

                cekUpdate = true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Pilih Data Dalam Tabel");
        }


    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        clearField();
        cekUpdate = false;
    }//GEN-LAST:event_btnCancelActionPerformed

    private void tblMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMahasiswaMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tblMahasiswaMouseClicked

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
            java.util.logging.Logger.getLogger(TabelMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupGender;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbLk;
    private javax.swing.JRadioButton rbPrp;
    private javax.swing.JTable tblMahasiswa;
    private javax.swing.JTextField txtNIM;
    private javax.swing.JTextField txtNama;
    private javax.swing.JSpinner txtUmur;
    // End of variables declaration//GEN-END:variables
}
