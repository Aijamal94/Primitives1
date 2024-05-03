public class Main {
    public static void main(String[] args){

        double ticketCost = 13676.0; // Стоимость билета
        double mileCost = 20.0; // Стоимость одной бонусной мили
        int miles = (int) (ticketCost / mileCost);  // Рассчитываем количество начисленных миль

        System.out.println("За купленный билет начислено " + miles + " миль.");  // Выводим результат на экран
    }
}