import java.io.*; 
import java.util.*; 
 
public class counter { 
    public static void main(String[] args) throws Exception { 
 
        // Read file (input.txt) 
        File file = new File("input.txt"); 
        Scanner sc = new Scanner(file); 
        Map<String, Integer> wordCount = new HashMap<>(); 
 
        while (sc.hasNext()) { 
            String word = sc.next().toLowerCase().replaceAll("[^a-z]",  
""); 
            if (word.isEmpty()) continue; 
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1); 
}      
sc.close(); 
System.out.println("Word Count Results:"); 
for (String word : wordCount.keySet()) { 
System.out.println(word + " : " + wordCount.get(word)); 
} 
} 
}