package Facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buyer {
    private static int  choice;
    public static void main(String args[]) throws NumberFormatException, IOException{
        do{
            System.out.print("========= Mobile Shop ============ \n");
            System.out.print("            1. IPHONE.              \n");
            System.out.print("            2. MOTOROLA.              \n");
            System.out.print("            3. NOKIA.            \n");
            System.out.print("            4. Exit.                     \n");
            System.out.print("Enter your choice: ");

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            choice=Integer.parseInt(br.readLine());
            ShopKeeper sk=new ShopKeeper();

            switch (choice) {
                case 1:
                {
                    sk.iphoneSale();
                }
                break;
                case 2:
                {
                    sk.MotoSale();
                }
                break;
                case 3:
                {
                    sk.NoikaSale();
                }
                break;
                default:
                {
                    System.out.println("Nothing You purchased");
                }
                return;
            }

        }while(choice!=4);
    }
}
