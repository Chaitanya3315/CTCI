package StacksAndQueues;
import java.util.*;
class Animal{
    private int order;
    String name;
    Animal(String s){
        this.name=s;
    }
    public int getOrder(){
        return this.order;
    }
    public void setOrder(int n){
        this.order=n;
    }
    public boolean isOrderThan(Animal a){
        return this.order <a.getOrder();
    }
}
class Dog extends Animal{
    Dog(String n){
        super(n);
    }
}
class Cat extends Animal{
    Cat(String n){
        super(n);
    }
}
public class AnimalShelter {
    Stack<Dog> dogs=new Stack<Dog>();
    Stack<Cat> cats=new Stack<Cat>();
    private int order=0;
    public void enqueue(Animal a){
        a.setOrder(order);
        order++;

        if(a instanceof Dog){
            dogs.push((Dog)a);
        } 
        if(a instanceof Cat){
            cats.push((Cat)a);
        }
    }
    public Animal dequeueAny(){
        if(dogs.isEmpty()){
            return cats.pop();
        }else if(cats.isEmpty()){
            return dogs.pop();
        }
        Dog d=dogs.peek();
        Cat c=cats.peek();
        if(d.isOrderThan(c)){
            return dogs.pop();
        }else{
            return cats.pop();
        }
    }
    public Dog dequeueDog(){
        return dogs.pop();
    }
    public Cat dequeueCat(){
        return cats.pop();
    }
    public static void main(String[] args){
        AnimalShelter shelter=new AnimalShelter();

    }
}
