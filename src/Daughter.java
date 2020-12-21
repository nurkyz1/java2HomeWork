public class Daughter extends Grandmother {
    private Status status;



    public Daughter(int age, String name, Status status, Address address) {
        super(age, name, address);
        this.status=status;

    }
    public void Sleep(String sleep, int time){


    }
    public final void  Sleep(String sleep){

    }
    public  String getInfo(){
        return super.getInfo()+" , Status: "+status;
    }
}
