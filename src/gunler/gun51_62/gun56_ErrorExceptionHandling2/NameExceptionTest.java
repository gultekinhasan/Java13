package gunler.gun51_62.gun56_ErrorExceptionHandling2;
import gunler.gun51_62.gun56_ErrorExceptionHandling2.Exceptions.NameException;
public class NameExceptionTest {
    public static void nameValidation(String str) throws NameException {
        if(str.length() < 3){
            throw new NameException("Name 3 harften küçük olamaz");
        }
    }
    public static void main(String[] args) {
        String name = "12";

        try {
            nameValidation(name);
        }catch (NameException ne){
            System.out.println(ne);
        }
        System.out.println("Program sona erdi.");
    }
}
