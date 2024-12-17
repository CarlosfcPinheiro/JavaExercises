package RegisterSchool;

public class Student extends EntitySchool{

    public Student(String id, String name){
        super(id, name);
    }

    @Override
    public String toString(){
        return "Student [id=" + this.getId() + ", name=" + this.getName() + "]";
    }
}
