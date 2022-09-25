package JavaAvancado;

public class Conta {
    String cliente;
    double saldo;

    void exibeSaldo(){
        System.out.println(cliente + " seu salde é de $ " + saldo);
    }
    void saca(double valor){
        saldo -= valor;
    }
    void deposita(double valor){
        saldo += valor;
    }
    void transfereParaDestino(Conta destino, double valor){
        this.saca(valor);
        destino.deposita(valor);
    }
}
