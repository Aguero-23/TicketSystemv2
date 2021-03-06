/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

public class Vista extends javax.swing.JFrame {

    private SimuladorArbolBinario simulador = new SimuladorArbolBinario();

    int dato = 0;
    int size = 0;

    public Vista() throws SQLException {
        initComponents();
        this.inicializar(false);
        cargaInicial();
        this.setResizable(false);
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);
    }

    public void cargaInicial() throws SQLException {
        ArbolBB ab = new ArbolBB();
        ResultSet rs = ab.consultaCliente();
        if (rs != null) {
            rs.last();    // moves cursor to the last row
            size = rs.getRow(); // get row id 
            rs.first();
        }
        try {
            cargaDatos(0, ab.consultaCliente());
        } catch (SQLException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cargaDatos(int i, ResultSet rs) throws SQLException {

        try {
            if (i < size) {
                if (rs.getString(6).equals("Dolares")) {
                    dato = rs.getInt(7) * Acciones.atenderTransaccion.tipoCambio;
                } else {
                    dato = rs.getInt(7);
                }
                
                if (this.simulador.insertar(dato)) {
                    this.inicializar(true);
                    complementos();
                }
                if (rs.next()) {
                    TimeUnit.SECONDS.sleep(1);
                    cargaDatos(i + 1, rs);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo insertar el dato", "Intenta de nuevo...", 0);
        }
    }

    private void inicializar(boolean enable) {
        this.jb_inOrden.setEnabled(enable);
        this.jb_postOrden.setEnabled(enable);
        this.jb_preOrden.setEnabled(enable);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_vistaGrafico = new javax.swing.JPanel();
        jsp_resultados = new javax.swing.JScrollPane();
        jta_impresion = new javax.swing.JTextArea();
        jdp_grafico = new javax.swing.JDesktopPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jb_inOrden = new javax.swing.JButton();
        jb_preOrden = new javax.swing.JButton();
        jb_postOrden = new javax.swing.JButton();
        jb_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gráfico de saldos");
        setResizable(false);

        jp_vistaGrafico.setBackground(new java.awt.Color(255, 255, 255));
        jp_vistaGrafico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jp_vistaGrafico.setOpaque(false);

        jsp_resultados.setOpaque(false);

        jta_impresion.setEditable(false);
        jta_impresion.setColumns(20);
        jta_impresion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jta_impresion.setRows(5);
        jta_impresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados de operaciones"));
        jta_impresion.setOpaque(false);
        jsp_resultados.setViewportView(jta_impresion);

        jdp_grafico.setOpaque(false);

        jInternalFrame2.setBorder(javax.swing.BorderFactory.createTitledBorder("Arbol"));
        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setResizable(true);
        jInternalFrame2.setEnabled(false);
        jInternalFrame2.setFocusCycleRoot(false);
        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );

        jdp_grafico.add(jInternalFrame2);
        jInternalFrame2.setBounds(0, 0, 600, 320);

        jb_inOrden.setBackground(new java.awt.Color(255, 255, 255));
        jb_inOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_stack_16px.png"))); // NOI18N
        jb_inOrden.setText("InOrden");
        jb_inOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_inOrdenActionPerformed(evt);
            }
        });

        jb_preOrden.setBackground(new java.awt.Color(255, 255, 255));
        jb_preOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_stack_16px.png"))); // NOI18N
        jb_preOrden.setText("PreOrden");
        jb_preOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_preOrdenActionPerformed(evt);
            }
        });

        jb_postOrden.setBackground(new java.awt.Color(255, 255, 255));
        jb_postOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_stack_16px.png"))); // NOI18N
        jb_postOrden.setText("PostOrden");
        jb_postOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_postOrdenActionPerformed(evt);
            }
        });

        jb_regresar.setBackground(new java.awt.Color(255, 255, 255));
        jb_regresar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_left_16px_2.png"))); // NOI18N
        jb_regresar.setText("Volver al menu");
        jb_regresar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jb_regresar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jb_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_vistaGraficoLayout = new javax.swing.GroupLayout(jp_vistaGrafico);
        jp_vistaGrafico.setLayout(jp_vistaGraficoLayout);
        jp_vistaGraficoLayout.setHorizontalGroup(
            jp_vistaGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_vistaGraficoLayout.createSequentialGroup()
                .addGroup(jp_vistaGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jdp_grafico, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_vistaGraficoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jp_vistaGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_vistaGraficoLayout.createSequentialGroup()
                                .addComponent(jb_inOrden)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_preOrden)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_postOrden))
                            .addGroup(jp_vistaGraficoLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jb_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsp_resultados, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jp_vistaGraficoLayout.setVerticalGroup(
            jp_vistaGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_vistaGraficoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdp_grafico, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jp_vistaGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsp_resultados, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_vistaGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jb_inOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jb_preOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jb_postOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jb_regresar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_vistaGrafico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_vistaGrafico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jp_vistaGrafico.getAccessibleContext().setAccessibleName("Cuentas Activas");

        setSize(new java.awt.Dimension(696, 529));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_inOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_inOrdenActionPerformed
        // TODO add your handling code here:
        String recorrido = null;
        recorrido = this.simulador.inOrden();

        this.jta_impresion.setText("");
        this.jta_impresion.setText(recorrido);
        this.jta_impresion.setCaretPosition(0);
    }//GEN-LAST:event_jb_inOrdenActionPerformed

    private void jb_preOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_preOrdenActionPerformed
        // TODO add your handling code here:
        String recorrido = null;
        recorrido = this.simulador.preOrden();

        this.jta_impresion.setText("");
        this.jta_impresion.setText(recorrido);
        this.jta_impresion.setCaretPosition(0);
    }//GEN-LAST:event_jb_preOrdenActionPerformed

    private void jb_postOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_postOrdenActionPerformed
        // TODO add your handling code here:
        String recorrido = null;
        recorrido = this.simulador.postOrden();

        this.jta_impresion.setText("");
        this.jta_impresion.setText(recorrido);
        this.jta_impresion.setCaretPosition(0);
    }//GEN-LAST:event_jb_postOrdenActionPerformed

    private void jb_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_regresarActionPerformed
        Principal.MainFrame mf = new Principal.MainFrame();
        mf.show(); this.hide(); this.dispose();
    }//GEN-LAST:event_jb_regresarActionPerformed

    public void complementos() {
        this.repintarArbol();
    }

    private void repintarArbol() {
        this.jdp_grafico.removeAll();
        Rectangle tamaño = this.jInternalFrame2.getBounds();
        this.jInternalFrame2 = null;
        this.jInternalFrame2 = new JInternalFrame("Representación gráfica", true);
        this.jdp_grafico.add(this.jInternalFrame2, JLayeredPane.DEFAULT_LAYER);
        this.jInternalFrame2.setVisible(true);
        this.jInternalFrame2.setBounds(tamaño);
        this.jInternalFrame2.setEnabled(false);
        this.jInternalFrame2.add(this.simulador.getDibujo(), BorderLayout.CENTER);
    }

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Vista().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JButton jb_inOrden;
    private javax.swing.JButton jb_postOrden;
    private javax.swing.JButton jb_preOrden;
    private javax.swing.JButton jb_regresar;
    private javax.swing.JDesktopPane jdp_grafico;
    private javax.swing.JPanel jp_vistaGrafico;
    private javax.swing.JScrollPane jsp_resultados;
    private javax.swing.JTextArea jta_impresion;
    // End of variables declaration//GEN-END:variables
}
