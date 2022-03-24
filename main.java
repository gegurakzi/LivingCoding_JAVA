import java.util.*;

class Program{
    public static void main(String[] args){
        System.out.println("HelloWorld!");
    }
}

class Scan{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        System.out.println(num);

        String input2 = scanner.nextLine();
        int num2 = Integer.parseInt(input2);
        System.out.println(num2);
    }
}

class Array{
    public static int[] shuffler(int[] input){
        for(int i=0; i < input.length; i++){
            int n = (int)(Math.random() * 10);
            int tmp = input[0];
            input[0] = input[n];
            input[n] = tmp;
        }
        return input;
    }

    public static void main(String[] args){
        int[] arr1 = new int[10];
        char[] str1 = new char[10];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = i;
            str1[i] = 'f';
        }

        arr1 = shuffler(arr1);

        System.out.println(Arrays.toString(arr1));
        System.out.println(str1);

        int[][] arr2 = {
                {10},
                {20, 20},
                {30, 30, 30},
                {40, 40, 40, 40}
        };

        for(int i = 0; i < arr2.length; i++){
            System.out.print(Arrays.toString(arr2[i]));
            if(i < arr2.length - 1) {
                System.out.print(", ");
            }
        }



    }
}