
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Oleg
 */
public class Class2 extends Class1 {
    public String ship;
    public void HowManyDays(){
        Calendar today = new GregorianCalendar();
        Calendar releasedate = new GregorianCalendar();
        today.add(Calendar.DAY_OF_YEAR, -releasedate.get(Calendar.DAY_OF_YEAR));
      /*  try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy"); //задали формат дате
            Date dateNow = dateFormat.parse(now); //применили форматирование к нужной строке
            Date dateRelease = dateFormat.parse(release); //применили форматирование к нужной строке
            long milliseconds = dateNow.getTime() - dateRelease.getTime(); //вычисление разницы дат в миллисекундах
            //int years = (int) (milliseconds/(360*24*60*60*100)); // в годах
            int days = (int)(milliseconds/24*60*60*1000); // в днях
        }catch (ParseException e){
        }
*/
    }
}

