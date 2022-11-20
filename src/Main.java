public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double Bmi = service.calculate(75.5, 1.7);
        double weight = 50.5; // Вес в кг
        double height = 1.7; // Рост в метрах
        System.out.println ("Ваш индекс массы тела:" + Bmi);


    }
}
