import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

public class Emojis extends JPanel{
    private int opcion;

    public Emojis(int opcion) {
        this.opcion = opcion;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        /* uso para el grosor de lineas, usado en opcion 4 */
        Graphics2D g2d = (Graphics2D)g;
        BasicStroke grosor = new BasicStroke(5);
        g2d.setStroke(grosor);

        switch (opcion){

            case 1:
                //EMOJI FELIZ

                g.setColor( Color.YELLOW );
                g.fillOval( 10, 10, 200, 200 );

                g.setColor( Color.BLACK );
                g.fillOval( 55, 65, 30, 30 );
                g.fillOval( 135, 65, 30, 30 );

                g.fillOval( 50, 110, 120, 60 );

                g.setColor( Color.YELLOW );
                g.fillRect( 50, 110, 120, 30 );
                g.fillOval( 50, 120, 120, 40 );
                break;
            case 2:
                //EMOJI SORPRESA

                g.setColor( Color.YELLOW );
                g.fillOval( 10, 10, 200, 200 );

                g.setColor( Color.BLACK );
                g.fillOval( 55, 65, 30, 30 );
                g.fillOval( 135, 65, 30, 30 );

                g.fillOval( 80, 110, 60, 60 );
                break;
            case 3:
                // CORAZON
                g.setColor( Color.RED);

                // PUNTOS DE LINES
                /*
                (X1, Y1) (X2, Y2)
                (130, 75) (100, 75)
                (100, 75) (70, 105)
                (70, 105) (70, 125)
                (70, 125) (90, 145)
                (90, 145) (140, 185)
                (140, 185) (190, 145)
                (190, 145) (210, 125)
                (210, 125) (210, 105)
                (210, 105) (190, 75)
                (190, 75) (160, 75)
                (160, 75) (140, 105)
                (140, 105) (130, 75)
                */
                int[] puntosX = {130, 100, 70, 70, 90, 140, 190, 210, 210, 190, 160, 140};
                int[] puntosY = {75, 75, 105, 125, 145, 185, 145, 125, 105, 75, 75, 105};

                g.fillPolygon(puntosX, puntosY, 12);
                break;
            case 4:
                //EMOJI SACANDO LENGUA

                g.setColor( Color.YELLOW );
                g.fillOval( 10, 10, 200, 200 );

                g.setColor( Color.BLACK );
                g.fillOval( 55, 65, 30, 30 );


                g2d.drawLine(135,80, 165, 65);
                g2d.drawLine(135,80, 165, 95);

                g.fillOval( 50, 110, 120, 60 );

                g.setColor( Color.YELLOW);
                g.fillRect( 50, 100, 120, 30 );
                g.setColor( Color.RED);
                g.fillOval( 85, 140, 30, 50 );
                g.fillOval( 105, 140, 30, 50 );
                g.fillOval( 95, 175, 30, 25 );
                break;
            case 5:
                //EMOJI TRISTE

                g.setColor( Color.YELLOW );
                g.fillOval( 10, 10, 200, 200 );

                g.setColor( Color.BLACK );
                g.fillOval( 55, 65, 30, 30 );
                g.fillOval( 135, 65, 30, 30 );

                g.setColor(Color.YELLOW);
                g.fillOval(55,80,30,40);
                g.fillOval(135,80,30,40);

                g.setColor( Color.BLACK );
                g.fillOval( 50, 130, 120, 60 );


                g.setColor( Color.YELLOW );
                g.fillRect( 50, 160, 120, 30 );
                g.fillOval( 50, 140, 120, 40 );
                break;

            case 6:
                /* EMOJI GUIÑANDO EL OJO */

                // CARA
                g.setColor( Color.YELLOW );
                g.fillOval( 10, 10, 200, 200 );
                // OJOS
                g.setColor( Color.BLACK );
                g.fillOval( 65, 65, 30, 40 );
                g2d.draw(new Arc2D.Double(135,85,35,15,0,180,Arc2D.CHORD));
                g2d.fill(new Arc2D.Double(135,85,35,15,0,180,Arc2D.CHORD));
                // CEJAS
                g2d.fill(new Arc2D.Double(55,45,45,10,40,200,Arc2D.CHORD));
                g2d.fill(new Arc2D.Double(135,65,35,15,-20,160,Arc2D.CHORD));
                // BOCA
                g.fillOval( 75, 110, 80, 70 );
                g.setColor( Color.YELLOW );
                g.fillRect( 75, 110, 80, 35 );
                g.fillOval( 75, 120, 80, 45 );
                break;

            case 7:
                /* EMOJI ENOJADO */

                // CARA
                g.setColor( Color.YELLOW );
                g.fillOval( 10, 10, 200, 200 );
                // OJOS
                g.setColor( Color.BLACK );
                g.fillOval( 75, 100, 20, 30 );
                g.fillOval( 125, 100, 20, 30 );
                // CEJAS
                g2d.fill(new Arc2D.Double(40,90,55,10,-50,170,Arc2D.CHORD));
                g2d.fill(new Arc2D.Double(125,90,55,10,50,190,Arc2D.CHORD));
                // BOCA
                g.fillOval( 80, 150, 60, 50 );
                g.setColor( Color.YELLOW );
                g.fillRect( 80, 170, 60, 25 );
                g.fillOval( 80, 160, 60, 45 );
                break;

            case 8:
                /* EMOJI FELIZ AL REVES */

                // CARA
                g.setColor( Color.YELLOW );
                g.fillOval( 10, 10, 200, 200 );
                // OJOS
                g.setColor( Color.BLACK );
                g.fillOval( 75, 125, 20, 30 );
                g.fillOval( 135, 125, 20, 30 );
                // BOCA
                g.fillOval( 65, 50, 100, 50 );
                g.setColor( Color.YELLOW );
                g.fillRect( 65, 70, 100, 25 );
                g.fillOval( 65, 60, 100, 45 );
                break;

            case 9:
                /* EMOJI DANDO UN BESO */

                // CARA
                g.setColor( Color.YELLOW );
                g.fillOval( 10, 10, 200, 200 );
                // OJOS
                g.setColor( Color.BLACK );
                g.fillOval( 75, 75, 20, 30 );
                g.fillOval( 135, 75, 20, 30 );
                // BOCA
                int [] X={110,140,120,140,110};
                int [] Y={130,140,150,160,170};
                g.drawPolyline(X,Y,5);
                break;














        }
    }
}
