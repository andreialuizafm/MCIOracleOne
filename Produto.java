public class Produto {
    private String  nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
    public double aplicarDesconto(double desconto){
        preco = preco - (preco * desconto);
        return preco;
    }
    public static void main(String[] args){
        Produto produto = new Produto("Notebook", 3000.00);
        produto.aplicarDesconto(0.10);
        System.out.println(produto);

    }

}
