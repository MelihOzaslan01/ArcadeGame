import java.util.Scanner;

public class Game {
    private Scanner inputs = new Scanner(System.in);
    public void start(){
        System.out.println("***Arcade Oyununa Hoş Geldiniz***");
        System.out.println("Lütfen bir karakter ismi giriniz...");
        String playerName = inputs.nextLine();

        Player player = new Player(playerName);
        System.out.println("Karakterinizin Ismi: "+ player.getCharacterName());
        System.out.println("Karanlık ve Puslu Bir Vadiye Hoşgeldiniz\n" +
                            "Burada Yaşanan Herşey Gerçektir...");


        System.out.println("*******************************");
        System.out.println("Lütfen Bir Karakter Seçiniz : ");
        player.selectChar();
    }
}
