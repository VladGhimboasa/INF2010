package tp1;

import java.util.HashSet;
import java.util.Set;

public class Rectangle extends BaseShape {
    // TODO creer un rectangle avec une largeur et une longueur.

    public Rectangle(Double width, Double height) {
        for(int i = 0; i< width.intValue(); i++){
            for(int y =0; y< height.intValue(); y++)
            {
                this.add(new Point2d(-(width/2)+i, -(height/2)+y));
            }
        }
    }

    // TODO creer un rectangle avec un point contenant la largeur et longueur.
    public Rectangle(Point2d dimensions) {
        this.add(dimensions);
    }

    private Rectangle(Set<Point2d> coords) {
        super(coords);
    }

    // TODO appliquer la translation sur la forme.
    @Override
    public Rectangle translate(Point2d point) {
        return new Rectangle(translateAll(point));
    }

    // TODO appliquer la rotation sur la forme.
    @Override
    public Rectangle rotate(Double angle) {
        return new Rectangle(rotateAll(angle));
    }

    // TODO retourner une nouvelle forme.
    @Override
    public Rectangle clone() {
        return new Rectangle(this.getCoords());
    }
}
