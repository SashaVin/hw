public class third {
    public static void main(String[] args) {
        String str_1 = "А роза упала на лапу Азора";
        proverka(str_1);

    }
    public static String rev(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static void proverka(String str_1){
        String str_0;
        String str_2;
        String UwU = str_1.replaceAll(" ", "");
        str_0 = UwU.toLowerCase();
        str_2 = rev(str_0);
        if (str_0.equals(str_2)) {
            System.out.println(str_1 + " - это палиндром");
        } else {
            System.out.println(str_1 + " - это НЕ палиндром");
        }

    }
}
