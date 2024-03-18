public class Strategy2 extends Strategy {
    @Override
    public void format() {
        System.out.printf(currentData.getDayOfMonth()+"."+currentData.getMonth()+"."+(currentData.getYear() - 2000)+" ");
        System.out.println(currentTime.getHour()+":"+currentTime.getMinute());
    }
}
