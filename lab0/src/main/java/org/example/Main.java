package org.example;

public class Main {

    public static int intTask(int weight)//weight - к-сть в кг
    {
        return weight / 1000; // к-сть в тоннах
    }

    static boolean boolTask(int a) // a - ціле число
    {
        return a %2==0;
    }

    static int ifTask(int a) // a - ціле число
    {
        if(a>0){
            a++;
        }else{
            a-=2;
        }
        return a;
    }

    static String caseTask(int a) // a - оцінка
    {
        switch(a){
            case 1:
                return "Погано";
            case 2:
                return "Незадовільно";
            case 3 :
                return "Задовільно";
            case 4:
                return "Добре";
            case 5:
                return "Відмінно";
            default:
                return "Помилка";
        }
    }

    static int forTask(int a, int b) //
    {
        System.out.println("forTask");
        int amount = 0;
        for(int i=a; i<=b; i++){
            System.out.println(i);
            amount++;
        }
        return amount;
    }

    static int whileTask(int a, int b) // a довжина більшого вектора, b довжина меншого вектора
    {
        int amount = 0;
        while(a-b>=0){
            a-=b;
            amount+=1;
        }
        return amount;
    }

    static int[] arrayTask(int a){ // a - розмір масива
        int[] array = new int[a];
        for(int i=0; i<a; i++){
            array[i]=(int)Math.pow(2, i);
        }
        return array;
    }

    static int[][] matrixTask(int a, int b){// a - к-ть рядків, b - к-ть стовбців
        int[][] array = new int[a][b];
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                array[i][j]=5*(j+1);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(intTask(550));
        System.out.println(boolTask(11));
        System.out.println(ifTask(-1));
        System.out.println(caseTask(5));
        System.out.println(forTask(5, 15));
        System.out.println(whileTask(5, 2));

        //arrayTask
        int[] array = arrayTask(5);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // matrixTask
        int[][] matrix = matrixTask(4, 5);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();


        }
    }
}