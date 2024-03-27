import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Shabab","laxmi","John","Kishor");
        
       Optional <String> name = names.stream()
                           .filter(str -> str.contains("x"))
                           .findFirst();
                           

        System.out.println(name.orElse("not found"));
    }
    
}
