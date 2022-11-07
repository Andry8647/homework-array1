public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] whole = new int[3];
        whole[0] = 1;
        whole[1] = 2;
        whole[2] = 3;
        double[] fractional = {1.57, 7.654, 9.986};
        int[] my = {30, 11, 1999};
        System.out.println("Задача 2");
        for (int i = 0; i < whole.length; i++) {
            if (i == whole.length - 1){
                System.out.print(whole[i] );
            }else {
                System.out.print(whole[i] + " ,");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < fractional.length; i++) {
            if (i == fractional.length - 1) {
                System.out.print(fractional[i]);
            } else {
                System.out.print(fractional[i] + " ,");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < my.length; i++) {
            if (i == my.length - 1) {
                System.out.print(my[i]);
            } else {
                System.out.print(my[i] + " ,");
            }
        }
        System.out.println();
        System.out.println("Задача 3");
        for (int i = whole.length - 1; i >= 0; i--) {
            if (i == 0){
                System.out.print(whole[i] );
            }else {
                System.out.print(whole[i] + " ,");
            }
        }
        System.out.println(" ");
        for (int i = fractional.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(fractional[i]);
            } else {
                System.out.print(fractional[i] + " ,");
            }
        }
        System.out.println(" ");
        for (int i = my.length - 1; i >=0 ; i--) {
            if (i == 0) {
                System.out.print(my[i]);
            } else {
                System.out.print(my[i] + " ,");
            }
        }
        System.out.println();
        System.out.println("Задача 4");
        for (int i = 0; i < whole.length; i++) {
            if ( whole[i] % 2 != 0){
                whole[i]++;
                System.out.print(whole[i] + " ");
            }else {
                System.out.print(whole[i] + " ");
            }
        }
    }
}