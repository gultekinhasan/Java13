package gunler.gun51_62.gun56_ErrorExceptionHandling2.Exceptions;

public class NameException extends Exception{ //Checked exception. Compiler tarafindan denetlenen
    public NameException(String message) {
        super(message);
    }
}
