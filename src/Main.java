public class Main {

    public static void main(String[] args) {
	Daughter objectA= new Daughter(50, " Nastya", Status.MAMA, new Address("Covetskaya 45"));
	Grandddaughter objectB = new Grandddaughter(14, " Anya", Status.DAUGHTER,
            "Kozlov ", new Address("Chui 145"));

	Grandddaughter objectC= new Grandddaughter(15,"Vika", Status.DAUGHTER,
            "№70",new Address(" Toktogul 30"));
	objectA.Sleep("Ночью мы спим ");
	objectB.Sleep("днем мы не спим", 7);
	objectC.Sleep(" в 2 часа дня мы не спим ");
		System.out.println(objectA.getInfo());
		System.out.println(objectB.getInfo());
		System.out.println(objectC.getInfo());
    }
}
