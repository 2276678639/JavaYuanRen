package club.baiyuan;

public class Main {
    public Dog createDog(int iq,String breed){
        System.out.println("创建一个iq为"+iq+"的"+breed);
        Dog dog = new Dog();
        dog.setIq(iq);
        dog.setBreed(breed);
        return dog;
    }


    public void main(String[] args) {
        Dog d1=createDog(64,"柯基");


    }
}
