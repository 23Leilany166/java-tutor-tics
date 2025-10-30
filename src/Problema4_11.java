import java.util.Arrays;
import java.util.Scanner;

public class Problema4_11 {

    public static String[] mezclarArreglos(String[] sur, String[] centro, String[] norte) {
        int tps = sur.length;
        int tpc = centro.length;
        int tpn = norte.length;

        String[] america = new String[tps + tpc + tpn];
        int ps = 0, pc = 0, pn = 0, pa = 0;

        // Mezclamos alfabéticamente los tres arreglos
        while (ps < tps && pc < tpc && pn < tpn) {
            if (sur[ps].compareToIgnoreCase(centro[pc]) <= 0 && sur[ps].compareToIgnoreCase(norte[pn]) <= 0) {
                america[pa++] = sur[ps++];
            } else if (centro[pc].compareToIgnoreCase(sur[ps]) <= 0 && centro[pc].compareToIgnoreCase(norte[pn]) <= 0) {
                america[pa++] = centro[pc++];
            } else {
                america[pa++] = norte[pn++];
            }
        }

        // Mezclar los que queden de dos arreglos
        while (ps < tps && pc < tpc) {
            america[pa++] = (sur[ps].compareToIgnoreCase(centro[pc]) <= 0) ? sur[ps++] : centro[pc++];
        }

        while (ps < tps && pn < tpn) {
            america[pa++] = (sur[ps].compareToIgnoreCase(norte[pn]) <= 0) ? sur[ps++] : norte[pn++];
        }

        while (pc < tpc && pn < tpn) {
            america[pa++] = (centro[pc].compareToIgnoreCase(norte[pn]) <= 0) ? centro[pc++] : norte[pn++];
        }

        // Agregar los que queden en cada arreglo
        while (ps < tps) america[pa++] = sur[ps++];
        while (pc < tpc) america[pa++] = centro[pc++];
        while (pn < tpn) america[pa++] = norte[pn++];

        return america;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de países de Sudamérica: ");
        int tps = sc.nextInt();
        System.out.print("Ingrese el número de países de Centroamérica: ");
        int tpc = sc.nextInt();
        System.out.print("Ingrese el número de países de Norteamérica: ");
        int tpn = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        String[] sur = new String[tps];
        String[] centro = new String[tpc];
        String[] norte = new String[tpn];

        System.out.println("\n--- Países de Sudamérica ---");
        for (int i = 0; i < tps; i++) {
            System.out.print("País " + (i + 1) + ": ");
            sur[i] = sc.nextLine();
        }

        System.out.println("\n--- Países de Centroamérica ---");
        for (int i = 0; i < tpc; i++) {
            System.out.print("País " + (i + 1) + ": ");
            centro[i] = sc.nextLine();
        }

        System.out.println("\n--- Países de Norteamérica ---");
        for (int i = 0; i < tpn; i++) {
            System.out.print("País " + (i + 1) + ": ");
            norte[i] = sc.nextLine();
        }

        String[] america = mezclarArreglos(sur, centro, norte);

        System.out.println("\n--- Arreglo AMERICA (ordenado alfabéticamente) ---");
        for (String pais : america) {
            System.out.println(pais);
        }

        sc.close();
    }
}
