public class Hamburguer extends Pizza{
    private String nome;
    private double valor;
    private boolean artesanal;

    public void valorHamburguer(double valor){
        this.valor = valor;
        if (artesanal == true){
            this.valor = valor + 8;
        }
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
