package fundamentos;

public class Condicionais {
    public static void main(String[] args) {

        // ===============================
        // CONDICIONAL SIMPLES: if / else
        // O bloco dentro do if é executado quando a condição é true.
        // Caso a condição seja false, o bloco else (se existir) é executado.

        boolean bool = false;

        // A condição pode ser controlada por uma variável booleana.
        if (bool) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        // ===============================
        // A condição também pode ser uma expressão comparativa.

        // Operadores de comparação:
        //   >   maior que
        //   >=  maior ou igual a
        //   <   menor que
        //   <=  menor ou igual a
        //   ==  igual (comparação de valores em tipos primitivos)
        //   !=  diferente

        if (10 < 100) {
            System.out.println("10 é menor que 100");
        } else {
            System.out.println("10 é maior ou igual a 100");
        }

        // ===============================
        // OPERADORES LÓGICOS
        // São usados para combinar múltiplas condições booleanas.

        // &&  (AND lógico)
        // Retorna true se ambas as condições forem verdadeiras.
        if (10 < 100 && 5 > 1) {
            System.out.println("Ambas as condições são verdadeiras (AND).");
        }

        // ||  (OR lógico)
        // Retorna true se pelo menos uma das condições for verdadeira.
        if (10 > 100 || 5 > 1) {
            System.out.println("Pelo menos uma condição é verdadeira (OR).");
        }

        // !  (NOT lógico)
        // Inverte o valor booleano.
        boolean ativo = false;
        if (!ativo) {
            System.out.println("A variável foi invertida com NOT.");
        }

        // Observação importante:
        // O operador && e || utilizam short-circuit.
        // Isso significa que:
        // - No &&, se a primeira condição for false, a segunda não é avaliada.
        // - No ||, se a primeira condição for true, a segunda não é avaliada.

        // ===============================
        // O else é opcional.

        // Em Java, Strings são objetos.
        // Para comparar o conteúdo (igualdade lógica), usamos equals().
        // equals() retorna true se forem iguais e false caso contrário.

        if ("wesley".equals("weslley")) {
            System.out.println("'wesley' é igual a 'weslley'");
        } else {
            System.out.println("'wesley' é diferente de 'weslley'");
        }

        // ===============================
        // ELSE IF
        // Permite encadear múltiplas condições.
        // Assim que uma condição for verdadeira, as demais não são avaliadas.

        String nome = "ok";

        if (nome.isBlank()) {
            System.out.println("Nome está vazio (ou contém apenas espaços).");
        } else if (nome.equals("wesley")) {
            System.out.println("Wesley");
        } else {
            System.out.println("Não está vazia, mas também não é 'wesley'.");
        }

        // ===============================
        // SWITCH / CASE
        // Usado quando queremos comparar o mesmo valor contra vários casos possíveis.
        // Alternativa ao if/else if quando testamos igualdade de um único valor.
        // Se esquecermos o break, ocorre o fall-through.

        String fruta = "maca";

        switch (fruta) {
            case "banana":
                System.out.println("A fruta é banana");
                break;
            case "abacaxi":
                System.out.println("A fruta é abacaxi");
                break;
            case "maca":
                System.out.println("A fruta é maçã");
                break;
            default:
                System.out.println("Não é nenhuma fruta conhecida");
        }

        // ===============================
        // SWITCH EXPRESSION (Java 14+)
        // Forma moderna com "->".
        // Não precisa de break e pode retornar valor.

        int numero = 2;

        String resultado = switch (numero) {
            case 1 -> "um";
            case 2 -> "dois";
            case 3 -> "três";
            default -> "desconhecido";
        };

        System.out.println(resultado);

        // ===============================
        // QUANDO USAR SWITCH?
        // Use switch quando:
        // - você está comparando o mesmo valor;
        // - há vários casos fixos;
        // - deseja código mais organizado.
        //
        // Use if/else quando:
        // - há comparações diferentes;
        // - precisa combinar condições com operadores lógicos (&&, ||, !).
    }
}