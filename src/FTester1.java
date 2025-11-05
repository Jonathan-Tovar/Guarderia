
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

public class FTester1 extends javax.swing.JFrame {

    Conexion cnx = new Conexion();
    String admin1 = "SELECT i.iDInfante, nombreinf, MONTH(fechaEntrada) AS mes, COUNT(*) AS total FROM infantes i "
            + "JOIN entradas e ON i.idInfante = e.idInfante "
            + "GROUP BY i.iDInfante, MONTH(fechaEntrada) ";

    String tutor1 = "SELECT idTutor, i.iDInfante, nombreinf, MONTH(fechaEntrada) AS mes, COUNT(*) AS total "
            + "FROM infantes i "
            + "JOIN entradas e ON i.idInfante = e.idInfante "
            + "WHERE idTutor = 1 "
            + "GROUP BY i.iDInfante, MONTH(fechaEntrada) ";

    String aux1 = "SELECT idAutorizado, i.iDInfante, nombreinf, MONTH(fechaSalida) AS mes, COUNT(*) AS total "
            + "FROM infantes i "
            + "JOIN salidas s ON i.idInfante = s.idInfante "
            + "WHERE idAutorizado = 1 AND tipoAutorizado = 'Auxiliar' "
            + "GROUP BY i.iDInfante, MONTH(fechaSalida) ";

    String edu1 = "SELECT idEducadora, i.iDInfante, nombreinf, MONTH(fechaEntrada) AS mes, COUNT(*) AS total "
            + "FROM infantes i "
            + "JOIN entradas e ON i.idInfante = e.idInfante ";

    public FTester1() {
        initComponents();

//        if (cnx.conectar("Localhost", "guarderia", "root", "") == 0) {
        if (cnx.conectar("148.202.213.51", "guarderia", "fsi202510", "2468") == 1) {
            JOptionPane.showMessageDialog(this, "conexion");
            cnx.entablar(admin1, Tconsultas);

        } else {
            JOptionPane.showMessageDialog(this, "CONEXION FALLIDA");
            System.exit(0);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btAdmin1 = new javax.swing.JButton();
        btTutor1 = new javax.swing.JButton();
        btAux1 = new javax.swing.JButton();
        btEdu1 = new javax.swing.JButton();
        cbMes = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tconsultas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jToolBar1.setBackground(new java.awt.Color(0, 153, 255));
        jToolBar1.setRollover(true);

        btAdmin1.setText("ADMIN1");
        btAdmin1.setFocusable(false);
        btAdmin1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAdmin1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btAdmin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdmin1ActionPerformed(evt);
            }
        });
        jToolBar1.add(btAdmin1);

        btTutor1.setText("TUTOR1");
        btTutor1.setFocusable(false);
        btTutor1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btTutor1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btTutor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTutor1ActionPerformed(evt);
            }
        });
        jToolBar1.add(btTutor1);

        btAux1.setText("AUX1");
        btAux1.setFocusable(false);
        btAux1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAux1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btAux1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAux1ActionPerformed(evt);
            }
        });
        jToolBar1.add(btAux1);

        btEdu1.setText("EDU1");
        btEdu1.setFocusable(false);
        btEdu1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEdu1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btEdu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEdu1ActionPerformed(evt);
            }
        });
        jToolBar1.add(btEdu1);

        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Enero", "Febrero", "Marzo" }));
        cbMes.setMaximumSize(new java.awt.Dimension(150, 50));
        cbMes.setMinimumSize(new java.awt.Dimension(150, 50));
        cbMes.setPreferredSize(new java.awt.Dimension(150, 50));
        jToolBar1.add(cbMes);

        Tconsultas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tconsultas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (cnx != null) {
            cnx.desconectar();
        }
    }//GEN-LAST:event_formWindowClosing

    private void btAdmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdmin1ActionPerformed
        cnx.entablar(admin1, Tconsultas);
    }//GEN-LAST:event_btAdmin1ActionPerformed

    private void btTutor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTutor1ActionPerformed
        cnx.entablar(tutor1, Tconsultas);
    }//GEN-LAST:event_btTutor1ActionPerformed

    private void btAux1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAux1ActionPerformed
        cnx.entablar(aux1, Tconsultas);
    }//GEN-LAST:event_btAux1ActionPerformed

    private void btEdu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEdu1ActionPerformed
        String educadora = JOptionPane.showInputDialog(this, "IDEducadora: ");
        int mes = cbMes.getSelectedIndex();
        
        String edu11 = edu1 += " WHERE idEducadora = " +educadora+
                " AND MONTH(fechaEntrada) =  " + mes
                + " GROUP BY i.iDInfante, MONTH(fechaEntrada) ";

        cnx.entablar(edu11, Tconsultas);
    }//GEN-LAST:event_btEdu1ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, (UnsupportedLookAndFeelException) ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FTester().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tconsultas;
    private javax.swing.JButton btAdmin1;
    private javax.swing.JButton btAux1;
    private javax.swing.JButton btEdu1;
    private javax.swing.JButton btTutor1;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    private static class logger {

        private static void log(Level SEVERE, Object object, UnsupportedLookAndFeelException unsupportedLookAndFeelException) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public logger() {
        }
    }
}
