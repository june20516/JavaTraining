public class HomeWork {
 
    public static void main(String[] args) {
 
        // 1. if ==> if else
        System.out.println("\n\n예제1\n");
        int a = 10;
        int b = 20;
        int c = 30;
 
        if (a > b) {
            System.out.println("a는 b보다 큰 수 입니다.");
        } else {
            System.out.println("a는 b보다 작거나 같은 수 입니다.");
        }
        if (b <= c) {
            System.out.println("b는 c보다 작거나 같은 수 입니다.");
        } else {
            System.out.println("b는 c보다 큰 수입니다.");
        }
        if (c >= a) {
            System.out.println("c는 a보다 크거나 같은 수 입니다.");
        } else {
            System.out.println("c는 a보다 작은 수입니다.");
        }
 
        // 2. 계산 결과와 이유 예측하기
        System.out.println("\n\n예제2\n");
        int a1 = 5; // 6
        int b1 = 4; // 5
        int c1 = ++a1 + ++b1; // 11 (+연산 시점에서 a1 = 6, b1 = 5)
 
        int a2 = 5; // 6
        int b2 = 4; // 5
        int c2 = ++a2 + b2++; // 10 (+연산 시점에서 a2 = 6, b2 = 4)
 
        int a3 = 5; // 6
        int b3 = 4; // 5
        int c3 = a3++ + ++b3; // 10 (+연산 시점에서 a2 = 5, b2 = 5)
 
        int a4 = 5; // 6
        int b4 = 4; // 5
        int c4 = a4++ + b4++; // 9 (+연산 시점에서 a2 = 5, b2 = 4)
 
        System.out.print("c1 = " + c1 + ", c2 = " + c2 + ", c3 = " + c3 + ", c4 = " + c4);
        
 
        // 3. a~z 출력하기
        System.out.println("\n\n예제3\n");
        for (char alph = 'a'; alph <= 'z'; alph++) { // char은 int 값을 가지고 있으므로 int처럼 사용
            System.out.print(alph); // 출력
        }
 
        // 4. 5층짜리 4칸 아파트
        System.out.println("\n\n\n예제4\n");
        for (int row = 5; row >= 1; row--) { // 층 반복
            for (int column = 1; column <= 4; column++) { // 칸 반복
                System.out.print("(" + row + "," + column + ") "); // 형식에 맞춰 출력
            }
            System.out.print("\n"); // 마지막칸에서 줄바꿈
        }
 
        // 5. 4층짜리 미끄럼틀
        System.out.println("\n\n예제5\n");
        for (int row = 1; row <= 4; row++) { // 층 반복
            for (int column = 1; column <= row; column++) { // 칸 반복
                System.out.print("(" + row + "," + column + ")"); // 형식에 맞춰 출력
            }
            System.out.print("\n"); // 마지막칸에서 줄바꿈
        }
        
 
        // 6. A~z까지 출력하기
        System.out.println("\n\n예제6\n");
        for (char alph = 'A'; alph <= 'z'; alph++) { // char은 int 값을 가지고 있으므로 int처럼 사용
            System.out.print(alph); // 출력
        }
        
 
        // 7. 6번의 예제에서 특수문자를 제외하기
        System.out.println("\n\n예제7\n");
            for (char alph = 'A'; alph <= 'z'; alph++) { // char은 int 값을 가지고 있으므로 int처럼 사용
                System.out.print(alph); // 출력        
                if (alph == 'Z')        // 'Z'가 출력되면 변수가 'a' 앞의 값으로 건너뜀
                    alph = 'a'-1;
        }        
 
        // 8. 7번의 예제에서 한 행에 4글자씩 출력하기
        System.out.println("\n\n예제8\n");
        for (char alph = 'A'; alph <= 'z'; alph++) { // char은 int 값을 가지고 있으므로 int처럼 사용
            if (alph % 4 == 1)
                System.out.print("\n"); // A(65)%4 = 1이므로, 1이 돌아올 때마다(출력4번마다) 줄바꿈
            System.out.print(alph); // 출력
                if (alph == 'Z')        // 'Z'가 출력되면 변수가 'a' 앞의 값으로 건너뜀
                    alph = 'a'-1;
        }
        
 
        // 9.구구단
        System.out.println("\n\n예제9\n");
        int[][] multipleTable = new int[9][8]; // 구구단 저장할 이차원 배열생성
 
        for (int row = 0; row < 9; row++) { // 행 반복
            for (int column = 0; column < 8; column++) { // 열 반복
                multipleTable[row][column] = (column + 2) * (row + 1); // 값 넣기
            }
        }
 
        // 출력
        for (int column = 2; column <= 9; column++) { // 2단부터 9단까
            System.out.print(column + " 단        "); // 몇단인지 출력
        }
        System.out.print("\n"); // 줄 바꿈
        for (int row = 1; row <= 9; row++) { // 행 반복
            for (int column = 2; column <= 9; column++) { // 열 반복
                System.out.print(column + " * " + row + " = " + multipleTable[row - 1][column - 2] + "    "); // 형식에 맞춰 출력
            }
            System.out.print("\n"); // 줄 바꿈
        }
 
 
        // 10. 구구단 한번에 n개씩 끊어서 출력하기
        System.out.println("\n\n예제10\n");
        int n = 3; // 한번에 출력하길 원하는 단 수 n개
        for (int i = 2; i < 9; i += n) { // 큰 줄 반복
            for (int column = i; column < n + i; column++) { // n번만큼 반복
                if (column > 9)
                    continue; // 마지막줄 n번 할때 9단 이상이면 무시
                System.out.print(column + " 단        "); // 몇단인지 출력
            }
            System.out.print("\n"); // 줄바꿈
 
            for (int row = 1; row <= 9; row++) { // 행 반복
                for (int column = i; column < n + i; column++) { // n번만큼 열반복
                    if (column > 9)
                        continue; // 마지막줄 n번 할때 9단 이상이면 무시
                    System.out.print(column + " * " + row + " = " + multipleTable[row - 1][column - 2] + "    "); // 형식에 맞춰 출력                                                                                                             // 맞춰 출력
                }
                System.out.print("\n");
            }
        }
 
        /*
         * 11. - 2차원 배열로 구현
         */
        System.out.println("\n\n예제11\n");
        // 5행을 가지는 이차원 배열 생성
        int size = 5;
        int twoDim[][] = new int[size][];
 
        // 각 행의 번호를 열의 개수로 생성
        for (int i = 0; i < size; i++) {
            twoDim[i] = new int[i + 1];
        }
 
        int count = 0; // 배열 최소단위에 들어갈 숫자 count 초기화
 
        for (int[] row : twoDim) { // 행반복
            for (int column : row) { // 열반복
                row[column] = ++count; // 증가하는 count를 배열에 입력
                System.out.print("[" + row[column] + "]" + " "); // 한칸씩 출력 (가시성을 위해 [] 처리)
            }
            System.out.print("\n"); // 행이 끝나면 줄바꿈
        }
        
 
        /*
         * 과제 12번 - 2차원 배열로 구현
         */
        System.out.println("\n\n예제12\n");
        // 5*5 크기 배열 생성
        int size2 = 5;
        int twoDim2[][] = new int[size2][size2];
 
        // 채워넣기
        int count2 = 0; // 들어갈 숫자 초기화
        for (int row = 0; row < size2; row++) { // 행 반복
            for (int column = 0; column < size2; column++) { // 열 반복
                if (column >= size2 - 1 - row) { // 열인덱스가 중심선(최대사이즈 - 행인덱스 -1)보다 크거나 같을 때
                    twoDim2[row][column] = ++count2; // 증가하는 숫자를 넣는다
                }
            }
        }
 
        // 출력하기
        for (int[] row : twoDim2) { // 행 반복
            for (int column : row) { // 열 반복
                String cStr = column == 0 ? " " : String.valueOf(column); // 값이 안들어갔으면 (0이면) 공백으로 바꾼다
                System.out.print("[" + cStr + "]" + " "); // 값 출력 (가시성을 위해 []처리)
            }
            System.out.print("\n"); // 열 끝까지 가면 줄바꿈
        }
    }
}