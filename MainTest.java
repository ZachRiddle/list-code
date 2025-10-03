class MainTest {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        if(testConstructor()) pass++; 
        //if the boolean test constructor is true increase pass by 1, otherwise increase fail by 1.
        else fail++;

        if(testSetter()) pass++; 
        else fail++;


        if(testSearch()) pass++; 
        else fail++;

        if(testSearchne()) pass++; 
        else fail++;

        if(testSearchte()) pass++; 
        else fail++;

        if(testdelete1()) pass++; 
        else fail++;

        if(testdelete2()) pass++; 
        else fail++;

        System.out.println(" passed: "+ pass +" fails: " + fail);
    }
    static int pass = 0;
    static int fail = 0;

        public static boolean testSearchne() {
        Linkedlist fl = new Linkedlist();
        Element fe = new Element(3);
        //setting the _key of fe to 3
        fl.insert(fe);

        return fl.search(3) == fe;
    } 
    public static boolean testSearchte() {
        Linkedlist fl = new Linkedlist();
        Element fe = new Element(3);
        Element se = new Element(4);
        fl.insert(fe);
        fl.insert(se);

        return fl.search(3) == fe;
    } 
        public static boolean testdelete1() {
        Linkedlist fl = new Linkedlist();
        Element fe = new Element(3);
        Element se = new Element(4);
        fl.insert(fe);
        fl.insert(se);
        fl.delete(fe);

        return fl.search(3) == null;
    }
        public static boolean testdelete2() {
        Linkedlist fl = new Linkedlist();
        Element fe = new Element(3);
        Element se = new Element(4);
        fl.insert(fe);
        fl.insert(se);
        fl.delete(se);

        return fl.search(3) == fe;
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

