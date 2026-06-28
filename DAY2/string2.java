public class string2 {
    public static void main(String[] args) {
    String a = "Java";
    String b = "Java";
    String c = "Python hello there ";
    String word = "Program123456598946565";
    String name = "Rohit";
    String text = "I Love Java";
    String text2 = "Java";
    String text3 = "Java Programming";
    String text4 = "Resume.pdf";
    String text5 = "";
    System.out.println(text5.isEmpty());
    System.out.println(text4.endsWith(".pdf"));
    System.out.println(text3.startsWith("Java"));
    System.out.println(name.indexOf("h"));
    System.out.println(word.substring(0,20));
    System.out.println(c.contains("Python"));
    System.out.println(a.equals(b)); 
    System.out.println(a.equals(c)); 
    System.out.println(name.replace('o','a'));
    System.out.println(text.replace("Java","Python"));
    System.out.println(text2.trim());
    }
}
