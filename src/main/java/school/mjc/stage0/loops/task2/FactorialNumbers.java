package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 1;
        int value=1;
        while(counter <= printToInclusive){
            value = value*counter;
            System.out.println(value);
            counter++;
        }
    }
}
