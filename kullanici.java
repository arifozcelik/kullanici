import java.util.Scanner;

public class kullanici {
    public static void main(String[] args) {
        String username,password;

        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı adını gir: ");
        username = input.nextLine();
        System.out.println("Şifre adını gir: ");
        password = input.nextLine();

        if(username.equals("arif")&&password.equals("123")) {
            System.out.println("BAŞARILI");
        }else{
            System.out.println("başarısız");
        }

    }
}
