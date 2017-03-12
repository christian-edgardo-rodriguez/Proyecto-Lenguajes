/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolenguajes;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Familia Rodriguez
 */
public class Principal extends javax.swing.JFrame {
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        conectarBaseDatos();
        thread = new Hilo(this);
        thread.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_principal = new javax.swing.JDialog();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jd_crear = new javax.swing.JDialog();
        jTextField6 = new javax.swing.JTextField();
        tf_telefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_apellido = new javax.swing.JTextField();
        tf_mail = new javax.swing.JTextField();
        cb_genero = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_usuario = new javax.swing.JTextField();
        tf_contra = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jd_principal.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(0, 0, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Contactos");
        jd_principal.getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 150, -1));

        jTextField3.setBackground(new java.awt.Color(0, 0, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Llamar");
        jd_principal.getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 150, -1));

        jTextField4.setBackground(new java.awt.Color(0, 0, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Mensajear");
        jd_principal.getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 150, -1));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(0, 0, 225));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("Historial");
        jd_principal.getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 150, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectolenguajes/fondo2-iloveimg-resized.jpg"))); // NOI18N
        jd_principal.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jd_crear.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField6.setEditable(false);
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("Crear Contacto");
        jd_crear.getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 110, -1));
        jd_crear.getContentPane().add(tf_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 150, -1));

        jLabel6.setText("Telefono");
        jd_crear.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jLabel7.setText("Nombre");
        jd_crear.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jLabel8.setText("Apellido");
        jd_crear.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jLabel9.setText("E-Mail");
        jd_crear.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jLabel10.setText("Genero");
        jd_crear.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));
        jd_crear.getContentPane().add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 150, -1));
        jd_crear.getContentPane().add(tf_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 150, -1));
        jd_crear.getContentPane().add(tf_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 150, -1));

        cb_genero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "F", "M" }));
        jd_crear.getContentPane().add(cb_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 150, -1));

        jButton3.setText("Crear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jd_crear.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 80, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectolenguajes/fondo2-iloveimg-resized.jpg"))); // NOI18N
        jd_crear.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));

        jLabel2.setText("Usuario");

        jLabel3.setText("Contraseña");

        tf_contra.setEditable(false);

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(tf_contra))
                .addGap(54, 54, 54))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jButton1)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 360, 190));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 51));
        jTextField1.setText("      SIMULADOR DE VOZ");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 157, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectolenguajes/fondo-iloveimg-resized.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try{
            PreparedStatement statement = connect.prepareStatement("Insert into Bitacora values (?,?)");
            statement.setString(1, dtf.format(LocalDateTime.now()));
            statement.setString(2, "Se ha cerrado el simulador");
            int prueba = statement.executeUpdate();
            if (prueba > 0) {
                System.out.println("Bitacora actualizada.");
            }
            connect.close();
        }catch(SQLException ex){
            System.out.print(ex);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tf_usuario.getText().equalsIgnoreCase("mark") && tf_contra.getText().equalsIgnoreCase("seven")) {
            this.jd_principal.setModal(true);
            this.jd_principal.pack();
            this.jd_principal.setLocationRelativeTo(this);
            this.jd_principal.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrecta");
        }
        this.tf_usuario.setText("");
        this.tf_contra.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            PreparedStatement statement = connect.prepareStatement("Insert into Contacts values (?,?,?,?,?)");
            int telefono = Integer.parseInt(tf_telefono.getText());
            String nombre = tf_nombre.getText();
            String apellido = tf_apellido.getText();
            String email = tf_mail.getText();
            String genero = cb_genero.getSelectedItem().toString();
            statement.setInt(1, telefono);
            statement.setString(2, nombre);
            statement.setString(3, apellido);
            statement.setString(4, email);
            statement.setString(5, genero);
            this.tf_telefono.setText("");
            this.tf_nombre.setText("");
            this.tf_apellido.setText("");
            this.tf_mail.setText("");
            this.cb_genero.setSelectedIndex(0);
            int retorno = statement.executeUpdate();
            if (retorno > 0) {
                JOptionPane.showMessageDialog(this, "Contacto creado");
            }
            PreparedStatement statement2 = connect.prepareStatement("Insert into Bitacora values (?,?)");
            statement.setString(1, dtf.format(LocalDateTime.now()));
            statement.setString(2, "Se ha creado un contacto.");
            int prueba2 = statement2.executeUpdate();
            if (prueba2 > 0) {
                System.out.println("Bitacora actualizada.");
            }
            this.jd_crear.dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            PreparedStatement statement = connect.prepareStatement("Insert into Bitacora values (?,?)");
            statement.setString(1, dtf.format(LocalDateTime.now()));
            statement.setString(2, "Se ha abierto el simulador");
            int prueba = statement.executeUpdate();
            if (prueba > 0) {
                System.out.println("Bitacora actualizada.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_genero;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JDialog jd_crear;
    private javax.swing.JDialog jd_principal;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_contra;
    private javax.swing.JTextField tf_mail;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_telefono;
    private javax.swing.JTextField tf_usuario;
    // End of variables declaration//GEN-END:variables
    Connection connect;
    Hilo thread;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    
    public void conectarBaseDatos() {
        try {
            String connectionUrl = "jdbc:sqlserver://;database=TablasLenguajes;integratedSecurity=true;";
            connect = DriverManager.getConnection(connectionUrl);
            System.out.println("Se ha conectado exitosamente.");
        } catch (SQLException ex) {
            System.out.println("Ha ocurrido un error.");
            ex.printStackTrace();
        }
    }
    
    public void usuarioTextField() {
        if (this.isVisible() && !this.tf_usuario.isFocusOwner()) {
            this.tf_usuario.grabFocus();
        }
    }

    public void contraTextField() {
        if (this.isVisible() && !this.tf_contra.isFocusOwner()) {
            this.tf_contra.grabFocus();
        }
    }
    
    public void nombreTextField(String nombre) {
        if (this.getFocusOwner() instanceof JTextField) {
            ((JTextField)this.getFocusOwner()).setText(nombre);
        }
    }
    
    public void enseñarCrear(){
        this.jd_crear.setModal(true);
        this.jd_crear.pack();
        this.jd_crear.setLocationRelativeTo(this);
        this.jd_crear.setVisible(true);
    }
    
    public void Reconocedor(){
        try {
            Configuration configuration = new Configuration();
            configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
            configuration.setDictionaryPath("./2163.dic");
            configuration.setLanguageModelPath("./2163.lm");

            //Recognizer Object, Pass the Configuration object
            LiveSpeechRecognizer recognize = new LiveSpeechRecognizer(configuration);

            //Start Recognition Process (The bool parameter clears the previous cache if true)
            recognize.startRecognition(true);

            //Create SpeechResult Object
            SpeechResult result;

            //Checking if recognizer has recognized the speech
            while ((result = recognize.getResult()) != null) {
                //Get the recognize speech
                String command = result.getHypothesis();
                if (command.equalsIgnoreCase("user")) {
                    System.out.println("USUARIO");
                } else if (command.equalsIgnoreCase("pass")) {
                    System.out.println("PASSWORD");
                } else if (command.equalsIgnoreCase("new")) {
                    System.out.println("NUEVO");
                } else if (command.equalsIgnoreCase("call")) {
                    System.out.println("LLAMAR");
                } else if (command.equalsIgnoreCase("out")) {
                    System.out.println("SALIR");
                    System.exit(0);
                }
            }
        } catch (Exception e) {
            System.out.println("Exception en " + e.toString());
            System.exit(0);
        }
    }
}
