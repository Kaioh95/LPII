
public class Turma{
    // variáveis de instância
    private Aluno aluno1;
    private Aluno aluno2;
    private Aluno aluno3;

    /**
     * Ccnstrutor para objetos da classe Turma
     */
    public Turma(){
        // inicializa variáveis de instância
        aluno1 = new Aluno();
        aluno2 = new Aluno();
        aluno3 = new Aluno();
    }

    public void set_aluno1(double prova1Parte1, double prova1Parte2, double prova2Parte1, double prova2Parte2){
        aluno1.set_prova1(prova1Parte1, prova1Parte2);
        aluno1.set_prova2(prova2Parte1, prova2Parte2);
    }

    public void set_aluno2(double prova1Parte1, double prova1Parte2, double prova2Parte1, double prova2Parte2){
        aluno2.set_prova1(prova1Parte1, prova1Parte2);
        aluno2.set_prova2(prova2Parte1, prova2Parte2);
    }

    public void set_aluno3(double prova1Parte1, double prova1Parte2, double prova2Parte1, double prova2Parte2){
        aluno3.set_prova1(prova1Parte1, prova1Parte2);
        aluno3.set_prova2(prova2Parte1, prova2Parte2);
    }

    public double calcularMedia(){
        double n1 = aluno1.calcularMedia();
        double n2 = aluno2.calcularMedia();
        double n3 = aluno3.calcularMedia();

        return (n1+n2+n3) / 3;
    }
}