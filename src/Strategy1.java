public class Strategy1 extends Strategy {
    @Override
    public void format() {
        System.out.printf(currentData.getDayOfMonth() + "." + currentData.getMonthValue() + "." + currentData.getYear() + " ");
        System.out.println(currentTime.getHour() + ":" + currentTime.getMinute() + ":" + currentTime.getSecond());
    }
}
