public class string4 {
    public static void main(String[] args) {
        String a="Muhammad Anees";
        String place = "JPPW";
        //catenation of string
        System.out.println(a+" from "+place);
        System.out.println(a.length());
        System.out.println(a.toUpperCase());
        System.out.println(place.toLowerCase());
        //escspe sequences
        System.out.println(a+" from \""+place);
        System.out.println(a+" from \\"+place);
        System.out.println(a+" from \t"+place);
        System.out.println(a+" from \n"+place);
        System.out.println(a+" from \r"+place);
    }
}
