package UnivercidadGrupo20.vistas;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jFrame1 = new javax.swing.JFrame();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        jBVolver = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        inscripciones = new javax.swing.JMenuItem();
        JMMateria = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        Administracion = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        notas = new javax.swing.JMenuItem();
        ModificarInscripciones = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem3.setText("jMenuItem3");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        escritorio.setBackground(new java.awt.Color(51, 51, 255));

        jBVolver.setText("SALIR");
        jBVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverActionPerformed(evt);
            }
        });

        escritorio.setLayer(jBVolver, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(774, Short.MAX_VALUE)
                .addComponent(jBVolver)
                .addGap(22, 22, 22))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jBVolver)
                .addContainerGap(601, Short.MAX_VALUE))
        );

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 650));

        jMenu2.setText("Alumnos");

        inscripciones.setText("Formulario de Alumno");
        inscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscripcionesActionPerformed(evt);
            }
        });
        jMenu2.add(inscripciones);

        jMenuBar1.add(jMenu2);

        JMMateria.setText("Materia");

        jMenuItem5.setText("Formulario de Materia");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        JMMateria.add(jMenuItem5);

        jMenuBar1.add(JMMateria);

        Administracion.setText("Administracion");
        Administracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministracionActionPerformed(evt);
            }
        });

        jMenu1.setText("Modificar");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        notas.setText("Manipulacion de Notas");
        jMenu1.add(notas);

        ModificarInscripciones.setText("Inscripciones");
        ModificarInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarInscripcionesActionPerformed(evt);
            }
        });
        jMenu1.add(ModificarInscripciones);

        Administracion.add(jMenu1);

        jMenuBar1.add(Administracion);

        jMenu4.setText("Consultas");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem6.setText("Alumno por Materia");
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministracionActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaAlumnos vi = new VistaAlumnos();
        vi.setLocation(200, 100);
        vi.setVisible(true);
        escritorio.add(vi);
        escritorio.moveToFront(vi);


    }//GEN-LAST:event_AdministracionActionPerformed

    private void inscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscripcionesActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaAlumnos vi = new VistaAlumnos();
        vi.setVisible(true);  
        escritorio.add(vi);
        escritorio.moveToFront(vi);

    }//GEN-LAST:event_inscripcionesActionPerformed

    private void ModificarInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarInscripcionesActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioDeInscripcion vi = new FormularioDeInscripcion();
        vi.setVisible(true);  
        escritorio.add(vi);
        escritorio.moveToFront(vi);

    }//GEN-LAST:event_ModificarInscripcionesActionPerformed

    private void jBVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverActionPerformed
        System.exit(0);

    }//GEN-LAST:event_jBVolverActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaMateria vi = new VistaMateria();
        vi.setVisible(true);  // Muestra pantalla Vista Inscripciones.
        escritorio.add(vi);
        escritorio.moveToFront(vi);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

        escritorio.removeAll();
        escritorio.repaint();
        VistaInscripciones vi = new VistaInscripciones();
        vi.setVisible(true);  // Muestra pantalla Vista Inscripciones.
        escritorio.add(vi);
        escritorio.moveToFront(vi);
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
       
    }//GEN-LAST:event_jMenu4ActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuPrincipal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Administracion;
    private javax.swing.JMenu JMMateria;
    private javax.swing.JMenuItem ModificarInscripciones;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem inscripciones;
    private javax.swing.JButton jBVolver;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem notas;
    // End of variables declaration//GEN-END:variables
}
