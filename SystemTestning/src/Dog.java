public class Dog {
    private String name;
    private int numberOfLegs;
    private boolean tail;

    public Dog(String name){
        this.name = name;
        this.numberOfLegs =4;
        this.tail = true;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public boolean hasTail() {
        return tail;
    }

    public void cutLeg(){
        if (this.numberOfLegs>0){
            numberOfLegs--;
        } else{
            System.out.println("You cant cut legs from a legless dog!");
        }


    }
    public void cutTail(){
        if (this.tail){
            this.tail = !this.tail;
        }
        else{
            System.out.println("Only one tail per dog!");

        }
    }


    }

