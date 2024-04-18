import java.util.Arrays;

public class Aluno {
    private String nome;
    private double notas;


    public Aluno(String nome) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return nome;
    }
    public double calculaMedia(double n1,double n2,double n3,double n4,double n5){
        double media = 0;
        media = (n1 + n2 + n3 + n4 + n5) / 5;
        return media;
    }
    public static void main(String[] args){
        Aluno aluno = new Aluno("Ana");
        System.out.printf("A média do aluno(a) " + aluno + " é " + aluno.calculaMedia(3.0,6.0,7.6,8.9,10.0));


    }
}
