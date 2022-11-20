public class BmiService {
    public double calculate(double weight, double height) {
        double heightSquare = height * height;
        double result;
        if (weight > height){
            result = weight / heightSquare;
        } else {
            result = 0;
        }
        return (int) result;

    }

}

