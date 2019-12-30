package Principal;

import java.sql.SQLException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

    public static String nextInLine = null;
    int numTicket = 1;
    int contPersonas = 0;
    Lista lis = new Lista();
    static Cola c = new Cola();
    String ticket = "";
    Funciones f = new Funciones();
    Clientes.Funciones cf = new Clientes.Funciones();

    public MainFrame() {
        initComponents();
        this.setResizable(false);
        jrdbG_Group.add(jrdb_Retiros);
        jrdbG_Group.add(jrdb_Informacion);
        jrdbG_Group.add(jrdb_Transferencias);
        jtf_Identificacion.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jrdbG_Group = new javax.swing.ButtonGroup();
        jp_PanelPrincipal = new javax.swing.JPanel();
        jl_FormularioTransacciones = new javax.swing.JLabel();
        jl_TICKETSYSTEM = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jl_Identificacion = new javax.swing.JLabel();
        jtf_Identificacion = new javax.swing.JTextField();
        jb_GenerarBoton = new javax.swing.JButton();
        jl_PersonasEnCola = new javax.swing.JLabel();
        jrdb_Retiros = new javax.swing.JRadioButton();
        jrdb_Transferencias = new javax.swing.JRadioButton();
        jrdb_Informacion = new javax.swing.JRadioButton();
        jl_persEnCola = new javax.swing.JLabel();
        jb_Caja1 = new javax.swing.JButton();
        jb_Caja2 = new javax.swing.JButton();
        jb_Caja3 = new javax.swing.JButton();
        jmb_MenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(350, 190));
        setSize(new java.awt.Dimension(500, 500));

        jp_PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jp_PanelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        jl_FormularioTransacciones.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jl_FormularioTransacciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_FormularioTransacciones.setText("Formulario de transacciones");
        jl_FormularioTransacciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jl_FormularioTransacciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jl_TICKETSYSTEM.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jl_TICKETSYSTEM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_sales_performance_50px.png"))); // NOI18N
        jl_TICKETSYSTEM.setText("Ticket System");
        jl_TICKETSYSTEM.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jSeparator1.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jl_Identificacion.setText("Identificación:");

        jb_GenerarBoton.setBackground(new java.awt.Color(255, 255, 255));
        jb_GenerarBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_document_50px_4.png"))); // NOI18N
        jb_GenerarBoton.setText("Generar Ticket");
        jb_GenerarBoton.setBorder(null);
        jb_GenerarBoton.setBorderPainted(false);
        jb_GenerarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jb_GenerarBoton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jb_GenerarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_GenerarBotonActionPerformed(evt);
            }
        });

        jl_PersonasEnCola.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_PersonasEnCola.setText("Personas en Cola");
        jl_PersonasEnCola.setEnabled(false);
        jl_PersonasEnCola.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jrdb_Retiros.setText("Retiros");
        jrdb_Retiros.setName("R"); // NOI18N
        jrdb_Retiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdb_RetirosActionPerformed(evt);
            }
        });

        jrdb_Transferencias.setText("Transferencias");
        jrdb_Transferencias.setName("T"); // NOI18N
        jrdb_Transferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdb_TransferenciasActionPerformed(evt);
            }
        });

        jrdb_Informacion.setText("Información");
        jrdb_Informacion.setName("I"); // NOI18N
        jrdb_Informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdb_InformacionActionPerformed(evt);
            }
        });

        jl_persEnCola.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_persEnCola.setText("0");
        jl_persEnCola.setEnabled(false);

        jb_Caja1.setBackground(new java.awt.Color(255, 255, 255));
        jb_Caja1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_administrator_male_32px.png"))); // NOI18N
        jb_Caja1.setText("Caja 1");
        jb_Caja1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jb_Caja1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jb_Caja1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_Caja1ActionPerformed(evt);
            }
        });

        jb_Caja2.setBackground(new java.awt.Color(255, 255, 255));
        jb_Caja2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_administrator_male_32px.png"))); // NOI18N
        jb_Caja2.setText("Caja 2");
        jb_Caja2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jb_Caja2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jb_Caja2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_Caja2ActionPerformed(evt);
            }
        });

        jb_Caja3.setBackground(new java.awt.Color(255, 255, 255));
        jb_Caja3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_administrator_male_32px.png"))); // NOI18N
        jb_Caja3.setText("Caja 3");
        jb_Caja3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jb_Caja3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jb_Caja3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_Caja3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_PanelPrincipalLayout = new javax.swing.GroupLayout(jp_PanelPrincipal);
        jp_PanelPrincipal.setLayout(jp_PanelPrincipalLayout);
        jp_PanelPrincipalLayout.setHorizontalGroup(
            jp_PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_PanelPrincipalLayout.createSequentialGroup()
                .addGroup(jp_PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_PanelPrincipalLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(jp_PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_Identificacion)
                            .addComponent(jb_GenerarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(jp_PanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jp_PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_PanelPrincipalLayout.createSequentialGroup()
                                .addComponent(jl_PersonasEnCola, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(jl_Identificacion))
                            .addComponent(jl_persEnCola, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp_PanelPrincipalLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jl_FormularioTransacciones))
                    .addGroup(jp_PanelPrincipalLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jl_TICKETSYSTEM)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jp_PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_Caja1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jp_PanelPrincipalLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jrdb_Retiros)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(jp_PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_Caja2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrdb_Transferencias))
                        .addGap(54, 54, 54)
                        .addGroup(jp_PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_Caja3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrdb_Informacion))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())))
        );
        jp_PanelPrincipalLayout.setVerticalGroup(
            jp_PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_PanelPrincipalLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jl_TICKETSYSTEM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_FormularioTransacciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jp_PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Identificacion)
                    .addComponent(jl_PersonasEnCola))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_persEnCola)
                .addGap(3, 3, 3)
                .addComponent(jtf_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_GenerarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jp_PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrdb_Transferencias)
                    .addComponent(jrdb_Retiros)
                    .addComponent(jrdb_Informacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Caja1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Caja2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Caja3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jb_GenerarBoton.getAccessibleContext().setAccessibleName("jb_GenerarBoton");
        jb_GenerarBoton.getAccessibleContext().setAccessibleDescription("");
        jrdb_Retiros.getAccessibleContext().setAccessibleName("jrdb_Retiros");
        jrdb_Transferencias.getAccessibleContext().setAccessibleName("jrdb_Transferencias");
        jrdb_Informacion.getAccessibleContext().setAccessibleName("jrdb_Informacion");

        jmb_MenuBar.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Clientes");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_business_building_16px.png"))); // NOI18N
        jMenuItem1.setText("Añadir Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_search_16px.png"))); // NOI18N
        jMenuItem2.setText("Consultar Cliente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_delete_16px_3.png"))); // NOI18N
        jMenuItem3.setText("Eliminar Cliente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jmb_MenuBar.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Gráficos");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_bar_chart_16px.png"))); // NOI18N
        jMenuItem5.setText("Consultar Saldos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jmb_MenuBar.add(jMenu2);

        setJMenuBar(jmb_MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jp_PanelPrincipal.getAccessibleContext().setAccessibleName("jp_PanelPrincipal");

        setSize(new java.awt.Dimension(485, 453));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //////////////////////INSERTAR BOTON Y VALIDACIONES\\\\\\\\\\\\\\\\\\
    private boolean ValidacionesForm() {
        boolean val = true;
        try {
//            if (lis.buscar(Integer.parseInt(jtf_Identificacion.getText()))) { // Valida si la cédula ya está en espera
            if (c.encuentra(Integer.parseInt(jtf_Identificacion.getText()))) { // Valida si la cédula ya está en espera
                JOptionPane.showMessageDialog(this, "Ya estas en espera.",
                        "Cédula duplicada", JOptionPane.ERROR_MESSAGE);
                val = false;
                jtf_Identificacion.requestFocus();
            } else if (jtf_Identificacion.getText().equals("") //Valida si el formulario esta vacio
                    || jtf_Identificacion.getText().equals(null)
                    || jtf_Identificacion.getText().equals(" ")
                    || jtf_Identificacion.getText().equals("0")) {

                JOptionPane.showMessageDialog(this, "El formulario está vacio o le faltan datos.",
                        "Error en datos", JOptionPane.ERROR_MESSAGE);
                val = false;
                jtf_Identificacion.requestFocus();
            } else if (cf.consultaCliente(jtf_Identificacion.getText()) == null) {
                JOptionPane.showMessageDialog(null, "La cedula no se encuentra en el sistema, "
                        + "por favor verifíquela.", "Cédula no existe", JOptionPane.ERROR_MESSAGE);
                val = false;
                jtf_Identificacion.requestFocus();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Error al digitar cedula, probablemente contiene una letra.");
            jtf_Identificacion.setText("0");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return val;
    }

    private void InsertarTicket(String tipoTransacion) {
        ticket = tipoTransacion + numTicket;
        lis.insert(new Persona(Integer.parseInt(jtf_Identificacion.getText()), ticket, numTicket));
        c.encola(new Persona(Integer.parseInt(jtf_Identificacion.getText()), ticket, numTicket));
        contPersonas = contPersonas + 1;
        jl_persEnCola.setText("" + contPersonas);
        numTicket = numTicket + 1;
        jtf_Identificacion.setText("0");
    }

    /*||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||*/

    private void jb_GenerarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_GenerarBotonActionPerformed

        if (ValidacionesForm()) {
            AbstractButton aux = getSelectedOption(); //Obtiene la seleccion del radio button
            if (aux == null) { // Si no se selecciona nada entonces devuelve un mensaje para que seleccione
                JOptionPane.showMessageDialog(this, "Debe seleccionar una opcion.",
                        "Sin selección.", JOptionPane.ERROR_MESSAGE);
            } else { //Como se selecciono algo entonces inserta un ticket con este tipo de transaccion
                InsertarTicket(aux.getName());
            }
        } else {

        }
    }//GEN-LAST:event_jb_GenerarBotonActionPerformed

    //Crea cliente
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Clientes.creaCliente cu = new Clientes.creaCliente();
        cu.show();
        this.hide();
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /////////////////////////RADIO BUTTONS\\\\\\\\\\\\\\\\\\\\\\\\\\\
    public AbstractButton getSelectedOption() {
        Enumeration<AbstractButton> radioButtons = jrdbG_Group.getElements();
        while (radioButtons.hasMoreElements()) {
            AbstractButton currentRadioButton = radioButtons.nextElement();
            if (currentRadioButton.isSelected()) {
                return currentRadioButton;
            }
        }
        return null;
    }

    /*|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||*/
 /* Botones que no tuvieron funcion.*/
    private void jrdb_RetirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdb_RetirosActionPerformed

    }//GEN-LAST:event_jrdb_RetirosActionPerformed

    private void jrdb_TransferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdb_TransferenciasActionPerformed

    }//GEN-LAST:event_jrdb_TransferenciasActionPerformed

    private void jrdb_InformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdb_InformacionActionPerformed

    }//GEN-LAST:event_jrdb_InformacionActionPerformed

    private void jb_Caja1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_Caja1ActionPerformed
        // TODO add your handling code here:
        if (jl_persEnCola.getText().equals("0")) {
            JOptionPane.showMessageDialog(rootPane, "No hay personas en cola.");
            jl_persEnCola.setText("" + 0);
        } else {
            f.Atender();
            contPersonas = contPersonas - 1;
            jl_persEnCola.setText("" + contPersonas);
        }

//        System.out.println("#1 Atendido: "+f.Atender());
    }//GEN-LAST:event_jb_Caja1ActionPerformed

    private void jb_Caja2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_Caja2ActionPerformed
        // TODO add your handling code here:
        if (jl_persEnCola.getText().equals("0")) {
            JOptionPane.showMessageDialog(rootPane, "No hay personas en cola.");
            jl_persEnCola.setText("" + 0);
        } else {
            f.AtenderCaja2();
            contPersonas = contPersonas - 1;
            jl_persEnCola.setText("" + contPersonas);
        }
//        System.out.println("#2 Atendido: "+f.AtenderCaja2());
    }//GEN-LAST:event_jb_Caja2ActionPerformed

    private void jb_Caja3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_Caja3ActionPerformed
        // TODO add your handling code here:
        if (jl_persEnCola.getText().equals("0")) {
            JOptionPane.showMessageDialog(rootPane, "No hay personas en cola.");
            jl_persEnCola.setText("" + 0);
        } else {
            f.AtenderCaja3();
            contPersonas = contPersonas - 1;
            jl_persEnCola.setText("" + contPersonas);
        }
//        System.out.println("#3 Atendido: "+f.AtenderCaja3());
    }//GEN-LAST:event_jb_Caja3ActionPerformed

    //Consulta Cliente
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Clientes.consultaCliente cu = new Clientes.consultaCliente();
        cu.show();
        this.hide();
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    //Eliminar Cliente
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Clientes.eliminaCliente cu = new Clientes.eliminaCliente();
        cu.show();
        this.hide();
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    //Consulta saldos
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            Graficos.Vista v = new Graficos.Vista();
            v.show();
            this.hide();
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jb_Caja1;
    private javax.swing.JButton jb_Caja2;
    private javax.swing.JButton jb_Caja3;
    private javax.swing.JButton jb_GenerarBoton;
    private javax.swing.JLabel jl_FormularioTransacciones;
    private javax.swing.JLabel jl_Identificacion;
    private javax.swing.JLabel jl_PersonasEnCola;
    private javax.swing.JLabel jl_TICKETSYSTEM;
    private javax.swing.JLabel jl_persEnCola;
    private javax.swing.JMenuBar jmb_MenuBar;
    private javax.swing.JPanel jp_PanelPrincipal;
    private javax.swing.ButtonGroup jrdbG_Group;
    private javax.swing.JRadioButton jrdb_Informacion;
    private javax.swing.JRadioButton jrdb_Retiros;
    private javax.swing.JRadioButton jrdb_Transferencias;
    private javax.swing.JTextField jtf_Identificacion;
    // End of variables declaration//GEN-END:variables
}
