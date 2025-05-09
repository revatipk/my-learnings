import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileContentToUpperCase {

    private static List<String> filterandConvert(Stream<String> stream, int length) {
        return stream.filter(s->s.length()==length).map(String::toUpperCase).collect(Collectors.toList());
    }

    public static void main(String []args) {

    }
}
