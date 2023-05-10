public class FretePadrao extends Frete implements Fretavel{
    public FretePadrao(double distancia, double valorPorKm) {
        super(distancia, valorPorKm);
    }
    public double calcularFrete() {
        return getDistancia() * getValorPorKm();
    }

}
