
import junit.framework.TestCase;
import org.junit.*;

public class Test1 extends TestCase {


    // H
    public void testLegs() throws Exception {
        Dog d = new Dog("Rufus"); //I varje test skapar vi en ny Dog!

        Assert.assertEquals( 4,d.getNumberOfLegs()); //ursprungvärdet
        d.cutLeg();                                        //testa metoden
        Assert.assertEquals(3,d.getNumberOfLegs()); //Stämmer
       d.cutLeg();                                 //testa fler metoder
       d.cutLeg();
        d.cutLeg();
        Assert.assertEquals(0,d.getNumberOfLegs()); //Är vi på noll nu?
        d.cutLeg();                                          //Vad händer om vi fortsätter?
        Assert.assertEquals(0,d.getNumberOfLegs()); // Vi kollar att resultatet fortfarande är okej.
        tearDown();                                            //Vi rensar bort alla instanser vi gjort här!
                                                                // Så att vi nästa test startar rent! (Varför är det viktigt?)
    }

    public void testTail() throws Exception {
        Dog d = new Dog ("Karo");
        Assert.assertTrue(d.hasTail());
        d.cutTail();
        Assert.assertFalse(d.hasTail());
        d.cutTail();
        Assert.assertFalse(d.hasTail());
        tearDown();
    }
}