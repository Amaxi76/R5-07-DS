public class Q6 {
   public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Veuillez fournir un nombre d'étoiles en argument.");
            return;
        }
    
        int n = Integer.parseInt(args[0]);
    
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
