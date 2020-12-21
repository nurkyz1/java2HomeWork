public class Grandmother {
    private int age;
    private String name;
    private Address address;

    public Grandmother(int age, String name, Address address) {
        this.age = age;
        this.name = name;
        this.address=address;

    }
    public void  abv(){
        System.out.println("abv");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
public  String getInfo(){
        return "Age :"+age+", Name :"+name+" , Address :"+address.getAddress();
}

}
