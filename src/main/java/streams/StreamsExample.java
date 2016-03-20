package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {
    
    public static void main(String[] args) {
        
        
        List<String> countries = Stream.of("India","Australia","USA").collect(Collectors.toList());
        
        
       long count = countries.stream().filter(a->a.equals("India")).count();
       System.out.println(count);
       
       
     /* Call to filter builds up a Stream recipe, but there’s nothing to force this recipe to be used. 
      * Methods such as filter that build up the Stream recipe but don’t force a new value to be generated at the end are referred to as
       lazy. 
       Methods such as count that generate a final value out of the Stream sequence are called eager.*/
       
       // LAZY
       countries.stream().filter(a-> { System.out.println("Inside Filter");
                                      return a.equals("India");
                                      });
       //No output
       
       
       //EAGER
       countries.stream().filter(a-> { System.out.println("Inside Filter");
                                       return a.equals("India");
                                     }).count();
       // ouput : 
/*     Inside Filter
       Inside Filter
       Inside Filter*/
       
       //Local variable x defined in an enclosing scope must be final or effectively final
       int x = 10;
       countries.stream().filter(a-> { // if x++; , Compilation Error : Local variable x defined in an enclosing scope must be final or effectively final
                                       // No Modification allowed for x here.
                                       return a.equals("USA");
                                     });        
    } 
}
