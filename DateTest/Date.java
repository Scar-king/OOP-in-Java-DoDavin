package DateTest;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        setDate(day, month, year);
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public void setDay(int day){
        if(day >= 1 && day <= 31){
            this.day = day;
        } else {
            throw new IllegalArgumentException("Day must be between 1 and 31");
        }
    }

    public void setMonth(int month){
        if(month >= 1 && month <= 12){
            this.month = month;
        } else {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }
    }

    public void setYear(int year){
        if(year >= 1900 && year <= 9999){
            this.year = year;
        } else {
            throw new IllegalArgumentException("Year must be between 1900 and 9999");
        }
    }

    public void setDate(int day, int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    @Override
    public String toString(){
        return String.format("%02d/%02d/%04d", day, month, year);
    }

}
