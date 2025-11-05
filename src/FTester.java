
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

public class FTester extends javax.swing.JFrame {

    Conexion cnx = new Conexion();
    String admin1 = "SELECT i.iDInfante, nombreinf, MONTH(fechaEntrada) AS mes, COUNT(*) AS total FROM infantes i "
            + "JOIN entradas e ON i.idInfante = e.idInfante "
            + "GROUP BY i.iDInfante, MONTH(fechaEntrada) ";

    String inf = "SELECT mes "
            + "FROM vista_asistencias_mensuales "
            + "GROUP BY mes ";
    
    String idf = "SELECT idInfante FROM infantes ORDER BY idInfante ";

    public FTester() {
        initComponents();

        if (cnx.conectar("localhost", "guarderia2", "root", "") == 1) {
            // if (cnx.conectar("148.202.213.51", "guarderia", "fsi202510", "2468") == 1) {
            JOptionPane.showMessageDialog(this, "conexion");
            cnx.entablar(admin1, Tconsultas);
            cnx.seleccionar(inf, cbMes);
            cnx.seleccionar(idf, cbIde);

        } else {
            JOptionPane.showMessageDialog(this, "CONEXION FALLIDA");
            System.exit(0);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        cbMes = new javax.swing.JComboBox<>();
        btConsulta = new javax.swing.JButton();
        btReporte = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jLabel2 = new javax.swing.JLabel();
        cbIde = new javax.swing.JComboBox<>();
        btConsulta2 = new javax.swing.JButton();
        btReporte2 = new javax.swing.JButton();
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

        jLabel1.setBackground(new java.awt.Color(51, 204, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ENTRADA POR MES");
        jLabel1.setOpaque(true);
        jToolBar1.add(jLabel1);

        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Julio", "Junio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", " " }));
        cbMes.setMaximumSize(new java.awt.Dimension(150, 50));
        cbMes.setMinimumSize(new java.awt.Dimension(150, 50));
        cbMes.setPreferredSize(new java.awt.Dimension(150, 50));
        jToolBar1.add(cbMes);

        btConsulta.setText("CONSULTA1");
        btConsulta.setFocusable(false);
        btConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btConsulta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaActionPerformed(evt);
            }
        });
        jToolBar1.add(btConsulta);

        btReporte.setText("REPORTE1");
        btReporte.setFocusable(false);
        btReporte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btReporte.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReporteActionPerformed(evt);
            }
        });
        jToolBar1.add(btReporte);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setMaximumSize(new java.awt.Dimension(40, 100));
        jSeparator1.setOpaque(true);
        jToolBar1.add(jSeparator1);

        jLabel2.setBackground(new java.awt.Color(51, 204, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("INFANTES CON SUS PERMISOS");
        jLabel2.setOpaque(true);
        jToolBar1.add(jLabel2);

        cbIde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Julio", "Junio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", " " }));
        cbIde.setMaximumSize(new java.awt.Dimension(150, 50));
        cbIde.setMinimumSize(new java.awt.Dimension(150, 50));
        cbIde.setPreferredSize(new java.awt.Dimension(150, 50));
        jToolBar1.add(cbIde);

        btConsulta2.setText("CONSULTA2");
        btConsulta2.setFocusable(false);
        btConsulta2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btConsulta2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btConsulta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsulta2ActionPerformed(evt);
            }
        });
        jToolBar1.add(btConsulta2);

        btReporte2.setText("REPORTE2");
        btReporte2.setFocusable(false);
        btReporte2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btReporte2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btReporte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReporte2ActionPerformed(evt);
            }
        });
        jToolBar1.add(btReporte2);

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
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
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

    private void btConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaActionPerformed
        int mes = cbMes.getSelectedIndex() + 1;
        String sql = "SELECT * "
                + "FROM vista_asistencias_mensuales "
                + "WHERE mes = " + mes + " ORDER BY idInfante";

        cnx.entablar(sql, Tconsultas);
    }//GEN-LAST:event_btConsultaActionPerformed

    private void btReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReporteActionPerformed
        String reporte = System.getProperty("user.dir") + "/infante_asistencia.jasper";
        Map parametros = new HashMap();
        parametros.put("mes", cbMes.getSelectedItem().toString());

        if (cnx.ejecutarReporte(reporte, parametros) == 0) {
            JOptionPane.showMessageDialog(this, "ERROR al ejecutar el reporte");
        }
    }//GEN-LAST:event_btReporteActionPerformed

    private void btConsulta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsulta2ActionPerformed
        int idInfante = cbIde.getSelectedIndex() + 1;
        String sql = "SELECT * "
                + "FROM vista_salidas_detalle "
                + "WHERE idInfante = " + idInfante + " "
                + "ORDER BY idInfante";


        cnx.entablar(sql, Tconsultas);
    }//GEN-LAST:event_btConsulta2ActionPerformed

    private void btReporte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReporte2ActionPerformed
        String reporte = System.getProperty("user.dir") + "/infantes_permisos.jasper";
        Map parametros = new HashMap();
        parametros.put("idInfante", cbIde.getSelectedItem().toString());

        if (cnx.ejecutarReporte(reporte, parametros) == 0) {
            JOptionPane.showMessageDialog(this, "ERROR al ejecutar el reporte");
        }


    }//GEN-LAST:event_btReporte2ActionPerformed

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
    private javax.swing.JButton btConsulta;
    private javax.swing.JButton btConsulta2;
    private javax.swing.JButton btReporte;
    private javax.swing.JButton btReporte2;
    private javax.swing.JComboBox<String> cbIde;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
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
