package fundamentos;

public class ArquivoInicial {
    // Todo código Java deve estar dentro de uma classe.
    // Não é permitido ter código solto fora de classes.
    // Um arquivo .java pode conter várias classes.
    // Apenas uma classe pode ser pública por arquivo.
    // Se existir uma classe pública, o nome do arquivo deve ser exatamente igual ao nome dessa classe.
    // As demais classes devem ser não públicas.

    // 1) public:
    // "public" significa que o método pode ser acessado de qualquer lugar.
    // A JVM precisa conseguir acessar esse método para iniciar o programa.

    // 2) static:
    // Significa que o método pertence à classe, e não a um objeto.
    // Isso é importante porque a JVM chama o método main sem criar um objeto da classe.
    // Se não fosse static, seria necessário criar um objeto primeiro.

    // 3) void:
    // Significa que o método não retorna nenhum valor.
    // O método main apenas executa o programa; ele não precisa retornar nada.

    // 4) main:
    // É o nome padrão que a JVM procura como ponto de entrada do programa.

    // 5) String[] args:
    // É um array de Strings.
    // Ele serve para receber argumentos passados pela linha de comando.
    public static void main(String[] args) {
        // System -> classe do Java.
        // out -> saída padrão (console).
        // println -> imprime e pula linha.
        System.out.println("Hello World!");
    }
}

class Carro {
}

