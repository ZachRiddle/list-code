public class Element {
    private Element prev;
    private Element next;
    private int key; //prevents from being effected by things?

    public Element(int _key) {
        key = _key;
    }
    public int getkey() {
        // this just lets use get the key sense its now private
        return key;
    }
    public void setprev(Element _prev) {
        prev = _prev;
    }
    public void setnext(Element _next) {
        next = _next;
    }
    public Element getnext() {
        return next;
        //get next just gives us next
    }
    public Element getprev() {
        return prev;
        //gives us prev same as next
    }
}