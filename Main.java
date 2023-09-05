import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem vindo ao programa de Flood Fill feito por - Gustavo Farignoli, João Trigo e Gabriel Molec");
        System.out.println("Gerando a matriz padrão");
        Matriz matriz = new Matriz();
        System.out.println("Defina a coordenada inicial para o FLood Fill:");
        System.out.print("Digite a coordenada X: ");
        int x = teclado.nextInt();
        System.out.print("Digite a coordenada Y: ");
        int y = teclado.nextInt();
        System.out.print("Escolha um número para trocar o 1 na matriz: ");
        int cor = teclado.nextInt();
        Cordenada cordenada = new Cordenada(x,y);
        System.out.println("Analisando coordenadas vizinhas");
        FloodFill floodFill = new FloodFill(cordenada,matriz,cor);
        floodFill.foundcolorable(cordenada);
        System.out.print("Escolha 1 para realizar a troca de valores através de Fila ou 2 para realizar com Pilha.");
        int op = teclado.nextInt();
        switch (op){
            case 1:
                floodFill.colorfila();
                break;
            case 2:
                floodFill.colorpilha();
                break;
        }
    }
}

