package exceptions.customExceptions.model.exceptions;


//RuntimeException - o compilador nao obriga vc a tratar, porem quebra o programa (aparentemente)
//Exception - o compilador obriga vc a tratar
public class DomainException extends RuntimeException{
    public DomainException(String msg){
        super(msg);
    }
}

/*
obs: esse domainexception extende a classe runtimeexception, mas ela é personalizada.
a gente cria uma nova exception no entities.reservation
*/
