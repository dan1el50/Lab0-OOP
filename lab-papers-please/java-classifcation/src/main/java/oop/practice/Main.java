package oop.practice;

public class Main {
  public static void main(String[] args){
    String[] traits = {"BLONDE, TALL"};
    Entity entity1 = new Entity(0, true, "Asgard", 2034, traits);
    Entity entity2 = new Entity(0, null, "Asgard", 2034, traits);
    Entity entity3 = new Entity(0, true, null, 2034, traits);
    Entity entity4 = new Entity(0, true, "Asgard", null, traits);
    Entity entity5 = new Entity(0, true, "Asgard", 2034, null);

//    System.out.print("{ID: " + entity1.getId());
//    System.out.print(", isHumanoid: " + entity1.isHumanoid());
//    System.out.print(", Planet: " + entity1.getPlanet());
//    System.out.print(", Age: " + entity1.getAge());
//    System.out.print(", Traits: " + String.join(", ", entity1.getTraits()) + "}");

    entity1.PrintEntity();
    entity2.PrintEntity();
    entity3.PrintEntity();
    entity4.PrintEntity();
    entity5.PrintEntity();

  }
}
