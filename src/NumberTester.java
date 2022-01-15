import java.io.*;

public class NumberTester {
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;
    File fileName;
    String[] numbers;

    public NumberTester(File fileName) {
        this.fileName = fileName;
    }


    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;

    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile(File fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader("myFile.txt"));) {
            String zeile = br.readLine();
            while ((zeile = br.readLine()) != null) {
                String[] parts = zeile.split(" ");
                int number = Integer.parseInt(parts[1]);

                switch (parts[0]) {
                    case "1":
                        setOddEvenTester((int n) -> n % 2 == 0);
                        if (oddTester.testNumber(number)) {
                            System.out.println("EVEN");
                        } else {
                            System.out.println("ODD");
                        }

                        break;

                    case "2":
                        setPrimeTester((int n) -> prime(n));
                        if (primeTester.testNumber(number)) {
                            System.out.println("PRIME");
                        } else {
                            System.out.println("NO PRIME");
                        }

                        break;

                    case "3":
                        setPalindromeTester((int n)-> palindrom(n));
                        if (palindromeTester.testNumber(number)) {
                            System.out.println("PALINDROM");
                        } else {
                            System.out.println("NO PALINDROM");
                        }

                        break;

                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public boolean testNumber(int number) {
        return false;
    }

    public boolean prime(int number) {
        int temp;
        boolean isPrime = true;

        for (int i = 2; i<= number/2;i++){
            temp=number%i;
            if (temp==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }

    public boolean palindrom(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int reminder = palindrome % 10;
            reverse = reverse * 10 - reminder;
            palindrome = palindrome / 10;
        }
        if (number == reverse) {
            return true;
        }
            return false;
    }
}