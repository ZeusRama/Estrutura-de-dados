package Atividade04Celula;

public class Questao3 {
    public static void main(String[] args) {
        // Teste 1
        ListaLigada lista = new ListaLigada();

        lista.adiciona("Rafael");
        lista.adiciona("Paulo");
        System.out.println(lista);

        // Teste 2
        ListaLigada lista2 = new ListaLigada();
        lista2.adiciona("Rafael");
        lista2.adiciona(0, "Paulo");
        lista2.adiciona(1, "Camila");
        System.out.println(lista2);

        // Teste 3
        ListaLigada lista3 = new ListaLigada();
        lista3.adiciona("Rafael");
        lista3.adiciona("Paulo");
        System.out.println(lista3.pega(0));
        System.out.println(lista3.pega(1));

        // Teste 4
        ListaLigada lista4 = new ListaLigada();
        lista4.adiciona("Rafael");
        lista4.adiciona("Paulo");
        lista4.adiciona("Camila");
        lista4.remove(1);

        // Teste 5
        ListaLigada lista5 = new ListaLigada();
        lista5.adiciona("Rafael");
        lista5.adiciona("Paulo");
        System.out.println(lista5.tamanho());
        lista5.adiciona("Camila");
        System.out.println(lista5.tamanho());

        // Teste 6
        ListaLigada lista6 = new ListaLigada();
        lista6.adiciona("Rafael");
        lista6.adiciona("Paulo");
        System.out.println(lista6.contem("Rafael"));
        System.out.println(lista6.contem("Camila"));

        // Teste 7
        ListaLigada lista7 = new ListaLigada();
        lista7.adicionaNoComeco("Rafael");
        lista7.adicionaNoComeco("Paulo");
        System.out.println(lista7);

        // Teste 8
        ListaLigada lista8 = new ListaLigada();
        lista8.adiciona("Rafael");
        lista8.adiciona("Paulo");
        lista8.removeDoComeco();
        System.out.println(lista8);

        // Teste 9
        ListaLigada lista9 = new ListaLigada();
        lista9.adiciona("Rafael");
        lista9.adiciona("Paulo");
        System.out.println(lista9);
    }
}