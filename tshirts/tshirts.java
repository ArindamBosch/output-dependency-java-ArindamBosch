public class Tshirts {
    static String size(int cms) {
        if(cms < 38) {
            return "S";
        } else if(cms > 38 && cms < 42) {
            return "M";
        } else {
            return "L";
        }
    }

    public static void main(String[] args) { 
        assert(size(37) == "S");
        assert(size(40) == "M");
        assert(size(43) == "L");
        System.out.println("All is well (maybe!)");
    }
}



public class TshirtsTest {
    public static void main(String[] args) {
        assert(Tshirts.size(37).equals("S"));
        assert(Tshirts.size(40).equals("M"));
        assert(Tshirts.size(43).equals("L"));

        // 🔥 This test will fail due to the bug
        assert(Tshirts.size(38).equals("M")) : "Expected size(38) to be M, but got: " + Tshirts.size(38);

        System.out.println("Test finished (should fail!)");
    }
}
