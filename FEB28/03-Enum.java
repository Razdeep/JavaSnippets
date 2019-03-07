enum Day{
    SUN, MON, TUE;
}
class Demo{
    public static void main(String args[])
    {
        Day days[] = Day.values();
        for(Day day: days)
            System.out.println(day);
    }
}