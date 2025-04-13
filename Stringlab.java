import java.util.Scanner;

public class Stringlab {
    public static void main(String[] args) {
        String title =  " Welcome to java String Lab! ";
        System.out.println("length: " + title.length());
        System.out.println("Character at index 7: " + title.charAt(7));
        System.out.println("Substring: " + title.substring(12, 16));
        System.out.println("Uppercase: " + title.toUpperCase());
        System.out.println("Lowercase: "+ title.toLowerCase());
        System.out.println("index of java: " + title.indexOf("java"));
        System.out.println("contains lab?: " + title.contains("Lab"));
        System.out.println("replace: " + title.replace("java", "Java programming"));
        String[] Split = title.split("\\s");
        for(String yo : Split){
            System.out.println(yo);
        }
        System.out.println("Trim: " + title.trim());
        String newtitle = " java string lab! ";
        if (title.equals(newtitle)){
            System.out.println("Equals: True");
        }else {
            System.out.println("Equals: False");
        }
      System.out.println( "Equal Ingore case: "  +  title.equalsIgnoreCase(newtitle));
      int count = 0;
      for(int i = 0; i < title.length();i++){
          char ch = title.charAt(i);
          if(ch == 'a' || ch =='e' || ch =='i' || ch =='o' || ch == 'u'){
              count++;
          }
        }
        System.out.print( "vowels counted: " +count);
    
      String race = "racecar";

      String reverse = "";
      for (int j =race.length() -1; j >=0; j--){
          reverse += race.charAt(j);
      }
      boolean yo = true;
      for (int k= 0; k < race.length();k++ ){
          if(race.charAt(k) != reverse.charAt(k)){
              yo = false;
          }
          if (yo){
              System.out.println("Pandlindrome: True");
            }  else{
                  System.out.println("Pandlindrome: False");
              }  
          }
    Scanner scanner = new Scanner(System.in);
    String response = "";
    while(!response.equals("Java")){
        System.out.print("Type Java: ");
        response = scanner.next();
    }
    System.out.println("Thank you");
    scanner.close();

    StringBuilder ch = new StringBuilder("StringBuilder Lab ");
    ch.append("-Learning java");
    System.out.println(ch);
    StringBuilder ch2= new StringBuilder("StringBuilder Lab ");
    ch2.insert(18,"is fun");
    System.out.println(ch2);
    StringBuilder ch3= new StringBuilder("StringBuilder Lab ");
    ch3.delete(14,17);
    System.out.println(ch3);
    StringBuilder ch4= new StringBuilder("StringBuilder Lab ");
    ch4.reverse();
    System.out.println(ch4);

    StringBuilder New = new StringBuilder("Multithreading Lab ");
    New.append("-Learning java");
    System.out.println(New);
    StringBuilder New2= new StringBuilder("Multithreading Lab ");
    New2.insert(19,"is fun");
    System.out.println(New2);
    StringBuilder New3= new StringBuilder("Multithreading Lab ");
    New3.delete(15,19);
    System.out.println(New3);
    StringBuilder New4= new StringBuilder("Multithreading Lab ");
    New4.reverse();
    System.out.println(New4);








    }}

      

    
      
    
   
    
    
    
