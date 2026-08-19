void main(){
    Scanner sc = new Scanner(System.in);
    Bicho bicho = new Bicho();

    IO.println("Coloque nome no seu bichinho virtual: ");
    String nome = sc.next();

    int vida = 1;
    int energia = 50;
    int fome = 50;
    int humor;
    int ataquecardiaco;
    int colesterol;
    int opcao2;
    int ganho = 0;
    int perda = 0;
    int maca = 1;
    int barrinha = 1;
    int bolo = 0;
    int moeda = 24;
int dia = 1;

    do {
        humor = (energia + fome);
        bicho.setNome(nome);

        IO.println("\n"+"Dia: "+dia);
        IO.println("Nome: "+bicho.getNome());
        bicho.setFome(fome);
        IO.println("Fome: "+bicho.getFome());
        bicho.setEnergia(energia);
        IO.println("Energia: "+bicho.getEnergia());
        bicho.setHumor(humor);
        IO.println("Humor: "+bicho.getHumor());
        IO.println("M$"+moeda);


        IO.println("\n"+"(1)Dar Comida | (2)Lojinha | (3)Jogar");
        int opcao = sc.nextInt();


        if(opcao == 1){
            IO.println("\n"+"(1)Maçã: "+maca);
            IO.println("(2)Barrainha de energia: "+barrinha);
            IO.println("(3)Bolo: "+bolo);
            IO.println("(*)Dar nada");
            int comida = sc.nextInt();


            if (comida == 1){
                if (maca <= 0){
                    IO.println("Não tem maçãs");
                }else{
                    fome += 15;
                    energia += 10;
                    maca -= 1;
                }
            }else if (comida == 2){
                if(barrinha <= 0){
                    IO.println("Não tem barrimhas de energia");
                }else {
                    fome += 5;
                    energia += 25;
                    barrinha -= 1;
                }
            }else if (comida == 3){
                if ( bolo <= 0){
                    IO.println("Não tem Bolo");
                }else{
                    fome += 40;
                    energia += 35;
                    bolo -= 1;
                }
            }else{
                IO.println("Voce Guardou Comida");
            }
        }else if (opcao == 2){
            IO.println("Moedas: M$"+moeda);
            IO.println("\n"+"(1)M$12 = Maçã");
            IO.println("(2)M$20 = Barrainha de energia");
            IO.println("(3)M$40 = Bolo");
            IO.println("(*) Sair");
            int compra = sc.nextInt();


            if (compra == 1){
                if(moeda < 12){
                    IO.println("Moedas Insuficientes");
                }else{
                    moeda -= 12;
                    maca += 1;
                }
            }else if(compra == 2){
                if(moeda <= 20){
                    IO.println("Moedas Insuficientes");
                }else{
                    moeda -= 20;
                    barrinha += 1;
                }
            }else if(compra == 3){
                if(moeda<=40){
                    IO.println("Moedas Insuficientes");
                }else{
                    moeda -= 40;
                    bolo += 1;
                }
            }else{
                IO.println("Voce Gardou Dinheiro");
            }
        }else if(opcao == 3){
            for(int pare = 0; pare < 3;pare++){
                IO.println("Escolha");
                IO.println("(0)Pedra | (1)Papel |(2)Tesoura");
                int opcao1 = sc.nextInt();
                if (opcao1 == 0) {
                    opcao2 = (int) (Math.random() * 2);
                    if (opcao1 == opcao2) {
                        IO.println("🤜/🤛");
                        IO.println("Empate");

                    } else if (opcao2 == 1) {
                        IO.println("🤜/🖐️");
                        IO.println("Voce Perdeu");
                        perda+=2;

                    } else if (opcao2 == 2) {
                        IO.println("🤜/✌️");
                        IO.println("Voce Ganhou");
                        ganho+=2;
                    }
                } else if (opcao1 == 1) {
                    opcao2 = (int) (Math.random() * 2);
                    if (opcao == opcao2) {
                        IO.println("🖐️/🖐️");
                        IO.println("Empate");


                    } else if (opcao2 == 0) {
                        IO.println("🖐️/🤛");
                        IO.println("Voce Ganhou");
                        ganho+=2;
                    } else if (opcao2 == 2) {
                        IO.println("🖐️/✌️");
                        IO.println("Voce Perdeu");
                        perda+=2;
                    }
                } else if (opcao1 == 2) {
                    opcao2 = (int) (Math.random() * 2);
                    if (opcao == opcao2) {
                        IO.println("️✌️/✌️");
                        IO.println("Empate");

                    } else if (opcao2 == 0) {
                        IO.println("✌️️/🤛");
                        IO.println("Voce Perdeu");
                        perda+=2;

                    } else if (opcao2 == 1) {
                        IO.println("✌️/🖐️");
                        IO.println("Voce Ganhou");
                        ganho+=2;
                    }
                }
            }
            IO.println("Moedas Ganhas: "+ganho);
            IO.println("Energia Perdida: "+perda);
            moeda += ganho;
            fome -= perda;
            energia -= perda;
        }


        if (fome < 0) {
            IO.println("\n"+nome + " morreu de fome");
            vida -= 1;
        } else if (fome > 100) {
            colesterol = (int) (Math.random() * 3);
            if (colesterol == 0) {
                IO.println("\n"+nome + " morreu de colesterol alto");
                vida -= 1;
            }
        }else if(energia < 0){
            IO.println("\n"+nome+" morreu por exaustão");
            vida -= 1;
        }else if(energia > 100){
            ataquecardiaco = (int)(Math.random()* 3);
            if(ataquecardiaco == 0){
                IO.println("\n"+nome+" morreu de ataque cardiaco");
            }
        }

        dia++;
        fome-= 4;
        energia -= 4;
    }while (vida != 0);
    IO.println("Total de Moedas: "+moeda);
}
