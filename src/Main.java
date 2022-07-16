import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int opcion=0;
        /* repeticion del menú hasta que escriba opc 13 */
        while (opcion != 13){
            /* MENU DE OPCIONES*/
            String entrada = JOptionPane.showInputDialog(
                    """
                            Escriba 1 para dibujar emoji feliz
                            Escriba 2 para dibujar emoji sorpresa
                            Escriba 3 para dibujar emoji de corazón
                            Escriba 4 para dibujar emoji sacando la lengua
                            Escriba 5 para dibujar emoji triste
                            Escriba 6 para dibujar emoji guiñando el ojo
                            Escriba 7 para dibujar emoji enojado
                            Escriba 8 para dibujar emoji feliz al revés
                            Escriba 13 para salir
                            """);
            opcion=Integer.parseInt(entrada);

            if (opcion <13 && opcion>0){
                Emojis panel =new Emojis (opcion);
                JFrame aplicacion = new JFrame();

                aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                aplicacion.add(panel);
                aplicacion.setSize(300,300);
                aplicacion.setVisible(true);
                /* DELAY */
                Thread.sleep(500);
            }
            else if (opcion == 13){
                JOptionPane.showMessageDialog(null, "Gracias por usar el programa!!.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Elige correctamente la opción.");
            }

        }

        /* cierre del programa completo junto a JFrame */
        System.exit( 0 );

    }
}
