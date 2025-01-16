/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import javax.swing.JOptionPane;
import sys.crudTable;
import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class FrameWisata extends javax.swing.JFrame {
String JudulKolom[] = {"idwisata", "Nama", "Alamat", "Info", "Lokasi", "Tgl_buat", "Tgl_ubah"};
int LebarKolom[] = {150, 300, 200, 100, 100, 100};
String SQL = "SELECT * FROM wisata";

    private crudTable myObject;
    public FrameWisata() {
        initComponents();
        this.setLocationRelativeTo(null);
        myObject = new crudTable();
        myObject.settingJudulTabel(TableWisata, JudulKolom);
        myObject.settingLebarKolom(TableWisata, LebarKolom);
        myObject.tampilTabel(TableWisata, SQL, JudulKolom);
         

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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FieldNama = new javax.swing.JTextField();
        FieldAlamat = new javax.swing.JTextField();
        FieldInformasi = new javax.swing.JTextField();
        FieldLokasi = new javax.swing.JTextField();
        FieldTgl_buat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        FieldWisata = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        FieldTgl_ubah = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableWisata = new javax.swing.JTable();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setText("Nama");

        jLabel2.setText("Alamat");

        jLabel3.setText("Informasi");

        jLabel4.setText("Lokasi");

        jLabel5.setText("Tanggal Buat");

        FieldTgl_buat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldTgl_buatActionPerformed(evt);
            }
        });

        jButton1.setText("SIMPAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("UBAH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("HAPUS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Id Wisata");

        FieldWisata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldWisataActionPerformed(evt);
            }
        });

        jLabel7.setText("Tanggal Ubah");

        TableWisata.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(TableWisata);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FieldInformasi)
                            .addComponent(FieldLokasi)
                            .addComponent(FieldTgl_buat)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addComponent(FieldAlamat)
                            .addComponent(FieldTgl_ubah)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FieldNama)
                            .addComponent(FieldWisata))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(FieldWisata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(FieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(FieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(FieldInformasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(FieldLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(FieldTgl_buat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldTgl_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
        String primaryKey = "idwisata";
        String primaryValue = FieldWisata.getText();
        String[] fieldToUpdate = {"idwisata", "Nama", "Alamat", "Info", "Lokasi", "Tgl_buat", "Tgl_ubah"};
        
        String[] newValue = {
        FieldWisata.getText(),
        FieldNama.getText(),
        FieldAlamat.getText(),
        FieldInformasi.getText(),
        FieldLokasi.getText(),
        FieldTgl_buat.getText(),
        FieldTgl_ubah.getText()
        };
        myObject.UbahDinamis("wisata", primaryKey, primaryValue, fieldToUpdate, newValue);
        myObject.tampilTabel(TableWisata, SQL, JudulKolom);
        } catch (Exception e) {
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            String primaryKey = "idwisata";
            String primaryValue = FieldWisata.getText();
            
            FieldWisata.setText("");
            FieldNama.setText("");
            FieldAlamat.setText("");
            FieldInformasi.setText("");
            FieldLokasi.setText("");
            FieldTgl_buat.setText("");
            FieldTgl_ubah.setText("");
            myObject.HapusDinamis("wisata", primaryKey, primaryValue);
            myObject.tampilTabel(TableWisata, SQL, JudulKolom);
        } catch (Exception e) {
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
        String idwisata = FieldWisata.getText();
        String Nama = FieldNama.getText();
        String Alamat = FieldAlamat.getText();
        String Info = FieldInformasi.getText();
        String Lokasi = FieldLokasi.getText();
        String Tgl_buat = FieldTgl_buat.getText();
        String Tgl_ubah = FieldTgl_ubah.getText();
        String[] nama = {"idwisata", "Nama", "Alamat", "Info", "Lokasi", "Tgl_buat", "Tgl_ubah"};
        String[] isiTable = {idwisata, Nama, Alamat, Info, Lokasi, Tgl_buat, Tgl_ubah};
        myObject.SimpanDinamis("wisata",nama, isiTable);
        myObject.tampilTabel(TableWisata, SQL, JudulKolom);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FieldWisataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldWisataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldWisataActionPerformed

    private void FieldTgl_buatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldTgl_buatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldTgl_buatActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
         int selectedRow = TableWisata.getSelectedRow();
        if (selectedRow != -1) {
            FieldWisata.setText(TableWisata.getValueAt(selectedRow, 0).toString());
            FieldNama.setText(TableWisata.getValueAt(selectedRow, 1).toString());
            FieldAlamat.setText(TableWisata.getValueAt(selectedRow, 2).toString());
            FieldInformasi.setText(TableWisata.getValueAt(selectedRow, 4).toString());
            FieldLokasi.setText(TableWisata.getValueAt(selectedRow, 5).toString());
            FieldTgl_buat.setText(TableWisata.getValueAt(selectedRow, 6).toString());
            FieldTgl_ubah.setText(TableWisata.getValueAt(selectedRow, 7).toString());
            myObject.tampilTabel(TableWisata, SQL, JudulKolom);
        }
    }//GEN-LAST:event_formMouseClicked

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
            java.util.logging.Logger.getLogger(FrameWisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameWisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameWisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameWisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameWisata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FieldAlamat;
    private javax.swing.JTextField FieldInformasi;
    private javax.swing.JTextField FieldLokasi;
    private javax.swing.JTextField FieldNama;
    private javax.swing.JTextField FieldTgl_buat;
    private javax.swing.JTextField FieldTgl_ubah;
    private javax.swing.JTextField FieldWisata;
    private javax.swing.JTable TableWisata;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
