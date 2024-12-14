package people;

public class Adult extends Person{
    private String rg;
    private String cpf;

    public Adult(String name, int age, String gender, String rg, String cpf){
        super(name, age, gender);
        this.rg = rg;
        this.cpf = cpf;
    }

    public void readData(){
        super.readData();
        System.out.printf("\nRG: %s", this.rg);
        System.out.printf("\nCPF: %s\n", this.cpf);
    }
}
