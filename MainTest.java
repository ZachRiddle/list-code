class MainTest {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Element fe = new Element(3);
        //setting the _key of fe to 3

        if(testConstructor()) pass++; 
        //if the boolean test constructor is true increase pass by 1, otherwise increase fail by 1.
        else fail++;

        if(testSetter()) pass++; 
        else fail++;


        if(testSearch()) pass++; 
        else fail++;

        if(testSearchne()) pass++; 
        else fail++;

        System.out.println(" passed: "+ pass +" fails: " + fail);
    }
    static int pass = 0;
    static int fail = 0;

        public static boolean testSearchne() {
        Linkedlist fl = new Linkedlist();
        Element fe = new Element(3);
        fl.insert(fe);

        return fl.search(3) == null;
    } 
    public static boolean testSearch() {
        Linkedlist fl = new Linkedlist();

        return fl.search(3) == null;
    } 
    public static boolean testConstructor() {
        Element fe = new Element(3);
        return fe.getkey() == 3;
        //get key to use sense we can no longer acces key due to it being private.
    }
        public static boolean testSetter() {
        Element fe = new Element(3);
        Element se = new Element (4);
        fe.setnext(se);
        //use set next with the argument second method
        return fe.getnext().getkey() == 4;
        //testing setkey, get next
    }
}

