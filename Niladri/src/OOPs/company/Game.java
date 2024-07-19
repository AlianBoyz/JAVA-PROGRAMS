package OOPs.company;
import java.util.*;
class Logic
{
    private int guess=0;
    private int rand=0;
    Logic (int range)
    {
        Random r=new Random();
        rand=r.nextInt(range);

    }
    public int test()
    {
        return rand;
    }
    public void setGuess(int g)
    {
        guess=g;
    }
    public int checking()
    {
        if (guess==rand)
        return 0;
        else if (guess>rand)
            return 2;
        else
            return 1;
    }
}
public class Game
{
    public static void main(String[] args)
    {
        int n=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("!!!WELCOME TO NUMBER GUESSING GAME!!!");
        System.out.println("HOW TO PLAY\n1.You have to set the range to play\n2.Computer will generate a random number in that range and you have to guess it\n3.Number of guesses you take to give correct guess will be your score");
        System.out.println("Enter the range you want to play");
        int range= sc.nextInt();
        Logic obj=new Logic(range);
        System.out.println("Guess a number");
        n = sc.nextInt();
        obj.setGuess(n);
        int score=0;
        while (obj.checking()!=0)
        {
            if (obj.checking()==2)
            {
                System.out.println("!!!YOU HAVE CHOSEN A GREATER NUMBER CHOSE AGAIN!!!");
                n=sc.nextInt();
                obj.setGuess(n);
                score++;
            }
            if (obj.checking()==1)
            {
                System.out.println("!!!YOU HAVE CHOSEN A LESSER NUMBER CHOSE AGAIN!!!");
                n=sc.nextInt();
                obj.setGuess(n);
                score++;
            }
        }
        System.out.println("!!! CORRECT GUESS !!!");
        System.out.println("YOUR SCORE \nNumber of guesses = "+score);
    }
}
