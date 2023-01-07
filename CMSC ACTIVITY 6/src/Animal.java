public class Animal {

    String  breed, color, classification, sound, size;
    int age, price; 

    Animal(String breed, String color, String classification, String sound, String size, int age, int price)
{    
    this.breed = breed;
    this.color = color;
    this.classification = classification;
    this.sound = sound; 
    this.size = size;
    this.age = age;
    this.price = price;
}
    
public void Introduction()
{
System.out.println("This animal is a dog called " + breed + " and it has the title of most expensive dog. " +
    "It has different color like " + color + " and they are becoming very " + classification + ". " + "Of course it can bark but the sound isn't that too " 
    + sound + " because of it's " + size + " size.");
}
public void Cost_Age()
{
System.out.println("The average " + breed + " lifespan is  typically " + age + " years. This Siberian dogs cost around " 
+ price +" dollars.");
}
}
