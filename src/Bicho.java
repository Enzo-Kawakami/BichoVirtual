public class Bicho {

    private String nome;
    private int fome;
    private int energia;
    private String humor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        if (fome <0){
            IO.println("Esfomeado");
        }else if (fome == 100){
            IO.println("Cheio");
        }else if (fome > 100){
            IO.println("Obeso");
        }else{
            this.fome = fome;
        }
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
       if(energia < 0){
           IO.println("Cansado");
       }else if(energia >= 100){
           IO.println("Virado nos trinta");
       }else{
           this.energia = energia;
       }
    }

    public String getHumor() {
        return humor;
    }

    public void setHumor(String humor) {
        this.humor = humor;
    }
    public Bicho() {
    }

}
