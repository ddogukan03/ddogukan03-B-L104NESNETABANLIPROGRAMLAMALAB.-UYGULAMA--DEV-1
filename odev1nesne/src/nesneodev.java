

public class nesneodev {

    static int[] dereceler = {341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299,343,317,265};
    static String[] isimler = {"kadir", "gökhan", "hakan", "suzan", "pınar", "mehmet", "ali", "emel", "fırat", "james", "jale", "ersin", "deniz", "gözde", "anıl", "burak"};


    public static void main(String[] args) {


        for (int i = 0; i < isimler.length; i++) {
            if (eniyiderece() == dereceler[i]) System.out.println("1. " + isimler[i] + " " + dereceler[i]);
        }
        for (int i = 0; i < isimler.length; i++) {
            if (ikincieniyi() == dereceler[i]) System.out.println("2. " + isimler[i] + " " + dereceler[i]);
        }
        for (int i = 0; i < isimler.length; i++) {
            if (üçüncüeniyi() == dereceler[i]) System.out.println("3. " + isimler[i] + " " + dereceler[i]);
        }
    harflendirme();
    }

    public static int eniyiderece() {
        int min = dereceler[0];

        for (int i = 0; i < dereceler.length; i++) {

            if (min > dereceler[i]) min = dereceler[i];
        }
        return min;
    }

    public static int ikincieniyi() {

        int ikinci =dereceler[0];
        for (int i = 0; i < dereceler.length; i++) {

            if (ikinci > dereceler[i] && dereceler[i]  >eniyiderece()) {ikinci = dereceler[i];}
        }
        return ikinci;

    }public static int üçüncüeniyi() {

        int üçüncü =dereceler[0];
        for (int i = 0; i < dereceler.length; i++) {

            if (üçüncü > dereceler[i] && dereceler[i]  >ikincieniyi()) {üçüncü = dereceler[i];}
        }
        return üçüncü;

    }public static void harflendirme (){
        int a =0;
        int b =0;
        int c =0;
        for (int i=0;i< dereceler.length;i++){
            if (dereceler[i]>200 && dereceler[i]<=299)a++;
            if (dereceler[i]>300 && dereceler[i]<=399)b++;
            if (dereceler[i]>=400)c++;
        }
        System.out.println("A-> "+a);
        System.out.println("B-> "+b);
        System.out.println("C-> "+c);
    }
}
