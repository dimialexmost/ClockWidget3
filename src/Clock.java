import java.time.LocalDateTime;

public class Clock {
    public  static void getTimeData() {
        Thread thread = new Thread() {
            public void start (){
                clock();
            }
        };
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.start();
    }
    private static void clock() {

        while (true) {
            try {
                GUI.labelCurrentTime.setText(timeString());
                GUI.labelCurrentDate.setText(dataString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    private static String timeString() {
        LocalDateTime date = LocalDateTime.now();
        int localHour = date.getHour();
        int localMinute = date.getMinute();
        int localSecond = date.getSecond();
        String timeCurrent;
        String hour;
        String minute;
        String second;

        if (localHour < 10) {
            hour = "0" + (localHour);
        } else {
            hour = String.valueOf(localHour);
        }
        if(localMinute < 10) {
            minute = "0" + (localMinute);
        } else {
            minute = String.valueOf(localMinute);
        }
        if(localSecond < 10) {
            second = "0" + (localSecond);
        } else {
            second = String.valueOf(localSecond);
        }
        timeCurrent = " " + hour + ":" + minute + ":" + second;
        return timeCurrent;
    }
    private static String dataString() {
        LocalDateTime date = LocalDateTime.now();
        String dataString = date.getDayOfMonth() + " - " + date.getMonthValue() + " - " + date.getYear() + " - " + date.getDayOfWeek();


        return dataString;
    }
}