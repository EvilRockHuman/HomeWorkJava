package TaskSix;

import java.time.LocalDate;

public class Task01 {
    public static void main(String[] args) {

//        LocalDate date = LocalDate.now();
//        int year = date.getYear();
//        int month = date.getMonthValue();
//        int day = date.getDayOfMonth();
//        int manyDay = date.getDayOfYear();
//        System.out.print("Текущая дата: ");
//        System.out.printf("%d-%d-%d \n", year, month, day);
//        System.out.print("Количество дней с начала года по нынешнюю дату: ");
//        System.out.println(manyDay);
//        LocalDate customDate = LocalDate.of(year, 1, 1);
//        System.out.print("Заданная дата: ");
//        System.out.println(customDate);
//        int YEAR = Integer.parseInt(String.valueOf(year)) - Integer.parseInt(String.valueOf(customDate.getYear()));
//        System.out.println("Разница в годах с текущей датой и заданной: "+YEAR);
//        int MONTH = Integer.parseInt(String.valueOf(month)) - Integer.parseInt(String.valueOf(customDate.getMonthValue()));
//        System.out.println("Разница в месяцах с текущей датой и заданной: "+MONTH);
//        int DAY = Integer.parseInt(String.valueOf(day)) - Integer.parseInt(String.valueOf(customDate.getDayOfMonth()));
//        System.out.println("Разница в днях с текущей датой и заданной: "+DAY);
//        int yearFuture = Integer.parseInt(String.valueOf(year)) + YEAR;
//        int monthFuture = Integer.parseInt(String.valueOf(month)) + MONTH;
//        int dayFuture = Integer.parseInt(String.valueOf(day)) + DAY;
//        System.out.print("Нынешняя дата+разница между нынешней и заданной дате: ");
//        System.out.printf("%d-%d-%d \n", yearFuture, monthFuture, dayFuture);
   LocalDate date = LocalDate.now();
        System.out.println("Текущая дата: "+date);
        int x = date.getDayOfYear();
        System.out.println("Количество дней с начала года: "+x);
        LocalDate z = date.plusDays(x);
        System.out.println("Дата после прибавления дней: "+z);
    }
}
