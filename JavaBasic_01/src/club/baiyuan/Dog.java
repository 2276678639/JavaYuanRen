package club.baiyuan;

public class Dog {
    private String breed;
    private int iq;

    public String getInfo(){
        String str="";
        if (this.iq<20){
            str="傻";
        }else if (this.iq<=80){
            str="普通的";
        }else{
            str="聪明的";
        }

        return str+this.breed;
    }

    public String getBreed() {
        return breed;
    }

    public String printInfo(){
        return getInfo();
    }

    public String playWith(Cat cat){
        return this.breed+cat.getBreed();
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public String toString() {
        return "dog{" +
                "breed='" + breed + '\'' +
                ", iq=" + iq +
                '}';
    }
}
