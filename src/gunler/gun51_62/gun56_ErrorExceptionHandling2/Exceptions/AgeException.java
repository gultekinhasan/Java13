package gunler.gun51_62.gun56_ErrorExceptionHandling2.Exceptions;

public class AgeException extends RuntimeException {//Unchecked exception
    public AgeException(String mesaj){
        super(mesaj);
    }
    /*public AgeException(String mesaj, Throwable cause){
        super(mesaj,cause);
    }*/
}

