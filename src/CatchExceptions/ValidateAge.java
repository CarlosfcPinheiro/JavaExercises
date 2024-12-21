package CatchExceptions;

public class ValidateAge {
    public static void Validate(int age) throws AgeLessThanZeroException {
        if (age < 0){
            throw new AgeLessThanZeroException();
        } else {
            return;
        }
    }
}
