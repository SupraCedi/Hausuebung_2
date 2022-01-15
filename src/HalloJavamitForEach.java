import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class HalloJavamitForEach {
    public static void main(String[] args) {

        File fileName = new File("myFile.csv");
        String[] numbers = new String[0];
        List<String> list = new ArrayList<>();

        list.add("187");
        list.add("test");
        list.add("abc");

        for (String numb : list) {
            System.out.println(numb);
        }
        System.out.println("\n");
        list.forEach((String numb) -> System.out.println(numb));

        Consumer<String> consumer = (String s) -> System.out.println(s);

        System.out.println("\n");
        list.forEach(System.out::print);
        System.out.println("\n");

        NumberTester nt = new NumberTester(fileName);
        nt.testFile(fileName);

        //KonsolenInterface
        Scanner s = new Scanner(System.in);
        final boolean run = true;
        while (run) {

            System.out.println("Enter Number a1");double a1 = s.nextInt();
            System.out.println("Enter Number b1");double b1 = s.nextInt();
            System.out.println("Enter Number a2");double a2 = s.nextInt();
            System.out.println("Enter Number b2");double b2 = s.nextInt();
            System.out.println("Choose operation:" + "\n" + "1 - add" + "\n" + "2 - subtract" + "\n" + "3 - multiply" + "\n" + "4 - divide" + "\n");
            int operation = s.nextInt();
            System.out.println("Choose calculator:" + "\n" + "1 - Rational calculator" + "\n" + "2 - Vector calculator" + "\n" + "3 - Complex Calculator" + "\n" + "4 - Exit program");
            int calcu = s.nextInt();
            switch (calcu) {
                case 1:
                    AbstractCalculator rationalcalculator = new RationalCalculator((a, b) -> {

                        /*Double a1 = a.getA();
                        Double b1 = b.getA();
                        Double a2 = a.getB();
                        Double b2 = b.getB();*/
                        if(operation == 1) {
                            Double result1 = a1 * b2;
                            Double result2 = b1 * a2;
                            Double result = result1 + result2;
                            Double nenner = a2 * b2;


                            for (int i = 0; i < nenner; i++) {
                                for (int j = 0; j < nenner; j++) {
                                    if (nenner % j == 0) {
                                        if (result % j == 0) {
                                            nenner = nenner / j;
                                            result = result / j;
                                        }
                                    }
                                }
                            }
                            System.out.println(result);
                            System.out.println("--------------------");
                            System.out.println(nenner);

                        }
                            return a;

                    }, (a, b) -> {
                        /*Double a1 = a.getA();
                        Double b1 = b.getA();
                        Double a2 = a.getB();
                        Double b2 = b.getB();*/
                        if(operation == 2) {
                            Double result1 = a1 * b2;
                            Double result2 = b1 * a2;
                            Double result = result1 - result2;
                            Double nenner = a2 * b2;

                            for (int i = 0; i < nenner; i++) {
                                for (int j = 0; j < nenner; j++) {
                                    if (nenner % j == 0) {
                                        if (result % j == 0) {
                                            nenner = nenner / j;
                                            result = result / j;
                                        }
                                    }
                                }
                            }
                            System.out.println(result);
                            System.out.println("--------------------");
                            System.out.println(nenner);
                        }
                        return a;
                    }, (a, b) -> {
                        /*Double a1 = a.getA();
                        Double b1 = b.getA();
                        Double a2 = a.getB();
                        Double b2 = b.getB();*/
                        if(operation == 3) {
                            Double result1 = a1 * b2;
                            Double result2 = b1 * a2;
                            Double result = result1 * result2;
                            Double nenner = a2 * b2;

                            for (int i = 0; i < nenner; i++) {
                                for (int j = 0; j < nenner; j++) {
                                    if (nenner % j == 0) {
                                        if (result % j == 0) {
                                            nenner = nenner / j;
                                            result = result / j;
                                        }
                                    }
                                }
                            }
                            System.out.println(result);
                            System.out.println("--------------------");
                            System.out.println(nenner);
                        }
                        return a;
                    }, (a, b) -> {
                        /*Double a1 = a.getA();
                        Double b1 = b.getA();
                        Double a2 = a.getB();
                        Double b2 = b.getB();*/
                        if(operation == 4) {
                            Double result1 = a1 * b2;
                            Double result2 = b1 * a2;
                            Double result = result1 / result2;
                            Double nenner = a2 * b2;

                            for (int i = 0; i < nenner; i++) {
                                for (int j = 0; j < nenner; j++) {
                                    if (nenner % j == 0) {
                                        if (result % j == 0) {
                                            nenner = nenner / j;
                                            result = result / j;
                                        }
                                    }
                                }
                            }
                            System.out.println(result);
                            System.out.println("--------------------");
                            System.out.println(nenner);
                        }
                        return a;
                    });
                    break;
                case 2:
                    AbstractCalculator vectorcalculator = new VectorCalculator((a, b) -> {
                        /*Double a1 = a.getA();
                        Double b1 = b.getA();
                        Double a2 = a.getB();
                        Double b2 = b.getB();*/
                        if(operation == 1) {
                            Double result1 = a1 * b2;
                            Double result2 = b1 * a2;
                            Double result = result1 + result2;
                            Double nenner = a2 * b2;


                            for (int i = 0; i < nenner; i++) {
                                for (int j = 0; j < nenner; j++) {
                                    if (nenner % j == 0) {
                                        if (result % j == 0) {
                                            nenner = nenner / j;
                                            result = result / j;
                                        }
                                    }
                                }
                            }
                            System.out.println(result);
                            System.out.println("--------------------");
                            System.out.println(nenner);
                        }
                        return a;

                    }, (a, b) -> {
                        /*Double a1 = a.getA();
                        Double b1 = b.getA();
                        Double a2 = a.getB();
                        Double b2 = b.getB();*/
                        if(operation == 2) {
                            Double result1 = a1 * b2;
                            Double result2 = b1 * a2;
                            Double result = result1 - result2;
                            Double nenner = a2 * b2;

                            for (int i = 0; i < nenner; i++) {
                                for (int j = 0; j < nenner; j++) {
                                    if (nenner % j == 0) {
                                        if (result % j == 0) {
                                            nenner = nenner / j;
                                            result = result / j;
                                        }
                                    }
                                }
                            }
                            System.out.println(result);
                            System.out.println("--------------------");
                            System.out.println(nenner);
                        }
                        return a;
                    }, (a, b) -> {
                        /*Double a1 = a.getA();
                        Double b1 = b.getA();
                        Double a2 = a.getB();
                        Double b2 = b.getB();*/
                        if(operation == 3) {
                            Double result1 = a1 * b2;
                            Double result2 = b1 * a2;
                            Double result = result1 * result2;
                            Double nenner = a2 * b2;

                            for (int i = 0; i < nenner; i++) {
                                for (int j = 0; j < nenner; j++) {
                                    if (nenner % j == 0) {
                                        if (result % j == 0) {
                                            nenner = nenner / j;
                                            result = result / j;
                                        }
                                    }
                                }
                            }
                            System.out.println(result);
                            System.out.println("--------------------");
                            System.out.println(nenner);
                        }
                        return a;
                    }, (a, b) -> {
                        /*Double a1 = a.getA();
                        Double b1 = b.getA();
                        Double a2 = a.getB();
                        Double b2 = b.getB();*/
                        if(operation == 4) {
                            Double result1 = a1 * b2;
                            Double result2 = b1 * a2;
                            Double result = result1 / result2;
                            Double nenner = a2 * b2;

                            for (int i = 0; i < nenner; i++) {
                                for (int j = 0; j < nenner; j++) {
                                    if (nenner % j == 0) {
                                        if (result % j == 0) {
                                            nenner = nenner / j;
                                            result = result / j;
                                        }
                                    }
                                }
                            }
                            System.out.println(result);
                            System.out.println("--------------------");
                            System.out.println(nenner);

                        }
                        return a;
                    });
                    break;
                case 3:
                    AbstractCalculator complexCalculator = new ComplexCalculator((a, b) -> {
                        /*Double a1 = a.getA();
                        Double b1 = b.getA();
                        Double a2 = a.getB();
                        Double b2 = b.getB();*/
                        if(operation == 1) {
                            Double result1 = a1 * b2;
                            Double result2 = b1 * a2;
                            Double result = result1 + result2;
                            Double nenner = a2 * b2;


                            for (int i = 0; i < nenner; i++) {
                                for (int j = 0; j < nenner; j++) {
                                    if (nenner % j == 0) {
                                        if (result % j == 0) {
                                            nenner = nenner / j;
                                            result = result / j;
                                        }
                                    }
                                }
                            }
                            System.out.println(result);
                            System.out.println("--------------------");
                            System.out.println(nenner);
                        }
                        return a;

                    }, (a, b) -> {
                        /*Double a1 = a.getA();
                        Double b1 = b.getA();
                        Double a2 = a.getB();
                        Double b2 = b.getB();*/
                        if(operation == 2) {
                            Double result1 = a1 * b2;
                            Double result2 = b1 * a2;
                            Double result = result1 - result2;
                            Double nenner = a2 * b2;

                            for (int i = 0; i < nenner; i++) {
                                for (int j = 0; j < nenner; j++) {
                                    if (nenner % j == 0) {
                                        if (result % j == 0) {
                                            nenner = nenner / j;
                                            result = result / j;
                                        }
                                    }
                                }
                            }
                            System.out.println(result);
                            System.out.println("--------------------");
                            System.out.println(nenner);
                        }
                        return a;
                    }, (a, b) -> {
                        /*Double a1 = a.getA();
                        Double b1 = b.getA();
                        Double a2 = a.getB();
                        Double b2 = b.getB();*/
                        if(operation == 3) {
                            Double result1 = a1 * b2;
                            Double result2 = b1 * a2;
                            Double result = result1 * result2;
                            Double nenner = a2 * b2;

                            for (int i = 0; i < nenner; i++) {
                                for (int j = 0; j < nenner; j++) {
                                    if (nenner % j == 0) {
                                        if (result % j == 0) {
                                            nenner = nenner / j;
                                            result = result / j;
                                        }
                                    }
                                }
                            }
                            System.out.println(result);
                            System.out.println("--------------------");
                            System.out.println(nenner);
                        }
                        return a;
                    }, (a, b) -> {
                        /*Double a1 = a.getA();
                        Double b1 = b.getA();
                        Double a2 = a.getB();
                        Double b2 = b.getB();*/
                        if(operation == 4) {
                            Double result1 = a1 * b2;
                            Double result2 = b1 * a2;
                            Double result = result1 / result2;
                            Double nenner = a2 * b2;

                            for (int i = 0; i < nenner; i++) {
                                for (int j = 0; j < nenner; j++) {
                                    if (nenner % j == 0) {
                                        if (result % j == 0) {
                                            nenner = nenner / j;
                                            result = result / j;
                                        }
                                    }
                                }
                            }
                            System.out.println(result);
                            System.out.println("--------------------");
                            System.out.println(nenner);
                        }
                        return a;
                    });
                    break;

                case 4:
                    System.out.println("Program beendet");
                    System.exit(0);
                    break;

            }

        }
    }
}


