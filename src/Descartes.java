import java.text.DecimalFormat;

public class Descartes {

    private double posX;
    private double posY;

    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("##.##");

        Descartes descartes = new Descartes(
                Double.parseDouble(args[0]),
                Double.parseDouble(args[1])
        );

        Point point1 = new Point(-5, 7);
        Point point2 = new Point(12, 4);

        double distance = descartes.distance(point1, point2);
        System.out.printf("Distance between two points: %s\n", df.format(distance));

        boolean isFirstQuadrant = descartes.getQuadrant((point1));
        System.out.printf("Is it a part of the first quadrant: %b", isFirstQuadrant);

        if (!descartes.getQuadrant(point1)){
            point1.setX(Math.abs(point1.getY()));
            point1.setY(Math.abs(point1.getY()));
        }
    }

    public Descartes(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public static class Point{
        private double x;
        private double y;

        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }

        double getX(){
            return this.x;
        }

        double getY(){
            return this.y;
        }

        void setX(double x){
            this.x = x;
        }

        void setY(double y){
            this.y = y;
        }
    }

    public boolean getQuadrant(Point point){
        return point.getX() > 0 && point.getY() > 0;
    }

    public double distance(Point point1, Point point2){
        return Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY()-point2.getY(), 2));
    }
}