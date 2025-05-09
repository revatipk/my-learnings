package java8;

import javax.swing.text.html.Option;
import java.util.Locale;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String []args)
    {
        String[] words = new String[10];
        Optional<String> checkNull = Optional.ofNullable(words[5]);
        if(checkNull.isPresent())
        {
            String word = words[5].toLowerCase();
            System.out.println(word);
        }
        else
            System.out.println("word is null");
        Optional<String> empty=Optional.empty();
        System.out.print(empty);

        words[2] = "Hello";
        Optional<String> value = Optional.of(words[2]);
        System.out.println(value.get());
    }
}
