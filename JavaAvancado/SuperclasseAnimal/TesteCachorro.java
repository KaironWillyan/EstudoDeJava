package JavaAvancado.SuperclasseAnimal;

public class TesteCachorro {
    public static void main(String args[]){
        Cachorro doguinho = new Cachorro();
        doguinho.comida = "Dog Premim";
        doguinho.nome = "Paçoca";
        doguinho.peso = 7;
        doguinho.fazerBarulho();
        doguinho.movimentar();
        doguinho.comer();
        doguinho.dormir();
        doguinho.enterrarOsso();
    }
}
