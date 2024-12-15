package clinic;

public class Doctor extends People implements Data{
    private String CRM;
    private String specialty;

    public Doctor(
            String name,
            String phone,
            String gender,
            int age,
            String CRM,
            String specialty){
        super(name, phone, gender, age);
        this.CRM = CRM;
        this.specialty = specialty;
    }

    public void entryData(String name, int age){
        super.entryData(name, age);
    }

    public void showData(){
        super.showData();
        System.out.println("CRM: " + this.CRM);
        System.out.println("Specialty: " + this.specialty);
    }
}
