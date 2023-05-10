public class Principal {
    public static void main(String[] args) {
        CadastroFrete cadastro = new CadastroFrete();
        // Adicionando fretes
        FretePadrao fretePadrao = new FretePadrao(100, 10);
        cadastro.adicionarFrete(fretePadrao);

        FreteExpresso freteExpresso = new FreteExpresso(200, 15, 2);
        cadastro.adicionarFrete(freteExpresso);

        FreteSuperExpresso freteSuperExpresso = new FreteSuperExpresso(300, 20, 3, 100);
        cadastro.adicionarFrete(freteSuperExpresso);

        // Calculando o valor total
        double valorTotal = cadastro.calcularValorTotal();
        System.out.println("Valor total dos fretes cadastrados: R$" + valorTotal);
    }
}
