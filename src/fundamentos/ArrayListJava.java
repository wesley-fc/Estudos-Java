package fundamentos;

import java.util.ArrayList;

public class ArrayListJava {
    public static void main(String[] args) {

        // ArrayList é uma coleção dinâmica que pode crescer e diminuir automaticamente,
        // diferente do array tradicional, que tem tamanho fixo.

        // ArrayList faz parte do pacote: java.util.ArrayList
        // Ele é uma implementação da interface List.

        // Diferença principal:

        // Array:
        // - Tamanho fixo.
        // - Usa [] para acesso.
        // - Pode armazenar tipos primitivos.

        // ArrayList:
        // - Cresce automaticamente.
        // - Usa métodos (add, remove, get, set, etc.).
        // - Armazena apenas objetos.

        // Declarando um ArrayList.
        // ArrayList não aceita tipos primitivos diretamente.
        // Então usamos Wrapper Classes:
        // int -> Integer
        // double -> Double
        // char -> Character
        // boolean -> Boolean
        ArrayList<Integer> numeros = new ArrayList<>();

        // O método add adiciona um elemento ao final da lista.
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Acessamos elementos por meio do método get passando o índice.
        // Diferente do array, que acessamos via [].
        // Os índices do ArrayList também começam em 0.
        System.out.println(numeros.get(0));
        System.out.println(numeros.get(1));
        System.out.println(numeros.get(2));

        // Para atualizar um valor em determinado índice utilizamos o método set.
        // O primeiro argumento é o índice, e o segundo é o novo valor.
        numeros.set(0, 100);
        System.out.println(numeros.get(0));

        // Para remover um elemento de um ArrayList utilizamos o método remove.
        // Podemos remover informando:
        // - Um índice
        // - Ou um objeto específico

        numeros.remove(1); // remove pelo índice

        // Quando removemos um elemento, todos os elementos à direita
        // são deslocados uma posição para a esquerda.

        // Exemplo:
        // índice:  0   1   2
        // valor:  100 20  30
        // Removendo o índice 1:
        // índice:  0   1
        // valor:  100 30

        // Removendo elemento a partir do valor:
        // É importante usar Integer.valueOf para evitar ambiguidade
        // entre remover por índice e remover por valor.
        numeros.remove(Integer.valueOf(100));

        // O tamanho do ArrayList é retornado pelo método size().
        // Removemos dois elementos, agora o ArrayList tem tamanho 1.
        System.out.println(numeros.size());

        // Percorrendo ArrayList com for tradicional.
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        // Percorrendo ArrayList com for-each.
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        // Quando usar ArrayList?
        // - Quando não sabemos o tamanho inicial da coleção.
        // - Quando precisamos adicionar/remover elementos com frequência.
        // - Quando queremos mais flexibilidade.

        // Quando usar Array?
        // - Quando o tamanho é fixo.
        // - Quando queremos uma estrutura mais simples.
    }
}