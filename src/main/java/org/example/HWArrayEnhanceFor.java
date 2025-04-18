package org.example;

public class HWArrayEnhanceFor {
    public static void main(String[] args) {

        int[][] myHwArray = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12},{13,14,15,16}};

        for(int[] myArray : myHwArray){
            for(int element : myArray){
                System.out.println(element + " ");
            }
            System.out.println();
        }

         //print 2,6,10,14
        // print 2,5,11,15

        for(int i = 0; i < myHwArray.length; i++){
            System.out.print(myHwArray[i][1] + " ");
        }

        int columnIndex = 1;
        for(int[] row : myHwArray){
            System.out.println(row[columnIndex] + " ");
        }
        System.out.println();

        System.out.println(myHwArray[0][1]);
        System.out.println(myHwArray[0][2]);
        System.out.println(myHwArray[0][3]);
        System.out.println(myHwArray[1][2]);

        int x = 20;
        while(x>0) {
            do {
                x -= 2;
            } while (x>5);
            x--;
            System.out.print(x+"\t");
        }

        for( int i = 0; i < myHwArray.length; i++){
            for( int j = 0; j < myHwArray[i].length; j++){
                System.out.println(j + "");
            }
            System.out.println();
        }


        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
        OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) {
            INNER_LOOP: for(int i=0; i<mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i]+"\t");
            }
            System.out.println();
        }





    }
}
