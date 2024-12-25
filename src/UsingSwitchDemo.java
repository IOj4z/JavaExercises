class UsingSwitchDemo {
    static String getDay(int num) {
        String day;
        switch (num){
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "None";
        }
        return day;
    }
    static String testDay(int num) {
        String dayName = "";
        switch (num){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayName = "Working day";
                break;
            case 6:
            case 7:
                dayName = "Day off";
                break;
        }
        return dayName;
    }

    public static void main(String[] args) {
        for (int k=1;k<=8;k++){
            System.out.println(k+": "+ getDay(k)+"\t "+testDay(k));
        }
    }
}
