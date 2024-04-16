public class App {
    public static void main(String[] args) {

        int[] myArray = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        for(int c : myArray) {
            System.out.print(c + " ");
        }
        System.out.println("");
        
        // Ou pode tentar também
        
        for(int c = 0; c < myArray.length; c++) {
            System.out.print(myArray[c] + " ");
        }
        System.out.println("");

        // Para somar todos os Valores dentro do array
        
        int total = 0;
        for (int c : myArray) {
            total += c;
        }
        System.out.println(total);

    }   
}