package kata2v4;

public class Kata2v4 {

    public static void main(String[] args) {
        
        Double[] vector = {1.5,2.6,3.1,4.2,1.5,5.8,3.1,6.2,2.3,9.0};
        //String[] vector = {"maria", "maria", "marta", "ari", "alejandro"};
        //int[] vector = {1,5,6,4,46,2100,3,56,1,2,3};
        
        Histogram<Double> histogram = CalculateHistogram.computeHistogram(vector); 
        
        for(Object Key : histogram.keySet()){
            System.out.println(Key + " -> " +  histogram.get(Key));
        }
    }
}
