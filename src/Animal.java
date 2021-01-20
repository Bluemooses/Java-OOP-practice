public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }


    public void eat(){

        System.out.println("Animal eat called, animal is now eating");

    }

    public void walk(){
        System.out.println("Animal walk called");
    }

    public void run(){
        System.out.println("Animal run called");
    }

    public void move(int i){
        System.out.println("Animal move called - moving at " + i);

    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
