public class Prova{
    // variáveis de instância
    private double notaParte1;
    private double notaParte2;

    /**
     * Ccnstrutor para objetos da classe Turma
     */
    public Prova(){
        // inicializa variáveis de instância
        notaParte1 = 0;
        notaParte2 = 0;
    }
    public Prova(double nota1, double nota2){
        // inicializa variáveis de instância
        notaParte1 = nota1;
        notaParte2 = nota2;
    }

    public void set_notaParte1(double notaParte1){
        this.notaParte1 = notaParte1;
    }

    public void set_notaParte2(double notaParte2){
        this.notaParte2 = notaParte2;
    }

    public double calcularNotaTotal(){
        double total = notaParte1 + notaParte2;
        if(total > 10)
            return 10;
        else if(total < 0)
            return 0;
        else 
            return total;
    }
}