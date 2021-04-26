import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class reverseString extends Date {

    private static final ArrayList<Integer> DYNAMIC_PUSH_STATUS_CHECK = new ArrayList<Integer>(Arrays.asList(0,1,2));

    public static void main(String[] args) throws ParseException {
//        short s1 = 1;
//        s1 += 1;
//        s1 = (short) (s1 + 1);
//        System.out.println(s1);
//        new reverseString().test();

//        Calendar calBegin = Calendar.getInstance();
//        System.out.println(calBegin);
//        Date time = calBegin.getTime();
//        System.out.println(calBegin.getTime());

//        Calendar calBegin = Calendar.getInstance();
//        calBegin.setTime(getFormatDate(new Date(),"yyyy-MM-dd HH:mm:ss"));
//        System.out.println(calBegin.getTime());
//
//
//        Calendar begin = Calendar.getInstance();
//        begin.set(Calendar.HOUR_OF_DAY, 5);
//        begin.set(Calendar.MINUTE, 59);
//        begin.set(Calendar.SECOND, 0);
//        System.out.println(begin.getTime());
//
//        Calendar end = Calendar.getInstance();
//        end.set(Calendar.HOUR_OF_DAY, 16);
//        end.set(Calendar.MINUTE, 1);
//        end.set(Calendar.SECOND, 0);
//        System.out.println(end.getTime());
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = sdf.parse(sdf.format(new Date(end.getTimeInMillis())));
//        System.out.println(date);

//        Date dateByTimePoint = getDateByTimePoint(new Date(), "12:15");
//        System.out.println(dateByTimePoint);
//        Calendar instance = Calendar.getInstance();
//        Calendar limit = Calendar.getInstance();
//
//        instance.set(Calendar.HOUR_OF_DAY, 6);
//        instance.set(Calendar.MINUTE, 0);
//        instance.set(Calendar.SECOND,0);
//
//        System.out.println(instance.getTime());
//        if (limit.after(instance)){
//            System.out.println("after");
//        }
//
//        instance.add(Calendar.MINUTE,100);
//        instance.set(Calendar.SECOND, 59);
//        System.out.println(instance.getTime());
//        System.out.println(DYNAMIC_PUSH_STATUS_CHECK);
        Integer integer = new Integer(1);
        if (DYNAMIC_PUSH_STATUS_CHECK.contains(integer)){
            System.out.println("dsjdhsjhdjsdhksds");
        }

        Calendar end = Calendar.getInstance();
        Calendar begin = Calendar.getInstance();
        begin.set(Calendar.HOUR_OF_DAY, 5);
        begin.set(Calendar.MINUTE, 59);
        begin.set(Calendar.SECOND, 30);
        end.set(Calendar.HOUR_OF_DAY, 16);
        end.set(Calendar.MINUTE, 0);
        end.set(Calendar.SECOND, 30);
        Calendar sta = Calendar.getInstance();
        Calendar en = Calendar.getInstance();
        if(sta.after(begin) && en.before(end)){
            System.out.println("dhdhk");
        }
        System.out.println("行吗");


        Date currentDate = getCurrentDate("1990-01-01", "yyyy-MM-dd");
        System.out.println(currentDate);

        List<Integer> outpatientDetailResponseList = new ArrayList<Integer>();
        System.out.println("djskds");
        for (Integer integer1 : outpatientDetailResponseList) {
            System.out.println("212");
        }
        System.out.println("dskdskgfgfgf");

    }


    @Test
    public void test(){
        dmxy();
        System.out.println(super.getClass().getName());
        System.out.println("dmxy");
    }

    private  void dmxy(){
        return;
    }
    public static Date getCurrentDate(String dateStr, String format) {
        SimpleDateFormat formatter = new SimpleDateFormat(format);

        try {
            Date currentTime = formatter.parse(dateStr);
            return currentTime;
        } catch (ParseException var5) {
            return null;
        }
    }
    public static Date getDateByTimePoint(Date currentDate, String timePoint) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String date = df.format(currentDate);
        String newDate = date + " " + timePoint;
        return getCurrentDate(newDate, "yyyy-MM-dd HH:mm");
    }

    public static Date getFormatDate(Date date, String format) {
        Date currentTime = null;
        SimpleDateFormat formatter = new SimpleDateFormat(format);

        try {
            String currentTimeStr = formatter.format(date);
            currentTime = formatter.parse(currentTimeStr);
            return currentTime;
        } catch (ParseException var5) {
            return null;
        }
    }
}
