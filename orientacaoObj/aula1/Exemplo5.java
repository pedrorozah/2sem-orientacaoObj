public class Exemplo5 {
    public static void main(String args[]) {
        // a máquina virtual gerencia memória por de baixo dos panos "Garbagge
        // Collector"
        OperacoesMatematicas opMat = new OperacoesMatematicas();
        System.out.println("67 * 44 = " + opMat.multiplicar(67, 44));
        System.out.println("22 * 8 = " + opMat.multiplicar(22, 8));
        System.out.println("22 / 8 = " + opMat.dividir(22, 8));
        System.out.println("22 + 8 = " + opMat.somar(22, 8));
        System.out.println("22 - 8 = " + opMat.subtrair(22, 8));

    }

}