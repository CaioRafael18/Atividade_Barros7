import java.util.ArrayList;
import java.util.List;

public class CadastroFrete{
    private List<Fretavel> fretes;
    public CadastroFrete() {
        fretes = new ArrayList<>();
    }
    public void adicionarFrete(Fretavel frete) {
        fretes.add(frete);
    }
    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Fretavel frete : fretes) {
            valorTotal += frete.calcularFrete();
        }
        return valorTotal;
    }
}
