public class Bicho {

    private String nome;
    private int fome;
    private int energia;
    private int humor;

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

    public int getHumor() {
        return humor;
    }

    public void setHumor(int humor) {
        if (humor >= 150 ){
            IO.println("Feliz");
        }else if(humor <= 149 ){
            IO.println("Neutro");
        }else if(humor <=50 ){
            IO.println("Triste");
        }else{
            IO.println("Chateado");
        }
        this.humor = humor;
    }
    public Bicho() {
    }

    @Override
    public String toString() {
        return "Bicho{" +
                "nome='" + nome + '\'' +
                ", fome=" + fome +
                ", energia=" + energia +
                ", humor=" + humor +
                '}';
    }
}
