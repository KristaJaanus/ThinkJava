package Chapter2;

/**
 * Created by Krista Jaanus Ex 2.3
 */
public class Time {
    public static void main (String []args) {
        int hour = 17;
        int minute = 6;
        int second = 37;
        int minutid = 60;
        int sekundid = 60;
        int päev = 24;
        double olnud = ((hour * minutid * sekundid) + (minute * sekundid) + second);
        double tuleb = ((päev * minutid * sekundid) - olnud);
        double day = (olnud + tuleb);
        System.out.println("Tänases päevas on olnud " + olnud + " sekundit. ");
        System.out.println("Südaööni on jäänud " + tuleb + " sekundit. ");
        System.out.println("Päevast on möödunud " + ((olnud * 100) / day) + " &.");
    }
}
