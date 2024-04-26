import java.util.ArrayList;
public class StepTracker
{
  private int activeDays, numDays, minSteps, dailySteps;
  public StepTracker (int a) {
    minSteps = a;
    dailySteps = 0;
    numDays = 0;
    activeDays = 0;
  }
  public void addDailySteps (int x) {
    dailySteps += x;
    numDays++;
    if (x >= minSteps) {
      activeDays++;
    }
  }
  public double averageSteps () {
    if (numDays == 0) {
      return 0.0;
    } else {
      return (double)dailySteps/numDays;
    }
  }
  public int activeDays () {
    return activeDays;
  }
} 
