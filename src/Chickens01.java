public class Chickens01 {
    public static void main(String[] args) {
        //Put your code here
        int eggsPerChicken = 4;
        int chickenCount = 8;
        int totalEggs = eggsPerChicken * chickenCount;
        chickenCount += 1;
        int totalEggs1 = totalEggs + eggsPerChicken * chickenCount;
        double chickenCount1 = chickenCount /= 2;
        double totalEggs2 = totalEggs1  + eggsPerChicken * chickenCount1;
        System.out.println(totalEggs2);
    }
}
