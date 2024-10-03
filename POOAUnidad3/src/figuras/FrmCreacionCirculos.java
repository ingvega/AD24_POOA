/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package figuras;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author paveg
 */
public class FrmCreacionCirculos extends javax.swing.JFrame {

    private int posicion;
    private PnlContenedor pnl;
    private Figura[] figuras = new Figura[20];

    /**
     * Creates new form FrmCreacionCirculos
     */
    public FrmCreacionCirculos() {
        initComponents();
        pnl = new PnlContenedor(figuras);
        figuras[0] = new Circulo(200);
        figuras[1] = new Circulo(100);
        figuras[2] = new Rectangulo(200, 50);
        figuras[3] = new Triangulo(300, 500);
        figuras[0].setColor(Color.yellow);
        figuras[1].setColor(Color.GREEN);
        figuras[2].setColor(Color.yellow);
        figuras[3].setColor(Color.GREEN);
        posicion = 4;
        pnl.setBounds(0, 0, 500, this.getHeight());
        this.add(pnl);
        cargarCombo();
    }

    public FrmCreacionCirculos(String titulo) {
        setTitle(titulo);
        setDefaultCloseOperation(3);
    }

    private void cargarCombo() {
        cboCirculo.removeAllItems();
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] == null) {
                break;
            }
            cboCirculo.addItem(figuras[i].toString());
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

        jLabel1 = new javax.swing.JLabel();
        txtRadio = new javax.swing.JTextField();
        chkIndicarUbicacion = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spnX = new javax.swing.JSpinner();
        spnY = new javax.swing.JSpinner();
        btnCrear = new javax.swing.JButton();
        cchColor = new javax.swing.JColorChooser();
        sldRadio = new javax.swing.JSlider();
        cboCirculo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Radio");

        txtRadio.setText("1");

        chkIndicarUbicacion.setText("Indicar ubicación");

        jLabel2.setText("X");

        jLabel3.setText("Y");

        btnCrear.setBackground(new java.awt.Color(0, 153, 0));
        btnCrear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        sldRadio.setMaximum(300);
        sldRadio.setMinimum(-300);
        sldRadio.setPaintLabels(true);
        sldRadio.setPaintTicks(true);
        sldRadio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldRadioStateChanged(evt);
            }
        });

        cboCirculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCirculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(889, 889, 889)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkIndicarUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cchColor, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboCirculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(spnX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spnY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(sldRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(sldRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkIndicarUbicacion)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(spnX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cchColor, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnCrear)
                .addGap(19, 19, 19)
                .addComponent(cboCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        int radio = Integer.parseInt(txtRadio.getText());
        Circulo c;/*=new Circulo(radio);
        System.out.println(c);
        System.out.println(c.toString());*/
        if (chkIndicarUbicacion.isSelected()) {
            int x = Integer.parseInt(spnX.getValue().toString());
            int y = Integer.parseInt(spnY.getValue().toString());
            Punto ubicacion = new Punto(x, y);
            c = new Circulo(radio, ubicacion);
        } else {
            c = new Circulo(radio);
        }
        c.setColor(cchColor.getColor());
        figuras[posicion++] = c;
        this.repaint();
        cargarCombo();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void sldRadioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldRadioStateChanged
        //figuras[0].aumentarRadio(sldRadio.getValue());
        repaint();
    }//GEN-LAST:event_sldRadioStateChanged

    private void cboCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCirculoActionPerformed
        int indice = cboCirculo.getSelectedIndex();
        if (indice == -1) {
            return;
        }
        JOptionPane.showMessageDialog(this, figuras[indice].toString());
    }//GEN-LAST:event_cboCirculoActionPerformed

//    public void paint(Graphics g){
//        Graphics2D renderizado=(Graphics2D)g;
//        renderizado.drawOval(0,0,100,100);
//        pack();
//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        new FrmCreacionCirculos().setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JComboBox<String> cboCirculo;
    private javax.swing.JColorChooser cchColor;
    private javax.swing.JCheckBox chkIndicarUbicacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSlider sldRadio;
    private javax.swing.JSpinner spnX;
    private javax.swing.JSpinner spnY;
    private javax.swing.JTextField txtRadio;
    // End of variables declaration//GEN-END:variables
}