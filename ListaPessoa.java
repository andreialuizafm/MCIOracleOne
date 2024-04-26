import java.util.ArrayList;
public class ListaPessoa {
    String nome;
    int idade;

    public ListaPessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String toString() {
        return "Nome: " + nome + "," + "Idade: " + idade;
    }

    public static void main(String[] args) {
        ListaPessoa Andreia = new ListaPessoa("Andréia", 41);
        ListaPessoa Rodrigo = new ListaPessoa("Rodrigo", 43);
        ListaPessoa Laura = new ListaPessoa("Laura", 25);
        ArrayList<ListaPessoa> listapessoas = new ArrayList<>();
        listapessoas.add(Andreia);
        listapessoas.add(Rodrigo);
        listapessoas.add(Laura);
        System.out.println("Minha lista tem " + listapessoas.size() + " nomes");
        System.out.println("O primeiro nome da lista é " + listapessoas.get(0).nome);
        for (int i = 0; i < listapessoas.size(); i++) {
            System.out.println(listapessoas.get(i));
        }
    }
}

