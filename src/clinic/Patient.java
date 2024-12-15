package clinic;

import java.io.Serializable;

public class Patient extends People implements Data{
    private String allergy;
    private String agreement;

    public Patient(
            String name,
            String phone,
            String gender,
            int age,
            String allergy,
            String agreement
    ){
        super(name, phone, gender, age);
        this.allergy = allergy;
        this.agreement = agreement;
    }

    public void entryData(String name, int age){
        super.entryData(name, age);
    }

    public void showData(){
        super.showData();
        System.out.println("Allergy: " + this.allergy);
        System.out.println("Agreement: " + this.agreement);
    }
}
