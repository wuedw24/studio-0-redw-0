package module3._1basics;

public class Array4
{
   public static void main(String[] args)
   {
     // declare, create, initialize arrays
     int[ ] highScores = {99,98,98,88,68};
     String[ ] names = {"Jamal", "Emily", "Destiny", "Mateo", "Sofia"};

     // Print corresponding names and scores
     System.out.println(names[0] + " has a score of " + highScores[0]);
     System.out.println(names[1] + " has a score of " + highScores[1]);
   }
}

