package proyecto;

import javax.swing.*;


import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class principal {


    public static void main (String[] args){


        JFrame panel = new JFrame("Corredora Propiedades"); //JPanel
        JDesktopPane escritorio = new JDesktopPane(); //JDesktopPane
        panel.getContentPane().add(escritorio);
        panel.setExtendedState(panel.MAXIMIZED_BOTH); //Maximizado al abrir
        panel.setDefaultCloseOperation(EXIT_ON_CLOSE); //Termina la ejecucion al cerrar ventana
        escritorio.setSize(1000,500);
        escritorio.setVisible(true);


        barramenu barra = new barramenu();
        barra.setBounds(0,0,1000,50);
        barra.setVisible(true);


        panel.setSize(1000,500); //definir tamaño para la ventana principal (1000px ancho X 500px alto)
        panel.setVisible(true);



    }

}
