package RegisterSchool;

public class Main {
    public static void main (String[] args){
        Register<EntitySchool> register = new Register<>();

        Student student = new Student("KAK12-3", "Carlos");
        Professor professor = new Professor("BNMAS12-1", "Albert");
        Student student2 = new Student("HAGS-34", "Pedro");

        register.addRegister(student);
        register.addRegister(professor);
        register.addRegister(student2);

        register.showAllRegisters();

        Object findRegister = register.searchById("KAK12-3");
        System.out.println("\nRegister found: " + findRegister);
    }
}
