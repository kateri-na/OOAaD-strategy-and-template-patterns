public abstract class Strategy implements TemplateStrategyInfo {
    protected java.time.LocalDate currentData;
    protected java.time.LocalTime currentTime;
    Strategy(){
        currentData = java.time.LocalDate.now();
        currentTime = java.time.LocalTime.now();
    }
    abstract void format();
}
