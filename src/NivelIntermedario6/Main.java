package NivelIntermedario6;

public class Main {
    public static void main(String[] args) {
    EquipamentosNinja kunai = new EquipamentosNinja("Kunai de ferro");
    EquipamentosNinja Shuriken = new EquipamentosNinja("Shuriken");
    EquipamentosNinja pergaminho = new EquipamentosNinja("pergaminho");

    BolsaGenerica<EquipamentosNinja> bolsa1 = new BolsaGenerica<>();
    bolsa1.adicionarEquipamentos(kunai);
    bolsa1.adicionarEquipamentos(Shuriken);
    bolsa1.adicionarEquipamentos(pergaminho);

        System.out.println(bolsa1);


    }
}
