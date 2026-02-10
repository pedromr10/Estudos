package vetor.exe.entities;

public class PessoaAltura {
    private String nome;
    private int idade;
    private double altura;

    public PessoaAltura(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public static double avgAltura(PessoaAltura[] vect){
        double soma = 0.0;
        for(int i = 0;i<vect.length;i++){
            soma += vect[i].getAltura();
        }
        return soma/vect.length;
    }

    public static double menos16anos(PessoaAltura[] vect){
        double pctg = 0.0;
        for(int i = 0;i<vect.length;i++){
            if(vect[i].getIdade() < 16){
                pctg++;
            }
        }
        return (pctg/vect.length)*100;
    }
}
