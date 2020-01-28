package tp1;

import java.util.GregorianCalendar;

public final class LetterFactory {
    final static Double maxHeight = 200.0;
    final static Double maxWidth = maxHeight / 2;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 10;

    // TODO
    public static BaseShape create_H() {
        Double degrees90 = Math.toRadians(90);
        Double spacing = stripeThickness * 2;
        BaseShape mainStripe = new Rectangle(stripeThickness, maxHeight);
        BaseShape mainLittleStripe = new Rectangle(stripeThickness, halfMaxHeight);
        BaseShape leftStripe = mainStripe.translate(new Point2d(-spacing - 10, 0.0));
        BaseShape middleStripe = mainLittleStripe.rotate(degrees90).translate(new Point2d(0.0, 0.0));
        BaseShape rightStripe = mainStripe.translate(new Point2d(halfMaxWidth , 0.0));
        leftStripe.add(middleStripe);
        leftStripe.add(rightStripe);
        return leftStripe;
    }

    // TODO
    public static BaseShape create_e() {
        Double degrees90 = Math.toRadians(90);
        Double spacing = stripeThickness * 2;

        BaseShape mainStripe = new Rectangle(stripeThickness, halfMaxHeight);
        BaseShape eBar = mainStripe.rotate(-degrees90);
        BaseShape mainRemove = new Rectangle(stripeThickness, halfMaxHeight);
        BaseShape eBarRemove = mainRemove.rotate(-degrees90).translate(new Point2d(halfMaxHeight/2, stripeThickness));

        BaseShape ellipse = new Ellipse(maxWidth, maxHeight);
        for(int i = 0; i<maxWidth/2 -10; i++)
        {
            BaseShape ellipseC = new Ellipse(maxWidth-i, maxHeight - i);
            ellipse.add(ellipseC);
        }

        ellipse.add(eBar);
        ellipse.remove(eBarRemove);
        return ellipse;
    }

    // TODO
    public static BaseShape create_l() {
        BaseShape horizontalStripe = new Rectangle(stripeThickness, maxHeight);
        return horizontalStripe;
    }

    // TODO
    public static BaseShape create_o() {
        BaseShape ellipse = new Ellipse(maxWidth, maxHeight);
        for(int i = 0; i<maxWidth/2 -10; i++)
        {
            BaseShape ellipseC = new Ellipse(maxWidth-i, maxHeight - i);
            ellipse.add(ellipseC);
        }

        return  ellipse;
    }

    // On vous donne la lettre W comme exemple.
    public static BaseShape create_W() {
        Double degrees15 = Math.toRadians(8);
        Double spacing = stripeThickness * 2;
        BaseShape mainStripe = new Rectangle(stripeThickness, maxHeight);
        BaseShape leftStripe = mainStripe.rotate(-degrees15).translate(new Point2d(-spacing, 0.0));
        BaseShape middleLeftStripe = mainStripe.rotate(degrees15).translate(new Point2d(-spacing / 3, 0.0));
        BaseShape middleRightStripe = mainStripe.rotate(-degrees15).translate(new Point2d(spacing / 3, 0.0));
        BaseShape rightStripe = mainStripe.rotate(degrees15).translate(new Point2d(spacing, 0.0));
        leftStripe.add(middleLeftStripe);
        leftStripe.add(middleRightStripe);
        leftStripe.add(rightStripe);
        return leftStripe;
    }

    // TODO
    public static BaseShape create_r() {
        Double degrees90 = Math.toRadians(90);
        Double spacing = stripeThickness * 2;
        Double rectangleH = 150.00;
        Double rectangleW = maxWidth;

        BaseShape mainCircle = new Circle(halfMaxHeight).translate(new Point2d(0.0, -halfMaxWidth + 10));
        for(int i = 0; i < halfMaxWidth / 2 + 10; i++){
            BaseShape littleCircle = new Circle(halfMaxHeight - i).translate(new Point2d(0.0, -halfMaxWidth + 10));
            mainCircle.add(littleCircle);
        }

        BaseShape mainRemove = new Rectangle(rectangleW, rectangleH);
        BaseShape eBarRemove = mainRemove.translate(new Point2d(2.0, 25.00));
        BaseShape mainStripe = new Rectangle(stripeThickness, maxHeight);
        BaseShape leftStripe = mainStripe.translate(new Point2d(-spacing, 0.0));

        BaseShape horizontalStripe = new Rectangle(stripeThickness, maxHeight);
        mainCircle.remove(eBarRemove);
        mainCircle.add(leftStripe);
        return mainCircle;
    }

    // TODO
    public static BaseShape create_d() {
       BaseShape mainCircle = new Circle(halfMaxHeight).translate(new Point2d(0.0, halfMaxWidth));
       for(int i = 0; i < halfMaxWidth / 2 + 10; i++){
           BaseShape littleCircle = new Circle(halfMaxHeight - i).translate(new Point2d(-5.0, halfMaxWidth));
           mainCircle.add(littleCircle);
       }
       BaseShape rightStripe = new Rectangle(stripeThickness, maxHeight).translate(new Point2d(halfMaxWidth - 5, 0.0));
       mainCircle.add(rightStripe);
       return mainCircle;
    }
}
