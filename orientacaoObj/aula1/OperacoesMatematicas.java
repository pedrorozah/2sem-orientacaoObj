public class OperacoesMatematicas {
    /* criar método para somar, subtrair, dividir e multiplicar 2 números */

    // segue padrão camelCase
    public int somar(int num1, int num2) {
        return num1 + num2;
    }

    public int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public float dividir(int num1, int num2) {
        if (num2 == 0)
            return 0;
        else
            return num1 / num2;
    }

}
