public class StrategyYearMouthDay extends Strategy {
    @Override
    public void format() {
        System.out.printf(currentData.getYear()+"-"+currentData.getMonthValue()+"-"+currentData.getDayOfMonth()+" ");
        System.out.println(currentTime.getHour()+":"+currentTime.getMinute());
    }

    @Override
    public void InputStrategyName() {
        System.out.println("Имя формата: year-month-day hour:minute");
    }

    @Override
    public void InputStrategyInfo() {
        System.out.println("формат часто используется в базах данных" +
                " для однозначного представления даты и времени");
    }
}
