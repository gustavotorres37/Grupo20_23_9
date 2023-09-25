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
        jmAlumnos = new javax.swing.JMenu();
        jmFormularioDeAlumno = new javax.swing.JMenuItem();
        jmMateria = new javax.swing.JMenu();
        jmFormularioDeMateria = new javax.swing.JMenuItem();
        jmAdministracion = new javax.swing.JMenu();
        jmModificar = new javax.swing.JMenu();
        jmManipulacionDeNotas = new javax.swing.JMenuItem();
        jmInscripciones = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        jmAlumnoPorMateria = new javax.swing.JMenuItem();

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

        jmAlumnos.setText("Alumnos");

        jmFormularioDeAlumno.setText("Formulario de Alumno");
        jmFormularioDeAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioDeAlumnoActionPerformed(evt);
            }
        });
        jmAlumnos.add(jmFormularioDeAlumno);

        jMenuBar1.add(jmAlumnos);

        jmMateria.setText("Materia");

        jmFormularioDeMateria.setText("Formulario de Materia");
        jmFormularioDeMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioDeMateriaActionPerformed(evt);
            }
        });
        jmMateria.add(jmFormularioDeMateria);

        jMenuBar1.add(jmMateria);

        jmAdministracion.setText("Administracion");
        jmAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAdministracionActionPerformed(evt);
            }
        });

        jmModificar.setText("Modificar");
        jmModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmModificarActionPerformed(evt);
            }
        });

        jmManipulacionDeNotas.setText("Manipulacion de Notas");
        jmModificar.add(jmManipulacionDeNotas);

        jmInscripciones.setText("Inscripciones");
        jmInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmInscripcionesActionPerformed(evt);
            }
        });
        jmModificar.add(jmInscripciones);

        jmAdministracion.add(jmModificar);

        jMenuBar1.add(jmAdministracion);

        jmConsultas.setText("Consultas");
        jmConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultasActionPerformed(evt);
            }
        });

        jmAlumnoPorMateria.setText("Alumno por Materia");
        jmAlumnoPorMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlumnoPorMateriaActionPerformed(evt);
            }
        });
        jmConsultas.add(jmAlumnoPorMateria);

        jMenuBar1.add(jmConsultas);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmAdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAdministracionActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaAlumnos vi = new VistaAlumnos();
        vi.setLocation(200, 100);
        vi.setVisible(true);
        escritorio.add(vi);
        escritorio.moveToFront(vi);


    }//GEN-LAST:event_jmAdministracionActionPerformed

    private void jmFormularioDeAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioDeAlumnoActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaAlumnos vi = new VistaAlumnos();
        vi.setVisible(true);
        escritorio.add(vi);
        escritorio.moveToFront(vi);

    }//GEN-LAST:event_jmFormularioDeAlumnoActionPerformed

    private void jmInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmInscripcionesActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioDeInscripcion vi = new FormularioDeInscripcion();
        vi.setVisible(true);  
        escritorio.add(vi);
        escritorio.moveToFront(vi);

    }//GEN-LAST:event_jmInscripcionesActionPerformed

    private void jBVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverActionPerformed
        System.exit(0);

    }//GEN-LAST:event_jBVolverActionPerformed

    private void jmFormularioDeMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioDeMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaMateria vi = new VistaMateria();
        vi.setVisible(true);  // Muestra pantalla Vista Inscripciones.
        escritorio.add(vi);
        escritorio.moveToFront(vi);
    }//GEN-LAST:event_jmFormularioDeMateriaActionPerformed

    private void jmModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmModificarActionPerformed

        escritorio.removeAll();
        escritorio.repaint();
        VistaInscripciones vi = new VistaInscripciones();
        vi.setVisible(true);  // Muestra pantalla Vista Inscripciones.
        escritorio.add(vi);
        escritorio.moveToFront(vi);
    }//GEN-LAST:event_jmModificarActionPerformed

    private void jmConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultasActionPerformed
       
    }//GEN-LAST:event_jmConsultasActionPerformed

    private void jmAlumnoPorMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlumnoPorMateriaActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        ConsultaAlumnosPorMateria capm = new ConsultaAlumnosPorMateria();
        capm.setVisible(true);  
        escritorio.add(capm);
        escritorio.moveToFront(capm);
        
    }//GEN-LAST:event_jmAlumnoPorMateriaActionPerformed

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
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jBVolver;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu jmAdministracion;
    private javax.swing.JMenuItem jmAlumnoPorMateria;
    private javax.swing.JMenu jmAlumnos;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenuItem jmFormularioDeAlumno;
    private javax.swing.JMenuItem jmFormularioDeMateria;
    private javax.swing.JMenuItem jmInscripciones;
    private javax.swing.JMenuItem jmManipulacionDeNotas;
    private javax.swing.JMenu jmMateria;
    private javax.swing.JMenu jmModificar;
    // End of variables declaration//GEN-END:variables
}
