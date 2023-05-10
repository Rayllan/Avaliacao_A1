import java.util.Scanner;

public class ProvaA1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a Placa do veiculo:");
        String placa = sc.nextLine();

        System.out.println("Infomer o valor do Litro do combustivel");
        double valorCombustivel = sc.nextDouble();

        System.out.println("Informe quanto quilomentos foram rodados a 60 KM/H:");
        double km60 = sc.nextDouble();

        System.out.println("Informe quanto quilomentos foram rodados a 80 KM/H:");
        double km80 = sc.nextDouble();

        System.out.println("Informe quanto quilomentos foram rodados a 100 KM/H:");
        double km100 = sc.nextDouble();

        System.out.println("Informe quanto quilomentos foram rodados a 120 KM/H:");
        double km120 = sc.nextDouble();

        System.out.println("Informe quanto quilomentos foram rodados a 140 KM/H:");
        double km140 = sc.nextDouble();

        sc.close();

        double consumo60 = km60 / 37.7;
        double consumo80 = km80 / 26.8;
        double consumo100 = km100 / 22.4;
        double consumo120 = km120 / 18.1;
        double consumo140 = km140 / 14.5;

        double velocidadeMediaPonderada = (60 * km60 + 80 * km80 + 100 * km100 + 120 * km120 + 140 * km140)
                / (km60 + km80 + km100 + km120 + km140);

        double totalCombustivel = consumo60 + consumo80 + consumo100 + consumo120 + consumo140;
        double valorTotal = totalCombustivel * valorCombustivel;

        System.out.printf("Placa do veículo: %s%n", placa);
        System.out.printf("Consumo total: %.3f litros%n", totalCombustivel);
        System.out.printf("Valor total: R$: %.2f %n", valorTotal);
        System.out.printf("Velocidade média ponderada: %.1f km/h", velocidadeMediaPonderada);
    }
}
