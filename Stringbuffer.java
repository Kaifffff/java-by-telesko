public class Stringbuffer {
    public static void main(String[] args) {
        // String is immutable in java so we can use StringBuffer is mutable
        StringBuffer sb = new StringBuffer("KAIF");
        System.out.println(sb);  // KAIF
  
        sb.append(" SHAIKH");
        System.out.println(sb);  // KAIF SHAIKH

        // // String str = sb;  we do not convert StringBuffer to String directly 
        // String str = sb.toString();
        // System.out.println(str);

        sb.insert(0, " MD ");
        System.out.println(sb);
 
    }
}
