public class BmiService {
    public double calculate (double height, int weight){

        // Формула для расчета ИМТ - ИМТ = m/h2, где:
        //
        //    m — масса тела в килограммах,
        //    h — рост в метрах.
        //

        double bmi= weight/(height*height);
        return bmi;

    }
}
