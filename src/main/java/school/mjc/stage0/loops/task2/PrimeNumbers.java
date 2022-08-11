package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 1;
        while(counter <= printToInclusive){
            if(counter%counter==0 &&  counter%1==0){
                System.out.println(counter);
            }
            counter++;
        }
    }
}
