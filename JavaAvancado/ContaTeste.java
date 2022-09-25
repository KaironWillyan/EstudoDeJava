package JavaAvancado;

public class ContaTeste {
    public static void main(String args[]){
        Conta conta1 = new Conta();
        conta1.cliente = "Kairon";
        conta1.saldo = 4_000.00;
        conta1.exibeSaldo();

        conta1.saca(2000);
        conta1.exibeSaldo();

        conta1.deposita(8000);
        conta1.exibeSaldo();

        Conta conta2 = new Conta();
        conta2.cliente = "Josefredo";
        conta2.saldo = 3_000.00;
        conta2.exibeSaldo();

        conta1.transfereParaDestino(conta2, 3000);

        conta1.exibeSaldo();
        conta2.exibeSaldo();
    }
}
