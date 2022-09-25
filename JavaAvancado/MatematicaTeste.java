package JavaAvancado;

public class MatematicaTeste {
    public static void main(String args[]) {
        Matematica testes = new Matematica();
        int maior = testes.maior(20, 40);
        System.out.println(maior);

        double raiz = (int) testes.raiz(64);
        System.out.println(raiz);

        double soma = testes.soma(20.5, 30);
        System.out.println(soma);
    }
}
