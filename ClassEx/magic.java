package ClassEx;

import java.util.Scanner;

public class magic
{
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);

    System.out.print("shemoitane kvadratis zoma ") ;
    int n =scanner.nextInt() ;
    int[][] arr=new int [n][n] ;

        System.out.println("shemoiyvane ricxvebi:");
        for (int i = 0; i < n; i++)
        {
    for (int j = 0; j < n; j++)
    {
        arr[i][j] = scanner.nextInt();
    }
}
      int sum = 0;
        for (int i = 0; i <n ; i ++ )
        {
    sum += arr[0][i];
}
    boolean magic = true;
        for (int i = 1; i < n; i++)
        {
    int rigisjami = 0;
    for (int j = 0; j <n; j ++ )
    {
        rigisjami += arr[i][j] ;
    }
    if (rigisjami != sum)
    {
        magic = false;
        break;
    }
}
        if (magic)
        {
    for (int j = 0; j <n; j++)
    {
        int svetisjami = 0;
        for (int i = 0; i < n; i ++)
        {
            svetisjami += arr[i][j];
        }
        if (svetisjami != sum)
        {
            magic = false;
            break;
        }
    }
}
        if (magic)
        {
    int n1 = 0, n2 = 0;
    for (int i = 0; i < n; i++)
    {
        n1 += arr[i][i];
        n2 += arr[i][n - i - 1] ;
    }
    if (n1 != sum || n2 != sum)
    {
        magic = false;
    }
}

        if (magic)
        {
    System.out.println("magiuria");
}
        else
{
    System.out.println("ar aris magiuri");
}

        scanner.close();
}
}


