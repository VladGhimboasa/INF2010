package tp1;

import java.util.*;

public final class PointOperator {
    // TODO appliquer la translation sur le vecteur d'entree.
    public static Double[] translate(Double[] vector, Double[] translateVector) {
        for(int i = 0; i < vector.length; i++){
            vector[i] += translateVector[i];
        }
        return vector;
    }

    // TODO appliquer la rotation sur le vecteur d'entree.
    public static Double[] rotate(Double[] vector, Double[][] rotationMatrix) {

        Double[] vectorResultant = new Double[vector.length];

        for(int i = 0; i<rotationMatrix.length; i++)
        {
            double sum = 0;
            for(int j = 0; j<rotationMatrix[i].length; j++)
            {
                sum += rotationMatrix[i][j] * vector[j];
            }
            vectorResultant[i] = sum;

        }
        return vectorResultant;
    }

    // TODO appliquer le facteur de division sur le vecteur d'entree.
    public static Double[] divide(Double[] vector, Double divider) {
        for(int i = 0; i < vector.length; i++){
            vector[i] = vector[i] / divider;
        }
        return vector;
    }

    // TODO appliquer le facteur de multiplication sur le vecteur d'entree.
    public static Double[] multiply(Double[] vector, Double multiplier) {
        for(int i = 0; i < vector.length; i++){
            vector[i] = vector[i] * multiplier;
        }
        return vector;
    }

    // TODO appliquer le facteur d'addition sur le vecteur d'entree.
    public static Double[] add(Double[] vector, Double adder) {
        for(int i = 0; i < vector.length; i++){
            vector[i] += adder;
        }
        return vector;
    }

    // TODO retourne la coordonnee avec les plus grandes valeurs en X et en Y.
    public static Point2d getMaxCoord(Collection<Point2d> coords) {
        double maxX = 0.0;
        double maxY = 0.0;
        for(Point2d pt : coords){
            if(maxX < pt.X()){
                maxX = pt.X();
            }
            if(maxY < pt.Y()){
                maxY = pt.Y();
            }
        }
        return new Point2d(maxX, maxY);
    }

    // TODO retourne la coordonnee avec les plus petites valeurs en X et en Y.
    public static Point2d getMinCoord(Collection<Point2d> coords) {
        double minX = 0.0;
        double minY = 0.0;
        for(Point2d pt : coords){
            if(minX > pt.X()){
                minX = pt.X();
            }
            if(minY > pt.Y()){
                minY = pt.Y();
            }
        }
        return new Point2d(minX, minY);
    }
}
