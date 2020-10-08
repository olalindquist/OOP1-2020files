import java.util.Arrays;

public class ComboLock {

    private int[] correct; //den korrekta kombinationen
    private boolean[] unlocked; //Måste sättas till [true,true, true] för att vi ska kunna öppna
    private int pointer; //Det värde som låset pekar på.

    public ComboLock(int secret1, int secret2, int secret3) {

        this.correct = new int[3];
        this.unlocked = new boolean[3];
        // Ej nödvändigt att nollställa unlocked då booleanArrayer initieras till false automatiskt.
        this.unlocked[0] = false;
        this.unlocked[1] = false;
        this.unlocked[2] = false;
        //Sätt de korrekta värdena
        this.correct[0] = secret1;
        this.correct[1] = secret2;
        this.correct[2] = secret3;
        //Och Nolla pekaren
        this.pointer = 0;

    }

    /**
     * Set the pointer to 0;
     */
    public void reset() {
        this.pointer = 0;
    }


    /**
     * Turns the lock pointer a number of ticks right.
     * @param ticks the number of ticks.
     */
    public void turnRight(int ticks) {

        this.pointer += ticks;

        //Om this.pointer överstiger 39 så är varvet slutet. Med restdivision får vi ut hur många steg i praktiken måste
        //flytte pekaren. Ett annat sätt att göra det hade varit att ta bort multipler av 39 tills pointer<39.

        while (this.pointer > 39) {
            this.pointer = this.pointer % 39 - 1;

        }

        System.out.println("Turned left to " + this.pointer);
        //Om den första unlocked är false och vi hamnat på rätt siffra så sätter vi första unlocked till true;
        if (!this.unlocked[0]) {
            if (this.pointer == correct[0]) {
                this.unlocked[0] = true;
            }
        }
        // Om den första och den andra är satta och vi har korrekt tredje siffra så sätter vi sista unlocked till true
            else if (this.unlocked[1]) {
                if (this.pointer == correct[2]) {
                    this.unlocked[2] = true;
                }
            }
            //I annat fall nollställer vi unlocked!
            else {
               resetUnlocked();
        }
        }

    /**
     * Turns the lock pointer a number of ticks to the left.
     * @param ticks the number of ticks.
     */
    public void turnLeft(int ticks) {

        // Vi börjar med att kolla om vi kommit över 39 och precis som ovan så skalar vi bort alla jämna
        //multipler av 39.
        while (ticks > 39) {
            ticks = ticks % 39;
        }

        this.pointer -= ticks;
        //Om vi hamnar under noll i vår räkning så räknar vi från 39 istället.
        if (this.pointer < 0) {
            this.pointer = Math.abs(this.pointer);
            this.pointer = 39 - this.pointer;

        }

        // Om den första är true och vi hamnar på rätt nummer så sätter vi andra till true.

        if (this.unlocked[0]) {
            if (this.pointer == correct[1]) {
                this.unlocked[1] = true;
            }
            //Annar nollar vi unlocked!
            else {
                resetUnlocked();

            }

            System.out.println("Turned right to: " + this.pointer);

        }
    }

    /**
     *
     * @return true if the lock is open
     */
        public boolean open () {
            System.out.println(Arrays.toString(this.unlocked));

            for (Boolean b : this.unlocked) {
                if (!b) {
                    return false;
                }
            }
            return true;

        }

    /**
     * sets unlocked to [false,false, false]
     *
     * (NOTERA att det är private-metod. Den går alltså bara att åberopa inom den klassen.)
     */
        private void resetUnlocked(){
            this.unlocked[0] = false;
            this.unlocked[1] = false;
            this.unlocked[2] = false;
            System.out.println("Sorry, wrong combination - please restart");
        }


    }

