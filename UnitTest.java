/**
 * Created by Umar on 26-Feb-16.
 */
import static org.junit.Assert.*;

//import junit.*;
import org.junit.Test;

import java.util.ArrayList;


public class UnitTest {
    @Test
    public void addtest(){
        ArrayList<Integer> r= new ArrayList<>();
        r.add(10);
        r.add(5);
        r.add(4);
        r.add(4);
        r.add(6);
        r.add(7);
        r.add(16);
        NaturalOperations n= new NaturalOperations();
        assertEquals(52,n.add(r));
    }
    @Test
    public void minus(){
        ArrayList<Integer> r= new ArrayList<>();
        r.add(10);
        r.add(5);
        r.add(4);
        r.add(4);
        r.add(6);
        r.add(7);
        r.add(16);
        NaturalOperations n= new NaturalOperations();
        assertEquals(-32,n.add(r));
    }
    @Test
    public void mul(){
        ArrayList<Integer> r= new ArrayList<>();
        r.add(10);
        r.add(5);
        r.add(4);
        r.add(4);
        r.add(6);
        r.add(7);
        r.add(16);
        NaturalOperations n= new NaturalOperations();
        assertEquals(537600,n.add(r));

    }
    @Test
    public void div(){
        ArrayList<Integer> r= new ArrayList<>();
        r.add(10);
        r.add(5);
        r.add(4);
        r.add(4);
        r.add(6);
        r.add(7);
        r.add(16);
        NaturalOperations n= new NaturalOperations();
        assertEquals(537600,n.div(r));
        ArrayList<Integer> r2= new ArrayList<>();
        r.add(10);
        r.add(5);
        r.add(0);
        r.add(4);
        r.add(6);
        r.add(7);
        r.add(16);
        assertEquals(null,n.div(r));
    }
}

