public class Name {
    public static void main(String[] args) {
        // String name = "Ankit ";
        // name = name + "Meena";
        // System.out.println(name);

        StringBuilder name = new StringBuilder("Ankit");
        name.append(" meena"); // editing the existing memory
        System.out.println(name);
        StringBuffer name1 = new StringBuffer("Hello Welcome,");
        name1.append(" Ankit");
        System.out.println(name1);
        name1.insert(2,"ee");
        System.out.println(name1);
        name1.replace(2,4,"EE");
        System.out.println(name1);
        name1.delete(2, 3);
        System.out.println(name1);
        // name1.reverse();
        int n =name1.length();
        name1.charAt(5);
        System.out.println(name1);
        name1.setCharAt(2,'a');
        
        System.out.println(name1);
        System.out.println(n);
        // stirng buffer is slower than string builder 

        //threadsafe
        //key takeway - faster and eff. memory storage.

        
    }
}
