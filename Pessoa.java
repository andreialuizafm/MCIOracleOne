public class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome,int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public int aumentaIdade(int idade){
        this.idade += 1;
        return this.idade;
    }
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Joao", 30);
        pessoa.aumentaIdade(30);
        System.out.println("Nome: " + pessoa.nome + " Idade: " + pessoa.idade);

    }
}
