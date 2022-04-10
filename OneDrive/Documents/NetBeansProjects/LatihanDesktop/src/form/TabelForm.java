/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alex Zaro Daeli
 */
public class TabelForm extends javax.swing.JFrame {

    private DefaultTableModel model;
    
    // Variable current id
    private int id = 0;
    
    // Varieble id yang dipilih
    private int selectedId = 0;

    /**
     * Creates new form TabelForm
     */
    public TabelForm() {
        initComponents();
        
        // Memanggil fungsi init table
        this.initTable();
       }

private void initTable() {
        // Initialize Table
        model = new DefaultTableModel();
        tb_data.setModel(model);
        
        // Menambahkan kolom awal pada bagian atas
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Phone Number");
        
        // Membuat tombol agar tidak terlihat saat pertama kali dijalankan
        btn_delete.setVisible(false); 
    }                      

    private void resetForm() {
        // Mengembalikan id yang dipilih menjadi 0
        this.selectedId = 0;
        
        // Menghapus text field
        tf_name.setText("");
        tf_phone.setText("");
        
        // Menghilangkan tombol hapus kembali
        btn_delete.setVisible(false);
    }
    
    // Fungsi untuk mengambil baris yang diklik
    private String getSelectedRow() {
         int selectedRowIndex = tb_data.getSelectedRow();
         Object selectedObject = (Object) tb_data.getModel().getValueAt(
            selectedRowIndex, 0
         );
         
         return String.valueOf(selectedObject);    
    }
    
    // Fungsi untuk menambahkan data ke model tabel
    private void store() {
        String name = tf_name.getText();
        String phone = tf_phone.getText();

        this.id = this.id + 1;
        String id = String.valueOf(this.id);

        Object[] obj = new Object[]{
            id,
            name,
            phone
        };
        
        this.model.addRow(obj);
    }
    
    // Fungsi untuk mengubah data yang ada pada tabel
    private void update() {
        String row = this.getSelectedRow();

        String name = tf_name.getText();
        String phone = tf_phone.getText();
        
        for (int i = 0; model.getRowCount() > i; i++) {
            String id = (String) model.getValueAt(i, 0);
            
            if (id.equals(row)) {
                model.setValueAt(name, i, 1);
                model.setValueAt(phone, i, 2);
            }
        }
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
        tb_data = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_phone = new javax.swing.JTextField();
        btn_submit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tb_data.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_dataMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tb_dataMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tb_data);

        jLabel1.setText(" Nama");

        tf_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nameActionPerformed(evt);
            }
        });

        jLabel2.setText("No.Telp");

        tf_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_phoneActionPerformed(evt);
            }
        });

        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_submit)
                        .addGap(183, 183, 183)
                        .addComponent(btn_delete))
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tf_phone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                        .addComponent(tf_name, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_submit)
                    .addComponent(btn_delete))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
         // TODO add your handling code here:
        if (this.selectedId > 0) {
            this.update();
        } else {
            this.store();
        }
        
        this.resetForm();
    }//GEN-LAST:event_btn_submitActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int selectedRowIndex = tb_data.getSelectedRow();
        model.removeRow(selectedRowIndex);
        
        this.resetForm();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void tf_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nameActionPerformed

    private void tf_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_phoneActionPerformed

    private void tb_dataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_dataMousePressed
        String row = this.getSelectedRow();
        
        String name = null;
        String phone = null;

        // Pencarian baris dan kolom pada model tabel
        for (int i = 0; model.getRowCount() > i; i++) {
            String id = (String) model.getValueAt(i, 0);
            
            if (id.equals(row)) {
                this.selectedId = Integer.parseInt(id);
                
                name = (String) model.getValueAt(i, 1);
                phone = (String) model.getValueAt(i, 2);
                
                // Tombol hapus ditampilkan
                btn_delete.setVisible(true);
            }
          }
        
        tf_name.setText(name);
        tf_phone.setText(phone);
    }//GEN-LAST:event_tb_dataMousePressed

    private void tb_dataMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_dataMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_dataMouseReleased

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
            java.util.logging.Logger.getLogger(TabelForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_submit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_data;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_phone;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}