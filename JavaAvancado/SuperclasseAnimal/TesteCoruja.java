package JavaAvancado.SuperclasseAnimal;

public class TesteCoruja {
    public static void main(String args[]){
        Ave coruja = new Coruja();
        coruja.comida = "Pequenos animais";
        coruja.peso = 0.3;
        coruja.fazerBarulho();
        coruja.movimentar();
        coruja.comer();
        coruja.voar();
        coruja.botarOvo();
    }
}
