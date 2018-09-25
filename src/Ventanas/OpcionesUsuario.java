
package Ventanas;

import com.itextpdf.awt.geom.Dimension;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author e
 */
public class OpcionesUsuario extends javax.swing.JFrame {

    private BufferedImage _image;  //para la imagen en memoria
    private JFreeChart grafico; //en grafico
    private Dimension d; //DIMENCION DEL GRAFICO

    /** Creates new form OpcionesUsuario */
    public OpcionesUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonImprimirTabla = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonListaBrother = new javax.swing.JButton();
        jButtonSesion = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jButtonListaNoReparados = new javax.swing.JButton();
        jButtonGrafica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jButtonImprimirTabla.setText("Imprimir Tabla de Clientes");
        jButtonImprimirTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImprimirTablaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Opciones de Usuario");

        jButtonListaBrother.setText("Imprimir Lista de servicios");
        jButtonListaBrother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaBrotherActionPerformed(evt);
            }
        });

        jButtonSesion.setBackground(new java.awt.Color(204, 0, 0));
        jButtonSesion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSesion.setText("Cerrar Sesión");
        jButtonSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSesionActionPerformed(evt);
            }
        });

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jButtonListaNoReparados.setText("Imprimir Lista de servicios no generados");
        jButtonListaNoReparados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaNoReparadosActionPerformed(evt);
            }
        });

        jButtonGrafica.setText("Crear Grafica");
        jButtonGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGraficaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonImprimirTabla)
                    .addComponent(jButtonListaBrother)
                    .addComponent(jButtonListaNoReparados)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jButtonRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSesion))
                    .addComponent(jButtonGrafica))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSesion)
                        .addComponent(jButtonRegresar)))
                .addGap(59, 59, 59)
                .addComponent(jButtonImprimirTabla)
                .addGap(18, 18, 18)
                .addComponent(jButtonListaBrother)
                .addGap(18, 18, 18)
                .addComponent(jButtonListaNoReparados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonGrafica)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    private void jButtonImprimirTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImprimirTablaActionPerformed

        Document documento = new Document();

        try {
        } catch (Exception e) {
        }


        try {
            PdfWriter.getInstance(documento, new FileOutputStream("Tabla_Clientes.pdf"));


            Image foto = Image.getInstance("banner-bienvenida.jpg");
            foto.scaleToFit(650, 1000);
            foto.setAlignment(Chunk.ALIGN_CENTER);

            documento.open();


            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add(" SISTEMA DE REGISTRO \n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("CARTERA DE CLIENTES REGISTRADOS \n\n");
            documento.add(foto);
            documento.add(parrafo);

            PdfPTable table = new PdfPTable(4);

            table.addCell("IDCliente");
            table.addCell("nombrecliente");
            table.addCell("telefono");
            table.addCell("mail");

            try {

                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
                Connection cn = DriverManager.getConnection("jdbc:odbc:Proyecto", "sa", "sasa");
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("select * from Clientes");

                if (rs.next()) {
                    do {

                        table.addCell(rs.getString(1));
                        table.addCell(rs.getString(2));
                        table.addCell(rs.getString(3));
                        table.addCell(rs.getString(4));

                    } while (rs.next());
                    documento.add(table);
                }
            } catch (Exception e) {
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Tabla de clientes creada con exito.");
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

    }//GEN-LAST:event_jButtonImprimirTablaActionPerformed

    private void jButtonListaBrotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaBrotherActionPerformed

        Document documento = new Document();

        try {
            PdfWriter.getInstance(documento, new FileOutputStream("Lista_Equipos_Brother.pdf"));

            Image foto = Image.getInstance("banner-bienvenida.jpg");
            foto.scaleToFit(650, 1000);
            foto.setAlignment(Chunk.ALIGN_CENTER);

            documento.open();

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Sans", 20, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("Lista de equipos de la marca Brother \n\n\n");
            documento.add(foto);
            documento.add(parrafo);

            parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_LEFT);
            parrafo.setFont(FontFactory.getFont("Sans", 13, Font.BOLD, BaseColor.BLACK));
            parrafo.add("ID         Serie             Marca      Modelo \n\n");


            documento.add(parrafo);
            try {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
                Connection cn = DriverManager.getConnection("jdbc:odbc:Proyecto", "sa", "sasa");
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("select * from Equipos where marca = 'Brother'");

                if (rs.next()) {
                    do {
                        parrafo = new Paragraph();
                        String tab = "      ";
                        String texto = rs.getString(1).trim() + tab + rs.getString(6).trim() + tab + rs.getString(7).trim() + tab + rs.getString(8).trim() + "\n";
                        parrafo.add(texto);
                        documento.add(parrafo);
                    } while (rs.next());
                }


            } catch (Exception e) {
                System.out.println("Error" + e);
            }
            documento.close();

            JOptionPane.showMessageDialog(null, "El listado se creo con exito");

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }//GEN-LAST:event_jButtonListaBrotherActionPerformed

    private void jButtonSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSesionActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSesionActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        Usuario ventana = new Usuario();
        ventana.setVisible(true);
        ventana.setVisible(false);
        //ventana.setBounds(400, 150, 335, 325);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButtonListaNoReparadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaNoReparadosActionPerformed

        Document documento = new Document();

        try {
            PdfWriter.getInstance(documento, new FileOutputStream("Lista_No_Reparados.pdf"));

            Image foto = Image.getInstance("banner-bienvenida.jpg");
            foto.scaleToFit(650, 1000);
            foto.setAlignment(Chunk.ALIGN_CENTER);

            documento.open();

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Sans", 20, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("Lista de equipos NO REPARADOS \n\n\n");
            documento.add(foto);
            documento.add(parrafo);

            parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_LEFT);
            parrafo.setFont(FontFactory.getFont("Sans", 13, Font.BOLD, BaseColor.BLACK));
            parrafo.add("ID         Status               \n\n");


            documento.add(parrafo);
            try {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
                Connection cn = DriverManager.getConnection("jdbc:odbc:Proyecto", "sa", "sasa");
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("select * from Estado where status = 'No Reparado'");

                if (rs.next()) {
                    do {
                        parrafo = new Paragraph();
                        String tab = "      ";
                        String texto = rs.getString(1).trim() + tab + rs.getString(2).trim() + "\n";
                        parrafo.add(texto);
                        documento.add(parrafo);
                    } while (rs.next());
                }


            } catch (Exception e) {
                System.out.println("Error" + e);
            }
            documento.close();

            JOptionPane.showMessageDialog(null, "El listado se creo con exito");

        } catch (Exception e) {
            System.out.println("Error" + e);
        }

    }//GEN-LAST:event_jButtonListaNoReparadosActionPerformed

    private void jButtonGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGraficaActionPerformed

        Grafica ventana = new Grafica();
        ventana.setVisible(true);        
        //ventana.setBounds(400, 150, 335, 325);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButtonGraficaActionPerformed
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
            java.util.logging.Logger.getLogger(OpcionesUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcionesUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcionesUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcionesUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new OpcionesUsuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGrafica;
    private javax.swing.JButton jButtonImprimirTabla;
    private javax.swing.JButton jButtonListaBrother;
    private javax.swing.JButton jButtonListaNoReparados;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jButtonSesion;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
