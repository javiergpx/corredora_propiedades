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

        JMenuBar barraMenu = new JMenuBar(); 
        panel.add(barraMenu);


        panel.add(escritorio);

        panel.setSize(1000,500); //definir tamaño para la ventana principal
        panel.setVisible(true);



    }

}
