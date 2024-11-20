public class Q4 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Veuillez fournir un nombre d'étoiles en argument.");
            return;
        }

        int n = Integer.parseInt(args[0]);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
