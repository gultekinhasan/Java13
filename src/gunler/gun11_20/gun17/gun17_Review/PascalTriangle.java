package gunler.gun11_20.gun17.gun17_Review;
        public class PascalTriangle {

            public static void main(String[] args) {

                //Asagidaki sekli sayilarla ciziniz

//                1
//               1 1
//              1 2 1
//             1 3 3 1
//            1 4 6 4 1

                int r = 5;

                for(int i=0; i<r; i++){  // sutun
                    for(int k=r; k>i; k--){  // satir / bosluk
                        System.out.print(" ");
                    }
                    int number = 1;
                    for(int j=0; j<=i; j++){ // satir / sayi
                        System.out.print(number + " ");
                        number = number * (i - j) / (j + 1); // sayilar arasindaki dize iliskisini
                    }
                    System.out.println();
                }


            }
        }



