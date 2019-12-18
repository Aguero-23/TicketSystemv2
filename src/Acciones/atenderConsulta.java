package Acciones;

import javax.swing.JOptionPane;
import static Principal.MainFrame.nextInLine;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static Principal.MainFrame.nextInLine;

/**
 *
 * @author kevinvsequeira
 */
public class atenderConsulta extends javax.swing.JFrame {

    Funciones f = new Funciones();
    String clienteMoneda = null;
    String clienteBanco = null;
    String destinatarioMoneda = null;
    int tipoCambio = 500;

    public atenderConsulta() {
        initComponents();
        cargaInicial();
    }

    public boolean validaMonto(int monto) {
        return (monto <= Integer.parseInt(jtf_saldo.getText().substring(1)));
    }

    public void cargaInicial() {
        jtf_identificacion.setEnabled(false);
        jtf_nombre.setEnabled(false);
        jtf_saldo.setEnabled(false);
        try {
            ResultSet rs = f.consultaCliente(nextInLine);
            //                    System.out.println("Cedula CC: "+rs.getString("Cedula"));
            clienteMoneda = rs.getString("Moneda");
            clienteBanco = rs.getString("Banco");
            jtf_identificacion.setText(rs.getString("Cedula"));
            jtf_nombre.setText(rs.getString("Nombre") + " " + rs.getString("Apellido1"));
            String tipo = (clienteMoneda.equals("Dolares")) ? "$" : "₡";
            jtf_saldo.setText(tipo + rs.getString("Saldo"));
        } catch (SQLException ex) {
            Logger.getLogger(atenderConsulta.class.getName()).log(Level.SEVERE, null, ex);
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

        jp_atenderConsulta = new javax.swing.JPanel();
        jl_Identificacion = new javax.swing.JLabel();
        jl_Nombre = new javax.swing.JLabel();
        jl_Saldo = new javax.swing.JLabel();
        jtf_identificacion = new javax.swing.JTextField();
        jtf_nombre = new javax.swing.JTextField();
        jtf_saldo = new javax.swing.JTextField();
        jb_regresar = new javax.swing.JButton();
        jl_TituloConsultaSaldo = new javax.swing.JLabel();
        jl_InformacionCliente = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Información");

        jp_atenderConsulta.setBackground(new java.awt.Color(255, 255, 255));
        jp_atenderConsulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        jl_Identificacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jl_Identificacion.setText("Cédula:");

        jl_Nombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jl_Nombre.setText("Nombre:");

        jl_Saldo.setBackground(new java.awt.Color(255, 255, 255));
        jl_Saldo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jl_Saldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_cash_16px.png"))); // NOI18N
        jl_Saldo.setText("Saldo:");

        jtf_identificacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jtf_nombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jtf_saldo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jb_regresar.setBackground(new java.awt.Color(255, 255, 255));
        jb_regresar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_left_16px_2.png"))); // NOI18N
        jb_regresar.setText("Regresar");
        jb_regresar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jb_regresar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jb_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_regresarActionPerformed(evt);
            }
        });

        jl_TituloConsultaSaldo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jl_TituloConsultaSaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_money_bag_32px.png"))); // NOI18N
        jl_TituloConsultaSaldo.setText("Consulta de saldo");

        jl_InformacionCliente.setBackground(new java.awt.Color(255, 255, 255));
        jl_InformacionCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jl_InformacionCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_user_32px.png"))); // NOI18N
        jl_InformacionCliente.setText("Informacion del Cliente: ");
        jl_InformacionCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jp_atenderConsultaLayout = new javax.swing.GroupLayout(jp_atenderConsulta);
        jp_atenderConsulta.setLayout(jp_atenderConsultaLayout);
        jp_atenderConsultaLayout.setHorizontalGroup(
            jp_atenderConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_atenderConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_atenderConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_atenderConsultaLayout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(jp_atenderConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_atenderConsultaLayout.createSequentialGroup()
                                .addGroup(jp_atenderConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_Saldo)
                                    .addComponent(jl_Nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jl_Identificacion, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(27, 27, 27)
                                .addGroup(jp_atenderConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jp_atenderConsultaLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jl_InformacionCliente))
                            .addComponent(jb_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(jp_atenderConsultaLayout.createSequentialGroup()
                        .addComponent(jl_TituloConsultaSaldo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_atenderConsultaLayout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_atenderConsultaLayout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())))
        );
        jp_atenderConsultaLayout.setVerticalGroup(
            jp_atenderConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_atenderConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_TituloConsultaSaldo)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jl_InformacionCliente)
                .addGap(18, 18, 18)
                .addGroup(jp_atenderConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_Identificacion))
                .addGap(18, 18, 18)
                .addGroup(jp_atenderConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_Nombre))
                .addGap(18, 18, 18)
                .addGroup(jp_atenderConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_Saldo))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jb_regresar)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_atenderConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_atenderConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(265, 335));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Botón Regresar
    private void jb_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_regresarActionPerformed
        this.hide(); this.dispose();
    }//GEN-LAST:event_jb_regresarActionPerformed

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
            java.util.logging.Logger.getLogger(atenderConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(atenderConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(atenderConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(atenderConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new atenderConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jb_regresar;
    private javax.swing.JLabel jl_Identificacion;
    private javax.swing.JLabel jl_InformacionCliente;
    private javax.swing.JLabel jl_Nombre;
    private javax.swing.JLabel jl_Saldo;
    private javax.swing.JLabel jl_TituloConsultaSaldo;
    private javax.swing.JPanel jp_atenderConsulta;
    private javax.swing.JTextField jtf_identificacion;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JTextField jtf_saldo;
    // End of variables declaration//GEN-END:variables
}
