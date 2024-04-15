public class Main {
    public static void main(String[] args) {
        String nome1 = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome1, idade, valor));
        String nome = "João";
        int aulas = 4;
        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome, aulas);
        System.out.println(mensagem);
        int x = 10;
        double y = x; // casting implícito
        double x1 = 10.5;
        int y1 = (int) x; // casting explícito
        String saudacao = "Olá, meu nome é ";
        String nome2 = "Alice ";
        String continuacao = "e minha idade é ";
        int idade2 = 17;
        System.out.println(saudacao + nome2 + continuacao + idade2);
    }
}
