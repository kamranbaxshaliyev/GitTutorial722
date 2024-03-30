package main;

public class Loop {
    public static void main(String[] args) {
        /*
        1.
        *****
        *****
        *****
        *****
        */
//       for(int i = 0; i < 5; i++) {
//            for(int j = 0; j < 15; j++) {
//                System.out.print("*");
//            }
//           System.out.println();
//       }

        /*
        2.
         *
         **
         ***
         ****
         *****
         ******
         *******
         ********
         */

//        for(int i = 0; i < 8; i++) {
//            for(int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
        3.
                  *
                 **
                ***
               ****
              *****
             ******
            *******
           ********
          *********
         **********
        */

//        for(int i = 0; i < 10; i++){
//            for(int k = 9; k > i; k--){
//                System.out.print(" ");
//            }
//            for(int j = 0; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
        4.
          = = =  = = =
          = = =  = = =
          = = =  = = =
          = = =  = = =
         */
//        for(int i = 0; i < 4; i++) {
//            for(int j = 0; j < 6; j++) {
//                System.out.print(" =");
//                if(j == 2)
//                    System.out.print(" ");
//            }
//            System.out.println();
        /*
        5.
               *
              ***
             *****
            *******
           *********
          ***********
         *************
         */

        //a)
//        for(int i = 0; i < 7; i++) {
//            for(int k = 0; k < 6 - i; k++) {
//                System.out.print(" ");
//            }
//
//            for(int j = 0; j <= 2*i ; j++) {
//                System.out.print("*");
//            }
//
//            for(int k = 0; k < 6 - i; k++) {
//                System.out.print(" ");
//            }
//
//            System.out.println();
//        }

        //b)
//        int nHeight = 7;
//
//        int nWidth = 13;
//
//        int middle = nWidth/2;
//        for(int i = 0; i < nHeight; i++) {
//            for(int j = 0; j < nWidth; j++) {
//                if(j == middle){
//                    for(int k = 0; k <= 2*i; k++){
//                        System.out.print("*");
//                    }
//                    middle--;
//                    continue;
//                }
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

        /*
        6.
        *         *
        *       *
        *     *
        *   *
        * *
        *   *
        *     *
        *       *
        *         *
        */

//        int nWidth = 11;
//
//        for(int i = 0; i < 9; i++) {
//            System.out.print("*");
//
//            if(i < 5) {
//                for (int j = 0; j < nWidth - 2; j++) {
//                    System.out.print(" ");
//                }
//
//                if(nWidth > 1)
//                    nWidth-=2;
//            }
//            else {
//                nWidth+=2;
//
//                for (int j = 0; j < nWidth; j++) {
//                    System.out.print(" ");
//                }
//            }
//
//            System.out.print("*");
//
//            System.out.println();
//        }

    }
}