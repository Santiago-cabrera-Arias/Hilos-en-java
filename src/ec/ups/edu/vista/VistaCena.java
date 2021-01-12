package ec.ups.edu.vista;

import ec.ups.edu.filosofos.Filosofos;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author santi
 */
public class VistaCena extends javax.swing.JFrame {

    Filosofos filosofos;

    int cont = 5;
    JButton[] filosofo;
    JButton[] tenedor;
    JTextField[] resultado;
    JLabel[] label;

    public VistaCena() {
        initComponents();
        
        filosofo = new JButton[cont];
        tenedor = new JButton[cont];
        resultado = new JTextField[cont];
        label = new JLabel[cont];

        
        crearFilosofo();

    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIniciar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        pane = new javax.swing.JPanel();
        pane1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIniciar.setForeground(new java.awt.Color(204, 204, 204));
        btnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/images/poder.png"))); // NOI18N
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setText("FILOSOFOS COMENSALES");

        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/images/boton-de-pausa.png"))); // NOI18N
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        jLabel8.setText("Numero de veces que comieron");

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/images/salida.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/images/anadir (2).png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jScrollPane2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pane.setLayout(new java.awt.GridLayout(0, 10));
        jScrollPane2.setViewportView(pane);

        pane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pane1.setLayout(new java.awt.GridLayout(0, 2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnIniciar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFinalizar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAgregar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(11, 11, 11)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir)
                    .addComponent(btnAgregar)
                    .addComponent(btnIniciar)
                    .addComponent(btnFinalizar))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Recursos.
     *
     * Se ha utilizado cinco botones que son para los filosofos Se ha utilizado
     * cinco label que son para los tenedores Y cinco campos de texto en donde
     * se guardara la informacion de cuantas veces a comido cada filosofo Ademas
     * se ha añadido un txtArea en el cual se ira mostrando lo que va haciendo
     * cada filosofo ya sea pensando comiendo o si soloto los palillos.
     *
     * @param evt
     */
    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed

        
        Filosofos comensales;

        int i;
        int izquierda;
        int derecha;

        //Hemos creado un for que recorra las posiciones de los tenedores
        //diciendo que mi i sea el derecho y mi i-1 mi tenedor izquierdo.
        //y se a aniadido un condicional en el que decimos que si el tendor
        //izquierdo es menor a cero este tomaria la posicion 4, hacemos esto debido a
        //que el filosofo uno debe coger el tenedor de la posicion numero 5.
        for (i = 0; i < cont; i++) {

            izquierda = i - 1;

            if (izquierda < 0) {

                //posicion 4
                izquierda = 4;

            }

            //Aqui le estamos asignando que el tenedor derecho va a ser igual a i.
            derecha = i;

            //lo de comensales es por que estamos instanciando la clase Filosofos y pasandole los datos que tenemos
            //en el constructor.
            //Le pasamos la posicion derecha, el tenedor de la izquierda el de la derecha
            //los filofos y los resultados, y un txtArea donde se mostrara la informacion.
            comensales = new Filosofos(i,tenedor[izquierda], tenedor[derecha] ,filosofo[i], resultado[i], txtArea);

        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    public void eliminar(){
        
        for (int i = 0; i < cont; i++) {
            
            pane.remove(filosofo[i]);
            pane.remove(tenedor[i]);
            pane1.remove(resultado[i]);
            pane1.remove(label[i]);
            
            
        }
        
    }
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        eliminar();
        
        cont++;
        filosofo = new JButton[cont];
        tenedor = new JButton[cont];
        resultado = new JTextField[cont];
        label = new JLabel[cont];
        crearFilosofo();

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed

        filosofos.pausar = true;

        try {

            sleep(5000);

        } catch (InterruptedException ex) {

            System.out.println("Error ");
            ex.printStackTrace();

        }

    }//GEN-LAST:event_btnFinalizarActionPerformed

    public void crearFilosofo() {

        for (int i = 0; i < cont; i++) {

            JButton boton = new JButton("Filosofo " + (i + 1));
            pane.add(boton);
            filosofo[i] = boton;
            JButton tenedor1 = new JButton("Libre");
            pane.add(tenedor1);
            tenedor[i] = tenedor1;
        }

        pane.updateUI();

        for (int i = 0; i < cont; i++) {

            label[i] = new JLabel();
            label[i].setFont(new Font("Andale Mono", Font.PLAIN, 12));
            label[i].setText("Filosofo " + (i + 1));

            resultado[i] = new JTextField("0");

            pane1.add(label[i]);
            pane1.add(resultado[i]);

        }

        pane1.updateUI();

    }

    /**
     * @paramFilosofo1 args the command line arguments
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
            java.util.logging.Logger.getLogger(VistaCena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCena().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pane;
    private javax.swing.JPanel pane1;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
