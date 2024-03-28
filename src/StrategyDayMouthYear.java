public class StrategyDayMouthYear extends Strategy {
    @Override
    public void format() {
        System.out.printf(currentData.getDayOfMonth() + "." + currentData.getMonthValue() + "." + currentData.getYear() + " ");
        System.out.println(currentTime.getHour() + ":" + currentTime.getMinute() + ":" + currentTime.getSecond());
    }
}
