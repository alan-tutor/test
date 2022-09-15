import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0; i<t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(xorFrom1(b)^xorFrom1(a-1)); 
        }
    }
    
    public static int xorFrom1(int n) {
        int remainder = n % 4;
        switch(remainder) {
            case 0:
                return n;
            case 1:
                return 1;
            case 2:
                return n+1;
            case 3: 
                return 0;
        }
        return -1;
    }
}

/*
될까? 싶은 것
s == f ?
1 1
0


XOR 이란,
두 개의 숫자가 같으면 0, 다르면 1

a ^ b = c

a b c
0 0 0
0 1 1
1 0 1
1 1 0

## 수학 태그의 문제
- 패턴을 찾아서, 수학 공식으로 푼다.
 
 
0001 
0010
0011
0100
0101
0110
0111
1000
1001
1010

1011
==> 13



3 10
3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10은 쉽게 구할 수 있으니까, (a)
1 2에 대한 xor값도 쉽게 구해서, (b)
a^b
3 4 5 6 7 8 9 10

O(T)

누적합을 쓰면 어떻게 될까?
int[] acc,
acc[i] => 1부터 i까지 xor한 값

s부터 f까지 xor한 값이, 
1부터 f까지 xor한 값에서, 1부터 s까지 xor한 값과 연관이 있다면,
*/