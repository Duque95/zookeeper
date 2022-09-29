public class Gorilla extends Mammal{
    public void throwSomething(){
        System.out.println("throw a banana");
        energyLevel -= 5;
    }
    public void eatSomething(){
        System.out.println("eat a banana");
        energyLevel += 10;
    }
    public void climbSomething(){
        System.out.println("climb a tree");
        energyLevel -= 10;
    }
}
