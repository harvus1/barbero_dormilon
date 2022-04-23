/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package barberodormilon;

import java.util.HashSet;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author axelg
 */
public class barberia extends javax.swing.JFrame {

    /**
     * Creates new form barberia
     */
 
    int nextCliente=0;
    Cliente list_espera;
    
    //CAMBIOS PRUEBA MIOS 
    public boolean[] arrayBarberos = new boolean[3];    // Array para verificar los barberos disponibles
    public boolean[] arrayEspera = new boolean[4];      // Array para verificar las sillas disponibles
    
    int espera=0;                                       //Contador de clientes en espera afuera 
      
    Hilo1 hilo1;
    Hilo2 hilo2;
    
    Hilo3 hilo3;
    
    Hilo4 hilo4;
    
    Hilo5 hilo5;
    
    
    
    DefaultListModel<String> modelo=new DefaultListModel<>();
    
    
    public barberia() {
        initComponents();
        persona1.setVisible(false);
         
        persona2.setVisible(false);
        persona3.setVisible(false);
        persona4.setVisible(false);
        
        cortando1.setVisible(false);
        cortando2.setVisible(false);
        cortando3.setVisible(false);
        jList1.setModel(modelo);
        
        Barberia.start();
        
        //----------------------------------------------
        arrayBarberos[0]=false;
        arrayBarberos[1]=false;
        arrayBarberos[2]=false;
        
        arrayEspera[0]=false;
        arrayEspera[1]=false;
        arrayEspera[2]=false;
        arrayEspera[3]=false;
        
        
        
        
        //CAMBIOS DE PUEBA AXEL
        hilo1 = new Hilo1();
        hilo1.start();
        
        hilo2 = new Hilo2();
        hilo2.start();
        
        hilo3 = new Hilo3();
        hilo3.start();
        
        hilo4 = new Hilo4();
        hilo4.start();
        
        hilo5 = new Hilo5();
        hilo5.start();
    }
    
    // Creamos el hilo1
    public class Hilo1 extends Thread {
       
       
        @Override
        public void run(){
            System.out.println("BARBERIA INICIADA");
        }
        private void nuevoProceso() {
           System.out.print("Hola"); 
        }
        
        private void nuevoCliente() {
            if(arrayEspera[0]==true && arrayEspera[1]==true && arrayEspera[2]==true && arrayEspera[3]==true){
                    modelo.addElement("Cliente");
                    espera=espera+1;
                    esperando.setText(espera+ "");                     
                }
            
            for(int i = 0; i <= 3; i = i + 1)
            {
                if(arrayEspera[i]==false){
                    arrayEspera[i] = true;
                    System.out.println("Cliente toma asiento en" + i);
                    if(i==0){
                        persona1.setVisible(true);
                    }
                    if(i==1){
                        persona2.setVisible(true);
                    }
                    if(i==2){
                        persona3.setVisible(true);
                    }
                    if(i==3){
                        persona4.setVisible(true);
                    }
                    
                    break;
                
                }
                
                
            
            }
        }
        
    }
    
    
    // Creamos el hilo2 EN ESTE VERIFICAMOS SI HAY BARBEROS DISPONBLES PARA PASAR A LOS CLIENTES 
    public class Hilo2 extends Thread {
       
       
        @Override
        public void run(){
            int a=1;
            int b =0;
            
            while(a==1){
                
             
                for(int i = 0; i <= 3; i = i + 1)
                {
                    if(arrayEspera[i]==true){   
                         for(int x = 0; x <= 2; x = x + 1)
                         {
                             if(arrayBarberos[x]==false){
                                 
                                 arrayBarberos[x]=true;
                                 
                                 
                                 arrayEspera[i]=false;
                                 System.out.println("Cliente "+i+ " Pase con el barbero " + x);
                                        if(i==0){
                                        persona1.setVisible(false);
                                        
                                        if(x==0){
                                            cortando1.setVisible(true);
                                            barbero1.setVisible(false);
                                            z1.setVisible(false);
                                        }
                                        if(x==1){
                                            cortando2.setVisible(true);
                                            barbero2.setVisible(false);
                                            z2.setVisible(false);
                                        }
                                        if(x==2){
                                            cortando3.setVisible(true);
                                            barbero3.setVisible(false);
                                            z3.setVisible(false);
                                        }
                                        x=0;
                                        i=0;
                                    }
                                    if(i==1){
                                        persona2.setVisible(false);
                                        if(x==0){
                                            cortando1.setVisible(true);
                                            barbero1.setVisible(false);
                                            z1.setVisible(false);
                                        }
                                        if(x==1){
                                            cortando2.setVisible(true);
                                            barbero2.setVisible(false);
                                            z2.setVisible(false);
                                        }
                                        if(x==2){
                                            cortando3.setVisible(true);
                                            barbero3.setVisible(false);
                                            z3.setVisible(false);
                                        }
                                        x=0;
                                        i=0;
                                    }
                                    if(i==2){
                                        persona3.setVisible(false);
                                        if(x==0){
                                            cortando1.setVisible(true);
                                            barbero1.setVisible(false);
                                            z1.setVisible(false);
                                        }
                                        if(x==1){
                                            cortando2.setVisible(true);
                                            barbero2.setVisible(false);
                                            z2.setVisible(false);
                                        }
                                        if(x==2){
                                            cortando3.setVisible(true);
                                            barbero3.setVisible(false);
                                            z3.setVisible(false);
                                        }
                                        x=0;
                                        i=0;
                                    }
                                    if(i==3){
                                        persona4.setVisible(false);
                                        if(x==0){
                                            cortando1.setVisible(true);
                                            barbero1.setVisible(false);
                                            z1.setVisible(false);
                                        }
                                        if(x==1){
                                            cortando2.setVisible(true);
                                            barbero2.setVisible(false);
                                            z2.setVisible(false);
                                        }
                                        if(x==2){
                                            cortando3.setVisible(true);
                                            barbero3.setVisible(false);
                                            z3.setVisible(false);
                                        }
                                        x=0;
                                        i=0;
                                    }
                                 break;
                             }
                         }
                    }
                }              
            
            
            }
   }
        //Clase sillon-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
           
          
    }
    
    
    
    // HILO DEL PRIMER BARBERO
    public class Hilo3 extends Thread {
       
        @Override
        public void run(){
            while(1==1){
                     
                     System.out.println("barbero 1 trabajando: " + arrayBarberos[0] ); 
                     if(arrayBarberos[0]==true){
                                try {
                                    Thread.sleep(7000);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(barberia.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                System.out.println("Corte terminado");
                                cortando1.setVisible(false);
                                arrayBarberos[0]=false;
                                
                                barbero1.setVisible(true);
                                z1.setVisible(true);      
                     }    
            }     
        }          
    }
    
    
     // HILO DEL SEGUNDO BARBERO
    public class Hilo4 extends Thread {
       
        @Override
        public void run(){
            while(1==1){
                     
                     System.out.println("barbero 2 trabajando: " + arrayBarberos[1] ); 
                     if(arrayBarberos[1]==true){
                                try {
                                    Thread.sleep(7000);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(barberia.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                System.out.println("Corte terminado");
                                cortando2.setVisible(false);
                                arrayBarberos[1]=false;
                                
                                barbero2.setVisible(true);
                                z2.setVisible(true);      
                     }    
            }     
        }          
    }
     // HILO DEL TERCER BARBERO
    public class Hilo5 extends Thread {
       
        @Override
        public void run(){
            while(1==1){
                     
                     System.out.println("barbero 3 trabajando: " + arrayBarberos[2] ); 
                     if(arrayBarberos[2]==true){
                                try {
                                    Thread.sleep(7000);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(barberia.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                System.out.println("Corte terminado");
                                cortando3.setVisible(false);
                                arrayBarberos[2]=false;
                                
                                barbero3.setVisible(true);
                                z3.setVisible(true);      
                     }    
            }     
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        barbero1 = new javax.swing.JLabel();
        barbero2 = new javax.swing.JLabel();
        barbero3 = new javax.swing.JLabel();
        z1 = new javax.swing.JLabel();
        z3 = new javax.swing.JLabel();
        z2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel18 = new javax.swing.JLabel();
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
        jLabel8 = new javax.swing.JLabel();
        esperando = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setText("BARBEROS DORMILONES");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/poste-de-barbero (3).png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/poste-de-barbero (3).png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/silla.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/silla.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/silla.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        barbero1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barbero.png"))); // NOI18N

        barbero2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barbero.png"))); // NOI18N

        barbero3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barbero.png"))); // NOI18N

        z1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        z1.setText("zzzZZZZZ");

        z3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        z3.setText("zzzZZZZZ");

        z2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        z2.setText("zzzZZZZZ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(barbero3)
                    .addComponent(barbero2)
                    .addComponent(barbero1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(z1)
                    .addComponent(z3)
                    .addComponent(z2))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(barbero1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(z1)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barbero2)
                    .addComponent(z2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barbero3)
                    .addComponent(z3))
                .addGap(17, 17, 17))
        );

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel14.setText("Barberos Durmiendo");

        jScrollPane1.setViewportView(jList1);

        jLabel18.setText("Personas esperando ");

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel19.setText("PERSONAS EN SOFA");

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        persona1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar-de-hombre.png"))); // NOI18N

        persona2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar-de-hombre.png"))); // NOI18N

        persona3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar-de-hombre.png"))); // NOI18N

        persona4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar-de-hombre.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(persona1)
                .addGap(65, 65, 65)
                .addComponent(persona2)
                .addGap(42, 42, 42)
                .addComponent(persona3)
                .addGap(35, 35, 35)
                .addComponent(persona4)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(persona4)
                    .addComponent(persona2)
                    .addComponent(persona1)
                    .addComponent(persona3))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setText("Agregar persona");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cortando1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cortando.png"))); // NOI18N

        cortando2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cortando.png"))); // NOI18N

        cortando3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cortando.png"))); // NOI18N

        jLabel8.setText("------------------------");

        esperando.setText("-");

        a1.setText("-");

        jLabel9.setText("jLabel9");

        jLabel10.setText("jLabel10");

        jLabel11.setText("jLabel11");

        jLabel12.setText("jLabel12");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel14)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(707, 707, 707))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addComponent(a1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(49, 49, 49)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(cortando1))
                                    .addGap(70, 70, 70)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(cortando2))
                                    .addGap(80, 80, 80)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cortando3)
                                        .addComponent(jLabel7)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel19)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel9)
                                .addGap(87, 87, 87)
                                .addComponent(jLabel10)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel11)
                                .addGap(86, 86, 86)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel18))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(5, 5, 5)
                                .addComponent(esperando)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(a1)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cortando1)
                                            .addComponent(cortando2)
                                            .addComponent(cortando3)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(esperando))
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(579, 579, 579))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int sillas_barberos=0;
    public int clientes=0;
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        hilo1.nuevoCliente();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void espera(Cliente nuevo)
    {
        if(list_espera==null)
        {
            list_espera = nuevo;
        }
        else
        {
            Cliente aux= list_espera;
            while(aux.get_Next()!=null)
            {
                aux= aux.get_Next();
            }
            aux.set_Next(nuevo);
        }
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

    private static Semaphore mutex = new Semaphore(1, true); // Controla el acceso a la región crítica
    private static int Cliente_esperando = 0; // Cuenta las ranuras Cliente_esperando del búfer
    private barbershop Barberia = new barbershop();
    
    public void insertar_elemento(Cliente elemento){
        if (Sillas[0]==null) {
            Sillas[0] = elemento;
            
        }
        else if (Sillas[1]==null) {
            Sillas[1] = elemento;
            
        }
        else if (Sillas[2]==null) {
            Sillas[2] = elemento;
            
        }
    }

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
    private static Cliente Sillas[] = new Cliente[3]; // Número de ranuras en el búfer

    public class barbershop extends Thread {

        @Override
        public void run() {
            while (true) { // Ciclo de barberia
                // Inicio semáforo Barbero
                while (Cliente_esperando <= 0) {
                    //    System.out.println("Sin Clientes ...");
                }
                                                 try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(barberia.class.getName()).log(Level.SEVERE, null, ex);
                    }
                int ocupados = 0;
                 if (Sillas[0] != null) {
                    Barbero b1 = new Barbero();
                    b1.numbarb = 1;
                    b1.Set_Cliente(Sillas[0]);
                    b1.start();
                    ocupados++;
                }
                if (Sillas[1] != null) {
                    Barbero b2 = new Barbero();
                    b2.numbarb = 2;
                    b2.Set_Cliente(Sillas[1]);
                    b2.start();
                    ocupados++;
                }
                if (Sillas[2] != null) {
                    Barbero b3 = new Barbero();
                    b3.numbarb = 3;
                    b3.Set_Cliente(Sillas[2]);
                    b3.start();
                    ocupados++;
                }
                Cliente_esperando = (Cliente_esperando-ocupados);
                // Fin semáforo Cliente_esperando

            }
        }
    }

    public class Barbero extends Thread {

        private Cliente atendiendo;
        public int numbarb;

        public void Set_Cliente(Cliente nuevo)
        {
            this.atendiendo = nuevo;
        }
        
        @Override
        public void run() {
                 System.out.println("Despertando a barbero " + numbarb);
                Cliente elemento = atendiendo;
                    try {
                        mutex.acquire(); // Entra a la región crítica
                        System.out.println("Despertando a barbero " + numbarb);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(barberia.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(barberia.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    this.cortarCabello(elemento);
                    quitar_elemento(numbarb-1);
                    mutex.release(); // Sale de la región crítica

        }

        private void cortarCabello(Cliente elemento) {
            System.out.println("Cortando cabello a " + elemento.get_Nombre());
            try {
                Thread.sleep(elemento.get_Tiempo() * 1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(barberia.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Termino corte a" + elemento.get_Nombre() );
        }
    }

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel barbero1;
    private javax.swing.JLabel barbero2;
    private javax.swing.JLabel barbero3;
    private javax.swing.JLabel cortando1;
    private javax.swing.JLabel cortando2;
    private javax.swing.JLabel cortando3;
    private javax.swing.JLabel esperando;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel persona1;
    private javax.swing.JLabel persona2;
    private javax.swing.JLabel persona3;
    private javax.swing.JLabel persona4;
    private javax.swing.JLabel z1;
    private javax.swing.JLabel z2;
    private javax.swing.JLabel z3;
    // End of variables declaration//GEN-END:variables
}
