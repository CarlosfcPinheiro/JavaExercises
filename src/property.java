public class property {
    int type = 1;
    int use = 2;
    int sleep = 3;

    double value = 120.500;
    double time = 2; // Years

    String neigh = "Alto José do Pinho";


    public static void main(String[] args){
        // Independent
        property apartament = new property();
        System.out.println(apartament.neigh);
        // Reference or "alias"
        property house = apartament;
        System.out.println("Time: " + house.sleep + " years");

        apartament.type = 1;
        System.out.println("Type: " + house.type + " (house)");
    }
}
