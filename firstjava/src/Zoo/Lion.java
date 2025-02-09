package Zoo;

public class Lion extends Animal {

    

    @Override
    void eat(){
        System.out.println(this.name + " is eating...nom..nom...");
    }

    @Override
    void sleep(){
        System.out.println(this.name + " is sleeping...zzz..zzz...");
    }

    @Override
    void makeSound() {
       System.out.println(this.name + " is roaring...");
    }



}
