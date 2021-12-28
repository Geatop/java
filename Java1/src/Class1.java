
import java.text.DateFormat;
import java.text.ParseException; //добавили для парсинга
import java.text.SimpleDateFormat; //добавили для форматирования дат
import java.util.Calendar;
import java.util.Date; // добавили даты
import java.util.GregorianCalendar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Oleg
 */
public class Class1 {
    public String name; //наименование
    public int price, release; // цена, дата выхода
  //  public Date release; //дата выхода
    public int howOld(){  
        Calendar today = new GregorianCalendar(); 
        int age = today.get(Calendar.YEAR) - release;
        return age;
        // Calendar releasedate = new GregorianCalendar();
        //   today.add(Calendar.YEAR, -releasedate.get(Calendar.YEAR));
        /*   SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date dateNow = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateNow);
        Date release = new Date();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(release);
         */
        /*  try {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy"); //задали формат дате
        Date dateNow = new date();//dateFormat.parse(now); //применили форматирование к нужной строке
        Date dateRelease = dateFormat.parse(release); //применили форматирование к нужной строке
        long milliseconds = dateNow.getTime() - dateRelease.getTime(); //вычисление разницы дат в миллисекундах
        int years = (int) (milliseconds/(360*24*60*60*100)); // в годах
        // int days = (int)(milliseconds/24*60*60*1000); // в днях
        }catch (ParseException e){
        }
         */
        //Date date = new Date();
        //SimpleDateFormat simple = new SimpleDateFormat("dd.MM.yyyy");
        //Date releaseDate = new Date();
        //SimpleDateFormat simple2 = new SimpleDateFormat("dd.MM.yyyy");
        //Date release = new Date();
        //release = (simple.format(date) - simple2.format(releaseDate));
    }
    public void TV() {
        price = (int) (price*1.2); //увеличили цену на 20%
    }
}
