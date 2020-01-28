package tp1;

public final class LetterFactory {
    final static Double maxHeight = 200.0;
    final static Double maxWidth = maxHeight / 2;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 10;

    // TODO
    public static BaseShape create_H() {
        Double degrees15 = Math.toRadians(8); //pas sur
        BaseShape mainStripe = new Rectangle(stripeThickness, maxHeight*2);
        BaseShape leftStripe = mainStripe.rotate(-degrees15).translate(new Point2d(-maxHeight, 0.0));

//        BaseShape verticalStripe = new Rectangle(stripeThickness, halfMaxHeight);
//        verticalStripe.rotate(degrees90).translate(new Point2d(-halfMaxWidth, halfMaxHeight));
//        horizontalLeftStripe.add(verticalStripe);
//        horizontalLeftStripe.add(horizontalRightStripe);
        return leftStripe;
    }

    // TODO
    public static BaseShape create_e() {
//        Double degree90 = Math.toRadians(48); //
//        BaseShape horizontalStripe = new Rectangle(stripeThickness, maxHeight);
//        BaseShape bottomStripe = new Rectangle(stripeThickness, halfMaxHeight);
//        bottomStripe.rotate(degree90);
//        BaseShape middleStripe = bottomStripe.translate(new Point2d(0.0, halfMaxHeight));
//        BaseShape topStripe = bottomStripe.translate(new Point2d(0.0, maxHeight));
//        horizontalStripe.add(bottomStripe);
//        horizontalStripe.add(middleStripe);
//        horizontalStripe.add(topStripe);
//        return horizontalStripe;
        BaseShape horizontalStripe = new Rectangle(stripeThickness, maxHeight);
        return horizontalStripe;
    }

    // TODO
    public static BaseShape create_l() {
        BaseShape horizontalStripe = new Rectangle(stripeThickness, maxHeight);
        return horizontalStripe;
    }

    // TODO
    public static BaseShape create_o() {
        Double degrees90 = Math.toRadians(48); //pas sur
        BaseShape horizontalLeftStripe = new Rectangle(stripeThickness, maxHeight);
        BaseShape horizontalRightStripe = horizontalLeftStripe.translate(new Point2d(halfMaxWidth, 0.0));
        horizontalLeftStripe.translate(new Point2d(-halfMaxWidth, 0.0));
        BaseShape verticalStripe = new Rectangle(stripeThickness, halfMaxHeight);
        verticalStripe.rotate(degrees90).translate(new Point2d(-halfMaxWidth, halfMaxHeight));
        horizontalLeftStripe.add(verticalStripe);
        horizontalLeftStripe.add(horizontalRightStripe);
        return horizontalLeftStripe;
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
        Double degrees90 = Math.toRadians(48); //pas sur
        BaseShape horizontalLeftStripe = new Rectangle(stripeThickness, maxHeight);
        BaseShape horizontalRightStripe = horizontalLeftStripe.translate(new Point2d(halfMaxWidth, 0.0));
        horizontalLeftStripe.translate(new Point2d(-halfMaxWidth, 0.0));
        BaseShape verticalStripe = new Rectangle(stripeThickness, halfMaxHeight);
        verticalStripe.rotate(degrees90).translate(new Point2d(-halfMaxWidth, halfMaxHeight));
        horizontalLeftStripe.add(verticalStripe);
        horizontalLeftStripe.add(horizontalRightStripe);
        return horizontalLeftStripe;
    }

    // TODO
    public static BaseShape create_d() {
        Double degrees90 = Math.toRadians(48); //pas sur
        BaseShape horizontalLeftStripe = new Rectangle(stripeThickness, maxHeight);
        BaseShape horizontalRightStripe = horizontalLeftStripe.translate(new Point2d(halfMaxWidth, 0.0));
        horizontalLeftStripe.translate(new Point2d(-halfMaxWidth, 0.0));
        BaseShape verticalStripe = new Rectangle(stripeThickness, halfMaxHeight);
        verticalStripe.rotate(degrees90).translate(new Point2d(-halfMaxWidth, halfMaxHeight));
        horizontalLeftStripe.add(verticalStripe);
        horizontalLeftStripe.add(horizontalRightStripe);
        return horizontalLeftStripe;
    }
}
