package fundamentos;

public class Variaveis {
    public static void main(String[] args){
        // Em Java, declaramos variáveis usando:
        // tipo nomeDaVariavel = valor;

        // O tipo pode ser declarado explicitamente:
        int minhaIdade = 21;

        System.out.println(minhaIdade);

        // A variável pode ser atualizada,
        // mas o novo valor deve ser do mesmo tipo.
        minhaIdade = 22;

        System.out.println(minhaIdade);

        // String armazena textos e usa aspas duplas.
        String meuNome = "Wesley";

        System.out.println(meuNome);

        // É possível declarar sem inicializar:
        int numero;
        // Porém, não é permitido usar a variável
        // antes de atribuir um valor a ela.

        // Desde o Java 10, podemos usar inferência de tipo com 'var'.
        // O tipo é determinado automaticamente com base no valor atribuído.
        var minhaAltura = 1.86;
        // 'var' só pode ser usado para variáveis locais
        // e exige inicialização obrigatória.

        System.out.println(minhaAltura);
    }
}