import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner call = new Scanner(System.in);
        String validate;

        do {
            System.out.println("----------HANGMAN----------");
            System.out.println("-----------------------------------");

            boolean input;
            do{
                System.out.println("Escreva 'yes' para iniciar o game");
                String open = call.next();

                if (open.equals("yes")){
                    input = false;
                }else{
                    System.out.println("Resposta inválida, digite novamente");
                    input = true;
                }
            }while(input);

            System.out.println("Digite a palavra a ser descoberta");
            String word = call.next();

            char[] state = new char[word.length()];
            for (int i = 0; i < word.length(); i++){
                state[i] = '_';
            }

            int errors = 0;
            ArrayList<Character> list = new ArrayList<>();

            while (errors < 6){
                Forca newForca = new Forca();

                System.out.println("Letras selecionadas: "+ list);
                switch(errors) {
                    case 1:
                        newForca.hand();
                        break;
                    case 2:
                        newForca.body();
                        break;
                    case 3:
                        newForca.armLeft();
                        break;
                    case 4:
                        newForca.armRight();
                        break;
                    case 5:
                        newForca.legLeft();
                        break;
                    case 6:
                        newForca.legRight();
                        break;
                    default:
                        newForca.start();
                }

                System.out.println("--------------------------------");

                System.out.println("Palavra com " + word.length() + " letras : " + Arrays.toString(state));
                boolean charValid;
                char charater;
                do{
                    System.out.print("Digite uma letra: ");
                    charater = call.next().charAt(0);

                    charValid = true;

                    for (int i = 0; i < list.size(); i++){
                        if(list.get(i) == charater){
                            System.out.println("Essa letra já foi selecionada, digite outra");
                            charValid = false;
                        }
                    }

                }while(!charValid);

                //Pega o primeiro caracter da string
                list.add(charater);

                //Verifica se dentro de uma string a o caracter selecionado
                if (word.contains(String.valueOf(charater))){
                    System.out.println("---Essa letra existe na palavra---");
                    for (int i = 0; i < word.length(); i++){
                        //Verifica se dentro da palavra na posição i o caracter é igual ao passado
                        if(word.charAt(i) == charater){
                            state[i] = charater;
                        }
                    }
                }else{
                    System.out.println("---Essa letra não existe na palavra---");
                    errors++;
                }

            }

            System.out.println("Você perdeu :( ");
            System.out.println("Deseje jogar novamente? y/n");
            validate = call.next();


        }while (validate.equals("y"));

        System.out.println("Byee :)");

        call.close();
    }
}