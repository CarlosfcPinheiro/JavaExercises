public class length {
    public static void main(String args[]){
        String firstname, lastname;
        byte
                text1[] = new byte[20],
                text2[] = new byte[20];
        try{
            System.out.print("Firstname: ");
            System.in.read(text1);
            System.out.print("Lastname: ");
            System.in.read(text2);
        } catch(Exception ex){
            System.out.println("Read name error...");
        }
        firstname = new String(text1);
        lastname = new String(text2);

        System.out.println("Firstname length: " + firstname.length());
        System.out.println("Lastname length: " + lastname.length());

    }
}
