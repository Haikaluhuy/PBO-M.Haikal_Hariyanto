import java.util.Scanner;
import java.util.regex.*;
import java.util.*;

public class task {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Masukkan string:");
        String s = scanner.nextLine();
        
      
        scanner.close();
        
      
        Pattern pattern = Pattern.compile("[A-Za-z]+");
        Matcher matcher = pattern.matcher(s);
      
        List<String> tokens = new ArrayList<>();
        
        
        while (matcher.find()) {
            tokens.add(matcher.group());
        }
        
        
        System.out.println(tokens.size());
        
       
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}

