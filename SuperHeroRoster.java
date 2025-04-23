import java.util.Scanner;

public class SuperHeroRoster {
    public static void main(String[] args) {
 
        
        String[] heroNames = {"Spider-Man", "Iron Man", "Black Widow"};
        String[] abilities = {"Web-slinging", "Flying and high-tech armor", "Stealth and combat"};
        int[] powerLevels = {85, 90, 80};
 
      

        for (int i = 0; i < heroNames.length; i++)
        {
            System.out.println("Hero: " + heroNames[i] + ", Ability: " + abilities[i] + ", Power levels: " + powerLevels[i]);
        }
 
        String targetHero = "Iron Man";
        searchHero(heroNames, abilities, powerLevels, targetHero);

 

        double averagePower = calculateAveragePower(powerLevels);
        System.out.println("Average power level: " + averagePower);

        Superhero[] superheros = new Superhero[heroNames.length];
        for (int i = 0; i < heroNames.length; i++)
        {
            superheros[i] = new Superhero(heroNames[i], abilities[i], powerLevels[i]);
            superheros[i].displayHero();
        }
    
    }
 
    public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) {
        Scanner search = new Scanner(System.in);
        String response = "";
        System.out.print("Enter Hero Name: ");
        response = search.nextLine();
        if(response.equals("Iron Man")) {
            System.out.println("Hero: Iron Man , Ability: Flying and high tech armor, power level: 90 ");

        }else if(response.equals("Black Widow")){
            System.out.println("Hero: Black Widow, Ability: Stealth and combat, power level: 80");

        }else if(response.equals("Spider-Man")){
            System.out.println("Hero: Spider-Man: Ability: Web-slinging, power level: 85");
        }else{
            System.out.println("Hero not found");
      
        }
        search.close();

        }

        

    
 
    public static double calculateAveragePower(int[] powerLevels) {
        // for all heros
 
        int sum = 0;
        for (int power : powerLevels)
        {
            sum += power;
        }

        return (double) sum / powerLevels.length; 
    }
}


class Superhero {



    private String name;
    private String ability;
    private int powerLevel;

    public Superhero(String name, String ability, int powerLevel)
    {
        this.name = name;
        this.ability = ability;
        this.powerLevel = powerLevel;
    }
 

    public void displayHero() {
       

        System.out.println("Hero: " + name + ", Ability: " + ability + ", Power levels: " + powerLevel);


}}
