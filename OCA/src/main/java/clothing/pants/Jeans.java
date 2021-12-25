package clothing.pants;
import static clothing.Shirt.getColor;

public class Jeans {
    public void matchShirt(){
        String color = getColor();
        if(color.equals("Green"))
        {
            System.out.print("Fit");
        }
    }
    public static void main(String[] args){
        Jeans trouser = new Jeans();
        trouser.matchShirt();
    }
}
