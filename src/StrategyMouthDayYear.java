public class StrategyMouthDayYear extends Strategy {
    @Override
    public void format() {
        System.out.printf(currentData.getMonthValue()+"."+currentData.getDayOfMonth()+"."+currentData.getYear()+" ");
        System.out.println(currentTime.getHour()+":"+currentTime.getMinute());
    }
}
