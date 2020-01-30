package View;

import Controler.Sort;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author thiago
 */
public class Principal extends javax.swing.JFrame {
    
    //variaveis para movimentar o jframe
    int posFrameX;
    int posFrameY;
    
    //variaveis para controlar o sorteio
    int ultimoSorteado = -1;
    String txtUltimoSorteado;
    
    
    public void setaValorSpiner(){
        
            if(listaItem.getModel().getSize() <= 1){
                SpinnerNumberModel model = new SpinnerNumberModel(1, 1, 1, 1);;
                qtdSorteio.setModel(model);
            }else{
                SpinnerNumberModel model = new SpinnerNumberModel(1, 1, listaItem.getModel().getSize(), 1);;
                qtdSorteio.setModel(model);
   
            }
            
            //bloquear a entrada de texto
            JComponent editor = qtdSorteio.getEditor();
            ((DefaultEditor) editor).getTextField().setFocusable(false);


    }
    
    public Principal() {
        initComponents();
        setaValorSpiner();
        listaItem.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaSorteados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd0 = new javax.swing.JLabel();
        btnAdd1 = new javax.swing.JLabel();
        btnRemove0 = new javax.swing.JLabel();
        btnRemove1 = new javax.swing.JLabel();
        btnLimpa0 = new javax.swing.JLabel();
        btnLimpa1 = new javax.swing.JLabel();
        btnExit0 = new javax.swing.JLabel();
        btnExit1 = new javax.swing.JLabel();
        btnSortear0 = new javax.swing.JLabel();
        btnSortear1 = new javax.swing.JLabel();
        head = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaSorteados = new javax.swing.JList<>();
        lblListaSorteados = new javax.swing.JLabel();
        txtAdd = new javax.swing.JTextField();
        panelqtdLista = new javax.swing.JPanel();
        lblItensList = new javax.swing.JLabel();
        qtdSorteio = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaItem = new javax.swing.JList<>();
        lblListaAserSorteada = new javax.swing.JLabel();
        btnAdd = new javax.swing.JLabel();
        btnSortear = new javax.swing.JLabel();
        verificar = new javax.swing.JCheckBox();
        btnLimpa = new javax.swing.JLabel();
        btnRemove = new javax.swing.JLabel();
        btnLimpaSorteados = new javax.swing.JLabel();
        btnRemoveSorteados = new javax.swing.JLabel();

        btnAdd0.setFont(btnAdd0.getFont().deriveFont(btnAdd0.getFont().getStyle() | java.awt.Font.BOLD, 14));
        btnAdd0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add.png"))); // NOI18N

        btnAdd1.setFont(btnAdd1.getFont().deriveFont(btnAdd1.getFont().getStyle() | java.awt.Font.BOLD, 14));
        btnAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add1.png"))); // NOI18N

        btnRemove0.setFont(btnRemove0.getFont().deriveFont(btnRemove0.getFont().getStyle() | java.awt.Font.BOLD, 14));
        btnRemove0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/remove.png"))); // NOI18N

        btnRemove1.setFont(btnRemove1.getFont().deriveFont(btnRemove1.getFont().getStyle() | java.awt.Font.BOLD, 14));
        btnRemove1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/remove1.png"))); // NOI18N

        btnLimpa0.setFont(btnLimpa0.getFont().deriveFont(btnLimpa0.getFont().getStyle() | java.awt.Font.BOLD, 14));
        btnLimpa0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lixo.png"))); // NOI18N

        btnLimpa1.setFont(btnLimpa1.getFont().deriveFont(btnLimpa1.getFont().getStyle() | java.awt.Font.BOLD, 14));
        btnLimpa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lixo1.png"))); // NOI18N

        btnExit0.setFont(btnExit0.getFont().deriveFont(btnExit0.getFont().getStyle() | java.awt.Font.BOLD, 14));
        btnExit0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/exit.png"))); // NOI18N
        btnExit0.setMaximumSize(new java.awt.Dimension(40, 40));

        btnExit1.setFont(btnExit1.getFont().deriveFont(btnExit1.getFont().getStyle() | java.awt.Font.BOLD, 14));
        btnExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/exit1.png"))); // NOI18N
        btnExit1.setMaximumSize(new java.awt.Dimension(40, 40));

        btnSortear0.setFont(btnSortear0.getFont().deriveFont(btnSortear0.getFont().getStyle() | java.awt.Font.BOLD, 14));
        btnSortear0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSortear0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/embaralhar.png"))); // NOI18N
        btnSortear0.setText("SORTEAR");
        btnSortear0.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.lightGray));
        btnSortear0.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSortear0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSortear0MouseClicked(evt);
            }
        });

        btnSortear1.setFont(btnSortear1.getFont().deriveFont(btnSortear1.getFont().getStyle() | java.awt.Font.BOLD, 14));
        btnSortear1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSortear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/embaralhar1.png"))); // NOI18N
        btnSortear1.setText("SORTEAR");
        btnSortear1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.lightGray));
        btnSortear1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        head.setBackground(java.awt.Color.black);
        head.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headMouseDragged(evt);
            }
        });
        head.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headMousePressed(evt);
            }
        });

        title.setFont(title.getFont().deriveFont(title.getFont().getStyle() | java.awt.Font.BOLD, 14));
        title.setForeground(java.awt.Color.white);
        title.setText("SORTEADOR");

        btnExit.setFont(btnExit.getFont().deriveFont(btnExit.getFont().getStyle() | java.awt.Font.BOLD, 14));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/exit.png"))); // NOI18N
        btnExit.setToolTipText("Sair");
        btnExit.setMaximumSize(new java.awt.Dimension(40, 40));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout headLayout = new javax.swing.GroupLayout(head);
        head.setLayout(headLayout);
        headLayout.setHorizontalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headLayout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(title)
                .addGap(239, 239, 239)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headLayout.createSequentialGroup()
                .addGroup(headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(headLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(title)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 40));

        body.setBackground(java.awt.Color.white);
        body.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bodyMouseClicked(evt);
            }
        });
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaSorteados.setBackground(java.awt.Color.black);
        listaSorteados.setForeground(java.awt.Color.white);
        listaSorteados.setModel(new DefaultListModel<String>());
        listaSorteados.setFocusable(false);
        listaSorteados.setSelectionBackground(new java.awt.Color(204, 204, 204));
        listaSorteados.setVerifyInputWhenFocusTarget(false);
        listaSorteados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaSorteadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaSorteados);

        body.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 220, 100));

        lblListaSorteados.setFont(lblListaSorteados.getFont().deriveFont(lblListaSorteados.getFont().getStyle() | java.awt.Font.BOLD, 15));
        lblListaSorteados.setText("LISTA DE ITENS SORTEADOS:");
        body.add(lblListaSorteados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 220, 20));

        txtAdd.setBackground(java.awt.Color.black);
        txtAdd.setForeground(java.awt.Color.white);
        txtAdd.setCaretColor(new java.awt.Color(255, 255, 255));
        txtAdd.setMargin(new java.awt.Insets(1, 5, 1, 1));
        txtAdd.setName(""); // NOI18N
        txtAdd.setSelectionColor(new java.awt.Color(204, 204, 204));
        txtAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddKeyPressed(evt);
            }
        });
        body.add(txtAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 180, 30));

        panelqtdLista.setBackground(body.getBackground());
        panelqtdLista.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.lightGray));

        lblItensList.setFont(lblItensList.getFont().deriveFont(lblItensList.getFont().getStyle() | java.awt.Font.BOLD, 15));
        lblItensList.setText("ITENS DA LISTA");

        qtdSorteio.setFont(qtdSorteio.getFont().deriveFont(qtdSorteio.getFont().getStyle() | java.awt.Font.BOLD, 14));
        qtdSorteio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        qtdSorteio.setFocusable(false);

        javax.swing.GroupLayout panelqtdListaLayout = new javax.swing.GroupLayout(panelqtdLista);
        panelqtdLista.setLayout(panelqtdListaLayout);
        panelqtdListaLayout.setHorizontalGroup(
            panelqtdListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelqtdListaLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(qtdSorteio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblItensList)
                .addGap(6, 6, 6))
        );
        panelqtdListaLayout.setVerticalGroup(
            panelqtdListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelqtdListaLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panelqtdListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtdSorteio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItensList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        body.add(panelqtdLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 200, 40));

        jScrollPane2.setToolTipText("");

        listaItem.setBackground(java.awt.Color.black);
        listaItem.setForeground(java.awt.Color.white);
        listaItem.setModel(new DefaultListModel<String>());
        listaItem.setFocusable(false);
        listaItem.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(listaItem);

        body.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 344, 250));

        lblListaAserSorteada.setFont(lblListaAserSorteada.getFont().deriveFont(lblListaAserSorteada.getFont().getStyle() | java.awt.Font.BOLD, 15));
        lblListaAserSorteada.setText("LISTA A SER SORTEADA:");
        body.add(lblListaAserSorteada, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 340, 40));

        btnAdd.setFont(btnAdd.getFont().deriveFont(btnAdd.getFont().getStyle() | java.awt.Font.BOLD, 14));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add.png"))); // NOI18N
        btnAdd.setToolTipText("Adicionar item");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
        });
        body.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 30, 30));

        btnSortear.setBackground(new java.awt.Color(255, 255, 255));
        btnSortear.setFont(btnSortear.getFont().deriveFont(btnSortear.getFont().getStyle() | java.awt.Font.BOLD, 14));
        btnSortear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSortear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/embaralhar.png"))); // NOI18N
        btnSortear.setText("SORTEAR");
        btnSortear.setToolTipText("Sortear Itens");
        btnSortear.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.lightGray));
        btnSortear.setFocusable(false);
        btnSortear.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSortear.setOpaque(true);
        btnSortear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSortearMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSortearMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSortearMouseEntered(evt);
            }
        });
        body.add(btnSortear, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 130, 40));

        verificar.setBackground(body.getBackground());
        verificar.setText("VERIFICAR REPETIÇÃO");
        verificar.setToolTipText("Verificar se o primeiro item sorteado e igual a o primeiro item do sorteio anterior");
        verificar.setFocusable(false);
        body.add(verificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 180, -1));

        btnLimpa.setFont(btnLimpa.getFont().deriveFont(btnLimpa.getFont().getStyle() | java.awt.Font.BOLD, 14));
        btnLimpa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lixo.png"))); // NOI18N
        btnLimpa.setToolTipText("Limpar lista de itens");
        btnLimpa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpaMouseEntered(evt);
            }
        });
        body.add(btnLimpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 30, 30));

        btnRemove.setFont(btnRemove.getFont().deriveFont(btnRemove.getFont().getStyle() | java.awt.Font.BOLD, 14));
        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/remove.png"))); // NOI18N
        btnRemove.setToolTipText("Remover item selecionado");
        btnRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRemoveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRemoveMouseExited(evt);
            }
        });
        body.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 30, 30));

        btnLimpaSorteados.setFont(btnLimpaSorteados.getFont().deriveFont(btnLimpaSorteados.getFont().getStyle() | java.awt.Font.BOLD, 14));
        btnLimpaSorteados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lixo.png"))); // NOI18N
        btnLimpaSorteados.setToolTipText("Limpar lista de sorteados");
        btnLimpaSorteados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpaSorteadosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpaSorteadosMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpaSorteadosMouseEntered(evt);
            }
        });
        body.add(btnLimpaSorteados, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 30, 30));

        btnRemoveSorteados.setFont(btnRemoveSorteados.getFont().deriveFont(btnRemoveSorteados.getFont().getStyle() | java.awt.Font.BOLD, 14));
        btnRemoveSorteados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/remove.png"))); // NOI18N
        btnRemoveSorteados.setToolTipText("Remover item selecionado da lista sorteada");
        btnRemoveSorteados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoveSorteadosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRemoveSorteadosMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRemoveSorteadosMouseEntered(evt);
            }
        });
        body.add(btnRemoveSorteados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 30, 30));

        getContentPane().add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 38, 600, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void headMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMousePressed
        //pega a posição do mouse
        posFrameX = evt.getX();
        posFrameY = evt.getY();
    }//GEN-LAST:event_headMousePressed

    private void headMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMouseDragged
        //move a posição do frame de acordo com o valor das variaveis posFramX e posFrameY
        this.setLocation(this.getLocation().x + evt.getX() - posFrameX, this.getLocation().y + evt.getY() - posFrameY);
    }//GEN-LAST:event_headMouseDragged

    private void btnSortearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSortearMouseClicked
        if (listaItem.getModel().getSize() <= 1) {
            JOptionPane.showMessageDialog(null, "Por favor verifique se a lista tem mais de 1 elemento e tente novamente!");

        } else {
            JOptionPane.showMessageDialog(null, "Sorteio realizado com Sucesso!");
            Sort s = new Sort();
            DefaultListModel listModel = new DefaultListModel();
            ArrayList l = s.gera(0, listaItem.getModel().getSize() - 1); //gera uma lista de 1 ate o tamanho da lista de item
            l = s.sorted((int) qtdSorteio.getValue(), l); //sorteia uma lista de itens dependendo da quantidade escolhida

            //verificar se a lista e nula
            if (l.isEmpty()) {

            } else {
                if (verificar.isSelected() == true) {
                    //verifica se o primeiro elemento sorteado e igual o ultimo sorteado
                    while (ultimoSorteado == (int) l.get(0)) {
                        //se for igual ele gera uma nova lista e sorteia novamente até ser diferente
                        l = s.gera(0, listaItem.getModel().getSize() - 1);
                        l = s.sorted((int) qtdSorteio.getValue(), l);
                    }
                }

                ultimoSorteado = (int) l.get(0);//atualiza o valor do ultimo sorteado
                int t = l.size(); //pega o tamanho da lista de sorteados
                listModel.clear();//limpa o list model pra poder adicionar no jlistSorteados

                //percorre a lista de sorteados
                for (int i = 0; i < t; i++) {

                    listModel.addElement(listaItem.getModel().getElementAt((int) l.get(i))); //adiciona o elemento ao listmodel
                    listaSorteados.setModel(listModel);//seta o elemento no jlistSorteados
                }
            }
        }
        
        
        
    }//GEN-LAST:event_btnSortearMouseClicked

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        btnAdd.setIcon(btnAdd1.getIcon());
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        btnAdd.setIcon(btnAdd0.getIcon());
    }//GEN-LAST:event_btnAddMouseExited

    private void btnRemoveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveMouseEntered
        btnRemove.setIcon(btnRemove1.getIcon());
    }//GEN-LAST:event_btnRemoveMouseEntered

    private void btnRemoveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveMouseExited
        btnRemove.setIcon(btnRemove0.getIcon());
    }//GEN-LAST:event_btnRemoveMouseExited

    private void btnLimpaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpaMouseEntered
        btnLimpa.setIcon(btnLimpa1.getIcon());
    }//GEN-LAST:event_btnLimpaMouseEntered

    private void btnLimpaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpaMouseExited
        btnLimpa.setIcon(btnLimpa0.getIcon());
    }//GEN-LAST:event_btnLimpaMouseExited

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setIcon(btnExit1.getIcon());
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setIcon(btnExit0.getIcon());
    }//GEN-LAST:event_btnExitMouseExited

    private void btnSortear0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSortear0MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSortear0MouseClicked

    private void btnSortearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSortearMouseEntered
        btnSortear.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.GRAY, java.awt.Color.GRAY));
        btnSortear.setIcon(btnSortear1.getIcon());
        btnSortear.setForeground(Color.gray);
        btnSortear.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnSortearMouseEntered

    private void btnSortearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSortearMouseExited
        btnSortear.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.lightGray));
        btnSortear.setIcon(btnSortear0.getIcon());
        btnSortear.setForeground(Color.black);
        btnSortear.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnSortearMouseExited

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        if ("".equals(txtAdd.getText())) {
            JOptionPane.showMessageDialog(null, "Campo de texto vazio!");
        } else {

            DefaultListModel model = (DefaultListModel) listaItem.getModel();
            model.addElement(txtAdd.getText());
            listaItem.setModel(model);
            setaValorSpiner();
            txtAdd.setText("");
        }
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveMouseClicked
        try {
            DefaultListModel model = (DefaultListModel) listaItem.getModel();
            model.remove(listaItem.getSelectedIndex());
            listaItem.setModel(model);
            listaItem.clearSelection();
            setaValorSpiner();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnRemoveMouseClicked

    private void btnLimpaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpaMouseClicked
        DefaultListModel model = (DefaultListModel) listaItem.getModel();
        model.clear();
        listaItem.setModel(model);
        setaValorSpiner();
    }//GEN-LAST:event_btnLimpaMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void txtAddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if ("".equals(txtAdd.getText())) {
                JOptionPane.showMessageDialog(null, "Campo de texto vazio!");
            } else {

                DefaultListModel model = (DefaultListModel) listaItem.getModel();
                model.addElement(txtAdd.getText());
                listaItem.setModel(model);
                setaValorSpiner();
                txtAdd.setText("");
            }
        }
    }//GEN-LAST:event_txtAddKeyPressed

    private void btnRemoveSorteadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveSorteadosMouseClicked
        try {
            DefaultListModel model = (DefaultListModel) listaSorteados.getModel();
            model.remove(listaSorteados.getSelectedIndex());
            listaSorteados.setModel(model);
            listaSorteados.clearSelection();
            setaValorSpiner();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnRemoveSorteadosMouseClicked

    private void btnLimpaSorteadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpaSorteadosMouseClicked
        DefaultListModel model = (DefaultListModel) listaSorteados.getModel();
        model.clear();
        listaSorteados.setModel(model);
    }//GEN-LAST:event_btnLimpaSorteadosMouseClicked

    private void btnLimpaSorteadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpaSorteadosMouseEntered
        btnLimpaSorteados.setIcon(btnLimpa1.getIcon());
    }//GEN-LAST:event_btnLimpaSorteadosMouseEntered

    private void btnLimpaSorteadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpaSorteadosMouseExited
        btnLimpaSorteados.setIcon(btnLimpa0.getIcon());
    }//GEN-LAST:event_btnLimpaSorteadosMouseExited

    private void btnRemoveSorteadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveSorteadosMouseEntered
        btnRemoveSorteados.setIcon(btnRemove1.getIcon());
    }//GEN-LAST:event_btnRemoveSorteadosMouseEntered

    private void btnRemoveSorteadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveSorteadosMouseExited
        btnRemoveSorteados.setIcon(btnRemove0.getIcon());
    }//GEN-LAST:event_btnRemoveSorteadosMouseExited

    private void bodyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bodyMouseClicked
        listaItem.clearSelection();
        listaSorteados.clearSelection();
    }//GEN-LAST:event_bodyMouseClicked

    private void listaSorteadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaSorteadosMouseClicked
        try {
            DefaultListModel model = (DefaultListModel) listaSorteados.getModel();
            
            //Jogando o texto selecionado na lista sorteada para o ctrl V
            Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
            ClipboardOwner selection = new StringSelection(listaSorteados.getSelectedValue());
            board.setContents((Transferable) selection, selection);

            
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_listaSorteadosMouseClicked

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
                if ("Metal".equals(info.getName())) {
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
    private javax.swing.JPanel body;
    private javax.swing.JLabel btnAdd;
    private javax.swing.JLabel btnAdd0;
    private javax.swing.JLabel btnAdd1;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnExit0;
    private javax.swing.JLabel btnExit1;
    private javax.swing.JLabel btnLimpa;
    private javax.swing.JLabel btnLimpa0;
    private javax.swing.JLabel btnLimpa1;
    private javax.swing.JLabel btnLimpaSorteados;
    private javax.swing.JLabel btnRemove;
    private javax.swing.JLabel btnRemove0;
    private javax.swing.JLabel btnRemove1;
    private javax.swing.JLabel btnRemoveSorteados;
    private javax.swing.JLabel btnSortear;
    private javax.swing.JLabel btnSortear0;
    private javax.swing.JLabel btnSortear1;
    private javax.swing.JPanel head;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblItensList;
    private javax.swing.JLabel lblListaAserSorteada;
    private javax.swing.JLabel lblListaSorteados;
    private javax.swing.JList<String> listaItem;
    private javax.swing.JList<String> listaSorteados;
    private javax.swing.JPanel panelqtdLista;
    private javax.swing.JSpinner qtdSorteio;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtAdd;
    private javax.swing.JCheckBox verificar;
    // End of variables declaration//GEN-END:variables
}
