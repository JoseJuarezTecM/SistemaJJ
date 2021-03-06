/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Usuario.java
 *
 * Created on 19/06/2014, 11:30:13 PM
 */
package Ventanas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.*;
import javax.swing.JOptionPane;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

/**
 *
 * @author e
 */
public class Usuario extends javax.swing.JFrame {

    /** Creates new form Usuario */
    public Usuario() {
        initComponents();
        llenarCombo("Select IDCliente from Clientes");

        this.setLocationRelativeTo(null);

        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/img/Mundo.png"));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(jLabelLogo.getWidth(),
                jLabelLogo.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        jLabelLogo.setIcon(iconoEscalado);

    }

    private void llenarCombo(String query) {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
            Connection cn = DriverManager.getConnection("jdbc:odbc:Proyecto", "sa", "sasa");

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            CMBID.removeAllItems();
            if (rs.next()) {
                do {
                    String dato = rs.getString(1);
                    CMBID.addItem(dato);
                } while (rs.next());
            }

        } catch (Exception er) {
            System.out.println("Error " + er);

        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        jLabelLogo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CMBdia = new javax.swing.JComboBox();
        CMBmes = new javax.swing.JComboBox();
        CMBano = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNumDeSerie = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        CMBequipo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtpaneObservaciones = new javax.swing.JTextPane();
        CMBdiaSalida = new javax.swing.JComboBox();
        CMDmesSalida = new javax.swing.JComboBox();
        CMBanoSalida = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtMarca = new javax.swing.JTextField();
        CMBID = new javax.swing.JComboBox();
        txtStatus = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBuscar.setBackground(new java.awt.Color(0, 51, 102));
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/priamolupa.png"))); // NOI18N
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 30, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("jjuarez@visualmexico.com.mx");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre del Cliente:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        txtNombreCliente.setBackground(new java.awt.Color(0, 51, 102));
        txtNombreCliente.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 220, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Visual System");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtBuscar.setBackground(new java.awt.Color(0, 51, 102));
        txtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefono:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        txtTelefono.setBackground(new java.awt.Color(0, 51, 102));
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 220, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Sistema de registro para el control de clientes y servicios");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("E-m@il:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        txtMail.setBackground(new java.awt.Color(0, 51, 102));
        txtMail.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 220, 30));
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 120, 100));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dirección:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Buscar por ID:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        txtDireccion.setBackground(new java.awt.Color(0, 51, 102));
        txtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 220, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo de servicio:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fecha solicitud:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        CMBdia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(CMBdia, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, -1, -1));

        CMBmes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getContentPane().add(CMBmes, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, -1, -1));

        CMBano.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2018", "2019", "2020" }));
        CMBano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMBanoActionPerformed(evt);
            }
        });
        getContentPane().add(CMBano, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("DD");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("MM");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("AAAA");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tipo:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, -1, -1));

        txtNumDeSerie.setBackground(new java.awt.Color(0, 51, 102));
        txtNumDeSerie.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtNumDeSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 110, 30));

        txtModelo.setBackground(new java.awt.Color(0, 51, 102));
        txtModelo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 110, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Depto:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        txtID.setBackground(new java.awt.Color(0, 51, 102));
        txtID.setEditable(false);
        txtID.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 110, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("ID:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Probable Fecha de Entrega:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        CMBequipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Consultoria", "Desarrollo", "Licencias", "Mantenimiento" }));
        CMBequipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMBequipoActionPerformed(evt);
            }
        });
        getContentPane().add(CMBequipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        jScrollPane1.setViewportView(txtpaneObservaciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 350, 60));

        CMBdiaSalida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(CMBdiaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));

        CMDmesSalida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getContentPane().add(CMDmesSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, -1));

        CMBanoSalida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2018", "2019", "2020" }));
        getContentPane().add(CMBanoSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, -1, -1));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("DD");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Número Servicio:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("MM");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, -1, -1));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("AAAA");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Reporte y Observaciones:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        jButtonGuardar.setBackground(new java.awt.Color(0, 51, 102));
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, -1, -1));

        jButtonLimpiar.setBackground(new java.awt.Color(0, 51, 102));
        jButtonLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));

        jButtonModificar.setBackground(new java.awt.Color(0, 51, 102));
        jButtonModificar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, -1, -1));

        jButtonEliminar.setBackground(new java.awt.Color(0, 51, 102));
        jButtonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 51, 102));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Opciones");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, -1, 60));

        txtMarca.setBackground(new java.awt.Color(0, 51, 102));
        txtMarca.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 110, 30));

        getContentPane().add(CMBID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        txtStatus.setEditable(false);
        txtStatus.setText("No Entregado");
        getContentPane().add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 100, -1));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Status:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Azul-Abs.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

        try {

            Class.forName("sun.jdbc.odbc.JdbcodbcDriver").newInstance();
            Connection cn = DriverManager.getConnection("jdbc:odbc:Proyecto", "sa", "sasa");

            PreparedStatement pst = cn.prepareStatement("insert into Clientes values(?,?,?,?)");

            pst.setString(1, txtNombreCliente.getText().trim());
            pst.setString(2, txtTelefono.getText().trim());
            pst.setString(3, txtMail.getText().trim());
            pst.setString(4, txtDireccion.getText().trim());

            pst.executeUpdate();

        } catch (Exception er) {
            System.out.println("Error" + er);
        }

        try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
            Connection cn = DriverManager.getConnection("jdbc:odbc:Proyecto", "sa", "sasa");

            PreparedStatement pst = cn.prepareStatement("insert into Equipos values(?,?,?,?,?,?,?,?,?,?,?)");

            pst.setInt(1, CMBequipo.getSelectedIndex() + 1);
            pst.setInt(2, CMBdia.getSelectedIndex() + 1);
            pst.setInt(3, CMBmes.getSelectedIndex() + 1);
            pst.setInt(4, CMBano.getSelectedIndex() + 1);
            pst.setString(5, txtNumDeSerie.getText().trim());
            pst.setString(6, txtMarca.getText().trim());
            pst.setString(7, txtModelo.getText().trim());
            pst.setInt(8, CMBdiaSalida.getSelectedIndex() + 1);
            pst.setInt(9, CMDmesSalida.getSelectedIndex() + 1);
            pst.setInt(10, CMBanoSalida.getSelectedIndex() + 1);
            pst.setString(11, txtpaneObservaciones.getText().trim());
            

            pst.executeUpdate();
            llenarCombo("Select IDCliente from Clientes");
            Limpiar();

            JOptionPane.showMessageDialog(null, "Alta realizada");

        } catch (Exception er) {
            System.out.println("Error" + er);
        }
        
        try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
            Connection cn = DriverManager.getConnection("jdbc:odbc:Proyecto", "sa", "sasa");

            PreparedStatement pst = cn.prepareStatement("insert into Estado values(?,?)");            

            pst.setString(1, txtStatus.getText().trim());                        
            pst.setString(2, txtpaneObservaciones.getText().trim());

            pst.executeUpdate();

        } catch (Exception er) {
            System.out.println("Error" + er);
        }


    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed

        try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
            Connection cn = DriverManager.getConnection("jdbc:odbc:Proyecto", "sa", "sasa");

            PreparedStatement pst = cn.prepareStatement("Select * from Clientes where IDCliente = ?");
            pst.setString(1, txtBuscar.getText());
            //pst.setString(1, CMBID.getName());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {

                txtNombreCliente.setText(rs.getString("nombrecliente").trim());
                txtTelefono.setText(rs.getString("telefono").trim());
                txtMail.setText(rs.getString("mail").trim());
                txtDireccion.setText(rs.getString("direccion").trim());
                //pst.setString(1, CMBID.getName());
                String guardar = txtBuscar.getText();
                txtID.setText(guardar);

            } else {
                JOptionPane.showMessageDialog(null, "No existe el usuario");
            }

        } catch (Exception er) {
            System.out.println("error en buscar " + er);
        }

        try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
            Connection cn = DriverManager.getConnection("jdbc:odbc:Proyecto", "sa", "sasa");

            PreparedStatement pst = cn.prepareStatement("Select * from Equipos where ID = ?");
            pst.setString(1, txtBuscar.getText());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {

                CMBequipo.setSelectedIndex(rs.getInt("nombre") - 1);
                CMBdia.setSelectedIndex(rs.getInt("diaEntrada") - 1);
                CMBmes.setSelectedIndex(rs.getInt("mesEntrada") - 1);
                CMBano.setSelectedIndex(rs.getInt("anoEntrada") - 1);
                txtNumDeSerie.setText(rs.getString("serie").trim());
                txtMarca.setText(rs.getString("marca").trim());
                txtModelo.setText(rs.getString("modelo").trim());
                CMBdiaSalida.setSelectedIndex(rs.getInt("diaSalida") - 1);
                CMDmesSalida.setSelectedIndex(rs.getInt("mesSalida") - 1);
                CMBanoSalida.setSelectedIndex(rs.getInt("anoSalida") - 1);
                txtpaneObservaciones.setText(rs.getString("observaciones").trim());

            } else {
            }

        } catch (Exception er) {
            System.out.println("error en buscar " + er);
        }
        
         try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
            Connection cn = DriverManager.getConnection("jdbc:odbc:Proyecto", "sa", "sasa");

            PreparedStatement pst = cn.prepareStatement("Select * from Estado where IDEstado = ?");
            pst.setString(1, txtBuscar.getText());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                
                txtStatus.setText(rs.getString("status").trim());

            } else {
            }

        } catch (Exception er) {
            System.out.println("error en buscar " + er);
        }
        

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed

        Limpiar();

    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed

        try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
            Connection cn = DriverManager.getConnection("jdbc:odbc:Proyecto", "sa", "sasa");

            PreparedStatement pst = cn.prepareStatement("update Clientes set nombrecliente=?, telefono=?, mail=?, direccion=? where IDCliente=?");
            pst.setString(1, txtNombreCliente.getText());
            pst.setString(2, txtTelefono.getText());
            pst.setString(3, txtMail.getText());
            pst.setString(4, txtDireccion.getText());
            pst.setString(5, txtBuscar.getText());


            pst.executeUpdate();

        } catch (Exception er) {
            System.out.println("error en modificar " + er);
        }

        try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
            Connection cn = DriverManager.getConnection("jdbc:odbc:Proyecto", "sa", "sasa");

            PreparedStatement pst = cn.prepareStatement("update Equipos set nombre=?, diaEntrada=?, mesEntrada=?, anoEntrada=?, serie=?, marca=?, modelo=?, diaSalida=?, mesSalida=?, anoSalida=?, Observaciones=? where ID=?");

            pst.setInt(1, CMBequipo.getSelectedIndex() + 1);
            pst.setInt(2, CMBdia.getSelectedIndex() + 1);
            pst.setInt(3, CMBmes.getSelectedIndex() + 1);
            pst.setInt(4, CMBano.getSelectedIndex() + 1);

            pst.setString(5, txtNumDeSerie.getText());
            pst.setString(6, txtMarca.getText());
            pst.setString(7, txtModelo.getText());

            pst.setInt(8, CMBdiaSalida.getSelectedIndex() + 1);
            pst.setInt(9, CMDmesSalida.getSelectedIndex() + 1);
            pst.setInt(10, CMBanoSalida.getSelectedIndex() + 1);

            pst.setString(11, txtpaneObservaciones.getText());
            pst.setString(12, txtBuscar.getText());

            pst.executeUpdate();

            Limpiar();

            JOptionPane.showMessageDialog(null, "Modificacion realizada");

        } catch (Exception er) {
            System.out.println("error en modificar " + er);
        }

    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed

        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
            Connection cn = DriverManager.getConnection("jdbc:odbc:Proyecto", "sa", "sasa");
            PreparedStatement pst = cn.prepareStatement("Delete from Clientes where IDCliente= ?");
            pst.setString(1, txtID.getText());
            pst.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error en baja " + e);
        }
        
        
           try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
            Connection cn = DriverManager.getConnection("jdbc:odbc:Proyecto", "sa", "sasa");
            PreparedStatement pst = cn.prepareStatement("Delete from Estado where IDEstado= ?");
            pst.setString(1, txtID.getText());
            pst.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error en baja " + e);
        }

        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
            Connection cn = DriverManager.getConnection("jdbc:odbc:Proyecto", "sa", "sasa");
            PreparedStatement pst = cn.prepareStatement("Delete from Equipos where ID= ?");
            pst.setString(1, txtID.getText());
            pst.executeUpdate();
            llenarCombo("Select IDCliente from Clientes");

            Limpiar();            
            JOptionPane.showMessageDialog(null, "Se elimino el usuario");


        } catch (Exception e) {
            System.out.println("Error en baja " + e);
        }

       
        
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new OpcionesUsuario().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void CMBanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMBanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CMBanoActionPerformed

    private void CMBequipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMBequipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CMBequipoActionPerformed

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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CMBID;
    private javax.swing.JComboBox CMBano;
    private javax.swing.JComboBox CMBanoSalida;
    private javax.swing.JComboBox CMBdia;
    private javax.swing.JComboBox CMBdiaSalida;
    private javax.swing.JComboBox CMBequipo;
    private javax.swing.JComboBox CMBmes;
    private javax.swing.JComboBox CMDmesSalida;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNumDeSerie;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextPane txtpaneObservaciones;
    // End of variables declaration//GEN-END:variables

    public void Limpiar() {
        CMBano.setSelectedIndex(0);
        CMBanoSalida.setSelectedIndex(0);
        CMBdia.setSelectedIndex(0);
        CMBdiaSalida.setSelectedIndex(0);
        CMBequipo.setSelectedIndex(0);
        CMBmes.setSelectedIndex(0);
        CMDmesSalida.setSelectedIndex(0);

        txtBuscar.setText("");
        txtDireccion.setText("");
        txtID.setText("");
        txtMail.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtNombreCliente.setText("");
        txtNumDeSerie.setText("");
        txtTelefono.setText("");
        txtpaneObservaciones.setText("");
        txtStatus.setText("No Reparado");
    }
}
