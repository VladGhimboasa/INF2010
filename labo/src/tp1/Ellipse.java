package tp1;

import java.util.Set;

public class Ellipse extends BaseShape {
    // TODO creer une ellipse avec une largeur et une longueur.
    public Ellipse(Double widthRadius, Double heightRadius) {
        for(int i = 0; i < widthRadius; i++ ) {
            this.add(new Point2d((-(widthRadius/2)+i), -Math.sqrt(((1-(Math.pow((-widthRadius/2+i),2)/(Math.pow(widthRadius/2, 2))))*Math.pow(heightRadius/2, 2)))));
        }
        for(int j = 0; j < widthRadius; j++ ) {
            this.add(new Point2d((-(widthRadius/2)+j), Math.sqrt(((1-(Math.pow((-widthRadius/2+j),2)/(Math.pow(widthRadius/2, 2))))*Math.pow(heightRadius/2, 2)))));
        }
        for(int l = 0; l < heightRadius; l++) {
            this.add(new Point2d((Math.sqrt(((1-(Math.pow((-heightRadius/2+l),2)/(Math.pow(heightRadius/2, 2))))*Math.pow(widthRadius/2, 2)))),-(heightRadius/2)+l));
        }
        for(int k = 0; k < heightRadius; k++) {
            this.add(new Point2d((-Math.sqrt(((1-(Math.pow((-heightRadius/2+k),2)/(Math.pow(heightRadius/2, 2))))*Math.pow(widthRadius/2, 2)))),-(heightRadius/2)+k));
        }
        //Formule ellipse : (x^2/a^2) + (y^2/b^2) = 1
    }

    private Ellipse(Set<Point2d> coords) {
        super(coords);
    }

    // TODO appliquer la translation sur la forme.
    @Override
    public Ellipse translate(Point2d point) {
        return new Ellipse(translateAll(point));
    }

    // TODO appliquer la rotation sur la forme.
    @Override
    public Ellipse rotate(Double angle) {
        return new Ellipse(rotateAll(angle));
    }

    // TODO retourner une nouvelle forme.
    @Override
    public Ellipse clone() { return new Ellipse(getCoords()); }
}
