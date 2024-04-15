public class Ex1 {
    public static void main(String[] args) {
        double n1 = 9;
        int n2 = 10;
        double n = n2;
        double media;
        char letra = 'A';
        String palavra = "média é:";
        double precoProduto = 5.7;
        int quantidade = 5;
        double valorTotal = precoProduto * quantidade;
        double valorEmDolares = valorTotal * 4.94;
        double precoOriginal = 10.00;
        double percentualDesconto = 0.10;
        double valorDesconto = precoOriginal * percentualDesconto;
        double novoPreco = valorTotal - valorDesconto;
        System.out.println(letra + " " + palavra);
        media = (n1 + n2) / 2;
        System.out.println(media);
        System.out.println("O valor total é: " + valorTotal) ;
        System.out.println("O valor em dólares: %.2f".formatted(valorEmDolares));
        System.out.println( "Valor do desconto: " + valorDesconto);
        System.out.println( "Valor com desconto: " + novoPreco);


    }
}
