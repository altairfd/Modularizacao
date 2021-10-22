import contas.Conta;

public class Caixa {
    public static void main(String[] args) throws Exception {
        Conta conta1 = new Conta();
        conta1.setNumConta(0001);
        conta1.setDono("Altair");
        conta1.abrirConta("CC");
        conta1.depositar(100f);
        
        Conta conta2 = new Conta();
        conta2.setNumConta(0002);
        conta2.setDono("Fernanda");
        conta2.abrirConta("CP");
        conta2.depositar(500f);
        conta2.sacar(150f);
        conta2.sacar(1000f);

        conta1.fecharConta();

        conta1.statusConta();
        conta2.statusConta();
        
    }
}
