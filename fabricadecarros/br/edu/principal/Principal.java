public class Principal {
    public static void main(String[] args) {
        Veiculos veiculo = criarVeiculo(args[0]);
        veiculo.buzinar();
    }
    public static Veiculos criarVeiculos(String Tipo){
        if(Tipo.equals("jeep")){
            return new jeep();
        }
        if(Tipo.equals("suv")){
            return new SUV();
        }
        if(Tipo.equals("Passeio")){
            return new carroPasseio();
        }
        if(Tipo.equals("Tanque")){
            return new carCombat();
        }
    }
}
