public class Date {
    int day, month, year;
    public Date(){
        day = 1; month = 2; year = 2022;
    }
    int daysSinceJan1(){
        int janDay = 1;
        int janMonth = 1;
        int diffMonth = month-janMonth;
        int diffDay = day-janDay;
        return(((diffMonth*2)*30)+(diffDay+1));
    }
}
