/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andres_masis_poo;

import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.util.LinkedList;
import andres_masis_poo.DatosApi;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Andrés
 */
public final class Interface extends javax.swing.JFrame {

   
    Items objeto = null;
    String procedencia = null;

    LinkedList<Items> todos_objetos = new LinkedList<>();

    // ARMA
    
     Armas weapon0;
     Armas weapon1;
     Armas weapon2;
     Armas weapon3;
     Armas weapon4;
     Armas weapon5;
     Armas weapon6;
     Armas weapon7;
     Armas weapon8;

    // ARMADURA

     Armadura armor0;
     Armadura armor1;
     Armadura armor2; 
     Armadura armor3; 
     Armadura armor4; 
     Armadura armor5; 
     Armadura armor6; 
     Armadura armor7; 

    // CONSUMIBLE

     Consumibles potion0; 
     Consumibles potion1; 
     Consumibles potion2; 

     
    // PERSONAJE
    Personaje character;

    /**
     * Creates new form Interface
     *
     * @throws java.io.IOException
     * @throws com.mashape.unirest.http.exceptions.UnirestException
     */
    public Interface() throws IOException, UnirestException {
    DatosApi pre = new DatosApi();
    pre.DatosApi2();
    
     this.weapon0 = new Armas(pre.listPrecio[0], "Armas", "Draktharr", 0, pre.listReviews[0], 0, 0, pre.listReviews[0]/3, pre.listReviews[0]/5);
     this.weapon1 = new Armas(pre.listPrecio[1], "Armas", "Filo", 0, pre.listReviews[1], 0, 0, pre.listReviews[1]/3, pre.listReviews[1]/5);
     this.weapon2 = new Armas(pre.listPrecio[2], "Armas", "Youmuu", 0, pre.listReviews[2], 0, pre.listReviews[2]/2, pre.listReviews[2]/3, 0);
     this.weapon3 = new Armas(pre.listPrecio[3], "Armas", "Statikk", 0, pre.listReviews[3], 0, 0, pre.listReviews[3]/3, pre.listReviews[3]/5);
     this.weapon4 = new Armas(pre.listPrecio[4], "Armas", "Guinsoo", 0, pre.listReviews[4], 0, 0, pre.listReviews[4]/3, pre.listReviews[4]/5);
     this.weapon5 = new Armas(pre.listPrecio[5], "Armas", "Espadón", 0, pre.listReviews[5], 0, 0, pre.listReviews[5]/3, 0);
     this.weapon6 = new Armas(pre.listPrecio[6], "Armas", "Rabadon", 0, pre.listReviews[6], 0, 0, pre.listReviews[6]/3, pre.listReviews[6]/5);
     this.weapon7 = new Armas(pre.listPrecio[7], "Armas", "Manamune", 0, pre.listReviews[7], 0, 0, pre.listReviews[7]/3, pre.listReviews[7]/5);
     this.weapon8 = new Armas(pre.listPrecio[8], "Armas", "Huracán", 0, pre.listReviews[8], 0, 0, pre.listReviews[8]/3, pre.listReviews[8]/5);
     
    // ARMADURA

     this.armor0 = new Armadura(pre.listPrecio[9], "Armadura", "Cotas", 0, 0, pre.listReviews[9], 0, pre.listReviews[9]/4, pre.listReviews[9]/10, "Chaleco con espinas");
     this.armor1 = new Armadura(pre.listPrecio[10], "Armadura", "Warmog", 0, 0, pre.listReviews[10], 0, pre.listReviews[10]/4, pre.listReviews[10]/10, "Chaleco grueso");
     this.armor2 = new Armadura(pre.listPrecio[11], "Armadura", "Caperuza", 0, 0, pre.listReviews[11], 0, pre.listReviews[11]/4, pre.listReviews[11]/10, "Casco de cuero");
     this.armor3 = new Armadura(pre.listPrecio[12], "Armadura", "Segahuesos", 0, 0, pre.listReviews[12], 0, pre.listReviews[12]/4, pre.listReviews[12]/10, "Casco de huesos");
     this.armor4 = new Armadura(pre.listPrecio[13], "Armadura", "Botas", 0, 0, pre.listReviews[13], 0, pre.listReviews[13]/4, pre.listReviews[13]/10, "Botas normales");
     this.armor5 = new Armadura(pre.listPrecio[14], "Armadura", "Escarpe", 0, 0, pre.listReviews[14], 0, pre.listReviews[14]/4, pre.listReviews[14]/10, "Botas de acero");
     this.armor6 = new Armadura(pre.listPrecio[15], "Armadura", "Leeroy ", 0, 0, pre.listReviews[15], 0, pre.listReviews[15]/4, pre.listReviews[15]/10, "Pantalon");
     this.armor7 = new Armadura(pre.listPrecio[16], "Armadura", "Jenkins", 0, 0, pre.listReviews[16], 0, pre.listReviews[16]/4, pre.listReviews[16]/10, "Pantalon");

    // CONSUMIBLE

     this.potion0 = new Consumibles(pre.listPrecio[17], "Consumibles", "Pocion pequeña", pre.listReviews[17]/3, 0, 0, 0, 0, 0);
     this.potion1 = new Consumibles(pre.listPrecio[18], "Consumibles", "Pocion mediana", pre.listReviews[18]*2, 0, 0, 0, 0, 0);
     this.potion2 = new Consumibles(pre.listPrecio[19], "Consumibles", "Pocion grande", pre.listReviews[19]*4, 0, 0, 0, 0, 0);

     this.character = new Personaje();
     
     this.cargarLista(); // la cargamos para setear los nombres
     
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icon.png"));
        return retValue;
    }   
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    // Pone botones en blanco o informacion segun sea el caso
    public void ocultarMostarBotones(Items objeto, JButton boton){
        if (objeto.cantidad_posee == 0){
            // No lo tiene
            boton.setText("");
        } else {
            // Si lo tiene
            
            // Revisa si esta equipado
            if(objeto.equipado){
                // Lo tiene equipado
                boton.setText("<" + objeto.categoria + "> " + objeto.nombre + "-Equipado" + "["+ objeto.cantidad_posee +"]");
            } else {
                boton.setText("<" + objeto.categoria + "> " + objeto.nombre + "-Desequipado" + "["+ objeto.cantidad_posee +"]");
            }
        }
        
    }    
    
    
    
    // Actualiza los datos que se le presentan al usuario
    public void refresh() {
        // Actualizar JLabels
        //Stats
        JLabelAtaque.setText("Ataque " + character.ataque);
        JLabelDefensa.setText("Defensa " + character.defensa);
        JLabelVelocidad.setText("Velocidad " + character.velocidad);
        JLabelVida.setText("Vida " + character.vida);
        JLabelEstilo.setText("Estilo " + character.estilo);
        JLabelMagia.setText("Magia " + character.magia);
        //Dinero
        JLabelDinero.setText("" + character.dinero);
        
        
        // Actualizar botones de Inventario
        this.ocultarMostarBotones(todos_objetos.get(0), JButtonInventario1);
        this.ocultarMostarBotones(todos_objetos.get(1), JButtonInventario2);
        this.ocultarMostarBotones(todos_objetos.get(2), JButtonInventario3);
        this.ocultarMostarBotones(todos_objetos.get(3), JButtonInventario4);
        this.ocultarMostarBotones(todos_objetos.get(4), JButtonInventario5);
        this.ocultarMostarBotones(todos_objetos.get(5), JButtonInventario6);
        this.ocultarMostarBotones(todos_objetos.get(6), JButtonInventario7);
        this.ocultarMostarBotones(todos_objetos.get(7), JButtonInventario8);
        this.ocultarMostarBotones(todos_objetos.get(8), JButtonInventario9);
        this.ocultarMostarBotones(todos_objetos.get(9), JButtonInventario10);
        this.ocultarMostarBotones(todos_objetos.get(10), JButtonInventario11);
        this.ocultarMostarBotones(todos_objetos.get(11), JButtonInventario12);
        this.ocultarMostarBotones(todos_objetos.get(12), JButtonInventario13);
        this.ocultarMostarBotones(todos_objetos.get(13), JButtonInventario14);
        this.ocultarMostarBotones(todos_objetos.get(14), JButtonInventario15);
        this.ocultarMostarBotones(todos_objetos.get(15), JButtonInventario16);
        this.ocultarMostarBotones(todos_objetos.get(16), JButtonInventario17);
        this.ocultarMostarBotones(todos_objetos.get(17), JButtonInventario18);
        this.ocultarMostarBotones(todos_objetos.get(18), JButtonInventario19);
        this.ocultarMostarBotones(todos_objetos.get(19), JButtonInventario20);
    }

    public void preview(Items objeto, Personaje character) {
        
        JLabelAtaque.setText("Ataque " + character.ataque + " + " + objeto.ataque);
        JLabelDefensa.setText("Defensa " + character.defensa + " + " + objeto.defensa);
        JLabelVelocidad.setText("Velocidad " + character.velocidad + " + " + objeto.vida);
        JLabelVida.setText("Vida " + character.vida + " + " + objeto.velocidad);
        JLabelEstilo.setText("Estilo " + character.estilo + " + " + objeto.estilo);
        JLabelMagia.setText("Magia " + character.magia + " + " + objeto.magia);
        
    }

    public void cargarLista() {
    todos_objetos.add(weapon0);
    todos_objetos.add(weapon1);
    todos_objetos.add(weapon2);
    todos_objetos.add(weapon3);
    todos_objetos.add(weapon4);
    todos_objetos.add(weapon5);
    todos_objetos.add(weapon6);
    todos_objetos.add(weapon7);
    todos_objetos.add(weapon8);

    todos_objetos.add(armor0);
    todos_objetos.add(armor1);
    todos_objetos.add(armor2);
    todos_objetos.add(armor3);
    todos_objetos.add(armor4);
    todos_objetos.add(armor5);
    todos_objetos.add(armor6);
    todos_objetos.add(armor7);       

    todos_objetos.add(potion0);
    todos_objetos.add(potion1);
    todos_objetos.add(potion2);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/fondo_tienda.png"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        JButtonSalir = new javax.swing.JButton();
        JButtonDesequipar = new javax.swing.JButton();
        JButtonEquipar = new javax.swing.JButton();
        JButtonVender = new javax.swing.JButton();
        JButtonComprar = new javax.swing.JButton();
        JPanelTituloTienda = new javax.swing.JPanel();
        JLabelTituloTienda = new javax.swing.JLabel();
        JPanelTituloInventario = new javax.swing.JPanel();
        JLabelTituloInventario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JPanelTienda = new javax.swing.JPanel();
        JButtonTienda1 = new javax.swing.JButton();
        JButtonTienda2 = new javax.swing.JButton();
        JButtomTienda3 = new javax.swing.JButton();
        JButtonTienda4 = new javax.swing.JButton();
        JButtonTienda5 = new javax.swing.JButton();
        JButtonTienda6 = new javax.swing.JButton();
        JButtonTienda7 = new javax.swing.JButton();
        JButtonTienda8 = new javax.swing.JButton();
        JButtonTienda9 = new javax.swing.JButton();
        JButtonTienda10 = new javax.swing.JButton();
        JButtonTienda11 = new javax.swing.JButton();
        JButtonTienda12 = new javax.swing.JButton();
        JButtonTienda13 = new javax.swing.JButton();
        JButtonTienda14 = new javax.swing.JButton();
        JButtonTienda15 = new javax.swing.JButton();
        JButtonTienda16 = new javax.swing.JButton();
        JButtonTienda17 = new javax.swing.JButton();
        JButtonTienda18 = new javax.swing.JButton();
        JButtonTienda19 = new javax.swing.JButton();
        JButtonTienda20 = new javax.swing.JButton();
        JPanelStats = new javax.swing.JPanel();
        JLabelTituloStats = new javax.swing.JLabel();
        JLabelAtaque = new javax.swing.JLabel();
        JLabelDefensa = new javax.swing.JLabel();
        JLabelVida = new javax.swing.JLabel();
        JLabelVelocidad = new javax.swing.JLabel();
        JLabelEstilo = new javax.swing.JLabel();
        JLabelMagia = new javax.swing.JLabel();
        jlabel_img_ataque = new javax.swing.JLabel();
        jlabel_img_defensa = new javax.swing.JLabel();
        jlabel_img_vida = new javax.swing.JLabel();
        jlabel_img_velocidad = new javax.swing.JLabel();
        jlabel_img_estilo = new javax.swing.JLabel();
        jlabel_img_magia = new javax.swing.JLabel();
        JLabelCoins = new javax.swing.JLabel();
        JLabelDinero = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JPanelInventario = new javax.swing.JPanel();
        JButtonInventario1 = new javax.swing.JButton();
        JButtonInventario2 = new javax.swing.JButton();
        JButtonInventario3 = new javax.swing.JButton();
        JButtonInventario4 = new javax.swing.JButton();
        JButtonInventario5 = new javax.swing.JButton();
        JButtonInventario6 = new javax.swing.JButton();
        JButtonInventario7 = new javax.swing.JButton();
        JButtonInventario8 = new javax.swing.JButton();
        JButtonInventario9 = new javax.swing.JButton();
        JButtonInventario10 = new javax.swing.JButton();
        JButtonInventario11 = new javax.swing.JButton();
        JButtonInventario12 = new javax.swing.JButton();
        JButtonInventario13 = new javax.swing.JButton();
        JButtonInventario14 = new javax.swing.JButton();
        JButtonInventario15 = new javax.swing.JButton();
        JButtonInventario16 = new javax.swing.JButton();
        JButtonInventario17 = new javax.swing.JButton();
        JButtonInventario18 = new javax.swing.JButton();
        JButtonInventario19 = new javax.swing.JButton();
        JButtonInventario20 = new javax.swing.JButton();
        jlabel_paquito = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        JButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_salir_0.png"))); // NOI18N
        JButtonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_salir_1.png"))); // NOI18N
        JButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalirActionPerformed(evt);
            }
        });

        JButtonDesequipar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_desequipar.png"))); // NOI18N
        JButtonDesequipar.setContentAreaFilled(false);
        JButtonDesequipar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonDesequipar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_desequipar_1.png"))); // NOI18N
        JButtonDesequipar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonDesequiparActionPerformed(evt);
            }
        });

        JButtonEquipar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_equipar.png"))); // NOI18N
        JButtonEquipar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonEquipar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_equipar_1.png"))); // NOI18N
        JButtonEquipar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonEquiparActionPerformed(evt);
            }
        });

        JButtonVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_vender_0.png"))); // NOI18N
        JButtonVender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonVender.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_vender_1.png"))); // NOI18N
        JButtonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonVenderActionPerformed(evt);
            }
        });

        JButtonComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_comprar.png"))); // NOI18N
        JButtonComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonComprar.setDisabledIcon(null);
        JButtonComprar.setDisabledSelectedIcon(null);
        JButtonComprar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_equipar_1.png"))); // NOI18N
        JButtonComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButtonComprarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JButtonComprarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonComprarMouseReleased(evt);
            }
        });
        JButtonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonComprarActionPerformed(evt);
            }
        });

        JPanelTituloTienda.setBackground(new java.awt.Color(18, 28, 23));

        JLabelTituloTienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/titulo_tienda.png"))); // NOI18N

        javax.swing.GroupLayout JPanelTituloTiendaLayout = new javax.swing.GroupLayout(JPanelTituloTienda);
        JPanelTituloTienda.setLayout(JPanelTituloTiendaLayout);
        JPanelTituloTiendaLayout.setHorizontalGroup(
            JPanelTituloTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelTituloTiendaLayout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(JLabelTituloTienda)
                .addGap(121, 121, 121))
        );
        JPanelTituloTiendaLayout.setVerticalGroup(
            JPanelTituloTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelTituloTienda, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        JPanelTituloInventario.setBackground(new java.awt.Color(18, 28, 23));

        JLabelTituloInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/titulo_Inventario.png"))); // NOI18N

        javax.swing.GroupLayout JPanelTituloInventarioLayout = new javax.swing.GroupLayout(JPanelTituloInventario);
        JPanelTituloInventario.setLayout(JPanelTituloInventarioLayout);
        JPanelTituloInventarioLayout.setHorizontalGroup(
            JPanelTituloInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelTituloInventarioLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(JLabelTituloInventario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelTituloInventarioLayout.setVerticalGroup(
            JPanelTituloInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelTituloInventarioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JLabelTituloInventario))
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        JPanelTienda.setBackground(new java.awt.Color(0, 0, 51));

        JButtonTienda1.setBackground(new java.awt.Color(29, 70, 252));
        JButtonTienda1.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonTienda1.setForeground(new java.awt.Color(255, 255, 255));
        JButtonTienda1.setText((todos_objetos.get(0)).nombre + "  $ " + (todos_objetos.get(0)).precio);
        JButtonTienda1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonTienda1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonTienda1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusLost(evt);
            }
        });
        JButtonTienda1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JButtonTienda1MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonTienda1MouseReleased(evt);
            }
        });
        JButtonTienda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonTienda1ActionPerformed(evt);
            }
        });

        JButtonTienda2.setBackground(new java.awt.Color(29, 70, 252));
        JButtonTienda2.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonTienda2.setForeground(new java.awt.Color(255, 255, 255));
        JButtonTienda2.setText((todos_objetos.get(1)).nombre + "  $ " + (todos_objetos.get(1)).precio);
        JButtonTienda2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonTienda2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonTienda2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusLost(evt);
            }
        });
        JButtonTienda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonTienda2ActionPerformed(evt);
            }
        });

        JButtomTienda3.setBackground(new java.awt.Color(29, 70, 252));
        JButtomTienda3.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtomTienda3.setForeground(new java.awt.Color(255, 255, 255));
        JButtomTienda3.setText((todos_objetos.get(2)).nombre + "  $ " + (todos_objetos.get(2)).precio);
        JButtomTienda3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtomTienda3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtomTienda3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusLost(evt);
            }
        });
        JButtomTienda3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtomTienda3ActionPerformed(evt);
            }
        });

        JButtonTienda4.setBackground(new java.awt.Color(29, 70, 252));
        JButtonTienda4.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonTienda4.setForeground(new java.awt.Color(255, 255, 255));
        JButtonTienda4.setMnemonic('[');
        JButtonTienda4.setText((todos_objetos.get(3)).nombre + "  $ " + (todos_objetos.get(3)).precio);
        JButtonTienda4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonTienda4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonTienda4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusLost(evt);
            }
        });
        JButtonTienda4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonTienda4ActionPerformed(evt);
            }
        });

        JButtonTienda5.setBackground(new java.awt.Color(29, 70, 252));
        JButtonTienda5.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonTienda5.setForeground(new java.awt.Color(255, 255, 255));
        JButtonTienda5.setMnemonic('[');
        JButtonTienda5.setText((todos_objetos.get(4)).nombre + "  $ " + (todos_objetos.get(4)).precio);
        JButtonTienda5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonTienda5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonTienda5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusLost(evt);
            }
        });
        JButtonTienda5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonTienda5ActionPerformed(evt);
            }
        });

        JButtonTienda6.setBackground(new java.awt.Color(29, 70, 252));
        JButtonTienda6.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonTienda6.setForeground(new java.awt.Color(255, 255, 255));
        JButtonTienda6.setMnemonic('[');
        JButtonTienda6.setText((todos_objetos.get(5)).nombre + "  $ " + (todos_objetos.get(5)).precio);
        JButtonTienda6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonTienda6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonTienda6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusLost(evt);
            }
        });
        JButtonTienda6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonTienda6ActionPerformed(evt);
            }
        });

        JButtonTienda7.setBackground(new java.awt.Color(29, 70, 252));
        JButtonTienda7.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonTienda7.setForeground(new java.awt.Color(255, 255, 255));
        JButtonTienda7.setMnemonic('[');
        JButtonTienda7.setText((todos_objetos.get(6)).nombre + "  $ " + (todos_objetos.get(6)).precio);
        JButtonTienda7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonTienda7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonTienda7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusLost(evt);
            }
        });
        JButtonTienda7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonTienda7ActionPerformed(evt);
            }
        });

        JButtonTienda8.setBackground(new java.awt.Color(29, 70, 252));
        JButtonTienda8.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonTienda8.setForeground(new java.awt.Color(255, 255, 255));
        JButtonTienda8.setMnemonic('[');
        JButtonTienda8.setText((todos_objetos.get(7)).nombre + "  $ " + (todos_objetos.get(7)).precio);
        JButtonTienda8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonTienda8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonTienda8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusLost(evt);
            }
        });
        JButtonTienda8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonTienda8ActionPerformed(evt);
            }
        });

        JButtonTienda9.setBackground(new java.awt.Color(29, 70, 252));
        JButtonTienda9.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonTienda9.setForeground(new java.awt.Color(255, 255, 255));
        JButtonTienda9.setMnemonic('[');
        JButtonTienda9.setText((todos_objetos.get(8)).nombre + "  $ " + (todos_objetos.get(8)).precio);
        JButtonTienda9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonTienda9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonTienda9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusLost(evt);
            }
        });
        JButtonTienda9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonTienda9ActionPerformed(evt);
            }
        });

        JButtonTienda10.setBackground(new java.awt.Color(29, 70, 252));
        JButtonTienda10.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonTienda10.setForeground(new java.awt.Color(255, 255, 255));
        JButtonTienda10.setMnemonic('[');
        JButtonTienda10.setText((todos_objetos.get(9)).nombre + "  $ " + (todos_objetos.get(9)).precio);
        JButtonTienda10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonTienda10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonTienda10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusLost(evt);
            }
        });
        JButtonTienda10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonTienda10ActionPerformed(evt);
            }
        });

        JButtonTienda11.setBackground(new java.awt.Color(29, 70, 252));
        JButtonTienda11.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonTienda11.setForeground(new java.awt.Color(255, 255, 255));
        JButtonTienda11.setMnemonic('[');
        JButtonTienda11.setText((todos_objetos.get(10)).nombre + "  $ " + (todos_objetos.get(10)).precio);
        JButtonTienda11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonTienda11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonTienda11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusLost(evt);
            }
        });
        JButtonTienda11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonTienda11ActionPerformed(evt);
            }
        });

        JButtonTienda12.setBackground(new java.awt.Color(29, 70, 252));
        JButtonTienda12.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonTienda12.setForeground(new java.awt.Color(255, 255, 255));
        JButtonTienda12.setMnemonic('[');
        JButtonTienda12.setText((todos_objetos.get(11)).nombre + "  $ " + (todos_objetos.get(11)).precio);
        JButtonTienda12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonTienda12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonTienda12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusLost(evt);
            }
        });
        JButtonTienda12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonTienda12ActionPerformed(evt);
            }
        });

        JButtonTienda13.setBackground(new java.awt.Color(29, 70, 252));
        JButtonTienda13.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonTienda13.setForeground(new java.awt.Color(255, 255, 255));
        JButtonTienda13.setMnemonic('[');
        JButtonTienda13.setText((todos_objetos.get(12)).nombre + "  $ " + (todos_objetos.get(12)).precio);
        JButtonTienda13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonTienda13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonTienda13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusLost(evt);
            }
        });
        JButtonTienda13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonTienda13ActionPerformed(evt);
            }
        });

        JButtonTienda14.setBackground(new java.awt.Color(29, 70, 252));
        JButtonTienda14.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonTienda14.setForeground(new java.awt.Color(255, 255, 255));
        JButtonTienda14.setMnemonic('[');
        JButtonTienda14.setText((todos_objetos.get(13)).nombre + "  $ " + (todos_objetos.get(13)).precio);
        JButtonTienda14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonTienda14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonTienda14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusLost(evt);
            }
        });
        JButtonTienda14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonTienda14ActionPerformed(evt);
            }
        });

        JButtonTienda15.setBackground(new java.awt.Color(29, 70, 252));
        JButtonTienda15.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonTienda15.setForeground(new java.awt.Color(255, 255, 255));
        JButtonTienda15.setMnemonic('[');
        JButtonTienda15.setText((todos_objetos.get(14)).nombre + "  $ " + (todos_objetos.get(14)).precio);
        JButtonTienda15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonTienda15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonTienda15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusLost(evt);
            }
        });
        JButtonTienda15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonTienda15ActionPerformed(evt);
            }
        });

        JButtonTienda16.setBackground(new java.awt.Color(29, 70, 252));
        JButtonTienda16.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonTienda16.setForeground(new java.awt.Color(255, 255, 255));
        JButtonTienda16.setMnemonic('[');
        JButtonTienda16.setText((todos_objetos.get(15)).nombre + "  $ " + (todos_objetos.get(15)).precio);
        JButtonTienda16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonTienda16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonTienda16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusLost(evt);
            }
        });
        JButtonTienda16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonTienda16ActionPerformed(evt);
            }
        });

        JButtonTienda17.setBackground(new java.awt.Color(29, 70, 252));
        JButtonTienda17.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonTienda17.setForeground(new java.awt.Color(255, 255, 255));
        JButtonTienda17.setMnemonic('[');
        JButtonTienda17.setText((todos_objetos.get(16)).nombre + "  $ " + (todos_objetos.get(16)).precio);
        JButtonTienda17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonTienda17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonTienda17.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusLost(evt);
            }
        });
        JButtonTienda17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonTienda17ActionPerformed(evt);
            }
        });

        JButtonTienda18.setBackground(new java.awt.Color(29, 70, 252));
        JButtonTienda18.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonTienda18.setForeground(new java.awt.Color(255, 255, 255));
        JButtonTienda18.setMnemonic('[');
        JButtonTienda18.setText((todos_objetos.get(17)).nombre + "  $ " + (todos_objetos.get(17)).precio);
        JButtonTienda18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonTienda18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonTienda18.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusLost(evt);
            }
        });
        JButtonTienda18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonTienda18ActionPerformed(evt);
            }
        });

        JButtonTienda19.setBackground(new java.awt.Color(29, 70, 252));
        JButtonTienda19.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonTienda19.setForeground(new java.awt.Color(255, 255, 255));
        JButtonTienda19.setMnemonic('[');
        JButtonTienda19.setText((todos_objetos.get(18)).nombre + "  $ " + (todos_objetos.get(18)).precio);
        JButtonTienda19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonTienda19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonTienda19.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusLost(evt);
            }
        });
        JButtonTienda19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonTienda19ActionPerformed(evt);
            }
        });

        JButtonTienda20.setBackground(new java.awt.Color(29, 70, 252));
        JButtonTienda20.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonTienda20.setForeground(new java.awt.Color(255, 255, 255));
        JButtonTienda20.setMnemonic('[');
        JButtonTienda20.setText((todos_objetos.get(19)).nombre + "  $ " + (todos_objetos.get(19)).precio);
        JButtonTienda20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonTienda20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonTienda20.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JButtonTienda1FocusLost(evt);
            }
        });
        JButtonTienda20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonTienda20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelTiendaLayout = new javax.swing.GroupLayout(JPanelTienda);
        JPanelTienda.setLayout(JPanelTiendaLayout);
        JPanelTiendaLayout.setHorizontalGroup(
            JPanelTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelTiendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JButtonTienda20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonTienda19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonTienda18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonTienda17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonTienda16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonTienda15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonTienda14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonTienda13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonTienda8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonTienda7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonTienda6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonTienda1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonTienda2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtomTienda3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonTienda5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonTienda4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonTienda9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonTienda10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonTienda11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonTienda12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JPanelTiendaLayout.setVerticalGroup(
            JPanelTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelTiendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JButtonTienda1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonTienda2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtomTienda3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonTienda4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonTienda5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonTienda6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonTienda7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonTienda8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonTienda9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonTienda10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonTienda11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonTienda12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonTienda13, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonTienda14, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonTienda15, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonTienda16, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonTienda17, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonTienda18, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonTienda19, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonTienda20, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(JPanelTienda);

        JPanelStats.setBackground(new java.awt.Color(0, 0, 51));
        JPanelStats.setBorder(javax.swing.BorderFactory.createMatteBorder(6, 6, 6, 6, new java.awt.Color(51, 51, 51)));

        JLabelTituloStats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/titulo_stats.png"))); // NOI18N

        JLabelAtaque.setBackground(new java.awt.Color(51, 135, 255));
        JLabelAtaque.setFont(new java.awt.Font("Old English Text MT", 0, 24)); // NOI18N
        JLabelAtaque.setForeground(new java.awt.Color(255, 255, 255));
        JLabelAtaque.setText("Ataque 10.0");
        JLabelAtaque.setOpaque(true);

        JLabelDefensa.setBackground(new java.awt.Color(51, 135, 255));
        JLabelDefensa.setFont(new java.awt.Font("Old English Text MT", 0, 24)); // NOI18N
        JLabelDefensa.setForeground(new java.awt.Color(255, 255, 255));
        JLabelDefensa.setText("Defensa 10.0");
        JLabelDefensa.setOpaque(true);

        JLabelVida.setBackground(new java.awt.Color(51, 135, 255));
        JLabelVida.setFont(new java.awt.Font("Old English Text MT", 0, 24)); // NOI18N
        JLabelVida.setForeground(new java.awt.Color(255, 255, 255));
        JLabelVida.setText("Vida 100.0");
        JLabelVida.setOpaque(true);

        JLabelVelocidad.setBackground(new java.awt.Color(51, 135, 255));
        JLabelVelocidad.setFont(new java.awt.Font("Old English Text MT", 0, 24)); // NOI18N
        JLabelVelocidad.setForeground(new java.awt.Color(255, 255, 255));
        JLabelVelocidad.setText(" Velocidad 15.0");
        JLabelVelocidad.setOpaque(true);

        JLabelEstilo.setBackground(new java.awt.Color(51, 135, 255));
        JLabelEstilo.setFont(new java.awt.Font("Old English Text MT", 0, 24)); // NOI18N
        JLabelEstilo.setForeground(new java.awt.Color(255, 255, 255));
        JLabelEstilo.setText("Estilo 5.0");
        JLabelEstilo.setOpaque(true);

        JLabelMagia.setBackground(new java.awt.Color(51, 135, 255));
        JLabelMagia.setFont(new java.awt.Font("Old English Text MT", 0, 24)); // NOI18N
        JLabelMagia.setForeground(new java.awt.Color(255, 255, 255));
        JLabelMagia.setText("Magia 3.0");
        JLabelMagia.setOpaque(true);

        jlabel_img_ataque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/espada_ataque.png"))); // NOI18N

        jlabel_img_defensa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/defensa_escudo.png"))); // NOI18N

        jlabel_img_vida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vida_rubi.png"))); // NOI18N

        jlabel_img_velocidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/velocidad_bota.png"))); // NOI18N

        jlabel_img_estilo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/look_apariencia.png"))); // NOI18N

        jlabel_img_magia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/magia_baston.png"))); // NOI18N

        javax.swing.GroupLayout JPanelStatsLayout = new javax.swing.GroupLayout(JPanelStats);
        JPanelStats.setLayout(JPanelStatsLayout);
        JPanelStatsLayout.setHorizontalGroup(
            JPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelStatsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLabelMagia, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabelEstilo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabelVelocidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabelVida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabelDefensa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPanelStatsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JLabelTituloStats)
                        .addGap(19, 19, 19))
                    .addComponent(JLabelAtaque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlabel_img_ataque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlabel_img_defensa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlabel_img_vida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlabel_img_velocidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlabel_img_estilo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlabel_img_magia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        JPanelStatsLayout.setVerticalGroup(
            JPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelStatsLayout.createSequentialGroup()
                .addComponent(JLabelTituloStats)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlabel_img_ataque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLabelAtaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(JPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlabel_img_defensa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLabelDefensa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(JPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlabel_img_vida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLabelVida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(JPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlabel_img_velocidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLabelVelocidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(JPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlabel_img_estilo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLabelEstilo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(JPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlabel_img_magia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLabelMagia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        JLabelCoins.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/monedas_oro.png"))); // NOI18N

        JLabelDinero.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        JLabelDinero.setForeground(new java.awt.Color(255, 255, 255));
        JLabelDinero.setText("3500.0");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(440, 510));

        JPanelInventario.setBackground(new java.awt.Color(0, 0, 51));

        JButtonInventario1.setBackground(new java.awt.Color(29, 70, 252));
        JButtonInventario1.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonInventario1.setForeground(new java.awt.Color(255, 255, 255));
        JButtonInventario1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonInventario1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonInventario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInventario1ActionPerformed(evt);
            }
        });

        JButtonInventario2.setBackground(new java.awt.Color(29, 70, 252));
        JButtonInventario2.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonInventario2.setForeground(new java.awt.Color(255, 255, 255));
        JButtonInventario2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonInventario2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonInventario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInventario2ActionPerformed(evt);
            }
        });

        JButtonInventario3.setBackground(new java.awt.Color(29, 70, 252));
        JButtonInventario3.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonInventario3.setForeground(new java.awt.Color(255, 255, 255));
        JButtonInventario3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonInventario3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonInventario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInventario3ActionPerformed(evt);
            }
        });

        JButtonInventario4.setBackground(new java.awt.Color(29, 70, 252));
        JButtonInventario4.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonInventario4.setForeground(new java.awt.Color(255, 255, 255));
        JButtonInventario4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonInventario4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonInventario4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInventario4ActionPerformed(evt);
            }
        });

        JButtonInventario5.setBackground(new java.awt.Color(29, 70, 252));
        JButtonInventario5.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonInventario5.setForeground(new java.awt.Color(255, 255, 255));
        JButtonInventario5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonInventario5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonInventario5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInventario5ActionPerformed(evt);
            }
        });

        JButtonInventario6.setBackground(new java.awt.Color(29, 70, 252));
        JButtonInventario6.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonInventario6.setForeground(new java.awt.Color(255, 255, 255));
        JButtonInventario6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonInventario6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonInventario6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInventario6ActionPerformed(evt);
            }
        });

        JButtonInventario7.setBackground(new java.awt.Color(29, 70, 252));
        JButtonInventario7.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonInventario7.setForeground(new java.awt.Color(255, 255, 255));
        JButtonInventario7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonInventario7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonInventario7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInventario7ActionPerformed(evt);
            }
        });

        JButtonInventario8.setBackground(new java.awt.Color(29, 70, 252));
        JButtonInventario8.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonInventario8.setForeground(new java.awt.Color(255, 255, 255));
        JButtonInventario8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonInventario8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonInventario8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInventario8ActionPerformed(evt);
            }
        });

        JButtonInventario9.setBackground(new java.awt.Color(29, 70, 252));
        JButtonInventario9.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonInventario9.setForeground(new java.awt.Color(255, 255, 255));
        JButtonInventario9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonInventario9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonInventario9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInventario9ActionPerformed(evt);
            }
        });

        JButtonInventario10.setBackground(new java.awt.Color(29, 70, 252));
        JButtonInventario10.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonInventario10.setForeground(new java.awt.Color(255, 255, 255));
        JButtonInventario10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonInventario10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonInventario10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInventario10ActionPerformed(evt);
            }
        });

        JButtonInventario11.setBackground(new java.awt.Color(29, 70, 252));
        JButtonInventario11.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonInventario11.setForeground(new java.awt.Color(255, 255, 255));
        JButtonInventario11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonInventario11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonInventario11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInventario11ActionPerformed(evt);
            }
        });

        JButtonInventario12.setBackground(new java.awt.Color(29, 70, 252));
        JButtonInventario12.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonInventario12.setForeground(new java.awt.Color(255, 255, 255));
        JButtonInventario12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonInventario12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonInventario12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInventario12ActionPerformed(evt);
            }
        });

        JButtonInventario13.setBackground(new java.awt.Color(29, 70, 252));
        JButtonInventario13.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonInventario13.setForeground(new java.awt.Color(255, 255, 255));
        JButtonInventario13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonInventario13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonInventario13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInventario13ActionPerformed(evt);
            }
        });

        JButtonInventario14.setBackground(new java.awt.Color(29, 70, 252));
        JButtonInventario14.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonInventario14.setForeground(new java.awt.Color(255, 255, 255));
        JButtonInventario14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonInventario14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonInventario14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInventario14ActionPerformed(evt);
            }
        });

        JButtonInventario15.setBackground(new java.awt.Color(29, 70, 252));
        JButtonInventario15.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonInventario15.setForeground(new java.awt.Color(255, 255, 255));
        JButtonInventario15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonInventario15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonInventario15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInventario15ActionPerformed(evt);
            }
        });

        JButtonInventario16.setBackground(new java.awt.Color(29, 70, 252));
        JButtonInventario16.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonInventario16.setForeground(new java.awt.Color(255, 255, 255));
        JButtonInventario16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonInventario16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonInventario16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInventario16ActionPerformed(evt);
            }
        });

        JButtonInventario17.setBackground(new java.awt.Color(29, 70, 252));
        JButtonInventario17.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonInventario17.setForeground(new java.awt.Color(255, 255, 255));
        JButtonInventario17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonInventario17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonInventario17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInventario17ActionPerformed(evt);
            }
        });

        JButtonInventario18.setBackground(new java.awt.Color(29, 70, 252));
        JButtonInventario18.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonInventario18.setForeground(new java.awt.Color(255, 255, 255));
        JButtonInventario18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonInventario18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonInventario18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInventario18ActionPerformed(evt);
            }
        });

        JButtonInventario19.setBackground(new java.awt.Color(29, 70, 252));
        JButtonInventario19.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonInventario19.setForeground(new java.awt.Color(255, 255, 255));
        JButtonInventario19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonInventario19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonInventario19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInventario19ActionPerformed(evt);
            }
        });

        JButtonInventario20.setBackground(new java.awt.Color(29, 70, 252));
        JButtonInventario20.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        JButtonInventario20.setForeground(new java.awt.Color(255, 255, 255));
        JButtonInventario20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonInventario20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButtonInventario20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInventario20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelInventarioLayout = new javax.swing.GroupLayout(JPanelInventario);
        JPanelInventario.setLayout(JPanelInventarioLayout);
        JPanelInventarioLayout.setHorizontalGroup(
            JPanelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JButtonInventario20, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(JButtonInventario18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonInventario17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonInventario15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonInventario13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonInventario11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonInventario10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonInventario9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonInventario8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonInventario7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonInventario6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonInventario4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonInventario1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(JButtonInventario2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonInventario3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonInventario5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonInventario12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonInventario14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonInventario16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonInventario19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelInventarioLayout.setVerticalGroup(
            JPanelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JButtonInventario1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonInventario2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonInventario3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonInventario4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonInventario5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonInventario6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonInventario7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonInventario8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonInventario9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonInventario10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonInventario11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonInventario12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonInventario13, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonInventario14, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonInventario15, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonInventario16, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonInventario17, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonInventario18, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonInventario19, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButtonInventario20, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(JPanelInventario);

        jlabel_paquito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/paquito.png"))); // NOI18N

        jDesktopPane1.setLayer(JButtonSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JButtonDesequipar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JButtonEquipar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JButtonVender, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JButtonComprar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JPanelTituloTienda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JPanelTituloInventario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JPanelStats, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JLabelCoins, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JLabelDinero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlabel_paquito, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(JButtonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JButtonVender, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JButtonEquipar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JButtonDesequipar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jlabel_paquito, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JPanelTituloTienda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JPanelTituloInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JLabelDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JLabelCoins)
                                .addGap(24, 24, 24))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(JPanelStats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(7, 7, 7)))))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JButtonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JButtonEquipar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JButtonDesequipar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JButtonVender, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlabel_paquito, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(JPanelTituloTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JPanelTituloInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLabelDinero))
                    .addComponent(JLabelCoins))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JPanelStats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void JButtonInventario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInventario3ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(2);

        if (objeto.cantidad_posee == 0){
            // No hay nada entonces no se pasa nada
            objeto = null;

        }else {
            // Se indica de donde viene
            procedencia = "inventario";
        }
    }//GEN-LAST:event_JButtonInventario3ActionPerformed

    private void JButtonInventario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInventario2ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(1);

        if (objeto.cantidad_posee == 0){
            // No hay nada entonces no se pasa nada
            objeto = null;

        }else {
            // Se indica de donde viene
            procedencia = "inventario";
        }
    }//GEN-LAST:event_JButtonInventario2ActionPerformed

    private void JButtonInventario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInventario1ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(0);

        if (objeto.cantidad_posee == 0){
            // No hay nada entonces no se pasa nada
            objeto = null;

        }else {
            // Se indica de donde viene
            procedencia = "inventario";
        }
    }//GEN-LAST:event_JButtonInventario1ActionPerformed

    private void JButtonTienda15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonTienda15ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(14);
        procedencia = "tienda";
        this.preview(objeto, character);        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonTienda15ActionPerformed

    private void JButtomTienda3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtomTienda3ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(2);
        procedencia = "tienda";
        this.preview(objeto, character);
    }//GEN-LAST:event_JButtomTienda3ActionPerformed

    private void JButtonTienda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonTienda2ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(1);
        procedencia = "tienda";
        this.preview(objeto, character);
    }//GEN-LAST:event_JButtonTienda2ActionPerformed

    private void JButtonTienda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonTienda1ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(0);
        procedencia = "tienda";
        this.preview(objeto, character);
    }//GEN-LAST:event_JButtonTienda1ActionPerformed

    private void JButtonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonComprarActionPerformed
        character.comprar(objeto, procedencia);
        this.refresh();
    }//GEN-LAST:event_JButtonComprarActionPerformed

    private void JButtonComprarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonComprarMouseReleased
        JButtonComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_comprar.png")));
    }//GEN-LAST:event_JButtonComprarMouseReleased

    private void JButtonComprarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonComprarMousePressed
        JButtonComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_comprar_1.png")));
    }//GEN-LAST:event_JButtonComprarMousePressed

    private void JButtonComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonComprarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonComprarMouseClicked

    private void JButtonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonVenderActionPerformed
        character.vender(objeto, procedencia);
        this.refresh();
    }//GEN-LAST:event_JButtonVenderActionPerformed

    private void JButtonEquiparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonEquiparActionPerformed
        character.equipar(objeto, procedencia);
        this.refresh();
    }//GEN-LAST:event_JButtonEquiparActionPerformed

    private void JButtonDesequiparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonDesequiparActionPerformed
        character.desequipar(objeto, procedencia);
        this.refresh();
    }//GEN-LAST:event_JButtonDesequiparActionPerformed

    private void JButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JButtonSalirActionPerformed

    private void JButtonTienda4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonTienda4ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(3);
        procedencia = "tienda";
        this.preview(objeto, character);
    }//GEN-LAST:event_JButtonTienda4ActionPerformed

    private void JButtonInventario4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInventario4ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(3);

        if (objeto.cantidad_posee == 0){
            // No hay nada entonces no se pasa nada
            objeto = null;

        }else {
            // Se indica de donde viene
            procedencia = "inventario";
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonInventario4ActionPerformed

    private void JButtonTienda1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonTienda1MouseEntered

    }//GEN-LAST:event_JButtonTienda1MouseEntered

    private void JButtonTienda1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonTienda1MouseReleased
        this.preview(objeto, character);        
    }//GEN-LAST:event_JButtonTienda1MouseReleased

    private void JButtonTienda1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JButtonTienda1FocusLost
        this.refresh();       
    }//GEN-LAST:event_JButtonTienda1FocusLost

    private void JButtonTienda1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JButtonTienda1FocusGained
        this.preview(objeto, character);
    }//GEN-LAST:event_JButtonTienda1FocusGained

    private void JButtonTienda5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonTienda5ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(4);
        procedencia = "tienda";
        this.preview(objeto, character);        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonTienda5ActionPerformed

    private void JButtonTienda6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonTienda6ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(5);
        procedencia = "tienda";
        this.preview(objeto, character);        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonTienda6ActionPerformed

    private void JButtonTienda7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonTienda7ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(6);
        procedencia = "tienda";
        this.preview(objeto, character);        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonTienda7ActionPerformed

    private void JButtonTienda8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonTienda8ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(7);
        procedencia = "tienda";
        this.preview(objeto, character);        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonTienda8ActionPerformed

    private void JButtonTienda9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonTienda9ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(8);
        procedencia = "tienda";
        this.preview(objeto, character);        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonTienda9ActionPerformed

    private void JButtonTienda10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonTienda10ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(9);
        procedencia = "tienda";
        this.preview(objeto, character);        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonTienda10ActionPerformed

    private void JButtonTienda11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonTienda11ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(10);
        procedencia = "tienda";
        this.preview(objeto, character);        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonTienda11ActionPerformed

    private void JButtonTienda12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonTienda12ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(11);
        procedencia = "tienda";
        this.preview(objeto, character);        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonTienda12ActionPerformed

    private void JButtonTienda13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonTienda13ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(12);
        procedencia = "tienda";
        this.preview(objeto, character);        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonTienda13ActionPerformed

    private void JButtonTienda14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonTienda14ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(13);
        procedencia = "tienda";
        this.preview(objeto, character);        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonTienda14ActionPerformed

    private void JButtonTienda16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonTienda16ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(15);
        procedencia = "tienda";
        this.preview(objeto, character);        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonTienda16ActionPerformed

    private void JButtonTienda17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonTienda17ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(16);
        procedencia = "tienda";
        this.preview(objeto, character);        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonTienda17ActionPerformed

    private void JButtonTienda18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonTienda18ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(17);
        procedencia = "tienda";
        this.preview(objeto, character);        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonTienda18ActionPerformed

    private void JButtonTienda19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonTienda19ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(18);
        procedencia = "tienda";
        this.preview(objeto, character);        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonTienda19ActionPerformed

    private void JButtonTienda20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonTienda20ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(19);
        procedencia = "tienda";
        this.preview(objeto, character);        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonTienda20ActionPerformed

    private void JButtonInventario5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInventario5ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(4);

        if (objeto.cantidad_posee == 0){
            // No hay nada entonces no se pasa nada
            objeto = null;

        }else {
            // Se indica de donde viene
            procedencia = "inventario";
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonInventario5ActionPerformed

    private void JButtonInventario6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInventario6ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(5);

        if (objeto.cantidad_posee == 0){
            // No hay nada entonces no se pasa nada
            objeto = null;

        }else {
            // Se indica de donde viene
            procedencia = "inventario";
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonInventario6ActionPerformed

    private void JButtonInventario7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInventario7ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(6);

        if (objeto.cantidad_posee == 0){
            // No hay nada entonces no se pasa nada
            objeto = null;

        }else {
            // Se indica de donde viene
            procedencia = "inventario";
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonInventario7ActionPerformed

    private void JButtonInventario8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInventario8ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(7);

        if (objeto.cantidad_posee == 0){
            // No hay nada entonces no se pasa nada
            objeto = null;

        }else {
            // Se indica de donde viene
            procedencia = "inventario";
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonInventario8ActionPerformed

    private void JButtonInventario9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInventario9ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(8);

        if (objeto.cantidad_posee == 0){
            // No hay nada entonces no se pasa nada
            objeto = null;

        }else {
            // Se indica de donde viene
            procedencia = "inventario";
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonInventario9ActionPerformed

    private void JButtonInventario10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInventario10ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(9);

        if (objeto.cantidad_posee == 0){
            // No hay nada entonces no se pasa nada
            objeto = null;

        }else {
            // Se indica de donde viene
            procedencia = "inventario";
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonInventario10ActionPerformed

    private void JButtonInventario11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInventario11ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(10);

        if (objeto.cantidad_posee == 0){
            // No hay nada entonces no se pasa nada
            objeto = null;

        }else {
            // Se indica de donde viene
            procedencia = "inventario";
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonInventario11ActionPerformed

    private void JButtonInventario12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInventario12ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(11);

        if (objeto.cantidad_posee == 0){
            // No hay nada entonces no se pasa nada
            objeto = null;

        }else {
            // Se indica de donde viene
            procedencia = "inventario";
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonInventario12ActionPerformed

    private void JButtonInventario13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInventario13ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(12);

        if (objeto.cantidad_posee == 0){
            // No hay nada entonces no se pasa nada
            objeto = null;

        }else {
            // Se indica de donde viene
            procedencia = "inventario";
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonInventario13ActionPerformed

    private void JButtonInventario14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInventario14ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(13);

        if (objeto.cantidad_posee == 0){
            // No hay nada entonces no se pasa nada
            objeto = null;

        }else {
            // Se indica de donde viene
            procedencia = "inventario";
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonInventario14ActionPerformed

    private void JButtonInventario15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInventario15ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(14);

        if (objeto.cantidad_posee == 0){
            // No hay nada entonces no se pasa nada
            objeto = null;

        }else {
            // Se indica de donde viene
            procedencia = "inventario";
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonInventario15ActionPerformed

    private void JButtonInventario16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInventario16ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(15);

        if (objeto.cantidad_posee == 0){
            // No hay nada entonces no se pasa nada
            objeto = null;

        }else {
            // Se indica de donde viene
            procedencia = "inventario";
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonInventario16ActionPerformed

    private void JButtonInventario17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInventario17ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(16);

        if (objeto.cantidad_posee == 0){
            // No hay nada entonces no se pasa nada
            objeto = null;

        }else {
            // Se indica de donde viene
            procedencia = "inventario";
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonInventario17ActionPerformed

    private void JButtonInventario18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInventario18ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(17);

        if (objeto.cantidad_posee == 0){
            // No hay nada entonces no se pasa nada
            objeto = null;

        }else {
            // Se indica de donde viene
            procedencia = "inventario";
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonInventario18ActionPerformed

    private void JButtonInventario19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInventario19ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(18);

        if (objeto.cantidad_posee == 0){
            // No hay nada entonces no se pasa nada
            objeto = null;

        }else {
            // Se indica de donde viene
            procedencia = "inventario";
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonInventario19ActionPerformed

    private void JButtonInventario20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInventario20ActionPerformed
        this.cargarLista();
        objeto = todos_objetos.get(19);

        if (objeto.cantidad_posee == 0){
            // No hay nada entonces no se pasa nada
            objeto = null;

        }else {
            // Se indica de donde viene
            procedencia = "inventario";
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonInventario20ActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Interface().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnirestException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtomTienda3;
    private javax.swing.JButton JButtonComprar;
    private javax.swing.JButton JButtonDesequipar;
    private javax.swing.JButton JButtonEquipar;
    private javax.swing.JButton JButtonInventario1;
    private javax.swing.JButton JButtonInventario10;
    private javax.swing.JButton JButtonInventario11;
    private javax.swing.JButton JButtonInventario12;
    private javax.swing.JButton JButtonInventario13;
    private javax.swing.JButton JButtonInventario14;
    private javax.swing.JButton JButtonInventario15;
    private javax.swing.JButton JButtonInventario16;
    private javax.swing.JButton JButtonInventario17;
    private javax.swing.JButton JButtonInventario18;
    private javax.swing.JButton JButtonInventario19;
    private javax.swing.JButton JButtonInventario2;
    private javax.swing.JButton JButtonInventario20;
    private javax.swing.JButton JButtonInventario3;
    private javax.swing.JButton JButtonInventario4;
    private javax.swing.JButton JButtonInventario5;
    private javax.swing.JButton JButtonInventario6;
    private javax.swing.JButton JButtonInventario7;
    private javax.swing.JButton JButtonInventario8;
    private javax.swing.JButton JButtonInventario9;
    private javax.swing.JButton JButtonSalir;
    private javax.swing.JButton JButtonTienda1;
    private javax.swing.JButton JButtonTienda10;
    private javax.swing.JButton JButtonTienda11;
    private javax.swing.JButton JButtonTienda12;
    private javax.swing.JButton JButtonTienda13;
    private javax.swing.JButton JButtonTienda14;
    private javax.swing.JButton JButtonTienda15;
    private javax.swing.JButton JButtonTienda16;
    private javax.swing.JButton JButtonTienda17;
    private javax.swing.JButton JButtonTienda18;
    private javax.swing.JButton JButtonTienda19;
    private javax.swing.JButton JButtonTienda2;
    private javax.swing.JButton JButtonTienda20;
    private javax.swing.JButton JButtonTienda4;
    private javax.swing.JButton JButtonTienda5;
    private javax.swing.JButton JButtonTienda6;
    private javax.swing.JButton JButtonTienda7;
    private javax.swing.JButton JButtonTienda8;
    private javax.swing.JButton JButtonTienda9;
    private javax.swing.JButton JButtonVender;
    private javax.swing.JLabel JLabelAtaque;
    private javax.swing.JLabel JLabelCoins;
    private javax.swing.JLabel JLabelDefensa;
    private javax.swing.JLabel JLabelDinero;
    private javax.swing.JLabel JLabelEstilo;
    private javax.swing.JLabel JLabelMagia;
    private javax.swing.JLabel JLabelTituloInventario;
    private javax.swing.JLabel JLabelTituloStats;
    private javax.swing.JLabel JLabelTituloTienda;
    private javax.swing.JLabel JLabelVelocidad;
    private javax.swing.JLabel JLabelVida;
    private javax.swing.JPanel JPanelInventario;
    private javax.swing.JPanel JPanelStats;
    private javax.swing.JPanel JPanelTienda;
    private javax.swing.JPanel JPanelTituloInventario;
    private javax.swing.JPanel JPanelTituloTienda;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlabel_img_ataque;
    private javax.swing.JLabel jlabel_img_defensa;
    private javax.swing.JLabel jlabel_img_estilo;
    private javax.swing.JLabel jlabel_img_magia;
    private javax.swing.JLabel jlabel_img_velocidad;
    private javax.swing.JLabel jlabel_img_vida;
    private javax.swing.JLabel jlabel_paquito;
    // End of variables declaration//GEN-END:variables
}
