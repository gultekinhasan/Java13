package exercises.gun36;

import java.util.ArrayList;

public class homework_a {

        public static void main(String[] args) {
            //DEV: Bir String Listede yanyana olan Stringlerin yerini degistirerek listeyi yeniden duzenleyen bir method yaziniz.
            //Method
            //List array olusacak
            //Elemanlarini yerlerini 0 ile 1 ---2 ile 3 yer degistirecek
            //set tek sayi cift sayi

            ArrayList<String> names = new ArrayList<>();

            names.add("Mike");// 0
            names.add("Smith");// 1
            names.add("John");// 2
            names.add("Evan");// 3
            names.add("Mary"); //4
            //list = [Smith, Mike, Evan, John, Mary]


            check(names);

        }
        public static void check (ArrayList<String> str) {

            ArrayList<String> temp = new ArrayList<>();

            for (int i = 0; i < str.size(); i++) {

                if (str.indexOf(str.get(i))%2==1) {
                    str.set(i,str.remove(i-1));
                     temp.add(str.get(i));
                }
            }
            System.out.println(str.toString());
        }
    }

