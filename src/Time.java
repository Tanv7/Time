public class Time implements Comparable<Time>
int hours,minutes,seconds;
public Time(int hours, int minutes, int seconds) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }

        public int getHours() {
            return hours;
        }
        @Override
public String toString(){
    return "Time{"+
            "hours="+hours+
            ",minutes=" +minutes+
            ",seconds="+seconds+

        }
        @Override
public int compareTo (Time t1){
    int t2=t1.getHours();
    return this.getHours()-t2;

        }


