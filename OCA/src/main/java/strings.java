public class strings {
    public static void main(String []args)
    {
        String str1 = "Java";
        String []str2={"J","a","v","a"};
        String str3="";
        for(String str:str2)
        {
            str3=str3+str;
        }
        System.out.println((str1==str3)+" "+(str1.equals(str3)));
    }
}
