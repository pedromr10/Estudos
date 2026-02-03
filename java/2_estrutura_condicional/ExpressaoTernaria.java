public class ExpressaoTernaria {
    public static void main(String[] args){
        //estrutura: (condicao) ? valor_se_verdadeiro : valor_se_falso
        //exemplo: (2 > 4) ? 50 : 80
        //como seria sem ternario:
        double preco1 = 34.5;
        double desconto1;
        if(preco1 < 20.0){
            desconto1 = preco1 * 0.1;
        }
        else{
            desconto1 = preco1 * 0.05;
        }

        //com ternario:
        double preco2 = 34.5;
        double desconto2 = (preco2 < 20.0) ? preco2 * 0.1 : preco2 * 0.05;
    }
}
