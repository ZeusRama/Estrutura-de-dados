package ME1;
import Atividade02Vetor.Aluno;
import Atividade02Vetor.Vetor;

public class MEPrograma {
    public static void main(String[] args) {
        Vetor vetor = new Vetor();

        Aluno a1 = new Aluno("Aluno1");
        Aluno a2 = new Aluno("Aluno2");
        Aluno a3 = new Aluno("Aluno3");
        Aluno a4 = new Aluno("Aluno4");
        Aluno a5 = new Aluno("Aluno5");
        Aluno a6 = new Aluno("Aluno6");
        Aluno a7 = new Aluno("Aluno7");
        Aluno a8 = new Aluno("Aluno8");
        Aluno a9 = new Aluno("Aluno9");
        Aluno a10 = new Aluno("Aluno10");
        Aluno a11 = new Aluno("Aluno11");
        Aluno a12 = new Aluno("Aluno12");
        Aluno a13 = new Aluno("Aluno13");
        Aluno a14 = new Aluno("Aluno14");
        Aluno a15 = new Aluno("Aluno15");
        Aluno a16 = new Aluno("Aluno16");
        Aluno a17 = new Aluno("Aluno17");

        vetor.adiciona(a1);
        vetor.adiciona(a2);
        vetor.adiciona(a3);
        vetor.adiciona(a4);
        vetor.adiciona(a5);
        vetor.adiciona(a6);
        vetor.adiciona(a7);
        vetor.adiciona(a8);
        vetor.adiciona(a9);
        vetor.adiciona(a10);
        vetor.adiciona(a11);
        vetor.adiciona(a12);
        vetor.adiciona(a13);
        vetor.adiciona(a14);
        vetor.adiciona(a15);

        System.out.println("Vetor com 15 alunos: " + vetor.toString());

        vetor.remove(0);
        vetor.remove(1);
        System.out.println("Vetor apos remocao 2 alunos: " + vetor.toString());

        vetor.adiciona(0,a16);
        vetor.adiciona(1, a17);

        System.out.println("Vetor adicionando 2 alunos: " + vetor.toString());
    }
}
