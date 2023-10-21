import java.util.Scanner;
import java.util.Random;

    public class TrabalhoUm {
        public static void main (String [] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            String[] menu = {
                "Hamburguer de Siri",
                "Sorvete",
                "Hamburguer sem graça",
                "Combo 1: hamburguer sem graça + fritas",
                "Combo 2: hamburguer sem graça + fritas + refrigerante",
                "Combo 1: hamburguer de siri + fritas",
                "Combo 2: hamburguer de siri + fritas + refrigerante",
            };

            double[] precoDinheiro = {7.0, 2.0, 5.0, 11.0, 12.0, 14.0, 15.0};
            double[] precoPix = {6.5, 2.0, 4.5, 10.5, 12.5, 13.5, 14.5};
            double[] precoDebito = {7.5, 2.2, 6.5, 11.0, 14.0, 15.0, 16.0};
            double[] precoCredito = {8.0, 2.3, 8.0, 11.5, 14.2, 15.0, 16.0};

            int[] ingredientesPao = {0, 0, 0, 0, 1, 0, 0};
            int[] ingredientesPaoEspecial = {1, 0, 0, 0, 0, 1, 1};
            int[] ingredientesTomate = {3, 0, 1, 1, 1, 3, 3};
            int[] ingredientesAlface = {2, 0, 1, 1, 1, 2, 2};
            int[] ingredientesBifeEspecial = {0, 0, 0, 0, 0, 0, 0};
            int[] ingredientesBife = {0, 0, 1, 1, 1, 0, 0};
            int[] ingredientesQueijo = {2, 0, 0, 0, 0, 2, 2};
            int[] ingredientesFritas = {0, 0, 0, 1, 1, 1, 1};
            int[] ingredientesRefrigente = {0, 0, 0, 0, 1, 0, 1};
            int[] ingredientesSorvete = {0, 1, 0, 0, 1, 0, 0};

            int[] estoque = {30, 40, 40, 45, 28, 78, 50, 32};

            System.out.println(); // quebra de linha
            
            // vai ver se o restaurante vai estar aberto, caso esteja aberto vai ver se tem 
            // garçom disponivel e se quer atender o cliente, caso o garçom n queira atender, o cliente vai embora
            boolean restauranteAberto = true;
            boolean garcomDisponivel = true;

            if (restauranteAberto && garcomDisponivel) {
                System.out.println("Bem-vindo ao Siri Cascudo");
                System.out.println("O garçom está disponível para atende-lo.");
                System.out.println("Deseja fazer o seu pedido? (Digite 'sim' ou 'não')");

                Scanner entrada = new Scanner(System.in);
                String resposta = scanner.nextLine();
                

                if(resposta.equalsIgnoreCase("sim"));
                    System.out.println("O garçom deseja atende-lo, pode fazer o seu pedido agora");
            }
                if(resposta.equalsIgnoreCase("não"));
                    System.out.println("O garçom não pode atende-lo no momento, você pode voltar mais tarde!");
                    
        
                }            
                int clienteld =1;
                while(true) {
                    System.out.println("Cliente" + clienteld + ", qual é o seu pedido?");
                    for (int i = 0; i < menu.length; i++);
                        System.out.println(i + 1 + ": " + menu);
                }


                int[] pedido = new int [menu.length];
                int pedidoIndex = 0;
                double totalPedido = 0.0;
                boolean numeroArmstrong = true;

                while(true) {
                    int escolha = scanner.nextInt();
                    if (escolha<1 || escolha > menu.length) {
                        System.out.println("Item não está disponivel no cardápio. Escolha novamente o seu pedido.");
                    }else{

                    }
                }
            }

        }
    