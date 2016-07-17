/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intefaz;

//librerias
import Datos.Aulas;
import Metodo.ConexionBD;
import Metodo.ManejadorBD;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 * @author Gabriela y Rocío
 */
public class Main extends javax.swing.JFrame {

    private ManejadorBD manej;//objeto de la clase ManejadorBD para consultas, delete, insertar
    private ArrayList<Aulas> listAulas;
    private int x;
    private int y;
    private MapaForm map;

    public Main() { //Constructor
        this.setUndecorated(true);
        initComponents();
        this.setTitle("Geolocalización Salas y Departamentos");// titulo
        map = new MapaForm();
        map.setVisible(true);
        this.setLocation((int) (map.getLocation().getX()), (int) (map.getLocation().getY() - this.getHeight()));
        cargarAulas();
        this.setVisible(true);
        setIconImage(new ImageIcon(getClass().getResource("marcador.png")).getImage());
    }
    
    public void cargarAulas() {
        manej = new ManejadorBD();
        try {
            listAulas = manej.importarDatos();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        edif1 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        edif2 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        edif3 = new javax.swing.JMenu();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        edif4 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        edif5 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        edif6 = new javax.swing.JMenu();
        jMenuItem24 = new javax.swing.JMenuItem();
        edif7 = new javax.swing.JMenu();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        edif8 = new javax.swing.JMenu();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jMenuBar1.setFocusTraversalPolicyProvider(true);
        jMenuBar1.setFocusable(false);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(900, 21));
        jMenuBar1.setSelectionModel(null);
        jMenuBar1.setVerifyInputWhenFocusTarget(false);
        jMenuBar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenuBar1MouseDragged(evt);
            }
        });
        jMenuBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuBar1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuBar1MousePressed(evt);
            }
        });

        jMenu1.setText("Inicio");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Departamentos");

        jMenu11.setText("Area Administrativa");

        jMenuItem3.setText("Dep. de Economía");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem3);

        jMenuItem4.setText("Dep. Administrativo y Financiero");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem4);

        jMenu2.add(jMenu11);

        jMenu12.setText("Area Biologica");

        jMenuItem6.setText("Dep. de Ciencias de la Salud");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem6);

        jMenuItem7.setText("Dep. de Ciencias Agropecuarias y de Alimentos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem7);

        jMenuItem5.setText("Dep. de Ciencias Naturales");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem5);

        jMenu2.add(jMenu12);

        jMenu13.setText("Area Socio Humanistica");

        jMenuItem8.setText("Dep. de Ciencias de la Educacion");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem8);

        jMenuItem9.setText("Dep. de Ciencias Juridicas y Comunicacion");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem9);

        jMenuItem11.setText("Dep. de Psicologia");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem11);

        jMenu2.add(jMenu13);

        jMenu3.setText("Area Tecnica");

        jMenuItem2.setText("Dep. de CC y Electronica");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem26.setText("Dep. de Arquitectura y Artes");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem26);

        jMenuItem27.setText("Dep. de Geologica, Minas e Ing Civil");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem27);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        edif1.setText("Edificio 1");
        edif1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edif1MouseClicked(evt);
            }
        });

        jMenuItem13.setText("Aula 121 - 124");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        edif1.add(jMenuItem13);

        jMenuItem14.setText("Aula 131 - 134");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        edif1.add(jMenuItem14);

        jMenuItem15.setText("Aula 141- 145");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        edif1.add(jMenuItem15);

        jMenuBar1.add(edif1);

        edif2.setText("Edificio 2");

        jMenuItem16.setText("Aula 220 - 226");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        edif2.add(jMenuItem16);

        jMenuItem17.setText("Aula 230 - 233");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        edif2.add(jMenuItem17);

        jMenuBar1.add(edif2);

        edif3.setText("Edificio 3");

        jMenuItem25.setText("Aula 312-314");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        edif3.add(jMenuItem25);

        jMenuItem30.setText("Aula 321-327");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        edif3.add(jMenuItem30);

        jMenuItem31.setText("Aula 331-335");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        edif3.add(jMenuItem31);

        jMenuBar1.add(edif3);

        edif4.setText("Edificio 4");

        jMenuItem18.setText("Aula 411 - 416");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        edif4.add(jMenuItem18);

        jMenuItem19.setText("AuLa 421 - 427");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        edif4.add(jMenuItem19);

        jMenuItem20.setText("Aula 431 - 433");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        edif4.add(jMenuItem20);

        jMenuBar1.add(edif4);

        edif5.setText("Edificio 5");

        jMenuItem21.setText("Aula 510 - 512");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        edif5.add(jMenuItem21);

        jMenuItem22.setText("Sala A - E");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        edif5.add(jMenuItem22);

        jMenuItem23.setText("Sala F - K");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        edif5.add(jMenuItem23);

        jMenuBar1.add(edif5);

        edif6.setText("Edificio 6");

        jMenuItem24.setText("Aula 611 - 614");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        edif6.add(jMenuItem24);

        jMenuBar1.add(edif6);

        edif7.setText("Edificio 7");
        edif7.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jMenuItem32.setText("Aula 721-726");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        edif7.add(jMenuItem32);

        jMenuItem33.setText("Aula 731-735");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        edif7.add(jMenuItem33);

        jMenuItem34.setText("Auditorio 1-5");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        edif7.add(jMenuItem34);

        jMenuItem35.setText("Auditorio 6");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        edif7.add(jMenuItem35);

        jMenuBar1.add(edif7);

        edif8.setText("Edificio 8");
        edif8.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jMenuItem28.setText("Aula 821 - 823");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        edif8.add(jMenuItem28);

        jMenuItem29.setText("Aula 831 - 832");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        edif8.add(jMenuItem29);

        jMenuBar1.add(edif8);

        jMenu4.setText("Servicios Estudiantiles");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);
        jMenuBar1.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 681, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuBar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MouseClicked

    }//GEN-LAST:event_jMenuBar1MouseClicked

    private void edif1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edif1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_edif1MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        map.setMarcador(listAulas.get(31));
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        map.setMarcador(listAulas.get(32));
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        map.setMarcador(listAulas.get(3));
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        map.setMarcador(listAulas.get(9));
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        map.setMarcador(listAulas.get(0));
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        map.setMarcador(listAulas.get(1));
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        map.setMarcador(listAulas.get(2));
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        map.setMarcador(listAulas.get(4));
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        map.setMarcador(listAulas.get(8));
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        map.setMarcador(listAulas.get(10));
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        map.setMarcador(listAulas.get(11));
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        map.setMarcador(listAulas.get(12));
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        map.setMarcador(listAulas.get(13));
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        map.setMarcador(listAulas.get(14));
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        map.setMarcador(listAulas.get(19));
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        map.setMarcador(listAulas.get(20));
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuBar1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(point.x - x, point.y - y);
        map.setLocation(point.x - x, point.y - y + this.getHeight());
    }//GEN-LAST:event_jMenuBar1MouseDragged

    private void jMenuBar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jMenuBar1MousePressed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        map.setMarcador(listAulas.get(26));
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        map.setMarcador(listAulas.get(28));
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        map.setMarcador(listAulas.get(23));
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        map.setMarcador(listAulas.get(24));
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        map.setMarcador(listAulas.get(25));
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        map.setMarcador(listAulas.get(16));
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        map.setMarcador(listAulas.get(22));
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        map.setMarcador(listAulas.get(21));
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        map.setMarcador(listAulas.get(30));
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        map.setMarcador(listAulas.get(5));
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        map.setMarcador(listAulas.get(6));
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        map.setMarcador(listAulas.get(7));
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
        map.setMarcador(listAulas.get(15));
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
        map.setMarcador(listAulas.get(17));
    }//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        map.setMarcador(listAulas.get(18));
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        map.setMarcador(listAulas.get(33));
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        map.setMarcador(listAulas.get(29));
    }//GEN-LAST:event_jMenu4MouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

//    private JMenuItem[][] aulasEd;
//    private JMenu[] edificios;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu edif1;
    private javax.swing.JMenu edif2;
    private javax.swing.JMenu edif3;
    private javax.swing.JMenu edif4;
    private javax.swing.JMenu edif5;
    private javax.swing.JMenu edif6;
    private javax.swing.JMenu edif7;
    private javax.swing.JMenu edif8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
