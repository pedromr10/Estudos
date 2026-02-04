package orientacao_objeto.membros_estaticos.util;

public class CurrencyConverter {
    //funcao para converter:
    public static double converter(double dolar, double amount){
        return (dolar*amount + (0.06*dolar*amount));
                //620      +   37,2
    }
}
