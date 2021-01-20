public class Main {

    public static void main(String[] args) {
	// write your code here

        //Creating objects from main template class Car
        Car porsche =  new Car();
        Car holden = new Car();

        //sets model to carrera
        porsche.setModel("Carrera");

        //references class car and fails - showing model unknown.
        porsche.setModel("Holden");

        System.out.println("Model is " + porsche.getModel());

        //accounts practice
        Account jacobsAccount = new Account();
        jacobsAccount.deposit(5000);
        jacobsAccount.withdrawal(200);

        //constructing a new account utilizing our account constructor
        Account daveAccount = new Account("115", 15000, "Dave Bald", "email@gmail.com", "612-555-7896");
        System.out.println(daveAccount.getAccountBalance());
    }
}
