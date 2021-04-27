package com.mycompany.proyecto_calculo;

import javax.swing.JOptionPane;

/**
 *
 * @author MRobot404
 */
public class NuevaPartida extends javax.swing.JFrame {

    public NuevaPartida() {
        initComponents();
        setLocationRelativeTo(null);
        Avanzar.setEnabled(true);
    }
    
    
    

    public void Validar() {
        if (NombreField.getText().isEmpty()) {
            Avanzar.setEnabled(false);
        } else {
            Avanzar.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        NombreField = new javax.swing.JTextField();
        Avanzar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("Nombre:");

        NombreField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NombreFieldKeyReleased(evt);
            }
        });

        Avanzar.setText("Ingresar");
        Avanzar.setToolTipText("");
        Avanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvanzarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(NombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(271, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Avanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addComponent(Avanzar)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvanzarActionPerformed
        String nombre=NombreField.getText();
        boolean ingresado = false;
        for (Jugadores j : NewMain.players) {
            if (j.getNombre().equals(nombre)) {
                ingresado = true;
                break;
            }
        }
        if (ingresado==true) {
                    JOptionPane.showMessageDialog(rootPane, "Elija otro nombre de usuario");
                } else {
                       Jugadores objeto=new Jugadores();
                       objeto.setID(NewMain.players.size());
                       objeto.setNivel(0);
                       objeto.setNombre(nombre);
                       objeto.setVidas(10);
                       NewMain.players.add(objeto);
                        JOptionPane.showMessageDialog(this, "Datos cargados exitosamente, bienvenido");
                        NombreField.setText("");
                        Nivel1 ver=new Nivel1();
                        ver.setVisible(true);
                        this.dispose();
                }
        
    }//GEN-LAST:event_AvanzarActionPerformed

    private void NombreFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreFieldKeyReleased
     Validar();
    }//GEN-LAST:event_NombreFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Avanzar;
    private javax.swing.JTextField NombreField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
