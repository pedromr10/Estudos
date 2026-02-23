package exceptions.customExceptions.model.exceptions;


//RuntimeException - o compilador nao obriga vc a tratar
//Exception - o compilador obriga vc a tratar
public class DomainException extends Exception{
    public DomainException(String msg){
        super(msg);
    }
}
