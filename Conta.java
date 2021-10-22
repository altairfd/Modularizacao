package contas;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void statusConta() {
        System.out.println("=====================================");
        System.out.println("Numero da Conta : " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono da conta: " + this.getDono());
        System.out.println("Saldo atual da conta: " + this.getSaldo());
        if (this.getStatus() == false) {
            System.out.println("A conta não foi encontrada");
        } else {
            System.out.println("A conta se encontra ativa");
        }
    }

    public void Conta() {
        this.setSaldo(0f);
        this.setStatus(false);;
    }

    public void abrirConta(String tipo) {
       this.setTipo(tipo);
       this.setStatus(true);
        if (tipo == "CC") {
            this.setSaldo(50f);
        }else {
            this.setSaldo(150f);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Ação inválida! Conta com extrato positivo");
        }else if (this.getSaldo() < 0) {
            System.out.println("Ação inválida! Você está em débito com o bando");
        }else{
            setStatus(false);
        }
    }

    public void depositar(Float valor) {
        if(this.getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        }else {
            System.out.println("Conta inválida! Verifique se a conta ainda esta aberta");
        }
        
    }

    public void sacar(float valor) {
        if (this.getStatus()) {
            if (this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
            }else if (this.getSaldo() < valor){
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Conta inválida, verifique se a conta ianda está aberta");
        }
    }

    public void pagarMensal() {
        float valor = 0f;
        if (this.getTipo() == "CC"){
            valor = 12.0f;
        }else if (this.getTipo() == "CP") {
            valor = 20.0f;
        }if (this.getStatus() == true) {
            if (this.getSaldo() > valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Mensalidade paga por " + this.getDono());
            }
        }else{
            System.out.println("Conta incorretra");
        }

    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getDono() {
        return dono;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }   

    public float getSaldo() {
        return saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }
}   

