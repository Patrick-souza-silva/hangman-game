public class Forca {

    public void start() {
        System.out.println(
                "Não mate a Inara" +
                " +---+\n" +
                        " |   |\n" +
                        "     |\n" +
                        "     |\n" +
                        "     |\n" +
                        "     |\n" +
                        "========="
        );
    }

    public void hand() {
        // Etapa 1 - cabeça
        System.out.println(
                " +---+\n" +
                        " |   |\n" +
                        " O   |\n" +
                        "     |\n" +
                        "     |\n" +
                        "     |\n" +
                        "========="
        );
    }

    public void body() {
        // Etapa 2 - corpo
        System.out.println(
                " +---+\n" +
                        " |   |\n" +
                        " O   |\n" +
                        " |   |\n" +
                        "     |\n" +
                        "     |\n" +
                        "========="
        );
    }

    public void armLeft() {
        // Etapa 3 - braço esquerdo
        System.out.println(
                " +---+\n" +
                        " |   |\n" +
                        " O   |\n" +
                        "/|   |\n" +
                        "     |\n" +
                        "     |\n" +
                        "========="
        );
    }

    public void armRight() {
        // Etapa 4 - braço direito
        System.out.println(
                " +---+\n" +
                        " |   |\n" +
                        " O   |\n" +
                        "/|\\  |\n" +
                        "     |\n" +
                        "     |\n" +
                        "========="
        );
    }


    public void legLeft() {
        // Etapa 5 - perna esquerda
        System.out.println(
                " +---+\n" +
                        " |   |\n" +
                        " O   |\n" +
                        "/|\\  |\n" +
                        "/    |\n" +
                        "     |\n" +
                        "========="
        );
    }


    public void legRight() {
        // Etapa 6 - perna direita (final)
        System.out.println(
                " +---+\n" +
                        " |   |\n" +
                        " O   |\n" +
                        "/|\\  |\n" +
                        "/ \\  |\n" +
                        "     |\n" +
                        "========="
        );
    }


}
