void main(){
    Bicho bicho = new Bicho();

    bicho.setFome(50);
    bicho.setEnergia(50);
    bicho.setHumor("Triste");
    bicho.setNome("Pou");

    IO.println(bicho.getNome());
    IO.println(bicho.getFome());
    IO.println(bicho.getEnergia());
    IO.println(bicho.getHumor());




}