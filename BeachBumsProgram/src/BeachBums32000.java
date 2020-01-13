import java.util.Scanner;
// 32000 because i decided to write most of this on a plane
// timothy alec moode
// december of 2019
public class BeachBums32000 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args){

        Beach b = new Beach();
        System.out.println("Enter Beach Name");
        b.setBeachName(keyboard.nextLine());

        System.out.println("Enter the Amount of Snow Cones Purchased");
        b.setSnowQuantity(Integer.parseInt(keyboard.nextLine()));
        System.out.println("Enter the Price of an Individual Snowcone");
        b.setSnowPrice(Double.parseDouble(keyboard.nextLine()));

        System.out.println("Enter the Amount of Corndogs purchased");
        b.setCornQuantity(Integer.parseInt(keyboard.nextLine()));
        System.out.println("Enter the Price of an Individual Corndog");
        b.setCornPrice(Double.parseDouble(keyboard.nextLine()));

        b.calcs();
        System.out.println(b.toString());
    }

}
