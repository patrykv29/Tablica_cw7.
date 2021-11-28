package Tablica;


import java.util.SimpleTimeZone;

public class cw7 {
    public static void main(String[] args) {
        int[] tablica = {10,9,8,7,6,5,4,3,2,1};

        for (int i = 0; i < tablica.length; i++)
        {
            if (i == 0) {
                System.out.print("[" + tablica[i]);
            } else if (i == 9) {
                System.out.print("," + tablica[i] + "]");
            } else
                System.out.print("," + tablica[i]);
        }
        System.out.println();
        System.out.println("Po petli");
        Sort(tablica);
        }




        public static int[] Sort(int[] tab){

            int zmn;
            for (int i =0;i< tab.length;i++) {
                for (int z = 0;z< tab.length-1-i; z++) {
                    if (tab[z] > tab[z + 1]) {

                        zmn = tab[z];
                        tab[z] = tab[z + 1];
                        tab[z + 1] = zmn;



                    }

                }
                if (i == 0) {
                    System.out.print("[" + tab[i]);
                } else if (i == 9) {
                    System.out.print("," + tab[i] + "]");
                } else
                    System.out.print("," + tab[i]);


            }



          return tab;
        }
}

