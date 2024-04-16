public class IdadePessoa{
    private String nome;
    private int idade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String toString(){
        return "Nome:" + getNome() + "\n" + "Idade:" + getIdade();
    }

    public void verificaIdade() {
        if (idade >= 18) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("É menor de idade");

        }
    }
    public static void main(String[] args){
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.nome = "Joao Alves";
        pessoa1.idade = 20;
        System.out.println(pessoa1.toString());
        pessoa1.verificaIdade();

        }
    }

