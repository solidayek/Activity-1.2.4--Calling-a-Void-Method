/*
 * Activity 1.2.4
 */
public class Dog
  

{
  
  String parkName;

  public void dogName(String name)
  {
    System.out.println("Hi! I am a dog. My name is " + name + ".");
  }

  public void sit()
  {
    System.out.println("OK! I am sitting.");
  }

  public void speak()
  {
    System.out.println("arf arf!");
  }

  public void walk(int num)
  {
    System.out.println("I love to walk for " + num + " minutes.");
  }

  public void walk(int num, String park)
  {
    parkName =  park;
    System.out.println("I love to walk for " + num + " minutes and go to " + park + "!");
  }
  

  public void eat(String food)
  {
    System.out.println("I eat " + food + ".");
  }
  
  public void eat(String food, int num)
  {
    System.out.println("I eat " + food + " " + num + " times a day.");
  }

  public void eat(String food, double amount, int num)
  {
    System.out.println("I eat " + amount + " cups of " + food + " " + num + " times a day.");
  }
  
  public void setAge(int years)
  {
    System.out.println("I am " + years + " years old.");
  }

  public void setAge(int years, int months)
  {
    System.out.println("I am " + years + " years and " + months + " months old.");
  }
  public void setAge(double years)
  {
    System.out.println("I am " + years + " years old.");
  }
  
  public void play(String toy)
  {
    System.out.println("Oh boy! I get to play with my " + toy + "!");
  }

  public void music(String song)
  {
    System.out.println("Oh lord...I love listening to " + song + "!" + " My owner always play it and I love it.");
  }


}




