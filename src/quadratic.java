public class quadratic {
    public static void main(String args[]){
        double a=2, b=-4, c=2;

        double disc = (Math.pow(b, 2)-(4*a*c));
        if (disc < 0) {
            String complex = Math.round(Math.sqrt(Math.abs(disc))) + "i";
            double base = 2*a;
            String quadratic = "("+-b+"±"+complex+")/"+base;
            System.out.println("Roots: "+quadratic);
        } else{
            double quadratic_pos = (-b+Math.sqrt(disc))/2*a;
            double quadratic_neg = (-b-Math.sqrt(disc))/2*a;
            System.out.println("Roots: {"+quadratic_pos+";"+quadratic_neg+"}");
        }
    }
}
