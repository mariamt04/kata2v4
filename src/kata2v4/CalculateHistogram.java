package kata2v4;

public class CalculateHistogram {
    
    public static <T> Histogram<T> computeHistogram (T[] vector){
        Histogram<T> listo = new Histogram<>();
        for (T key : vector){
            listo.increment(key);
        }
        return listo;
    }
}
