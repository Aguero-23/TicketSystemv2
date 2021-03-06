/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/**
 *
 * @author kevinvsequeira
 */
public class consultaCliente extends javax.swing.JFrame {

    Funciones f = new Funciones();
    Principal.MainFrame mf = new Principal.MainFrame();
    Clientes.Cliente c = new Clientes.Cliente(null);

    public consultaCliente() {
        initComponents();
        cargarInicial();
        this.setResizable(false);
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);
    }

    public void cargarInicial() {
        jtf_identificacion.setEditable(false);
        jtf_nombre.setEditable(false);
        jtf_apellido1.setEditable(false);
        jtf_apellido2.setEditable(false);
        jtf_banco.setEditable(false);
        jtf_moneda.setEditable(false);
        jtf_saldoInicial.setEditable(false);
        jtf_creacion.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_consultaCliente = new javax.swing.JPanel();
        jl_CedulaConsultar = new javax.swing.JLabel();
        jb_consultar = new javax.swing.JButton();
        jtf_identificacionConsultar = new javax.swing.JTextField();
        jtf_nombre = new javax.swing.JTextField();
        jtf_apellido2 = new javax.swing.JTextField();
        jb_regresar = new javax.swing.JButton();
        jtf_banco = new javax.swing.JTextField();
        jtf_creacion = new javax.swing.JTextField();
        jtf_moneda = new javax.swing.JTextField();
        jtf_saldoInicial = new javax.swing.JTextField();
        jl_Banco = new javax.swing.JLabel();
        jl_Moneda = new javax.swing.JLabel();
        jl_SaldoInicial = new javax.swing.JLabel();
        jl_creacion = new javax.swing.JLabel();
        jl_Identificacion = new javax.swing.JLabel();
        jl_Nombre = new javax.swing.JLabel();
        jl_Apellido1 = new javax.swing.JLabel();
        jl_Apellido2 = new javax.swing.JLabel();
        jtf_apellido1 = new javax.swing.JTextField();
        jtf_identificacion = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jl_TituloConsultarCliente = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jl_InformacionCliente = new javax.swing.JLabel();
        jl_InformacionBanco = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta Cliente");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);

        jp_consultaCliente.setBackground(new java.awt.Color(255, 255, 255));
        jp_consultaCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        jl_CedulaConsultar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jl_CedulaConsultar.setText("Cédula a consultar:");

        jb_consultar.setBackground(new java.awt.Color(255, 255, 255));
        jb_consultar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jb_consultar.setText("Consultar");
        jb_consultar.setBorder(null);
        jb_consultar.setBorderPainted(false);
        jb_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_consultarActionPerformed(evt);
            }
        });

        jtf_identificacionConsultar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jtf_nombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jtf_apellido2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

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

        jtf_banco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jtf_creacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jtf_moneda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtf_moneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_monedaActionPerformed(evt);
            }
        });

        jtf_saldoInicial.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jl_Banco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jl_Banco.setText("Banco:");

        jl_Moneda.setBackground(new java.awt.Color(255, 255, 255));
        jl_Moneda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jl_Moneda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_coins_16px.png"))); // NOI18N
        jl_Moneda.setText("Moneda:");

        jl_SaldoInicial.setBackground(new java.awt.Color(255, 255, 255));
        jl_SaldoInicial.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jl_SaldoInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_cash_16px.png"))); // NOI18N
        jl_SaldoInicial.setText("Saldo inicial:");

        jl_creacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jl_creacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_calendar_16px.png"))); // NOI18N
        jl_creacion.setText("Creación:");

        jl_Identificacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jl_Identificacion.setText("Cédula:");

        jl_Nombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jl_Nombre.setText("Nombre:");

        jl_Apellido1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jl_Apellido1.setText("Apellido 1:");

        jl_Apellido2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jl_Apellido2.setText("Apellido 2:");

        jtf_apellido1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jtf_identificacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));

        jl_TituloConsultarCliente.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jl_TituloConsultarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_search_more_32px.png"))); // NOI18N
        jl_TituloConsultarCliente.setText("Consultar Cliente");

        jl_InformacionCliente.setBackground(new java.awt.Color(255, 255, 255));
        jl_InformacionCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jl_InformacionCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_user_32px.png"))); // NOI18N
        jl_InformacionCliente.setText("Informacion del Cliente: ");
        jl_InformacionCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jl_InformacionBanco.setBackground(new java.awt.Color(255, 255, 255));
        jl_InformacionBanco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jl_InformacionBanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_museum_32px.png"))); // NOI18N
        jl_InformacionBanco.setText("Informacion del Banco: ");
        jl_InformacionBanco.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jp_consultaClienteLayout = new javax.swing.GroupLayout(jp_consultaCliente);
        jp_consultaCliente.setLayout(jp_consultaClienteLayout);
        jp_consultaClienteLayout.setHorizontalGroup(
            jp_consultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_consultaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_consultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_consultaClienteLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jl_CedulaConsultar)
                        .addGap(75, 75, 75)
                        .addComponent(jtf_identificacionConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jb_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_consultaClienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jp_consultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_consultaClienteLayout.createSequentialGroup()
                                .addGroup(jp_consultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_consultaClienteLayout.createSequentialGroup()
                                        .addComponent(jl_Apellido2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtf_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_consultaClienteLayout.createSequentialGroup()
                                        .addComponent(jl_Apellido1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtf_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jp_consultaClienteLayout.createSequentialGroup()
                                        .addComponent(jl_Nombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jp_consultaClienteLayout.createSequentialGroup()
                                        .addComponent(jl_Identificacion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtf_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(60, 60, 60)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jp_consultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jp_consultaClienteLayout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addGroup(jp_consultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jl_creacion)
                                            .addGroup(jp_consultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jl_Banco)
                                                .addComponent(jl_Moneda))))
                                    .addGroup(jp_consultaClienteLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jl_SaldoInicial)))
                                .addGap(26, 26, 26)
                                .addGroup(jp_consultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_moneda, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_saldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_banco, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_creacion, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jp_consultaClienteLayout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(jl_InformacionBanco)))
                        .addGap(145, 145, 145))
                    .addGroup(jp_consultaClienteLayout.createSequentialGroup()
                        .addGroup(jp_consultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_InformacionCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jp_consultaClienteLayout.createSequentialGroup()
                .addGroup(jp_consultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_consultaClienteLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jl_TituloConsultarCliente))
                    .addGroup(jp_consultaClienteLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jb_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jp_consultaClienteLayout.setVerticalGroup(
            jp_consultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_consultaClienteLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jl_TituloConsultarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jp_consultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_consultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_consultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jl_CedulaConsultar)
                        .addComponent(jtf_identificacionConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jp_consultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_InformacionBanco)
                    .addComponent(jl_InformacionCliente))
                .addGroup(jp_consultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_consultaClienteLayout.createSequentialGroup()
                        .addGroup(jp_consultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_consultaClienteLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jp_consultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtf_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jl_Identificacion)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_consultaClienteLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jp_consultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtf_banco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jl_Banco))))
                        .addGap(18, 18, 18)
                        .addGroup(jp_consultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_moneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_Moneda)
                            .addComponent(jl_Nombre))
                        .addGap(18, 18, 18)
                        .addGroup(jp_consultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_saldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_SaldoInicial)
                            .addComponent(jl_Apellido1))
                        .addGap(18, 18, 18)
                        .addGroup(jp_consultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_creacion)
                            .addComponent(jl_Apellido2)
                            .addComponent(jtf_creacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_consultaClienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_consultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 559, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_consultaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(576, 504));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Boton Consultar
    private void jb_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_consultarActionPerformed
        if (jtf_identificacionConsultar.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe de digitar una cedula para realizar la busqueda",
                    "Sin cédula", JOptionPane.ERROR_MESSAGE);
        } else {
            ResultSet rs = f.consultaCliente(jtf_identificacionConsultar.getText());
            if (rs != null) {
                String[] data = new String[8];
                try {
//                    System.out.println("Cedula CC: "+rs.getString("Cedula"));
                    jtf_identificacion.setText(rs.getString("Cedula"));
                    jtf_nombre.setText(rs.getString("Nombre"));
                    jtf_apellido1.setText(rs.getString("Apellido1"));
                    jtf_apellido2.setText(rs.getString("Apellido2"));
                    jtf_banco.setText(rs.getString("Banco"));
                    jtf_moneda.setText(rs.getString("Moneda"));
                    jtf_saldoInicial.setText(rs.getString("Saldo"));
                    jtf_creacion.setText(rs.getString("Fecha_Creacion"));
                } catch (SQLException ex) {
                    Logger.getLogger(consultaCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron registros asociados a la cedula "
                        + jtf_identificacionConsultar.getText(), "Sin registros", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jb_consultarActionPerformed

    //Añadir al sistema
    private void jb_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_regresarActionPerformed
        mf.show();
        this.hide();
        this.dispose();
    }//GEN-LAST:event_jb_regresarActionPerformed

    private void jtf_monedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_monedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_monedaActionPerformed

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
            java.util.logging.Logger.getLogger(consultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton jb_consultar;
    private javax.swing.JButton jb_regresar;
    private javax.swing.JLabel jl_Apellido1;
    private javax.swing.JLabel jl_Apellido2;
    private javax.swing.JLabel jl_Banco;
    private javax.swing.JLabel jl_CedulaConsultar;
    private javax.swing.JLabel jl_Identificacion;
    private javax.swing.JLabel jl_InformacionBanco;
    private javax.swing.JLabel jl_InformacionCliente;
    private javax.swing.JLabel jl_Moneda;
    private javax.swing.JLabel jl_Nombre;
    private javax.swing.JLabel jl_SaldoInicial;
    private javax.swing.JLabel jl_TituloConsultarCliente;
    private javax.swing.JLabel jl_creacion;
    private javax.swing.JPanel jp_consultaCliente;
    private javax.swing.JTextField jtf_apellido1;
    private javax.swing.JTextField jtf_apellido2;
    private javax.swing.JTextField jtf_banco;
    private javax.swing.JTextField jtf_creacion;
    private javax.swing.JTextField jtf_identificacion;
    private javax.swing.JTextField jtf_identificacionConsultar;
    private javax.swing.JTextField jtf_moneda;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JTextField jtf_saldoInicial;
    // End of variables declaration//GEN-END:variables
}
