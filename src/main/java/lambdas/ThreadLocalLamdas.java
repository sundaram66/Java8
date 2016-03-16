package lambdas;

import java.text.SimpleDateFormat;

public class ThreadLocalLamdas {
    
    
    private static final ThreadLocal<SimpleDateFormat> formatterOld = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue()
        {
            return new SimpleDateFormat("yyyyMMdd HHmm");
        }
    };
    
    /*ThreadLocal class is extend in Java 8 with a new method withInitial() that takes 
     * Supplier functional interface as argument. 
     * So we can use lambda expressions to easily create the ThreadLocal instance. 
     * For example, above formatter ThreadLocal variable can be defined in one line as below:*/
         
    
    private static final ThreadLocal<SimpleDateFormat> formatter = 
            ThreadLocal.<SimpleDateFormat>withInitial
            (() -> {return new SimpleDateFormat("yyyyMMdd HHmm");});


}
