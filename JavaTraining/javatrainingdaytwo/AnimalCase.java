package javatrainingdaytwo;
interface animaleats{
    public void eat();
}

interface animaltravels{
    public void travel();
}

class AnimalCase implements animaleats,animaltravels {
    public void eat() {
        System.out.println("animal is eating");
    }

    public void travel() {
        System.out.println("Animal is travelling");
    }


    public static void main(String args[]) {
        AnimalCase A = new AnimalCase();
        A.eat();
        A.travel();

    }
}