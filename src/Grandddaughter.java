 final  public class Grandddaughter extends Daughter {
    private  String nameSchool;
    public Grandddaughter(int age, String name, Status status, String nameSchool, Address address) {
        super(age, name, status,address);
        this.nameSchool=nameSchool;
    }

    public String getNameSchool() {
        return nameSchool;
    }
    public  String getInfo(){
        return super.getInfo()+" , Name School:"+ nameSchool;
    }

     @Override
     public void abv() {
         super.abv();
     }
 }
