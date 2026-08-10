package Universities;

public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException(String e){
        super(e);
    }
}