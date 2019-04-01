public class HomeWork {
 
    public static void main(String[] args) {
 
        // 1. if ==> if else
        System.out.println("\n\n����1\n");
        int a = 10;
        int b = 20;
        int c = 30;
 
        if (a > b) {
            System.out.println("a�� b���� ū �� �Դϴ�.");
        } else {
            System.out.println("a�� b���� �۰ų� ���� �� �Դϴ�.");
        }
        if (b <= c) {
            System.out.println("b�� c���� �۰ų� ���� �� �Դϴ�.");
        } else {
            System.out.println("b�� c���� ū ���Դϴ�.");
        }
        if (c >= a) {
            System.out.println("c�� a���� ũ�ų� ���� �� �Դϴ�.");
        } else {
            System.out.println("c�� a���� ���� ���Դϴ�.");
        }
 
        // 2. ��� ����� ���� �����ϱ�
        System.out.println("\n\n����2\n");
        int a1 = 5; // 6
        int b1 = 4; // 5
        int c1 = ++a1 + ++b1; // 11 (+���� �������� a1 = 6, b1 = 5)
 
        int a2 = 5; // 6
        int b2 = 4; // 5
        int c2 = ++a2 + b2++; // 10 (+���� �������� a2 = 6, b2 = 4)
 
        int a3 = 5; // 6
        int b3 = 4; // 5
        int c3 = a3++ + ++b3; // 10 (+���� �������� a2 = 5, b2 = 5)
 
        int a4 = 5; // 6
        int b4 = 4; // 5
        int c4 = a4++ + b4++; // 9 (+���� �������� a2 = 5, b2 = 4)
 
        System.out.print("c1 = " + c1 + ", c2 = " + c2 + ", c3 = " + c3 + ", c4 = " + c4);
        
 
        // 3. a~z ����ϱ�
        System.out.println("\n\n����3\n");
        for (char alph = 'a'; alph <= 'z'; alph++) { // char�� int ���� ������ �����Ƿ� intó�� ���
            System.out.print(alph); // ���
        }
 
        // 4. 5��¥�� 4ĭ ����Ʈ
        System.out.println("\n\n\n����4\n");
        for (int row = 5; row >= 1; row--) { // �� �ݺ�
            for (int column = 1; column <= 4; column++) { // ĭ �ݺ�
                System.out.print("(" + row + "," + column + ") "); // ���Ŀ� ���� ���
            }
            System.out.print("\n"); // ������ĭ���� �ٹٲ�
        }
 
        // 5. 4��¥�� �̲���Ʋ
        System.out.println("\n\n����5\n");
        for (int row = 1; row <= 4; row++) { // �� �ݺ�
            for (int column = 1; column <= row; column++) { // ĭ �ݺ�
                System.out.print("(" + row + "," + column + ")"); // ���Ŀ� ���� ���
            }
            System.out.print("\n"); // ������ĭ���� �ٹٲ�
        }
        
 
        // 6. A~z���� ����ϱ�
        System.out.println("\n\n����6\n");
        for (char alph = 'A'; alph <= 'z'; alph++) { // char�� int ���� ������ �����Ƿ� intó�� ���
            System.out.print(alph); // ���
        }
        
 
        // 7. 6���� �������� Ư�����ڸ� �����ϱ�
        System.out.println("\n\n����7\n");
            for (char alph = 'A'; alph <= 'z'; alph++) { // char�� int ���� ������ �����Ƿ� intó�� ���
                System.out.print(alph); // ���        
                if (alph == 'Z')        // 'Z'�� ��µǸ� ������ 'a' ���� ������ �ǳʶ�
                    alph = 'a'-1;
        }        
 
        // 8. 7���� �������� �� �࿡ 4���ھ� ����ϱ�
        System.out.println("\n\n����8\n");
        for (char alph = 'A'; alph <= 'z'; alph++) { // char�� int ���� ������ �����Ƿ� intó�� ���
            if (alph % 4 == 1)
                System.out.print("\n"); // A(65)%4 = 1�̹Ƿ�, 1�� ���ƿ� ������(���4������) �ٹٲ�
            System.out.print(alph); // ���
                if (alph == 'Z')        // 'Z'�� ��µǸ� ������ 'a' ���� ������ �ǳʶ�
                    alph = 'a'-1;
        }
        
 
        // 9.������
        System.out.println("\n\n����9\n");
        int[][] multipleTable = new int[9][8]; // ������ ������ ������ �迭����
 
        for (int row = 0; row < 9; row++) { // �� �ݺ�
            for (int column = 0; column < 8; column++) { // �� �ݺ�
                multipleTable[row][column] = (column + 2) * (row + 1); // �� �ֱ�
            }
        }
 
        // ���
        for (int column = 2; column <= 9; column++) { // 2�ܺ��� 9�ܱ�
            System.out.print(column + " ��        "); // ������� ���
        }
        System.out.print("\n"); // �� �ٲ�
        for (int row = 1; row <= 9; row++) { // �� �ݺ�
            for (int column = 2; column <= 9; column++) { // �� �ݺ�
                System.out.print(column + " * " + row + " = " + multipleTable[row - 1][column - 2] + "    "); // ���Ŀ� ���� ���
            }
            System.out.print("\n"); // �� �ٲ�
        }
 
 
        // 10. ������ �ѹ��� n���� ��� ����ϱ�
        System.out.println("\n\n����10\n");
        int n = 3; // �ѹ��� ����ϱ� ���ϴ� �� �� n��
        for (int i = 2; i < 9; i += n) { // ū �� �ݺ�
            for (int column = i; column < n + i; column++) { // n����ŭ �ݺ�
                if (column > 9)
                    continue; // �������� n�� �Ҷ� 9�� �̻��̸� ����
                System.out.print(column + " ��        "); // ������� ���
            }
            System.out.print("\n"); // �ٹٲ�
 
            for (int row = 1; row <= 9; row++) { // �� �ݺ�
                for (int column = i; column < n + i; column++) { // n����ŭ ���ݺ�
                    if (column > 9)
                        continue; // �������� n�� �Ҷ� 9�� �̻��̸� ����
                    System.out.print(column + " * " + row + " = " + multipleTable[row - 1][column - 2] + "    "); // ���Ŀ� ���� ���                                                                                                             // ���� ���
                }
                System.out.print("\n");
            }
        }
 
        /*
         * 11. - 2���� �迭�� ����
         */
        System.out.println("\n\n����11\n");
        // 5���� ������ ������ �迭 ����
        int size = 5;
        int twoDim[][] = new int[size][];
 
        // �� ���� ��ȣ�� ���� ������ ����
        for (int i = 0; i < size; i++) {
            twoDim[i] = new int[i + 1];
        }
 
        int count = 0; // �迭 �ּҴ����� �� ���� count �ʱ�ȭ
 
        for (int[] row : twoDim) { // ��ݺ�
            for (int column : row) { // ���ݺ�
                row[column] = ++count; // �����ϴ� count�� �迭�� �Է�
                System.out.print("[" + row[column] + "]" + " "); // ��ĭ�� ��� (���ü��� ���� [] ó��)
            }
            System.out.print("\n"); // ���� ������ �ٹٲ�
        }
        
 
        /*
         * ���� 12�� - 2���� �迭�� ����
         */
        System.out.println("\n\n����12\n");
        // 5*5 ũ�� �迭 ����
        int size2 = 5;
        int twoDim2[][] = new int[size2][size2];
 
        // ä���ֱ�
        int count2 = 0; // �� ���� �ʱ�ȭ
        for (int row = 0; row < size2; row++) { // �� �ݺ�
            for (int column = 0; column < size2; column++) { // �� �ݺ�
                if (column >= size2 - 1 - row) { // ���ε����� �߽ɼ�(�ִ������ - ���ε��� -1)���� ũ�ų� ���� ��
                    twoDim2[row][column] = ++count2; // �����ϴ� ���ڸ� �ִ´�
                }
            }
        }
 
        // ����ϱ�
        for (int[] row : twoDim2) { // �� �ݺ�
            for (int column : row) { // �� �ݺ�
                String cStr = column == 0 ? " " : String.valueOf(column); // ���� �ȵ����� (0�̸�) �������� �ٲ۴�
                System.out.print("[" + cStr + "]" + " "); // �� ��� (���ü��� ���� []ó��)
            }
            System.out.print("\n"); // �� ������ ���� �ٹٲ�
        }
    }
}