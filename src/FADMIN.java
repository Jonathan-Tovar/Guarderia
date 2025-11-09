
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class FADMIN extends javax.swing.JFrame {

    Conexion cnx;
    String id, nombre;

    String infp = "SELECT matricula FROM infantes ORDER BY matricula";
    String enc = "SELECT idencargado FROM encargados ORDER BY idencargado";
    
     String inf = "SELECT mes "
            + "FROM vista_asistencias_mensuales "
            + "GROUP BY mes ";
     
     String todo = "SELECT * "
             + "FROM vista_asistencias_mensuales "
             + "GROUP BY mes";
    
    String idf = "SELECT idInfante FROM infantes ORDER BY idInfante ";

    public FADMIN() {
        initComponents();

        cnx = new Conexion();

        if (cnx.conectar("localhost", "guarderia2", "root", "") == 1) {
            cnx.entablar(todo, Tconsultas);
            cnx.seleccionar(inf, cbmes);
            cnx.seleccionar(idf, cbIde);
            ;

        } else {
            JOptionPane.showMessageDialog(this, "Sin conexión. La ventana se cerrará.");
            System.exit(0);
        }

    }

    public void recibirDatos(Conexion cnx, String id, String nombre) {
        this.cnx = cnx;
        this.id = id;
        this.nombre = nombre;

        LID.setText(id);
        LNom.setText(nombre);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LID = new javax.swing.JLabel();
        LNom = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton5 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        txtbuscador = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tconsultas = new javax.swing.JTable();
        jToolBar2 = new javax.swing.JToolBar();
        cbmes = new javax.swing.JComboBox<>();
        btConsulta1 = new javax.swing.JButton();
        btReporte1 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        cbIde = new javax.swing.JComboBox<>();
        btConsulta2 = new javax.swing.JButton();
        btReporte2 = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FADMIN");

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        LID.setBackground(new java.awt.Color(0, 0, 0));
        LID.setForeground(new java.awt.Color(0, 0, 0));
        LID.setText("LID");

        LNom.setBackground(new java.awt.Color(0, 0, 0));
        LNom.setForeground(new java.awt.Color(0, 0, 0));
        LNom.setText("NOMBRE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(LID, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(LNom, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LNom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jToolBar1.setRollover(true);

        jButton1.setText("ENCARGADOS");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator1);

        jButton2.setText("PERSONAL");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);
        jToolBar1.add(jSeparator2);

        jButton3.setText("INFANTES");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton3);
        jToolBar1.add(jSeparator3);

        jButton5.setText("REGRISTROS");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton5);
        jToolBar1.add(jSeparator4);

        jButton4.setText("PERMISOS");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton4);
        jToolBar1.add(jSeparator5);

        txtbuscador.setMaximumSize(new java.awt.Dimension(150, 30));
        txtbuscador.setMinimumSize(new java.awt.Dimension(150, 30));
        txtbuscador.setPreferredSize(new java.awt.Dimension(150, 30));
        jToolBar1.add(txtbuscador);

        btBuscar.setText("BUSCAR");
        btBuscar.setFocusable(false);
        btBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btBuscar);

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

        jToolBar2.setRollover(true);

        cbmes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbmes.setMaximumSize(new java.awt.Dimension(95, 40));
        cbmes.setMinimumSize(new java.awt.Dimension(95, 40));
        cbmes.setPreferredSize(new java.awt.Dimension(95, 40));
        jToolBar2.add(cbmes);

        btConsulta1.setText("CONSULTA1");
        btConsulta1.setFocusable(false);
        btConsulta1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btConsulta1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btConsulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsulta1ActionPerformed(evt);
            }
        });
        jToolBar2.add(btConsulta1);

        btReporte1.setText("REPORTE1");
        btReporte1.setFocusable(false);
        btReporte1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btReporte1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btReporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReporte1ActionPerformed(evt);
            }
        });
        jToolBar2.add(btReporte1);
        jToolBar2.add(jSeparator6);

        cbIde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbIde.setMaximumSize(new java.awt.Dimension(95, 40));
        cbIde.setMinimumSize(new java.awt.Dimension(95, 40));
        cbIde.setPreferredSize(new java.awt.Dimension(95, 40));
        jToolBar2.add(cbIde);

        btConsulta2.setText("CONSULTA2");
        btConsulta2.setFocusable(false);
        btConsulta2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btConsulta2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btConsulta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsulta2ActionPerformed(evt);
            }
        });
        jToolBar2.add(btConsulta2);

        btReporte2.setText("REPORTE2");
        btReporte2.setFocusable(false);
        btReporte2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btReporte2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btReporte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReporte2ActionPerformed(evt);
            }
        });
        jToolBar2.add(btReporte2);
        jToolBar2.add(jSeparator7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btReporte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReporte2ActionPerformed
        String reporte = System.getProperty("user.dir") + "/infantes_permisos.jasper";
        Map parametros = new HashMap();
        parametros.put("idInfante", cbIde.getSelectedItem().toString());

        if (cnx.ejecutarReporte(reporte, parametros) == 0) {
            JOptionPane.showMessageDialog(this, "ERROR al ejecutar el reporte");
        }
    }//GEN-LAST:event_btReporte2ActionPerformed

    private void btReporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReporte1ActionPerformed
        String reporte = System.getProperty("user.dir") + "/infante_asistencia.jasper";
        Map parametros = new HashMap();
        parametros.put("mes", cbmes.getSelectedItem().toString());

        if (cnx.ejecutarReporte(reporte, parametros) == 0) {
            JOptionPane.showMessageDialog(this, "ERROR al ejecutar el reporte");
        }
    }//GEN-LAST:event_btReporte1ActionPerformed

    private void btConsulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsulta1ActionPerformed
        int mes = cbmes.getSelectedIndex() + 1;
        String sql = "SELECT * "
                + "FROM vista_asistencias_mensuales "
                + "WHERE mes = " + mes + " ORDER BY idInfante";

        cnx.entablar(sql, Tconsultas);
    }//GEN-LAST:event_btConsulta1ActionPerformed

    private void btConsulta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsulta2ActionPerformed
        int idInfante = cbIde.getSelectedIndex() + 1;
        String sql = "SELECT * "
                + "FROM vista_salidas_detalle "
                + "WHERE idInfante = " + idInfante + " "
                + "ORDER BY idInfante";

        cnx.entablar(sql, Tconsultas);
    }//GEN-LAST:event_btConsulta2ActionPerformed

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
            java.util.logging.Logger.getLogger(FADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FADMIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LID;
    private javax.swing.JLabel LNom;
    private javax.swing.JTable Tconsultas;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btConsulta1;
    private javax.swing.JButton btConsulta2;
    private javax.swing.JButton btReporte1;
    private javax.swing.JButton btReporte2;
    private javax.swing.JComboBox<String> cbIde;
    private javax.swing.JComboBox<String> cbmes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTextField txtbuscador;
    // End of variables declaration//GEN-END:variables
}
