package homework_2;

public class Task1 {
    public static void main(String[] args) {
        int var0 = 0;
        int var1 = 1;
        int var3 = 3;
        int var2 = 2;
        int var4 = 4;
        int var6 = 6;
        int var5 = 5;
        int var7 = 7;
        int var8 = 8;
        int var9 = 9;

        int countVariables = 10;
//        int result = (var0 + var1 + var2 + var3 + var4 + var5 + var6 + var7 + var8 + var9) / 10;
        int sum = var0 + var1 + var2 + var3 + var4 + var5 + var6 + var7 + var8 + var9;

        System.out.println("sum: " + sum);

        int average = sum / countVariables;
        System.out.println("average: " + average );

        //есть два пути
        double averageDouble = (double) sum / countVariables;
        System.out.println("averageDouble: " + averageDouble);

        int rest = (int) ((averageDouble - average) * countVariables);
        System.out.println("rest: " + rest);

        rest = sum % countVariables;
        System.out.println("rest: " + rest);

    }
}
