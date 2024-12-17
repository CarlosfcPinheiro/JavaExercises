package RegisterSchool;

import java.util.ArrayList;
import java.util.List;

public class Register<T extends EntitySchool> {
    private List<T> registerList;

    public Register(){
        registerList = new ArrayList<>();
    }

    public void addRegister(T register){
        registerList.add(register);
    }

    public T searchById(String id){
        for (T register : registerList){
            if (register.getId().equals(id)){
                return register;
            }
        }

        return null;
    }

    public void showAllRegisters(){
        for (T register : registerList){
            System.out.println(register);
        }
    }
}
