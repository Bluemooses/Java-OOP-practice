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



    }
}
