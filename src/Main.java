public class Main {

    public static void main(String[] args) {
	// write your code here

        //Creating objects from main template class Car
        Car porsche =  new Car();
        Car holden = new Car();

        porsche.setModel("Carrera");

        System.out.println("Model is " + porsche.getModel());
    }
}
