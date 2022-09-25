package JavaAvancado.SuperclasseAnimal;

public class TesteGalinha {
    public static void main(String args[]){
        Galinha galinha = new Galinha();
        galinha.comida = "Pequenos animais";
        galinha.peso = 0.3;
        galinha.fazerBarulho();
        galinha.movimentar();
        galinha.comer();
        galinha.voar();
        galinha.botarOvo();
    }
}
