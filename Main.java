//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Qual o primeiro lado?: ");
    double lado1 = scanner.nextDouble();
    System.out.println("Qual o segundo lado?: ");
    double lado2 = scanner.nextDouble();
    System.out.println("Qual o terceiro lado?: ");
    double lado3 = scanner.nextDouble();

    if ((lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado1 + lado3 > lado2)) {
        System.out.println("Triângulo válido.");

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Seu triângulo é equilátero!");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("Seu triângulo é isósceles!");
        } else {
            System.out.println("Seu triângulo é escaleno!");
        }
    }else {
        System.out.println("Os valores informados não formam um triângulo.");
    }
}
