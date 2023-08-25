import java.util.Scanner;

public class Main {

    /*public static double add (String[] rechnung) {
        int i = 0;
        double Sum = 0;
        while (i < rechnung.length) {
            double wert = Double.parseDouble(rechnung[i]);
            Sum = Sum + wert;
            i++;
            System.out.println("Ergebnis der Berechnung: " + Sum);
        }
        return Sum;
    }

    public static double sub (String[] rechnung) {
        int i = 0;
        double Sum = 0;
        while (i < rechnung.length) {
            double wert = Double.parseDouble(rechnung[i]);
            Sum = Sum - wert;
            i++;
            System.out.println("Ergebnis der Berechnung: " + Sum);
        }
        return Sum;
    }

    public static double mul (String[] rechnung) {
        int i = 0;
        double Sum = 0;
        while (i < rechnung.length) {
            double wert = Double.parseDouble(rechnung[i]);
            Sum = Sum * wert;
            i++;
            System.out.println("Ergebnis der Berechnung: " + Sum);
        }
        return Sum;
    }

    public static double div (String[] rechnung) {
        int i = 0;
        double Sum = 0;
        while (i < rechnung.length) {
            double wert = Double.parseDouble(rechnung[i]);
            Sum = Sum / wert;
            i++;
            System.out.println("Ergebnis der Berechnung: " + Sum);
        }
        return Sum;
    }*/

    public static void main(String[] args) {
        String op;
        String a = String.valueOf('1');
        String b = String.valueOf('2');
        String c = String.valueOf('3');
        String d = String.valueOf('4');
        String e = String.valueOf('5');
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Willkommen beim Calculator V 1.1, zum rechnen folgen Sie bitte den Anweisungen.");
        while (true) {
            while (true) {
                System.out.println("Was möchten Sie rechnen?");
                System.out.println("1 - Addition");
                System.out.println("2 - Subtraktion");
                System.out.println("3 - Multiplikation");
                System.out.println("4 - Division");
                System.out.println("5 - Rechner beenden");
                op = scanner.next();
                if (!a.equals(op) && !b.equals(op) && !c.equals(op) && !d.equals(op) && !e.equals(op)) {
                    System.out.println("Unbekanntes oder noch nicht implementiertes Rechensymbol.");
                } else if (op.equals(e)) {
                    System.out.println("Ergebnis der Rechenoperation: 0... Natürlich... Depp! Also nochmal...");
                    return;
                } else {
                    break;
                }
            }
                System.out.println("Geben Sie bitte alle zu berechnenden Zahlen ein, danach drücken Sie bitte 'Enter':");
                String[] rechnung = scanner2.nextLine().split("\\s+");
                if (a.equals(op)) {
                    int i = 0;
                    double Sum = 0;
                    while (i < rechnung.length) {
                        double wert = Double.parseDouble(rechnung[i]);
                        Sum = Sum + wert;
                        i++;
                    }
                    System.out.println("Ergebnis der Berechnung: " + Sum);
                } else if (b.equals(op)) {
                    int i = 0;
                    double Sum = 0;
                    while (i < rechnung.length) {
                        double wert = Double.parseDouble(rechnung[i]);
                        if (Sum == 0) {
                            Sum = wert;
                        } else {
                            Sum = Sum - wert;
                        }
                        i++;
                    }
                    System.out.println("Ergebnis der Berechnung: " + Sum);
                } else if (c.equals(op)) {
                    int i = 0;
                    double Sum = 0;
                    while (i < rechnung.length) {
                        double wert = Double.parseDouble(rechnung[i]);
                        Sum = Sum * wert;
                        i++;
                    }
                    System.out.println("Ergebnis der Berechnung: " + Sum);
                } else if (d.equals(op)) {
                    int i = 0;
                    double Sum = 0;
                    while (i < rechnung.length) {
                        double wert = Double.parseDouble(rechnung[i]);
                        if (Sum == 0) {
                            Sum = wert;
                        } else {
                            Sum = Sum / wert;
                        }
                        if (wert == 0) {
                            System.out.println("Teilen durch 0 ist nicht möglich.");
                            break;
                        }
                        i++;
                    }
                    System.out.println("Ergebnis der Berechnung: " + Sum);
                } else {
                    System.out.println("Unbekannter Wert, Programm beendet.");
                    break;
                }
            }
        }




    /*public class Main {

    public static double add ( double zahl1, double zahl2) {
        return zahl1 + zahl2;
    }

    public static double sub ( double zahl1, double zahl2) {
        return zahl1 - zahl2;
    }

    public static double multiplizieren ( double zahl1, double zahl2) {
        return zahl1 * zahl2;
    }

    public static double dividieren ( double zahl1, double zahl2) {
        return zahl1 / zahl2;
    }

    public static void main(String[] args) {
        double zwischensumme = 0;
        String op;
        String a = String.valueOf('+');
        String b = String.valueOf('-');
        String c = String.valueOf('*');
        String d = String.valueOf('/');
        String e = String.valueOf('=');
        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen beim Calculator V 1.1, zum rechnen folgen Sie bitte den Anweisungen.");
        System.out.println("Zum beenden geben Sie bitte ein '=' ein.");
        System.out.println("Geben Sie die erste Zahl ein und bestätigen Sie mit 'Enter':");
        double zahl1 = scanner.nextDouble();
        while (true) {
            if (zwischensumme != 0) {
                zahl1 = zwischensumme;
            }
            while (true) {
                System.out.println("Rechensymbol: ");
                op = scanner.next();
                if (!a.equals(op) && !b.equals(op) && !c.equals(op) && !d.equals(op) && !e.equals(op)) {
                    System.out.println("Unbekanntes oder noch nicht implementiertes Rechensymbol.");
                } else if (op.equals(e)) {
                    System.out.println("Ergebnis der Rechenoperation: " + zwischensumme);
                    return;
                } else {
                    break;
                }
            }
            if (!e.equals(op)) {
                System.out.println("Geben Sie die nächste Zahl ein und bestätigen Sie mit 'Enter':");
                double zahl2 = scanner.nextDouble();

                if (a.equals(op)) {
                    double sumAdd = add(zahl1, zahl2);
                    zwischensumme = sumAdd;
                    System.out.println("Zwischensumme: " + sumAdd);
                } else if (b.equals(op)) {
                    double sumSub = sub(zahl1, zahl2);
                    zwischensumme = sumSub;
                    System.out.println("Zwischensumme: " + sumSub);
                } else if (c.equals(op)) {
                    double sumMul = multiplizieren(zahl1, zahl2);
                    zwischensumme = sumMul;
                    System.out.println("Zwischensumme: " + sumMul);
                } else if (d.equals(op)) {
                    double sumDiv = dividieren(zahl1, zahl2);
                    zwischensumme = sumDiv;
                    System.out.println("Zwischensumme: " + sumDiv);
                } else { break;}
            }
        }*/
    }
