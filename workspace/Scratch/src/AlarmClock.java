/*
 * A business class that models an alarm clock.
 */
class AlarmClock
{
    //ATTRIBUTES, PROPERTIES, TRAITS - aka FIELDS, INSTANCE VARIABLES
    private int snoozeInterval = 10;

    //BEHAVIORS, FUNCTIONS, or METHODS
    public void snooze()
    {
        System.out.println("Snoozing for " + snoozeInterval + " minutes");

    }
    //Accessor methods - these provide "controlled" access to the internal fields
    //aka "getter/setter" methods common in OOP
    public int getSnoozeInterval()
    {
        return snoozeInterval;
    }

    public void setSnoozeInterval(int snoozeInterval)
    {
        this.snoozeInterval = snoozeInterval;
    }
}