package club.baiyuan;

public class Cat {
    private String breed;
    private String color;

    public String getInfo(){
        return this.color+this.breed;
    }

    public String print(){
        return getInfo();
    }

    public String playWith(Dog dog){
        return this.getInfo()+dog.getInfo();
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "cat{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
