public class Strings {
    public static void main(String[] args){
        String original = "abcde FGHIJ ABC abc DEFG   ";
        
        //deixar tudo minusculo:
        String minusculo = original.toLowerCase();
        System.out.println(minusculo);

        //deixar tudo maiusculo:
        String maiusculo = original.toUpperCase();
        System.out.println(maiusculo);

        //elimina os espacos nos cantos da string:
        String trim = original.trim();
        System.out.println(trim);

        //criar outra string a partir de um indice:
        String subs = original.substring(2); //pega tudo desde o segundo caractere
        System.out.println(subs);

        //criar outra string a partir de um indice ate outro indice:
        String subs2 = original.substring(2, 7); 
        System.out.println(subs2);

        //trocar um caractere/string por outro:
        String change = original.replace('a', 'z'); 
        System.out.println(change);

        //split:
        String s = "potato apple lemon";
        String[] vect = s.split(" "); //onde vai separar
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
