package TorreDeHanoi;

public class TorreDeHanoi {
    public static void main(String[] args) {
        int numDiscos = 3; // Número de discos

        // Chama o método para vesolver a Torre de Hanoi
        resolverTorreDeHanoi(numDiscos, 'A', 'B', 'C');
    }

    // Método recursivo para  resolver a Torre de Hanoi
    public static void resolverTorreDeHanoi(int numDiscos, char origem, char auxiliar, char destino) {
        if (numDiscos == 1) {
            // Caso base: mover o disco da origem para o destino
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
        } else {
            // Mover n-1 discos da origem para o auxiliar usando o destino como auxiliar
            resolverTorreDeHanoi(numDiscos - 1, origem, destino, auxiliar);

            // Mover o disco restante da origem para o destino
            System.out.println("Mover disco " + numDiscos + " de " + origem + " para" + destino);

            // Mover os n-1 discos do axiliar para destini usando a origem como auxiliar
            resolverTorreDeHanoi(numDiscos - 1, auxiliar, origem, destino);
        }
    }
}
