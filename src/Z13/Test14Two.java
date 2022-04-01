package Z13;

public class Test14Two {
    public static String norm(String name) {
        if (name == null) {
            return name;
        }
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public static String init(String name) {
        if (name.length() == 0) {
            return name;
        }
        return name.substring(0,1).toUpperCase() + name.substring(1);
    }

    public static String tr(String s, String from, String to) {
        for (int i = 0; i < s.length(); i++) {
            int idexof = from.indexOf(s.charAt(i));
            if (idexof != -1) {
                s = s.replace(s.charAt(i), to.charAt(idexof));
            }

        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(norm("caravaggio"));
        System.out.println(norm("VERMEER"));
        System.out.println(init("johann sebastian bach"));
        System.out.println(init("i. babeL"));
        System.out.println(init("jorge LUIS BORGES"));
        System.out.println(init("WOLFGANG a. mozart"));
        System.out.println(tr("November 2016",
                "abcdefghijklmnopqrstuvwyz",
                "ABCDEFGHIJKLMNOPQRSTUVWYZ"));
        System.out.println(tr("abcXYZ", "aZcX", "||Cx"));
    }
}




