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

                //Puntos en X
                int [] XC={154,160,166,171,177,184,190,195,200,205,210,215,220,224,228,230,232,232,229,226,220,215,208,199,189,180,170,161,154,
                143,132,123,113,107,100,95,89,84,80,77,76,80,85,92,100,106,112,119,125,131,137,142,148};
                //Puntos en Y
                int [] YC={91,86,81,77,75,73,73,73,74,76,79,82,87,92,97,106,114,124,134,141,147,153,159,167,174,182,189,194,198,191,185,178,
                170,165,160,155,150,144,137,125,113,100,92,83,80,76,75,73,74,76,77,81,85};
                g.fillPolygon(XC,YC,53);
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

            case 10:
                // EMOJI ESTRELLA
                //Puntos en X
                int [] X1={117,136,156,218,167,187,136,88,107,55};
                int [] X2={118,137,157,219,168,188,137,89,108,56};
                //Puntos en Y
                int [] Y1={110,45,109,109,149,218,182,219,148,110};
                int [] Y2={111,46,110,110,150,219,183,220,149,111};

                g.setColor( new Color(252,234,98) );
                g.drawPolyline(X1,Y1,10);
                g.fillPolygon(X2,Y2,10);
                break;

            case 11:
                //EMOJI OJOS
                g.setColor( Color.WHITE );
                g.fillOval( 75, 75, 80, 160 );
                g.fillOval( 155, 75, 80, 160 );

                g.setColor( new Color(199,130,47) );
                g.fillOval(72,126,57,57);
                g.fillOval(155,126,57,57);

                g.setColor( Color.BLACK );
                g.fillOval(72,131,48,48);
                g.fillOval(155,131,48,48);

                g.setColor( Color.WHITE );
                g.fillOval(86,131,10,10);
                g.fillOval(169,131,10,10);

                break;

            case 12:
                //EMOJI GOTAS
                g.setColor(new Color(115,205,250) );
                g.fillOval(83,130,55,55); //G1
                g.fillOval(161,160,44,44); //G2
                g.fillOval(165,76,51,51); //G3

                int [] XG1={84,135,87};
                int [] YG1={163,144,94};
                g.fillPolygon(XG1,YG1,3);
                int [] XG2={162,198,157};
                int [] YG2={180,166,135};
                g.fillPolygon(XG2,YG2,3);
                int [] XG3={188,183,120};
                int [] YG3={76,126,80};
                g.fillPolygon(XG3,YG3,3);
                break;

        }
    }
}
