package equals_hashcode.equals_.model.entities;
import java.util.Objects;

public class Client {
    private String name;
    private String email;

    public Client(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    //um cliente sera igual a outro se os nomes foram iguais:
    @Override
    public boolean equals(Object obj){
        if(this == obj){ //ve se a referencia do objeto é igual
            return true;
        }
        if(obj == null){ //ve se o objeto q vc ta comparando é nulo
            return false;
        }
        if(getClass() != obj.getClass()){ //ve se o objeto tem a mesma classe
            return false;
        }
        Client other = (Client) obj; //inicialmente o obj é object, mas para acessar o name, precisa ser client, por isso o downcast
        if(name == null){ //se o nome do objeto for nulo 
            if(other.name != null){ //e o nome do outro nao for nulo
                return false;
            }
        }
        else if(!name.equals(other.name)){ //se nao for igual
            return false;
        }
        return true; //se nada do que rolou acima acontecer, retorna que sao iguais
    }
}
