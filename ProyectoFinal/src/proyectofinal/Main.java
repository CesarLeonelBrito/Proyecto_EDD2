package proyectofinal;

import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogArchivos = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        bt_nuevoArchivo = new javax.swing.JButton();
        bt_abrirArchivo = new javax.swing.JButton();
        bt_salvarArchivo = new javax.swing.JButton();
        bt_cerrarArchivo = new javax.swing.JButton();
        bt_menuPrincipal1 = new javax.swing.JButton();
        dialogRegistros = new javax.swing.JDialog();
        bt_menuPrincipal3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        bt_crearRegistro = new javax.swing.JButton();
        dialogCampos = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        bt_crearCampo = new javax.swing.JButton();
        bt_listarCampo = new javax.swing.JButton();
        bt_modificarCampo = new javax.swing.JButton();
        bt_borrarCampo = new javax.swing.JButton();
        bt_menuPrincipal2 = new javax.swing.JButton();
        dialogCrearCampo = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_campoNombre = new javax.swing.JTextField();
        rd_campoInt = new javax.swing.JRadioButton();
        rd_campoChar = new javax.swing.JRadioButton();
        bt_CrearCampo2 = new javax.swing.JButton();
        dialogListarCampos = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_campos = new javax.swing.JTable();
        dialogModificarCampo = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        jt_camposmod = new javax.swing.JTable();
        bt_modCampo = new javax.swing.JButton();
        bt_llavePrincipal = new javax.swing.JButton();
        dialogBorrarCampo = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_camposelim = new javax.swing.JTable();
        bt_elimCampo = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        dialogModCampo2 = new javax.swing.JDialog();
        rd_campoInt1 = new javax.swing.JRadioButton();
        rd_campoChar1 = new javax.swing.JRadioButton();
        bt_ModCampo2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_campoNombre1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        bt_archivos = new javax.swing.JButton();
        bt_campos = new javax.swing.JButton();
        bt_registros = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelMainFile = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel3.setText("Menu Archivos");

        bt_nuevoArchivo.setText("Nuevo Archivo");
        bt_nuevoArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_nuevoArchivoActionPerformed(evt);
            }
        });

        bt_abrirArchivo.setText("Abrir Archivo");
        bt_abrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_abrirArchivoActionPerformed(evt);
            }
        });

        bt_salvarArchivo.setText("Salvar Archivo");
        bt_salvarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salvarArchivoActionPerformed(evt);
            }
        });

        bt_cerrarArchivo.setText("Cerrar Archivo");
        bt_cerrarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cerrarArchivoActionPerformed(evt);
            }
        });

        bt_menuPrincipal1.setText("Regresar a Menu Principal");
        bt_menuPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_menuPrincipal1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogArchivosLayout = new javax.swing.GroupLayout(dialogArchivos.getContentPane());
        dialogArchivos.getContentPane().setLayout(dialogArchivosLayout);
        dialogArchivosLayout.setHorizontalGroup(
            dialogArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogArchivosLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(dialogArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_nuevoArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(bt_abrirArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_salvarArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_cerrarArchivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_menuPrincipal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        dialogArchivosLayout.setVerticalGroup(
            dialogArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogArchivosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_nuevoArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_abrirArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_salvarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_cerrarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addComponent(bt_menuPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        bt_menuPrincipal3.setText("Regresar a Menu Principal");
        bt_menuPrincipal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_menuPrincipal3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel7.setText("Menu Registros");

        bt_crearRegistro.setText("Crear Registro");
        bt_crearRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_crearRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogRegistrosLayout = new javax.swing.GroupLayout(dialogRegistros.getContentPane());
        dialogRegistros.getContentPane().setLayout(dialogRegistrosLayout);
        dialogRegistrosLayout.setHorizontalGroup(
            dialogRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogRegistrosLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(dialogRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_crearRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(bt_menuPrincipal3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        dialogRegistrosLayout.setVerticalGroup(
            dialogRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogRegistrosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_crearRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 351, Short.MAX_VALUE)
                .addComponent(bt_menuPrincipal3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel4.setText("Menu Campos");

        bt_crearCampo.setText("Crear Campos");
        bt_crearCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_crearCampoActionPerformed(evt);
            }
        });

        bt_listarCampo.setText("Listar Campos");
        bt_listarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_listarCampoActionPerformed(evt);
            }
        });

        bt_modificarCampo.setText("Modificar Campos");
        bt_modificarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modificarCampoActionPerformed(evt);
            }
        });

        bt_borrarCampo.setText("Borrar Campos");
        bt_borrarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_borrarCampoActionPerformed(evt);
            }
        });

        bt_menuPrincipal2.setText("Regresar a Menu Principal");
        bt_menuPrincipal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_menuPrincipal2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogCamposLayout = new javax.swing.GroupLayout(dialogCampos.getContentPane());
        dialogCampos.getContentPane().setLayout(dialogCamposLayout);
        dialogCamposLayout.setHorizontalGroup(
            dialogCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCamposLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(dialogCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_crearCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(bt_listarCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_modificarCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_borrarCampo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_menuPrincipal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        dialogCamposLayout.setVerticalGroup(
            dialogCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCamposLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_crearCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_listarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_modificarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_borrarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(bt_menuPrincipal2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Nombre del Campo:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Tipo de Campo:");

        buttonGroup1.add(rd_campoInt);
        rd_campoInt.setText("int[x]");

        buttonGroup1.add(rd_campoChar);
        rd_campoChar.setText("char[x]");

        bt_CrearCampo2.setText("Crear Campo");
        bt_CrearCampo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CrearCampo2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogCrearCampoLayout = new javax.swing.GroupLayout(dialogCrearCampo.getContentPane());
        dialogCrearCampo.getContentPane().setLayout(dialogCrearCampoLayout);
        dialogCrearCampoLayout.setHorizontalGroup(
            dialogCrearCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCrearCampoLayout.createSequentialGroup()
                .addGroup(dialogCrearCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogCrearCampoLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel5))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogCrearCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogCrearCampoLayout.createSequentialGroup()
                        .addGroup(dialogCrearCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rd_campoChar)
                            .addComponent(rd_campoInt))
                        .addContainerGap())
                    .addComponent(tf_campoNombre)))
            .addGroup(dialogCrearCampoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(bt_CrearCampo2, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        dialogCrearCampoLayout.setVerticalGroup(
            dialogCrearCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCrearCampoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(dialogCrearCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(dialogCrearCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_campoInt)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rd_campoChar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addComponent(bt_CrearCampo2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jt_campos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tipo de Dato"
            }
        ));
        jScrollPane1.setViewportView(jt_campos);
        if (jt_campos.getColumnModel().getColumnCount() > 0) {
            jt_campos.getColumnModel().getColumn(0).setResizable(false);
            jt_campos.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout dialogListarCamposLayout = new javax.swing.GroupLayout(dialogListarCampos.getContentPane());
        dialogListarCampos.getContentPane().setLayout(dialogListarCamposLayout);
        dialogListarCamposLayout.setHorizontalGroup(
            dialogListarCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogListarCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                .addContainerGap())
        );
        dialogListarCamposLayout.setVerticalGroup(
            dialogListarCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogListarCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );

        jt_camposmod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tipo de Dato"
            }
        ));
        jScrollPane4.setViewportView(jt_camposmod);
        if (jt_camposmod.getColumnModel().getColumnCount() > 0) {
            jt_camposmod.getColumnModel().getColumn(0).setResizable(false);
            jt_camposmod.getColumnModel().getColumn(1).setResizable(false);
        }

        bt_modCampo.setText("Modificar Campo");
        bt_modCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modCampoActionPerformed(evt);
            }
        });

        bt_llavePrincipal.setText("Hacer Llave Principal");
        bt_llavePrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_llavePrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogModificarCampoLayout = new javax.swing.GroupLayout(dialogModificarCampo.getContentPane());
        dialogModificarCampo.getContentPane().setLayout(dialogModificarCampoLayout);
        dialogModificarCampoLayout.setHorizontalGroup(
            dialogModificarCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogModificarCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogModificarCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                    .addComponent(bt_modCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_llavePrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        dialogModificarCampoLayout.setVerticalGroup(
            dialogModificarCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogModificarCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_modCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_llavePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jt_camposelim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tipo de Dato"
            }
        ));
        jScrollPane3.setViewportView(jt_camposelim);
        if (jt_camposelim.getColumnModel().getColumnCount() > 0) {
            jt_camposelim.getColumnModel().getColumn(0).setResizable(false);
            jt_camposelim.getColumnModel().getColumn(1).setResizable(false);
        }

        bt_elimCampo.setText("Eliminar Campo");
        bt_elimCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_elimCampoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogBorrarCampoLayout = new javax.swing.GroupLayout(dialogBorrarCampo.getContentPane());
        dialogBorrarCampo.getContentPane().setLayout(dialogBorrarCampoLayout);
        dialogBorrarCampoLayout.setHorizontalGroup(
            dialogBorrarCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogBorrarCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogBorrarCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                    .addComponent(bt_elimCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        dialogBorrarCampoLayout.setVerticalGroup(
            dialogBorrarCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogBorrarCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_elimCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        buttonGroup1.add(rd_campoInt1);
        rd_campoInt1.setText("int[x]");

        buttonGroup1.add(rd_campoChar1);
        rd_campoChar1.setText("char[x]");

        bt_ModCampo2.setText("Modificar Campo");
        bt_ModCampo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ModCampo2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Nombre del Campo:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Tipo de Campo:");

        javax.swing.GroupLayout dialogModCampo2Layout = new javax.swing.GroupLayout(dialogModCampo2.getContentPane());
        dialogModCampo2.getContentPane().setLayout(dialogModCampo2Layout);
        dialogModCampo2Layout.setHorizontalGroup(
            dialogModCampo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogModCampo2Layout.createSequentialGroup()
                .addGroup(dialogModCampo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogModCampo2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel8))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogModCampo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogModCampo2Layout.createSequentialGroup()
                        .addGroup(dialogModCampo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rd_campoChar1)
                            .addComponent(rd_campoInt1))
                        .addContainerGap())
                    .addComponent(tf_campoNombre1)))
            .addGroup(dialogModCampo2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(bt_ModCampo2, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        dialogModCampo2Layout.setVerticalGroup(
            dialogModCampo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogModCampo2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(dialogModCampo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_campoNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(dialogModCampo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_campoInt1)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rd_campoChar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addComponent(bt_ModCampo2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("File Manager");

        jToolBar1.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        bt_archivos.setText("Archivos");
        bt_archivos.setFocusable(false);
        bt_archivos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_archivos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_archivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_archivosActionPerformed(evt);
            }
        });
        jToolBar1.add(bt_archivos);

        bt_campos.setText("Campos");
        bt_campos.setEnabled(false);
        bt_campos.setFocusable(false);
        bt_campos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_campos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_campos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_camposActionPerformed(evt);
            }
        });
        jToolBar1.add(bt_campos);

        bt_registros.setText("Registros");
        bt_registros.setEnabled(false);
        bt_registros.setFocusable(false);
        bt_registros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_registros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_registros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrosActionPerformed(evt);
            }
        });
        jToolBar1.add(bt_registros);

        jButton4.setText("Índices");
        jButton4.setEnabled(false);
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton4);

        jButton5.setText("Estandarización");
        jButton5.setEnabled(false);
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton5);

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("File:");

        labelMainFile.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelMainFile.setForeground(new java.awt.Color(0, 0, 0));
        labelMainFile.setText("n/a");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMainFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMainFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(383, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_archivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_archivosActionPerformed
        dialogArchivos.setModal(true);
        dialogArchivos.pack();
        dialogArchivos.setLocationRelativeTo(this);
        dialogArchivos.setVisible(true);
    }//GEN-LAST:event_bt_archivosActionPerformed

    private void bt_camposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_camposActionPerformed
        dialogCampos.setModal(true);
        dialogCampos.pack();
        dialogCampos.setLocationRelativeTo(this);
        dialogCampos.setVisible(true);
    }//GEN-LAST:event_bt_camposActionPerformed

    private void bt_menuPrincipal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_menuPrincipal2ActionPerformed
        dialogCampos.hide();
    }//GEN-LAST:event_bt_menuPrincipal2ActionPerformed

    private void bt_menuPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_menuPrincipal1ActionPerformed
        dialogArchivos.hide();
    }//GEN-LAST:event_bt_menuPrincipal1ActionPerformed

    private void bt_abrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_abrirArchivoActionPerformed
        try {
            JFileChooser fc = new JFileChooser();
            File archivo = null;
            FileFilter filtro = new FileNameExtensionFilter("Seleccionar Archivo", "txt");
            fc.setFileFilter(filtro);
            int op = fc.showOpenDialog(null);
            if (op == JFileChooser.APPROVE_OPTION) {
                archivo = fc.getSelectedFile();
                archivoSeleccionado = archivo;
            }
            labelMainFile.setText(archivo.getAbsolutePath());
            bt_campos.setEnabled(true);
            bt_registros.setEnabled(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bt_abrirArchivoActionPerformed

    private void bt_nuevoArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nuevoArchivoActionPerformed
        try {
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Texto", "txt");
            jfc.setFileFilter(filter);
            jfc.showOpenDialog(null);
            File file = jfc.getSelectedFile();
            String aux = file.getAbsolutePath();
            if (!aux.endsWith(".txt")) {
                aux += ".txt";
            }
            file = new File(aux);
            file.createNewFile();
            /*String newFile = JOptionPane.showInputDialog(this, "Ingrese el archivo que desea crear");
            JFileChooser fc = new JFileChooser();
            File archivo = null;
            FileFilter filtro = new FileNameExtensionFilter("Seleccionar Archivo");
            fc.setFileFilter(filtro);
            int op = fc.showOpenDialog(null);
            
            File myObj = new File(op + newFile + ".txt");
            if (myObj.createNewFile()) {
                JOptionPane.showMessageDialog(this, "Archivo Creado");
            } else {
                JOptionPane.showMessageDialog(this, "Archivo Ya Existe");
            }*/
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_bt_nuevoArchivoActionPerformed

    private void bt_cerrarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cerrarArchivoActionPerformed
        try {
            labelMainFile.setText("n/a");
            bt_campos.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Archivo Cerrado Exitosamente");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bt_cerrarArchivoActionPerformed

    private void bt_crearCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_crearCampoActionPerformed
        dialogCrearCampo.setModal(true);
        dialogCrearCampo.pack();
        dialogCrearCampo.setLocationRelativeTo(this);
        dialogCrearCampo.setVisible(true);
    }//GEN-LAST:event_bt_crearCampoActionPerformed

    private void bt_listarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_listarCampoActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jt_campos.getModel();
        modelo.setRowCount(0);
        for (int i = 0; i < nombreCampos.size(); i++) {
            Object[] nuevo = {nombreCampos.get(i), tipoCampos.get(i)};
            modelo.addRow(nuevo);
        }
        jt_campos.setModel(modelo);
        dialogListarCampos.setModal(true);
        dialogListarCampos.pack();
        dialogListarCampos.setLocationRelativeTo(this);
        dialogListarCampos.setVisible(true);
    }//GEN-LAST:event_bt_listarCampoActionPerformed

    private void bt_modificarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modificarCampoActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jt_camposmod.getModel();
        modelo.setRowCount(0);
        for (int i = 0; i < nombreCampos.size(); i++) {
            Object[] nuevo = {nombreCampos.get(i), tipoCampos.get(i)};
            modelo.addRow(nuevo);
        }
        jt_camposmod.setModel(modelo);
        dialogModificarCampo.setModal(true);
        dialogModificarCampo.pack();
        dialogModificarCampo.setLocationRelativeTo(this);
        dialogModificarCampo.setVisible(true);
    }//GEN-LAST:event_bt_modificarCampoActionPerformed

    private void bt_borrarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_borrarCampoActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jt_camposelim.getModel();
        modelo.setRowCount(0);
        for (int i = 0; i < nombreCampos.size(); i++) {
            Object[] nuevo = {nombreCampos.get(i), tipoCampos.get(i)};
            modelo.addRow(nuevo);
        }
        jt_camposelim.setModel(modelo);
        dialogBorrarCampo.setModal(true);
        dialogBorrarCampo.pack();
        dialogBorrarCampo.setLocationRelativeTo(this);
        dialogBorrarCampo.setVisible(true);
    }//GEN-LAST:event_bt_borrarCampoActionPerformed

    private void bt_CrearCampo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CrearCampo2ActionPerformed
        try {
            String nombre = tf_campoNombre.getText();
            String tipo = "";
            if (rd_campoChar.isSelected()) {
                tipo = "char";
            } else if (rd_campoInt.isSelected()) {
                tipo = "int";
            }
            nombreCampos.add(nombre);
            tipoCampos.add(tipo);
            rd_campoChar.setSelected(false);
            rd_campoInt.setSelected(false);
            tf_campoNombre.setText("");
            dialogCrearCampo.hide();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bt_CrearCampo2ActionPerformed

    private void bt_modCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modCampoActionPerformed
        try {
            int po = jt_camposmod.getSelectedRow();
            poCamposMod = po;
            tf_campoNombre1.setText(nombreCampos.get(po));
            if (tipoCampos.get(po).equals("char")) {
                rd_campoChar1.setSelected(true);
            } else {
                rd_campoInt1.setSelected(true);
            }
            dialogModCampo2.setModal(true);
            dialogModCampo2.pack();
            dialogModCampo2.setLocationRelativeTo(this);
            dialogModCampo2.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bt_modCampoActionPerformed

    private void bt_elimCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_elimCampoActionPerformed
        try {
            int po = jt_camposelim.getSelectedRow();
            DefaultTableModel modelo = (DefaultTableModel) jt_camposelim.getModel();
            nombreCampos.remove(po);
            tipoCampos.remove(po);
            modelo.removeRow(po);
            jt_camposelim.setModel(modelo);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bt_elimCampoActionPerformed

    private void bt_ModCampo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ModCampo2ActionPerformed
        String nombre = tf_campoNombre1.getText();
        String tipo = "";
        if (rd_campoChar1.isSelected()) {
            tipo = "char";
        } else if (rd_campoInt1.isSelected()) {
            tipo = "int";
        }
        nombreCampos.set(poCamposMod, nombre);
        tipoCampos.set(poCamposMod, tipo);
        DefaultTableModel modelo = (DefaultTableModel) jt_camposmod.getModel();
        modelo.setRowCount(0);
        for (int i = 0; i < nombreCampos.size(); i++) {
            Object[] nuevo = {nombreCampos.get(i), tipoCampos.get(i)};
            modelo.addRow(nuevo);
        }
        jt_camposmod.setModel(modelo);
        dialogModCampo2.hide();
    }//GEN-LAST:event_bt_ModCampo2ActionPerformed

    private void bt_salvarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salvarArchivoActionPerformed
        try {
            FileWriter fw = null;
            BufferedWriter bw = null;
            if (archivoSeleccionado.delete()) {
                archivoSeleccionado.createNewFile();
            }
            try {
                fw = new FileWriter(archivoSeleccionado, false);
                bw = new BufferedWriter(fw);
                bw.write("{");
                for (int i = 0; i < nombreCampos.size(); i++) {
                    if (i != nombreCampos.size() - 1) {
                        bw.write(nombreCampos.get(i) + ": ");
                        bw.write(tipoCampos.get(i) + ", ");
                    } else {
                        bw.write(nombreCampos.get(i) + ": ");
                        bw.write(tipoCampos.get(i));
                    }
                }
                bw.write("\n");
                for (int i = 0; i < registros.size(); i++) {
                    bw.write(registros.get(i));
                    bw.write("\n");
                }
                bw.write("}");
                bw.flush();
                JOptionPane.showMessageDialog(this, "Archivo Guardado Exitosamente");
            } catch (Exception ex) {
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
        }
    }//GEN-LAST:event_bt_salvarArchivoActionPerformed

    private void bt_llavePrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_llavePrincipalActionPerformed
        try {
            int po = jt_camposmod.getSelectedRow();
            String eje1 = nombreCampos.get(po);
            String eje2 = tipoCampos.get(po);
            nombreCampos.remove(po);
            tipoCampos.remove(po);
            nombreCampos.add(0, eje1);
            tipoCampos.add(0, eje2);
            DefaultTableModel modelo = (DefaultTableModel) jt_camposmod.getModel();
            modelo.setRowCount(0);
            for (int i = 0; i < nombreCampos.size(); i++) {
                Object[] nuevo = {nombreCampos.get(i), tipoCampos.get(i)};
                modelo.addRow(nuevo);
            }
            jt_camposmod.setModel(modelo);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bt_llavePrincipalActionPerformed

    private void bt_menuPrincipal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_menuPrincipal3ActionPerformed
        dialogRegistros.hide();        
    }//GEN-LAST:event_bt_menuPrincipal3ActionPerformed

    private void bt_crearRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_crearRegistroActionPerformed
        try {
            String inputFinal = "";
            for (int i = 0; i < nombreCampos.size(); i++) {
                String input = JOptionPane.showInputDialog(this, "Ingrese " + nombreCampos.get(i) + ": ");
                if(i != nombreCampos.size() - 1){
                    inputFinal += input + ",";
                } else {
                    inputFinal += input;
                }
            }
            registros.add(inputFinal);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bt_crearRegistroActionPerformed

    private void bt_registrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrosActionPerformed
        dialogRegistros.setModal(true);
        dialogRegistros.pack();
        dialogRegistros.setLocationRelativeTo(this);
        dialogRegistros.setVisible(true);
    }//GEN-LAST:event_bt_registrosActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_CrearCampo2;
    private javax.swing.JButton bt_ModCampo2;
    private javax.swing.JButton bt_abrirArchivo;
    private javax.swing.JButton bt_archivos;
    private javax.swing.JButton bt_borrarCampo;
    private javax.swing.JButton bt_campos;
    private javax.swing.JButton bt_cerrarArchivo;
    private javax.swing.JButton bt_crearCampo;
    private javax.swing.JButton bt_crearRegistro;
    private javax.swing.JButton bt_elimCampo;
    private javax.swing.JButton bt_listarCampo;
    private javax.swing.JButton bt_llavePrincipal;
    private javax.swing.JButton bt_menuPrincipal1;
    private javax.swing.JButton bt_menuPrincipal2;
    private javax.swing.JButton bt_menuPrincipal3;
    private javax.swing.JButton bt_modCampo;
    private javax.swing.JButton bt_modificarCampo;
    private javax.swing.JButton bt_nuevoArchivo;
    private javax.swing.JButton bt_registros;
    private javax.swing.JButton bt_salvarArchivo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDialog dialogArchivos;
    private javax.swing.JDialog dialogBorrarCampo;
    private javax.swing.JDialog dialogCampos;
    private javax.swing.JDialog dialogCrearCampo;
    private javax.swing.JDialog dialogListarCampos;
    private javax.swing.JDialog dialogModCampo2;
    private javax.swing.JDialog dialogModificarCampo;
    private javax.swing.JDialog dialogRegistros;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable jt_campos;
    private javax.swing.JTable jt_camposelim;
    private javax.swing.JTable jt_camposmod;
    private javax.swing.JLabel labelMainFile;
    private javax.swing.JRadioButton rd_campoChar;
    private javax.swing.JRadioButton rd_campoChar1;
    private javax.swing.JRadioButton rd_campoInt;
    private javax.swing.JRadioButton rd_campoInt1;
    private javax.swing.JTextField tf_campoNombre;
    private javax.swing.JTextField tf_campoNombre1;
    // End of variables declaration//GEN-END:variables
    File archivoSeleccionado;
    int poCamposMod;
    ArrayList<String> nombreCampos = new ArrayList();
    ArrayList<String> tipoCampos = new ArrayList();
    ArrayList<String> registros = new ArrayList();
}
