public class Strategy3 extends Strategy {
    @Override
    public void format() {
        System.out.printf(currentData.getYear()+"-"+currentData.getMonthValue()+"-"+currentData.getDayOfMonth()+" ");
        System.out.println(currentTime.getHour()+":"+currentTime.getMinute());
    }
}
