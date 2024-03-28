public class StrategyMouthDayYear extends Strategy {
    @Override
    public void format() {
        System.out.printf(currentData.getMonthValue()+"."+currentData.getDayOfMonth()+"."+currentData.getYear()+" ");
        System.out.println(currentTime.getHour()+":"+currentTime.getMinute());
    }

    @Override
    public void InputStrategyName() {
        System.out.println("Имя формата: month.day.year hour:minute");
    }

    @Override
    public void InputStrategyInfo() {
        System.out.println("Формат широко используется в американской и канадской системе датирования");
    }
}
