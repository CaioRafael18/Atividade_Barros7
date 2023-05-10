public class FreteExpresso extends Frete implements Fretavel {
    private int nivelUrgencia = 0;
    public FreteExpresso(double distancia, double valorPorKm, int nivelUrgencia) {
        super(distancia, valorPorKm);
        this.nivelUrgencia = this.nivelUrgencia;
    }
    public int getNivelUrgencia() {
        return nivelUrgencia;
    }
    public double calcularFrete() {
        return (getDistancia() * getValorPorKm()) + (getNivelUrgencia() * 100);
    }
}
