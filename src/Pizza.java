public class Pizza {
    private String nome;
    private double valor;
    private boolean borda;

    public void valorPizza(double valor){
        this.valor = valor;
        if (borda == true){
            this.valor = valor * 0.05;
        }else {
            System.out.println("sem acrescimo de borda");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
