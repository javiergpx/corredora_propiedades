package proyecto;

import javax.swing.*;

public class barramenu extends JFrame {

    private JMenuBar barra;
    private JMenu inicio, propiedades;
    private JMenuItem iniciarSesion, registrarse, venta, arriendo;
    private boolean visibilidadMenuPropiedades = false;

    public barramenu() {


        barra = new JMenuBar();
        setJMenuBar(barra);

        inicio = new JMenu("Inicio");
        barra.add(inicio);
        propiedades = new JMenu("Propiedades", visibilidadMenuPropiedades);
        barra.add(propiedades);

        iniciarSesion = new JMenuItem("Iniciar Sesion");
        inicio.add(iniciarSesion);

        registrarse = new JMenuItem("Registrarse");
        inicio.add(registrarse);

        venta = new JMenuItem("Venta");
        propiedades.add(venta);

        arriendo = new JMenuItem("Arriendo");
        propiedades.add(arriendo);


    }

    //metodo para habilitar el menu propiedades al iniciar sesion
    public void setVisibilidadMenuPropiedades(boolean cambio){
        visibilidadMenuPropiedades = cambio;
    }
}


