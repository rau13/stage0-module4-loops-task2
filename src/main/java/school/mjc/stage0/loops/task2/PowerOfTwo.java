package school.mjc.stage0.loops.task2;

public class PowerOfTwo {

    public  void printPower(int power) {
        int counter = 1;
        while(counter<=power){
            if(counter>0){
                System.out.println((int) Math.pow(2,counter));
            }
            counter++;
        }
    }
}
