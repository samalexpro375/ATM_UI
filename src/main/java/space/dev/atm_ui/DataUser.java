package space.dev.atm_ui;

public class DataUser {
    protected static String numcard, pin;
    public static int money;
    public static String filePath = System.getProperty("user.dir") + "/data.txt";

    public static void GetNumCard(String numcard_u){
        numcard = numcard_u;
    }
    public static void GetPin(String pin_u){
        pin = pin_u;
    }

}
