public class Date {
    public int year;
    public int month;
    public int day;

    /*public Date() {
        this.year = 2026;
        this.month = 1;
        this.day = 1;
        System.out.println("Date()⽅法被调⽤了 ");
    }*/

    /*public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println("Date(int,int,int)⽅法被调⽤了 ");
    }*/

    public void printDate(Date this){
        System.out.println(this.year + "/" + this.month + "/" + this.day);
    }

    public static void main(String[] args) {
        //此处创建了⼀个Date类型的对象，并没有显式调⽤构造⽅法
        //Date d1 = new Date(2026,5,20);   //输出Date(int,int,int)⽅法被调⽤了
        Date d2 = new Date();
        //d1.printDate();    // 2026/5/20
        d2.printDate();    // 2026/1/1
    }
}