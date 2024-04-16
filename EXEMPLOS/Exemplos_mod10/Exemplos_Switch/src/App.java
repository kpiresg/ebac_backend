public class App {
    public static void main(String args[]) {
        String result;
        Integer pos = 1;

        switch (pos) {
            case 1:
                result = "Você é o primeiro";
                break;
            case 2:
                result = "Você é o segundo";
                break;
            case 3:
                result = "Você é o terceiro";
                break;
            default:
                result = "Você não ficou nos 3 melhores";
                break;
        }
        return result;
    }
}
