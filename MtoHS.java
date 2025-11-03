class MtoHS{
    
    public static void main(String[] args) {
        int minutes = 90;  

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int seconds = minutes * 60;

        System.out.println(hours + " hr " + remainingMinutes + " min");
        System.out.println("or " + seconds + " seconds");
    }
}

