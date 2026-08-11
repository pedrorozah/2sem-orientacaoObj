public class Decisao {
    public static void main(String[] args) {
        // operadores lógicos: && -> AND || -> OR, ! -> NOT
        // relacionais: == -> igual, != -> diferente, >, <, >=, <=
        // = -> atribuição
        // valores numéricos se compara com ==
        // Strings se compara com "equals"
        // converte String para int
        if (args.length < 2) {
            System.out.println("Precisa de 2 parâmetros");
            System.exit(0);
        }
        int val1 = Integer.parseInt(args[0]);
        int val2 = Integer.parseInt(args[1]);

        // se em JAVA
        if ((val1 < 5) && (val2 != 2)) {
            System.out.println("Entrou no if");
        } else if (val2 < 5) {
            System.out.println("Entrou no else if");
        } else {
            System.out.println("Entrou no else");
        }

        // switch case em JAVA
        String val = "c";
        switch (val.toUpperCase()) {
            case "S":
                System.out.println("Sim");
                break;
            case "N":
                System.out.println("Não");
                break;
            default:
                System.out.println("Outro valor");
                break;
        }
    }
}