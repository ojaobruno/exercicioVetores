import java.util.Scanner;

public class ExercicioVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selecione uma opção (1 a 7):");
            System.out.println("1. Opção 1");
            System.out.println("2. Opção 2");
            System.out.println("3. Opção 3");
            System.out.println("4. Opção 4");
            System.out.println("5. Opção 5");
            System.out.println("6. Opção 6");
            System.out.println("7. Opção 7");
            System.out.print("Opção: ");

            // Lendo a opção do usuário
            int opcao;
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido.");
                continue;
            }

            // Verificando se a opção é válida
            if (opcao < 1 || opcao > 7) {
                System.out.println("Opção inválida. Por favor, selecione uma opção de 1 a 7.");
                continue;
            }

            // Executando a ação correspondente à opção
            switch (opcao) {
                case 1:
                    opcao1();
                    break;
                case 2:
                    opcao2();
                    break;
                case 3:
                    opcao3();
                    break;
                case 4:
                    opcao4();
                    break;
                case 5:
                    opcao5();
                    break;
                case 6:
                    opcao6();
                    break;
                case 7:
                    opcao7();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
    
    public static void opcao1() {
        Scanner scanner = new Scanner(System.in);
        int[] N = new int[10];
        int value;
        
        while (true) {
            System.out.println("Digite um valor menor ou igual a 20:");
            value = scanner.nextInt();
            if (value <= 20) {
                break;
            } else {
                System.out.println("Valor inválido. Digite um valor menor ou igual a 20.");
            }
        }
        
        N[0] = value;
        for (int i = 1; i < N.length; i++) {
            N[i] = N[i - 1] * 2;
        }
        
        System.out.println("Valores do Vetor N:");
        for (int num : N) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void opcao2() {
        Scanner scanner = new Scanner(System.in);
        int[] N = new int[10];
        int value;
        
        while (true) {
            System.out.println("Digite um valor entre 1 e 99:");
            value = scanner.nextInt();
            if (value > 1 && value < 100) {
                break;
            } else {
                System.out.println("Valor inválido. Digite um valor entre 1 e 99.");
            }
        }
        
        N[0] = value;
        for (int i = 1; i < N.length; i++) {
            N[i] = N[i - 1] - 1;
        }
        
        System.out.println("Valores do Vetor N:");
        for (int num : N) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void opcao3() {
        Scanner scanner = new Scanner(System.in);
        int value;
        
        while (true) {
            System.out.println("Digite um valor entre 1 e 1000:");
            value = scanner.nextInt();
            if (value > 1 && value <= 1000) {
                break;
            } else {
                System.out.println("Valor inválido. Digite um valor entre 1 e 1000.");
            }
        }
        
        int[] N = new int[value];
        for (int i = 0; i < N.length; i++) {
            N[i] = i + 1;
        }
        
        System.out.println("Valores do Vetor N:");
        for (int num : N) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void opcao4() {
        Scanner scanner = new Scanner(System.in);
        int[] N = new int[10];
        int value;
        int soma = 0;
        
        while (true) {
            System.out.println("Digite um valor entre 1 e 99:");
            value = scanner.nextInt();
            if (value > 1 && value < 100) {
                break;
            } else {
                System.out.println("Valor inválido. Digite um valor entre 1 e 99.");
            }
        }
        
        N[0] = value;
        soma += N[0];
        for (int i = 1; i < N.length; i++) {
            N[i] = N[i - 1] + 1;
            soma += N[i];
        }
        
        System.out.println("Valores do Vetor N:");
        for (int num : N) {
            System.out.print(num + " ");
        }
        System.out.println("\nSoma dos elementos: " + soma);
    }

    public static void opcao5() {
        Scanner scanner = new Scanner(System.in);
        int value;
        
        while (true) {
            System.out.println("Digite um valor entre 4 e 50:");
            value = scanner.nextInt();
            if (value > 3 && value <= 50) {
                break;
            } else {
                System.out.println("Valor inválido. Digite um valor entre 4 e 50.");
            }
        }
        
        int[][] N = new int[value][value];
        int count = 1;
        for (int i = 0; i < N.length; i++) {
            for (int j = 0; j < N[i].length; j++) {
                N[i][j] = count++;
            }
        }
        
        System.out.println("Valores da Matriz N:");
        for (int i = 0; i < N.length; i++) {
            for (int j = 0; j < N[i].length; j++) {
                System.out.print(N[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void opcao6() {
        Scanner scanner = new Scanner(System.in);
        int value;
        
        while (true) {
            System.out.println("Digite um valor entre 4 e 50:");
            value = scanner.nextInt();
            if (value > 3 && value <= 50) {
                break;
            } else {
                System.out.println("Valor inválido. Digite um valor entre 4 e 50.");
            }
        }
        
        int[][] N = new int[value][value];
        insertValues(N);
        
        System.out.println("Valores da Matriz N:");
        for (int i = 0; i < N.length; i++) {
            for (int j = 0; j < N[i].length; j++) {
                System.out.print(N[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void insertValues(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static void opcao7() {
        Scanner scanner = new Scanner(System.in);
        int value;
        
        while (true) {
            System.out.println("Digite um valor entre 4 e 50:");
            value = scanner.nextInt();
            if (value > 3 && value <= 50) {
                break;
            } else {
                System.out.println("Valor inválido. Digite um valor entre 4 e 50.");
            }
        }
        
        int[][] N = new int[value][value];
        int[][] Z = new int[value][value];
        
        // Preenchendo as matrizes N e Z com valores sequenciais
        int count = 1;
        for (int i = 0; i < N.length; i++) {
            for (int j = 0; j < N[i].length; j++) {
                N[i][j] = count;
                Z[i][j] = count++;
            }
        }
        
        // Somando as matrizes N e Z em uma terceira matriz
        int[][] somaMatrizes = new int[value][value];
        for (int i = 0; i < somaMatrizes.length; i++) {
            for (int j = 0; j < somaMatrizes[i].length; j++) {
                somaMatrizes[i][j] = N[i][j] + Z[i][j];
            }
        }
        
        // Exibindo os valores das matrizes N e Z
        System.out.println("Valores da Matriz N:");
        printMatrix(N);
        
        System.out.println("Valores da Matriz Z:");
        printMatrix(Z);
    }
    
    public static void insertValues1(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
