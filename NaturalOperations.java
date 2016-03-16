import java.util.*;

/**
 * Created by Umar on 26-Feb-16.
 */
public class NaturalOperations {

    public static void main (String args[]){
        Random r= new Random(100);
        NaturalOperations n= new NaturalOperations();
        ArrayList<Integer> send= new ArrayList<>();
        for(int i=0;i< 5;i++){
            int k=r.nextInt(10)+1;
            send.add(k);
            System.out.println(k);
        }
        System.out.println(n.add(send));
        System.out.println(n.sub(send));
        System.out.println(n.mul(send));
//        Long g= (Long)n.div(send);
        if(n.div(send)!=(Long)null)
        System.out.println(n.div(send));
        else
            System.out.println("Division Not possible for 0");
    }
    public long add(ArrayList<Integer> in){
        long r=0;
        for(int i=0;i<in.size();i++){
            r+=in.get(i);
        }
        return r;
    }
    public long sub(ArrayList<Integer> in){

        long r=in.get(0);
        for(int i=0;i<in.size();i++){
            r-=in.get(i);
        }
        return r;
    }
    public long mul(ArrayList<Integer> in){
        long r=in.get(0);
        for(int i=1;i<in.size();i++){
            r*=in.get(i);
        }
        return r;
    }
    public long div (ArrayList<Integer> in){
        long r= in.get(0);
        if (r==0) {

            return (Long) null;
        }
        for(int i=1;i<in.size();i++){
            if (in.get(i)==0)
                return (Long) null;
            r/=in.get(i);
        }
        return r;

    }

}
