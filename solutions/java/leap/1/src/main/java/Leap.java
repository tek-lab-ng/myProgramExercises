class Leap {

    boolean isLeapYear(int year) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        boolean isLeap = false;
        if(year%4 == 0){
            isLeap = true;
            if(year%100 == 0){
                isLeap = true;
                isLeap = (year%400 == 0) ? true : false;
            }
        }

        return isLeap;
    }  
}
