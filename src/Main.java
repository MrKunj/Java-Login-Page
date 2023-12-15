public class Main {
    public static void main(String[] args) {

        System.out.println("Hello");
        // using hashmaps, as this can store data in key value pairs
        IdandPassword idandPassword = new IdandPassword();
        LoginPage loginpage = new LoginPage(idandPassword.getLoginInfo());
        System.out.println("World");
    }
}