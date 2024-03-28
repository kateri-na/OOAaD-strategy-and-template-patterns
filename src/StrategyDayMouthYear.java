public class StrategyDayMouthYear extends Strategy {
    @Override
    public void format() {
        System.out.printf(currentData.getDayOfMonth() + "." + currentData.getMonthValue() + "." + currentData.getYear() + " ");
        System.out.println(currentTime.getHour() + ":" + currentTime.getMinute() + ":" + currentTime.getSecond());
    }
    @Override
    public void InputStrategyName() {
        System.out.println("Имя формата: day.month.year hour:minute:second");
    }

    @Override
    public void InputStrategyInfo() {
        System.out.println("Формат часто используется в программах для отображения " +
                "текущей даты и времени с разделением на составляющие");
    }
}
