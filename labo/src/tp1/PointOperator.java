package tp1;

import java.util.*;

public final class PointOperator {

    // TODO appliquer la translation sur le vecteur d'entree.
    public static Double[] translate(Double[] vector, Double[] translateVector) {
        Double[] arr = vector.clone();
        for(int i = 0; i < arr.length; i++){
            arr[i] += translateVector[i];
        }
        return arr;
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
        Double[] arr = vector.clone();
        for(int i = 0; i < arr.length; i++){
            arr[i] = vector[i] / divider;
        }
        return arr;
    }

    // TODO appliquer le facteur de multiplication sur le vecteur d'entree.
    public static Double[] multiply(Double[] vector, Double multiplier) {
        Double[] arr = vector.clone();
        for(int i = 0; i < arr.length; i++){
            arr[i] = vector[i] * multiplier;
        }
        return arr;
    }

    // TODO appliquer le facteur d'addition sur le vecteur d'entree.
    public static Double[] add(Double[] vector, Double adder) {
        Double[] arr = vector.clone();
        for(int i = 0; i < arr.length; i++){
            arr[i] += adder;
        }
        return arr;
    }

    // TODO retourne la coordonnee avec les plus grandes valeurs en X et en Y.
    public static Point2d getMaxCoord(Collection<Point2d> coords) {
        double maxX = 0.0;
        double maxY = 0.0;
        for(Point2d point : coords){
            if(maxX < point.X()){
                maxX = point.X();
            }
            if(maxY < point.Y()){
                maxY = point.Y();
            }
        }
        return new Point2d(maxX, maxY);
    }

    // TODO retourne la coordonnee avec les plus petites valeurs en X et en Y.
    public static Point2d getMinCoord(Collection<Point2d> coords) {
        double minX = 0.0;
        double minY = 0.0;
        for(Point2d point : coords){
            if(minX > point.X()){
                minX = point.X();
            }
            if(minY > point.Y()){
                minY = point.Y();
            }
        }
        return new Point2d(minX, minY);
    }
}
