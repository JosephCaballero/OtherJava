public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "20";
        String taxRate = ".10";
        String gibberish = "asubid";

        //Parse shirtPrice and taxRate, and print the total tax
        int intParse = Integer.parseInt(shirtPrice);
        double doubleParse = Double.parseDouble(taxRate);
        System.out.println("The total tax is " + (intParse * doubleParse));
        System.out.println(intParse);
        System.out.println(doubleParse);
        //Try to parse taxRate as an int
        int taxParse = Integer.parseInt(taxRate);
        //Try to parse gibberish as an int
        int parseGib = Integer.parseInt(gibberish);
    }

}
