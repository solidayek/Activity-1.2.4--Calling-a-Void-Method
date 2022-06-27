class Main {
  
  public static void main(String[] args)
  {
    //Kino
    Dog mycuteDog = new Dog();
    mycuteDog.dogName("Kino");
    mycuteDog.eat("Orijen",2 ,3);
    mycuteDog.walk(30, "DoggyFun");
    System.out.println("");

    //Daisy
    Dog mycuteDog2 = new Dog();
    mycuteDog2.dogName("daisy");
    mycuteDog2.eat("kibble", 2); // Daisy eats kibble twice a day
    System.out.println("");
   



   
    Dog mycuteDog3 = new Dog();
    mycuteDog3.dogName("Jungkook");
    mycuteDog3.eat("kimchi Fried Rice and meat",2); 
    mycuteDog3.setAge(23);
    mycuteDog3.walk(3, "Nadeuri");
    mycuteDog3.play("Frisco Plush");
    mycuteDog3.music("shake it off");
  }
  
}