package RegisterSchool;

import people.Employee;

public class Professor extends EntitySchool {

    public Professor(String id, String name){
        super(id, name);
    }

    @Override
    public String toString(){
        return "Professor [id=" + this.getId() + ", name=" + this.getName() + "]";
    }
}
