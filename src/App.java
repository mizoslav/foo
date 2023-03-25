public class App {
    public static void main(String[] args) throws Exception {
        String[] messages = {"Hello, World!", "Github foo experiment done!", "Boodbye!"};
        String prompt = ">>> ";

        for (String message : messages) {
            System.out.println(prompt + message);
        }
    }
}
