import java.util.Scanner;

/**
 * Created by Chloe on 23/08/2017.
 */
public class Wordsmith {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        input to determine whether to open a file or make a new one
//        to be implemented in a gui at a later date
        System.out.println("New File/Open Existing File");
        String startup = sc.nextLine();
        if (startup.equals("new")){
//            new file
            System.out.println("Please choose a title: ");
            String title = sc.nextLine();
            Documents document = new Documents();

        } else if (startup.equals("open")){
//            open existing file
            System.out.println("Choose a file to open: ");
        }

    }
}
