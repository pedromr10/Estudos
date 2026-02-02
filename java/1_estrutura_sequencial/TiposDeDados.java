public class TiposDeDados
{
	public static void main(String[] args) {
        //1 - tipos de dados:
        int idade = 22; //int = num inteiro;
        double pi = 3.14159; //double = num com ponto flutuante
        double altura = 1.65;
        char sexo = 'M'; //char = um unico caractere
        boolean maiorDeIdade = true; //boolean = verdadeiro ou falso
        String nome = "Pedro";

        //2 - saida de dados:
        //texto:
        System.out.println("Ola, mundo!");
        //int:
        System.out.println(idade);
        //double:
        System.out.println(pi);
        //double com casas decimais: (note que é printf - f de formatado)
        System.out.printf("%.2f", pi);
        //double com casas decimais e com quebra de linha no fim (%n):
        System.out.printf("%.3f%n", pi);
        //concatenando elementos:
        System.out.println("Eu tenho " + idade + " anos!");
        //elementos na mesma string:
        System.out.printf("O numero de pi é: %f", pi);
        //print de tudo?
        System.out.printf("%nMeu nome é %s, tenho %d anos. Tenho %.2f m de altura e sou do sexo %s", nome, idade, altura, sexo);

	}
}

/* 
OBS:
    1. %f é para numero com ponto flutuante
    2. %n é para quebra de linha
    3. printf print formatado
*/