/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author CLAUDIO CRUZADO E
 */
public class FrmPersonal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPersonal
     */
    public FrmPersonal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        cmbSexo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dateFechaN = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dateFechaI = new com.toedter.calendar.JDateChooser();
        ChecSexo = new javax.swing.JCheckBox();
        ChecNombre = new javax.swing.JCheckBox();
        ChecApellidoP = new javax.swing.JCheckBox();
        ChecApellidoM = new javax.swing.JCheckBox();
        ChecTelefono = new javax.swing.JCheckBox();
        ChecDireccion = new javax.swing.JCheckBox();
        ChecEmail = new javax.swing.JCheckBox();
        ChecFechaI = new javax.swing.JCheckBox();
        ChecFechaN = new javax.swing.JCheckBox();
        ChecDNI1 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(210, 126, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(960, 471));
        setSize(new java.awt.Dimension(960, 471));
        getContentPane().setLayout(null);

        jPanel6.setBackground(new java.awt.Color(90, 83, 79));
        jPanel6.setLayout(null);

        jButton1.setBackground(new java.awt.Color(210, 126, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton1.setText("X");
        jPanel6.add(jButton1);
        jButton1.setBounds(863, 10, 40, 21);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 950, 40);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        txtDni.setBackground(new java.awt.Color(218, 218, 218));
        txtDni.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtDni.setBorder(null);
        jPanel1.add(txtDni);
        txtDni.setBounds(50, 30, 170, 22);

        txtNombre.setBackground(new java.awt.Color(218, 218, 218));
        txtNombre.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre);
        txtNombre.setBounds(50, 80, 170, 22);

        txtApellidoP.setBackground(new java.awt.Color(218, 218, 218));
        txtApellidoP.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtApellidoP.setBorder(null);
        jPanel1.add(txtApellidoP);
        txtApellidoP.setBounds(50, 130, 170, 22);

        txtApellidoM.setBackground(new java.awt.Color(218, 218, 218));
        txtApellidoM.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtApellidoM.setBorder(null);
        jPanel1.add(txtApellidoM);
        txtApellidoM.setBounds(50, 180, 170, 22);

        txtTelefono.setBackground(new java.awt.Color(218, 218, 218));
        txtTelefono.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtTelefono.setBorder(null);
        jPanel1.add(txtTelefono);
        txtTelefono.setBounds(280, 80, 170, 22);

        txtEmail.setBackground(new java.awt.Color(218, 218, 218));
        txtEmail.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtEmail.setBorder(null);
        jPanel1.add(txtEmail);
        txtEmail.setBounds(280, 180, 170, 22);

        txtDireccion.setBackground(new java.awt.Color(218, 218, 218));
        txtDireccion.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtDireccion.setBorder(null);
        txtDireccion.setPreferredSize(new java.awt.Dimension(128, 20));
        jPanel1.add(txtDireccion);
        txtDireccion.setBounds(280, 130, 170, 22);

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));
        cmbSexo.setBorder(null);
        jPanel1.add(cmbSexo);
        cmbSexo.setBounds(520, 80, 170, 20);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("NOMBRE:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 60, 90, 14);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("DNI:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 10, 50, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("APELLIDO P:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 110, 100, 14);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("APELLIDO MATERNO:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 160, 150, 17);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("DIRECCIÓN:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(280, 110, 100, 17);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("TELÉFONO:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(280, 60, 120, 17);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("FECHA NACIMIENTO:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(520, 110, 120, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("SEXO:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(520, 60, 70, 20);

        dateFechaN.setBackground(new java.awt.Color(218, 218, 218));
        jPanel1.add(dateFechaN);
        dateFechaN.setBounds(520, 130, 170, 22);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("E-MAIL:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(280, 160, 80, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("FECHA INGRESO:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(520, 160, 120, 20);

        dateFechaI.setBackground(new java.awt.Color(218, 218, 218));
        jPanel1.add(dateFechaI);
        dateFechaI.setBounds(520, 180, 170, 22);

        ChecSexo.setBackground(new java.awt.Color(255, 255, 255));
        ChecSexo.setForeground(new java.awt.Color(210, 126, 0));
        ChecSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChecSexoActionPerformed(evt);
            }
        });
        jPanel1.add(ChecSexo);
        ChecSexo.setBounds(690, 80, 20, 21);

        ChecNombre.setBackground(new java.awt.Color(255, 255, 255));
        ChecNombre.setForeground(new java.awt.Color(210, 126, 0));
        ChecNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChecNombreActionPerformed(evt);
            }
        });
        jPanel1.add(ChecNombre);
        ChecNombre.setBounds(220, 80, 20, 21);

        ChecApellidoP.setBackground(new java.awt.Color(255, 255, 255));
        ChecApellidoP.setForeground(new java.awt.Color(210, 126, 0));
        ChecApellidoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChecApellidoPActionPerformed(evt);
            }
        });
        jPanel1.add(ChecApellidoP);
        ChecApellidoP.setBounds(220, 130, 20, 21);

        ChecApellidoM.setBackground(new java.awt.Color(255, 255, 255));
        ChecApellidoM.setForeground(new java.awt.Color(210, 126, 0));
        ChecApellidoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChecApellidoMActionPerformed(evt);
            }
        });
        jPanel1.add(ChecApellidoM);
        ChecApellidoM.setBounds(220, 180, 20, 21);

        ChecTelefono.setBackground(new java.awt.Color(255, 255, 255));
        ChecTelefono.setForeground(new java.awt.Color(210, 126, 0));
        ChecTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChecTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(ChecTelefono);
        ChecTelefono.setBounds(450, 80, 20, 21);

        ChecDireccion.setBackground(new java.awt.Color(255, 255, 255));
        ChecDireccion.setForeground(new java.awt.Color(210, 126, 0));
        ChecDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChecDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(ChecDireccion);
        ChecDireccion.setBounds(450, 130, 20, 21);

        ChecEmail.setBackground(new java.awt.Color(255, 255, 255));
        ChecEmail.setForeground(new java.awt.Color(210, 126, 0));
        ChecEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChecEmailActionPerformed(evt);
            }
        });
        jPanel1.add(ChecEmail);
        ChecEmail.setBounds(450, 180, 20, 21);

        ChecFechaI.setBackground(new java.awt.Color(255, 255, 255));
        ChecFechaI.setForeground(new java.awt.Color(210, 126, 0));
        ChecFechaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChecFechaIActionPerformed(evt);
            }
        });
        jPanel1.add(ChecFechaI);
        ChecFechaI.setBounds(690, 180, 20, 21);

        ChecFechaN.setBackground(new java.awt.Color(255, 255, 255));
        ChecFechaN.setForeground(new java.awt.Color(210, 126, 0));
        ChecFechaN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChecFechaNActionPerformed(evt);
            }
        });
        jPanel1.add(ChecFechaN);
        ChecFechaN.setBounds(690, 130, 20, 21);

        ChecDNI1.setBackground(new java.awt.Color(255, 255, 255));
        ChecDNI1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ChecDNI1.setForeground(new java.awt.Color(210, 126, 0));
        ChecDNI1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChecDNI1ActionPerformed(evt);
            }
        });
        jPanel1.add(ChecDNI1);
        ChecDNI1.setBounds(220, 30, 20, 21);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 90, 750, 220);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        btnEliminar.setBackground(new java.awt.Color(210, 126, 0));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        jPanel2.add(btnEliminar);
        btnEliminar.setBounds(40, 120, 100, 23);

        btnModificar.setBackground(new java.awt.Color(210, 126, 0));
        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar);
        btnModificar.setBounds(40, 80, 100, 23);

        btnContinuar.setBackground(new java.awt.Color(210, 126, 0));
        btnContinuar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setText("CONTINUAR");
        jPanel2.add(btnContinuar);
        btnContinuar.setBounds(40, 40, 100, 23);

        btnCancelar1.setBackground(new java.awt.Color(210, 126, 0));
        btnCancelar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar1.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar1.setText("CANCELAR");
        jPanel2.add(btnCancelar1);
        btnCancelar1.setBounds(40, 160, 100, 23);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(760, 90, 190, 220);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        txtBuscar.setBackground(new java.awt.Color(218, 218, 218));
        txtBuscar.setBorder(null);
        jPanel3.add(txtBuscar);
        txtBuscar.setBounds(690, 10, 230, 20);

        btnBuscar.setBackground(new java.awt.Color(216, 126, 0));
        btnBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(null);
        btnBuscar.setPreferredSize(new java.awt.Dimension(97, 23));
        jPanel3.add(btnBuscar);
        btnBuscar.setBounds(580, 10, 100, 23);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 40, 950, 50);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        btnCancelar.setBackground(new java.awt.Color(210, 126, 0));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("SELECCIONAR");
        jPanel4.add(btnCancelar);
        btnCancelar.setBounds(60, 20, 110, 23);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 310, 950, 160);
        getContentPane().add(jPanel5);
        jPanel5.setBounds(250, -30, 10, 10);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void ChecSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChecSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChecSexoActionPerformed

    private void ChecDNI1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChecDNI1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChecDNI1ActionPerformed

    private void ChecNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChecNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChecNombreActionPerformed

    private void ChecApellidoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChecApellidoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChecApellidoPActionPerformed

    private void ChecApellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChecApellidoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChecApellidoMActionPerformed

    private void ChecTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChecTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChecTelefonoActionPerformed

    private void ChecDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChecDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChecDireccionActionPerformed

    private void ChecEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChecEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChecEmailActionPerformed

    private void ChecFechaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChecFechaIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChecFechaIActionPerformed

    private void ChecFechaNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChecFechaNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChecFechaNActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPersonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox ChecApellidoM;
    public javax.swing.JCheckBox ChecApellidoP;
    public javax.swing.JCheckBox ChecDNI1;
    public javax.swing.JCheckBox ChecDireccion;
    public javax.swing.JCheckBox ChecEmail;
    public javax.swing.JCheckBox ChecFechaI;
    public javax.swing.JCheckBox ChecFechaN;
    public javax.swing.JCheckBox ChecNombre;
    public javax.swing.JCheckBox ChecSexo;
    public javax.swing.JCheckBox ChecTelefono;
    public javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    public javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    public javax.swing.JComboBox<String> cmbSexo;
    public com.toedter.calendar.JDateChooser dateFechaI;
    public com.toedter.calendar.JDateChooser dateFechaN;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JTextField txtApellidoM;
    public javax.swing.JTextField txtApellidoP;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
