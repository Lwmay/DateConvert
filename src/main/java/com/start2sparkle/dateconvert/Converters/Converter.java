package main.java.com.start2sparkle.dateconvert.Converters;

public abstract class Converter implements IConverter{

    protected String day, month, year, refCo, strDate;

    public void setRefCo(){
        this.refCo = this.year + this.month + this.day;
    };

    public void setStrDate(){
        this.strDate = this.day + "/" + this.month + "/" + this.year;
    };

    public Integer toCo(){
        this.refCo = this.year + this.month + this.day;
        return Integer.parseInt(this.refCo);
    };

    public String toDate(){
        return this.strDate;
    };

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }
}
