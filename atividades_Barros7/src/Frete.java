
abstract class Frete {
    private double distancia = 0; // distancia em Quilometros
    private double get = 0; // valor cobrado em Quilometros.
    public Frete(double distancia, double valorPorKm) {
        this.distancia = distancia;
        this.get = valorPorKm;
    }
    public double getDistancia() {
        return distancia;
    }
    public double getValorPorKm() {
        return get;
    }
}

