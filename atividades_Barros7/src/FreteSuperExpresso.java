public class FreteSuperExpresso extends FreteExpresso implements Fretavel{
    int valorDoSeguro = 0;
    public FreteSuperExpresso(double distancia, double valorPorKm, int nivelUrgencia, int i){
        super(distancia,valorPorKm,nivelUrgencia);
        this.valorDoSeguro = valorDoSeguro;
    }

    public int getValorDoSeguro() {
        return valorDoSeguro;
    }

    public double calcularFrete() {
        return (getDistancia() * getValorPorKm()) + (getNivelUrgencia() * 100) + getValorDoSeguro();
    }
}
