package gunler.gun51_62.gun56_ErrorExceptionHandling2.Exceptions;

public class AddressException extends RuntimeException{ //Unchecked exception

    public AddressException(String message) {
        super(message);
    }
}