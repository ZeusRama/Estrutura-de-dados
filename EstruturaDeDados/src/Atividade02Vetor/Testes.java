package Atividade02Vetor;

public class Testes {
    public static void main(String[] args) {
        // Teste1
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        a1.setNome("Rafael");
        a2.setNome("Paulo");

        Vetor lista = new Vetor();
        lista.adiciona(a1);
        lista.adiciona(a2);
        System.out.println(lista);

        // Teste2
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        a3.setNome("Rafael");
        a4.setNome("Paulo");
        a5.setNome("Ana");
        Vetor lista2 = new Vetor();
        lista2.adiciona(a1);
        lista2.adiciona(0, a2);
        lista2.adiciona(1, a3);
        System.out.println(lista2);

        // Teste3
        Aluno a6 = new Aluno();
        Aluno a7 = new Aluno();
        a6.setNome("Rafael");
        a7.setNome("Paulo");

        Vetor lista3 = new Vetor();
        lista3.adiciona(a6);
        lista3.adiciona(a7);
        Aluno aluno1 = lista.pega(0);
        Aluno aluno2 = lista.pega(1);
        System.out.println(aluno1);
        System.out.println(aluno2);

        // Teste4
        Aluno a8 = new Aluno();
        Aluno a9 = new Aluno();
        a1.setNome("Rafael");
        a2.setNome("Paulo");
        Vetor lista4 = new Vetor();
        lista4.adiciona(a8);
        lista4.adiciona(a9);
        lista4.remove(0);
        System.out.println(lista4);

        // Teste5
        Aluno a10 = new Aluno();
        Aluno a11 = new Aluno();
        a10.setNome("Rafael");
        a11.setNome("Paulo");
        Vetor lista5 = new Vetor();
        lista5.adiciona(a10);
        lista5.adiciona(a11);
        System.out.println(lista.contem(a10));
        System.out.println(lista.contem(a11));
        Aluno aluno = new Aluno();
        aluno.setNome("Ana");

        // Teste6
        Aluno a12 = new Aluno();
        Aluno a13 = new Aluno();
        Aluno a14 = new Aluno();
        a12.setNome("Rafael");
        a13.setNome("Paulo");
        Vetor lista6 = new Vetor();
        lista6.adiciona(a12);
        lista6.adiciona(a13);
        System.out.println(lista.tamanho());
        lista.adiciona(a14);
        System.out.println(lista.tamanho());

        // Teste7
        Vetor vetor = new Vetor();
        long inicio = System.currentTimeMillis();

        for (int i = 1; i < 30000; i++) {
            Aluno alunovet = new Aluno();
            vetor.adiciona(alunovet);
            if (!vetor.contem(alunovet)) {
                System.out.println("Erro: aluno "
                        + aluno + " não foi adicionado.");
            }
        }
        for (int i = 1; i < 30000; i++) {
            Aluno alunovet = new Aluno();
            if (vetor.contem(alunovet)) {
                System.out.println("Erro: aluno "
                        + alunovet + " foi adicionado.");
            }
        }
        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo = " + tempo);
        // Teste8
        Vetor vetorEstoura = new Vetor();
        for (int i = 0; i < 100001; i++) {
            Aluno alunoest = new Aluno();
            vetor.adiciona(alunoest);
            vetorEstoura.garantaEspaco();
        }
    }
}