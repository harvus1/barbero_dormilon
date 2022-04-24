/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package barberodormilon;

import java.util.HashSet;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author axelg
 */
public class barberia extends javax.swing.JFrame {

    /**
     * Creates new form barberia
     */
    int espera = 0;
    int nextCliente = 0;
    Cliente list_espera;

    public barberia() {
        initComponents();
        persona1.setVisible(false);
        persona2.setVisible(false);
        persona3.setVisible(false);
        persona4.setVisible(false);

        cortando1.setVisible(false);
        cortando2.setVisible(false);
        cortando3.setVisible(false);
        Cliente_esperando = 0;
        b1.numbarb = 0;
        b2.numbarb = 1;
        b3.numbarb = 2;
        b1.info = lbl_info1;
        b2.info = lbl_info2;
        b3.info = lbl_info3;
        b1.start();
        b2.start();
        b3.start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        barbero1 = new javax.swing.JLabel();
        barbero2 = new javax.swing.JLabel();
        barbero3 = new javax.swing.JLabel();
        lbl_zz1 = new javax.swing.JLabel();
        lbl_zz2 = new javax.swing.JLabel();
        lbl_zz3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        persona1 = new javax.swing.JLabel();
        persona2 = new javax.swing.JLabel();
        persona3 = new javax.swing.JLabel();
        persona4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cortando1 = new javax.swing.JLabel();
        cortando2 = new javax.swing.JLabel();
        cortando3 = new javax.swing.JLabel();
        lbl_info1 = new javax.swing.JLabel();
        lbl_info2 = new javax.swing.JLabel();
        lbl_info3 = new javax.swing.JLabel();
        lbl_info = new javax.swing.JLabel();
        lbl_fila = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jList1);

        jLabel18.setText("Personas esperando ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setText("BARBEROS DORMILONES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/poste-de-barbero (3).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 60, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/poste-de-barbero (3).png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/silla.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/silla.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/silla.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barbero1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barbero.png"))); // NOI18N
        jPanel1.add(barbero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        barbero2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barbero.png"))); // NOI18N
        jPanel1.add(barbero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        barbero3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barbero.png"))); // NOI18N
        jPanel1.add(barbero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        lbl_zz1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lbl_zz1.setText("B1>ZZZZZ");
        jPanel1.add(lbl_zz1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        lbl_zz2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lbl_zz2.setText("B2>ZZZZZ");
        jPanel1.add(lbl_zz2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        lbl_zz3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lbl_zz3.setText("B3>ZZZZZ");
        jPanel1.add(lbl_zz3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 180, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel14.setText("Barberos Durmiendo");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel19.setText("PERSONAS EN SOFA");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        persona1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar-de-hombre.png"))); // NOI18N
        jPanel2.add(persona1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 23, -1, -1));

        persona2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar-de-hombre.png"))); // NOI18N
        jPanel2.add(persona2, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 23, -1, -1));

        persona3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar-de-hombre.png"))); // NOI18N
        jPanel2.add(persona3, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 23, -1, -1));

        persona4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar-de-hombre.png"))); // NOI18N
        jPanel2.add(persona4, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 23, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 460, 120));

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setText("Agregar persona");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, 126, 39));

        cortando1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cortando.png"))); // NOI18N
        getContentPane().add(cortando1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, -1, -1));

        cortando2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cortando.png"))); // NOI18N
        getContentPane().add(cortando2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, -1, -1));

        cortando3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cortando.png"))); // NOI18N
        getContentPane().add(cortando3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 440, -1, -1));

        lbl_info1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lbl_info1.setText("Esperando...");
        getContentPane().add(lbl_info1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, -1, -1));

        lbl_info2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lbl_info2.setText("Esperando...");
        getContentPane().add(lbl_info2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, -1, -1));

        lbl_info3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lbl_info3.setText("Esperando...");
        getContentPane().add(lbl_info3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 520, -1, -1));

        lbl_info.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lbl_info.setText(".....");
        getContentPane().add(lbl_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 580, -1, -1));

        lbl_fila.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lbl_fila.setText("__");
        getContentPane().add(lbl_fila, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int cant_clientes;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nuevos = new Ingresar();
        nuevos.nextCliente = nextCliente++;
        nuevos.start();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(barberia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(barberia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(barberia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(barberia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new barberia().setVisible(true);
            }
        });
    }

    private static Semaphore mutex = new Semaphore(4, true); // Controla el acceso a la región crítica
    private int Cliente_esperando; // Cuenta las ranuras Cliente_esperando del búfer
    Barbero b1 = new Barbero();
    Barbero b2 = new Barbero();
    Barbero b3 = new Barbero();
    Ingresar nuevos;
    private static Cliente Sillas[] = new Cliente[3]; // Número de ranuras en el búfer

    public void quitar_elemento(int pos) {

        if (list_espera != null) {
            Sillas[pos] = list_espera;
            list_espera = list_espera.get_Next();
        } else {
            Sillas[pos] = null;
        }
    }

    /**
     * Clases a utilizar
     */
    public class Ingresar extends Thread {

        public int nextCliente;

        @Override
        public void run() {

            Cliente nuevo = new Cliente("C" + this.nextCliente);
            if (Cliente_esperando < 3) {
                try {
                    mutex.acquire(); // Entra a la región crítica
                } catch (InterruptedException ex) {
                    Logger.getLogger(barberia.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.insertar_elemento(nuevo); // Coloca el nuevo elemento en el búfer
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(barberia.class.getName()).log(Level.SEVERE, null, ex);
                }
                mutex.release(); // Sale de la región crítica
                Cliente_esperando++;
                System.out.println(nuevo.get_Nombre() + " insertado " + nuevo.get_Tiempo());
            } else {
                espera(nuevo);
                Cliente_esperando++;
                System.out.println(nuevo.get_Nombre() + " insertado " + nuevo.get_Tiempo());
            }
            if (Cliente_esperando == 4) {
                persona1.setVisible(true);

            } else if (Cliente_esperando == 5) {
                persona2.setVisible(true);

            } else if (Cliente_esperando == 6) {
                persona3.setVisible(true);

            } else if (Cliente_esperando == 7) {
                persona4.setVisible(true);
            }
            if (Cliente_esperando > 7) {
                lbl_fila.setText("Personas en fila " + (Cliente_esperando - 7));
            }

        }

        public void insertar_elemento(Cliente elemento) {
            if (Sillas[0] == null) {
                Sillas[0] = elemento;
            } else if (Sillas[1] == null) {
                Sillas[1] = elemento;
            } else if (Sillas[2] == null) {
                Sillas[2] = elemento;
            }
        }

        public void espera(Cliente nuevo) {
            if (list_espera == null) {
                list_espera = nuevo;
            } else {
                Cliente aux = list_espera;
                while (aux.get_Next() != null) {
                    aux = aux.get_Next();
                }
                aux.set_Next(nuevo);
            }
        }

    }

    public class Barbero extends Thread {

        public int numbarb;
        public JLabel info;

        @Override
        public void run() {

            while (true) {
                while (Cliente_esperando <= 0) {
                    lbl_info.setText("Sin clientes");
                }
                lbl_info.setText("Atendiendo");
                if (Sillas[numbarb] != null) {
                    this.info.setText("Despertando");
                    this.despertar(numbarb);
                    Cliente elemento = Sillas[numbarb];
                    try {
                        mutex.acquire(); // Entra a la región crítica
                    } catch (InterruptedException ex) {
                        Logger.getLogger(barberia.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(barberia.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    this.cortarCabello(elemento);
                    quitar_elemento(numbarb);
                    dormir(numbarb);
                    mutex.release(); // Sale de la región crítica
                    Cliente_esperando--;
                    this.info.setText("Esperando...");
                    esperando();
                    if (Cliente_esperando >= 7) {
                        lbl_fila.setText("Personas en fila " + (Cliente_esperando - 7));
                    }

                }

            }
        }

        private void cortarCabello(Cliente elemento) {
            for (int timer = elemento.get_Tiempo(); timer > 0; timer--) {
                this.info.setText("Cortando cabello a " + elemento.get_Nombre() + " " + timer + "s");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(barberia.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            this.info.setText("Termino corte a " + elemento.get_Nombre());
        }

        public void despertar(int i) {
            switch (i) {
                case 0:
                    barbero1.setVisible(false);
                    lbl_zz1.setVisible(false);
                    cortando1.setVisible(true);
                    break;
                case 1:
                    barbero2.setVisible(false);
                    lbl_zz2.setVisible(false);
                    cortando2.setVisible(true);
                    break;
                case 2:
                    barbero3.setVisible(false);
                    lbl_zz3.setVisible(false);
                    cortando3.setVisible(true);
                    break;
            }
        }

        public void dormir(int i) {
            switch (i) {
                case 0:
                    barbero1.setVisible(true);
                    lbl_zz1.setVisible(true);
                    cortando1.setVisible(false);
                    break;
                case 1:
                    barbero2.setVisible(true);
                    lbl_zz2.setVisible(true);
                    cortando2.setVisible(false);
                    break;
                case 2:
                    barbero3.setVisible(true);
                    lbl_zz3.setVisible(true);
                    cortando3.setVisible(false);
                    break;
            }
        }

        public void esperando() {
            switch (Cliente_esperando) {
                case 3:
                    persona1.setVisible(false);
                    break;
                case 4:
                    persona2.setVisible(false);
                    break;
                case 5:
                    persona3.setVisible(false);
                    break;

                case 6:
                    persona4.setVisible(false);
                    break;
            }
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barbero1;
    private javax.swing.JLabel barbero2;
    private javax.swing.JLabel barbero3;
    private javax.swing.JLabel cortando1;
    private javax.swing.JLabel cortando2;
    private javax.swing.JLabel cortando3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_fila;
    private javax.swing.JLabel lbl_info;
    private javax.swing.JLabel lbl_info1;
    private javax.swing.JLabel lbl_info2;
    private javax.swing.JLabel lbl_info3;
    private javax.swing.JLabel lbl_zz1;
    private javax.swing.JLabel lbl_zz2;
    private javax.swing.JLabel lbl_zz3;
    private javax.swing.JLabel persona1;
    private javax.swing.JLabel persona2;
    private javax.swing.JLabel persona3;
    private javax.swing.JLabel persona4;
    // End of variables declaration//GEN-END:variables
}
