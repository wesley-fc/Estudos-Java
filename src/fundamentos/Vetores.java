package fundamentos;

public class Vetores {
    public static void main(String[] args) {
        // Vetores (arrays) em Java são estruturas que armazenam vários valores do mesmo tipo
        // em uma única variável, organizados por índice.

        // Em Java, "vetor" normalmente significa "array". Ele permite guardar vários dados do mesmo tipo
        // (int, double, String, etc.) em sequência.

        // 1) Como declarar um vetor:
        // tipo[] identificador; // forma mais comum
        // int[] numeros;
        // (Dessa forma, apenas declaramos; ainda não criamos espaço na memória.)
        int[] numeros;

        // 2) Como criar (instanciar) um vetor:
        numeros = new int[5];
        // Agora temos um vetor com 5 posições.

        // Índices sempre começam em 0.
        // Então esse vetor tem:
        // índice: 0 1 2 3 4
        // valor:  0 0 0 0 0
        // Como é int, o valor padrão é 0.

        // Declarar e criar ao mesmo tempo:
        int[] numeros2 = new int[5];

        // Ou já com valores definidos:
        int[] numeros3 = {10, 20, 30, 40, 50};

        // Acessando elementos:
        System.out.println(numeros3[0]); // primeiro elemento
        System.out.println(numeros3[4]); // último elemento

        // Se tentarmos acessar um índice que não existe, vai gerar:
        // ArrayIndexOutOfBoundsException

        // Alterando valores em um determinado índice:
        numeros3[0] = 100;
        System.out.println(numeros3[0]);

        // Percorrendo um vetor (for tradicional):
        // O atributo length retorna o tamanho do vetor.
        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }

        // For melhorado (for-each):
        // Esse é mais simples quando você só quer ler os valores.
        for (int numero : numeros3) {
            System.out.println(numero);
        }

        // Vetor de String:
        String[] nomes = {"Wesley", "Allan", "Larisse"};
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Características importantes:
        // - Tamanho fixo (não cresce depois de criado).
        // - Armazena apenas um tipo de dado.
        // - Índice começa em 0.
        // - Possui atributo length.

        // Quando usar vetor (array)?
        // - Quando você sabe o tamanho fixo dos dados.
        // - Quando quer uma estrutura simples e direta.
    }
}