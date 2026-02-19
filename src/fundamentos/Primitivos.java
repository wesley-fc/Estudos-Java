package fundamentos;

public class Primitivos {
    public static void main(String[] args){

        // Tipos primitivos do Java.

        // ===============================
        // NÚMEROS INTEIROS (sem casas decimais)
        // Existem 4 tipos para representar números inteiros.
        // A diferença entre eles está no tamanho em bits e na faixa de valores que suportam.

        // byte: ocupa 8 bits na memória.
        // Faixa de valores: -128 a 127.
        byte inteiroDoTipoByte = 127;

        // short: ocupa 16 bits na memória.
        // Faixa de valores: -32.768 a 32.767.
        short inteiroDoTipoShort = 32767;

        // int: ocupa 32 bits na memória.
        // Faixa de valores: -2.147.483.648 a 2.147.483.647.
        int inteiroDoTipoInt = 2147483647;

        // long: ocupa 64 bits na memória.
        // Faixa de valores: -9.223.372.036.854.775.808L a 9.223.372.036.854.775.807L.
        // É necessário usar o sufixo 'L' ao declarar literais do tipo long.
        long inteiroDoTipoLong = 9223372036854775807L;

        System.out.println(inteiroDoTipoByte);
        System.out.println(inteiroDoTipoShort);
        System.out.println(inteiroDoTipoInt);
        System.out.println(inteiroDoTipoLong);

        // ===============================
        // NÚMEROS DE PONTO FLUTUANTE (com casas decimais)
        // Existem 2 tipos para representar valores decimais.
        // A diferença entre eles está na precisão e no tamanho em memória.

        // float: ocupa 32 bits na memória.
        // Representa números com precisão simples (~7 casas decimais).
        // É necessário usar o sufixo 'f' ao declarar um literal float.
        float numeroDePontoFlutuanteFloat = 3.13f;

        // double: ocupa 64 bits na memória.
        // Representa números com precisão dupla (~15 casas decimais).
        // É o tipo padrão para números decimais em Java.
        double numeroDePontoFlutuanteDouble = 21.313141;

        System.out.println(numeroDePontoFlutuanteFloat);
        System.out.println(numeroDePontoFlutuanteDouble);

        // ===============================
        // REPRESENTAÇÃO DE TEXTO E CARACTERES

        // Para representar palavras (sequência de caracteres) em Java,
        // utilizamos a classe String.
        // Strings são delimitadas por aspas duplas.
        String meuNome = "Wesley Freitas Costa";
        System.out.println(meuNome);

        // Para representar um único caractere, utilizamos o tipo primitivo char.
        // O tipo char ocupa 16 bits e representa caracteres no padrão Unicode.
        // É delimitado por aspas simples.
        char meuGenero = 'M';
        System.out.println(meuGenero);

        // ===============================
        // REPRESENTAÇÃO DE VALORES LÓGICOS

        // O tipo boolean representa valores lógicos.
        // Possui apenas dois possíveis valores: true ou false.
        boolean meuBooleanTrue = true;
        boolean meuBooleanFalse = false;

        System.out.println(meuBooleanTrue);
        System.out.println(meuBooleanFalse);
    }
}
