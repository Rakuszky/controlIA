/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlia;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Rakuszky
 */
public class ventanaLogin extends JFrame {
    public JPanel panelLogin;
    public ventanaLogin(){
        this.setSize(220,400); //Se define el largo y ancho de la ventana de LOGIN
        setTitle("LOGIN"); //Corresponde al título de la ventana
        
        setLocationRelativeTo(null); //Se establece que la ventana aparecerá en el centro de la pantalla
        setResizable(false); //Se impide que el operador pueda modificar las dimensiones de la pantalla
        
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Se cierra el proceso al presionar X
    }
    
    private void iniciarComponentes(){
        iniciarPanel_1();
        iniciarEtiquetas1();
        iniciarBotones1();
        iniciarCajaTxt1();
        iniciarCajaPass();
    }
    
    private void iniciarPanel_1(){
        panelLogin= new JPanel(); //Creación del panel       
        panelLogin.setLayout(null); // Se desactiva el diseño predeterminad del panel
        this.getContentPane().add(panelLogin); //Se agrega el panel a la ventana                
    }
    
    private void iniciarEtiquetas1(){
        //Agregando icono de usuario
        ImageIcon imgUsuarios = new ImageIcon("usuario_icono.png"); //Se crea el imgIcon asociado a la imagen
        JLabel etiquetaImgUsuarios = new JLabel(); //Se crea la etiqueta
        etiquetaImgUsuarios.setBounds(70, 15, 80, 80); //Se definen las dimensiones de la etiqueta de imagen
        etiquetaImgUsuarios.setIcon(new ImageIcon(imgUsuarios.getImage().getScaledInstance(etiquetaImgUsuarios.getWidth(),
                etiquetaImgUsuarios.getHeight(), Image.SCALE_SMOOTH))); //Se definen las dimensiones de la imagen dentro de la etiqueta
        panelLogin.add(etiquetaImgUsuarios); //Se agrega la etiqueta de imagen al panel
        
        //Etiqueta Bienvenido(a)
        JLabel etiquetaBienvenida = new JLabel("Bienvenido(a)", SwingConstants.CENTER); //Se crea la etiqueta de texto
        etiquetaBienvenida.setBounds(10, 100, 200, 35);  //Se definen las dimensiones de la etiqueta
        //etiquetaBienvenida.setForeground(Color.black); //Se define el color de fondo de la etiqueta
        //etiquetaBienvenida.setOpaque(true); // Se permite la edición del fondo de la etiqueta
        etiquetaBienvenida.setBackground(Color.black); //Se define el color de fondo de la etiqueta
        etiquetaBienvenida.setFont(new Font ("arial", 3, 30)); //Se define la fuente, estilo y tamaño de la letra de la etiqueta.
        panelLogin.add(etiquetaBienvenida); //Se agrega la etiqueta al panel.
        
        //Etiqueta Usuario
        JLabel etiquetaUsuario = new JLabel("Usuario:", SwingConstants.CENTER); //Se crea la etiqueta de texto
        etiquetaUsuario.setBounds(10, 150, 85, 20);  //Se definen las dimensiones de la etiqueta
        etiquetaUsuario.setForeground(Color.black); //Se define el color de fondo de la etiqueta
        //etiquetaUsuario.setOpaque(true); // Se permite la edición del fondo de la etiqueta
        //etiquetaUsuario.setBackground(Color.black); //Se define el color de fondo de la etiqueta
        etiquetaUsuario.setFont(new Font ("arial", 3, 20)); //Se define la fuente, estilo y tamaño de la letra de la etiqueta.
        panelLogin.add(etiquetaUsuario); //Se agrega la etiqueta al panel.
        
        //Etiqueta Contraseña
        JLabel etiquetaPass = new JLabel("Contraseña:", SwingConstants.CENTER); //Se crea la etiqueta de texto
        etiquetaPass.setBounds(10, 225, 120, 20);  //Se definen las dimensiones de la etiqueta
        etiquetaPass.setForeground(Color.black); //Se define el color de fondo de la etiqueta
        //etiquetaPass.setOpaque(true); // Se permite la edición del fondo de la etiqueta
        //etiquetaPass.setBackground(Color.red); //Se define el color de fondo de la etiqueta
        etiquetaPass.setFont(new Font ("arial", 3, 20)); //Se define la fuente, estilo y tamaño de la letra de la etiqueta.
        panelLogin.add(etiquetaPass); //Se agrega la etiqueta al panel.
    }
    private void iniciarBotones1(){
        JButton botonEntrar = new JButton(); //se crea el botón
        botonEntrar.setText("Entrar"); //Se estableció el texto del botón
        botonEntrar.setBounds(60, 315, 100, 30); //posición y dimensiones del botón
        botonEntrar.setEnabled(true); //habilitar o deshabilitar las funciones del botón
        botonEntrar.setForeground(Color.black); //Color de la letra del botón
        botonEntrar.setFont(new Font("arial", 3, 20)); //Fuente, estilo y tamaño de la letra del botón
        panelLogin.add(botonEntrar);//se agrega el botón al panel
    }
    
    private void iniciarCajaTxt1(){
        JTextField campoUsuario = new JTextField(); //Se crea el campo de texto
        campoUsuario.setBounds(10, 180, 200, 30); //Se define la posición y dimensiones del campo de texto
        campoUsuario.setFont(new Font("arial" , 2, 20)); //Se define la fuente, estilo y el tamaño del texto
        panelLogin.add(campoUsuario); //Se agrega el campo de texto al panel
    }
    
    private void iniciarCajaPass(){
        JPasswordField passLogin = new JPasswordField();
        passLogin.setBounds(10, 255, 200, 30);
        panelLogin.add(passLogin);
    }
}
