
import java.util.Scanner;
public class JavaByAlDave {



    /**
     * Al DAVE ALBA
     */
    public static void main(String[] args) {

        /*****************************************************/
        String name;
        int Transmutation;
        int W_PV = 25, P_PV = 45, Q_PV = 30;
        int AScore, LScore, QScore, PTries, PTOver_Items = 0, PTScore;
        int Acover_items = 0, WTries, LTries, QTries, QOver_Items = 0, LQOver_Items = 0;
        int LQover_Items = 0, AcOver_items = 0, Qover_Items = 0, Ascore = 0, Lscore = 0, Qscore = 0;
        double PTscore = 0, PTover_Items = 0;
        double TOTAL_WW, WW_TOTAL, INITIAL_Avg, QEScore, ww_avg, QEOver_Items, percent_WW, percent_PT, percent_QE;
        double avg_WW, PT_avg, avg_PT, avg_QE, QE_avg;
        System.out.println('\t' + "    Welcome to the grading system" + '\n');
        System.out.println('\t' + "The Percentage value are the following: " + '\n'
                + "Written Work; " + W_PV + " % " + '\n' + "Performance Task: " + P_PV + " %" + '\n' + "Quarter Exam: " + Q_PV + " %" +
                '\n' + "Total of 100 %" + '\n');


        /*****************************************************/
        @SuppressWarnings("resource")
        Scanner p = new Scanner(System.in);

        /*********/
        System.out.println("WRITTEN WORK");
        System.out.println("\nSET THE TOTAL NUMBER OF ACTIVITIES: ");
        WTries = p.nextInt();
        for (int x = 1; x <= WTries; x++) {
            System.out.print("Input the total score of Activity " + x + " : ");
            Acover_items = p.nextInt();
            AcOver_items = AcOver_items + Acover_items;
        }


        /*********/
        System.out.println("\nSET THE TOTAL NUMBER OF LONG QUIZ:  ");
        LTries = p.nextInt();
        for (int i = 1; i <= LTries; i++) {
            System.out.print("Input the total score OF LONG QUIZ " + i + " : ");
            LQOver_Items = p.nextInt();
            LQover_Items = LQover_Items + LQOver_Items;
        }

        /*********/
        System.out.println("\nSET THE TOTAL NUMBERS OF Quizzes: ");
        QTries = p.nextInt();
        for (int n = 1; n <= QTries; n++) {
            System.out.print("Input the TOTAL score of QUIZZES " + n + " : ");
            QOver_Items = p.nextInt();
            Qover_Items = Qover_Items + QOver_Items;
        }


        /*********/
        System.out.println("\nPERFORMANCE TASK");
        System.out.println("SET THE TOTAL NUMBER OF Performance task: ");
        PTries = p.nextInt();
        for (int y = 1; y <= PTries; y++) {
            System.out.print("Input the total score of PERFORMANCE TASK " + y + " : ");
            PTOver_Items = p.nextInt();
            PTover_Items = PTover_Items + PTOver_Items;
        }


        /*********/
        System.out.println("\nQuarter Exam");
        System.out.print("Input total score of Quarter Exam : ");
        QEOver_Items = p.nextInt();


        /*********/
        System.out.println("\nTOTAL OF THE FOLLOWING : ");
        WW_TOTAL = AcOver_items + LQover_Items + Qover_Items;
        System.out.println("WRITTEN WORK: " + WW_TOTAL);
        System.out.println("PERFORMANCE TASK: " + PTover_Items);
        System.out.println("QUARTER EXAM: " + QEOver_Items);


        /*****************************************************/
        @SuppressWarnings("resource")
        Scanner gg = new Scanner(System.in);
        String log;
        System.out.println("\nChoose\nPress : [1] Input Student"
                + "\nPress : [2] Terminate the Program ");
        log = gg.next();
        while (log.equals("1") == true) {
            System.out.println("Input Name of Student");
            @SuppressWarnings("resource")
            Scanner ss = new Scanner(System.in);
            name = ss.nextLine().toUpperCase();
            Lscore = 0;
            Ascore = 0;
            Qscore = 0;
            PTscore = 0;


            /*********/
            System.out.println('\n' + "WRITTEN WORK");
            for (int n = 1; n <= WTries; n++) {
                while (true) {
                    System.out.print("Please Input the Score of Activity " + n + " : ");
                    AScore = p.nextInt();
                    if ((0 > AScore) || (AScore > Acover_items))
                        System.out.println("Invalid Input Score of activity " + n + " ");
                    else
                        break;
                }
                Ascore = Ascore + AScore;
            }


            /*********/
            for (int B = 1; B <= LTries; B++) {
                while (true) {
                    System.out.print("Please input the score in LONG QUIZ " + B + " : ");
                    LScore = p.nextInt();
                    if ((0 > LScore) || (LScore > LQOver_Items))
                        System.out.println("Invalid Input Score of Long Quiz " + B + "  ");
                    else
                        break;
                }
                Lscore = Lscore + LScore;
            }


            /*********/
            for (int G = 1; G <= QTries; G++) {
                while (true) {
                    System.out.print("Please input the score in QUIZ " + G + " : ");
                    QScore = p.nextInt();

                    if ((0 > QScore) || (QScore > QOver_Items))
                        System.out.println("Invalid Input Score of Quiz " + G + "  ");
                    else
                        break;
                }
                Qscore = Qscore + QScore;
            }

            /*********/
            System.out.println("\nPerformance Task");
            for (int g = 1; g <= PTries; g++) {
                while (true) {

                    System.out.print("Please input the score in performance task " + g + " : ");
                    PTScore = p.nextInt();

                    if ((0 > PTScore) || (PTScore > PTOver_Items))
                        System.out.println("Invalid Input Score of Performance task " + g + "");
                    else
                        break;

                }
                PTscore = PTscore + PTScore;
            }

            /*********/
            System.out.println("\nQuarter Exam");
            while (true) {
                System.out.println("Please input the score in QUARTER EXAM ");
                QEScore = p.nextInt();
                if ((0 > QEScore) || (QEScore > QEOver_Items))
                    System.out.println("Invalid Input Score of Quarter Exam ");
                else

                    break;

            }

            /*****************************************************/
            TOTAL_WW = Ascore + Lscore + Qscore;
            System.out.println("\n\nThe overall score of the written work is " + TOTAL_WW);


            avg_WW = TOTAL_WW / WW_TOTAL;
            ww_avg = avg_WW * 100;
            percent_WW = ww_avg * 0.25;
            System.out.println("\t\tWritten Work: " + percent_WW + "%");

            avg_PT = PTscore / PTover_Items;
            PT_avg = avg_PT * 100;
            percent_PT = PT_avg * 0.45;
            System.out.println("\t\tPerformance Task: " + percent_PT + "%");

            avg_QE = QEScore / QEOver_Items;
            QE_avg = avg_QE * 100;
            percent_QE = QE_avg * 0.30;
            System.out.println("\t\tQuarterly Exam: " + percent_QE + "% ");


            INITIAL_Avg = percent_WW + percent_PT + percent_QE;
            System.out.println("The Initial grade grade of student " + name + " " + " is: " + INITIAL_Avg);
            Transmutation = (int) Math.round(INITIAL_Avg);


            if (Transmutation == 43) {
                System.out.println("THE QUARTERLY GRADE OF  " + name + " IS 70 ");
            } else if ((Transmutation == 44) || (Transmutation == 45) || (Transmutation == 46) || (Transmutation == 47)) {
                System.out.println("THE QUARTERLY GRADE OF  " + name + " IS 71 ");
            } else if ((Transmutation == 48) || (Transmutation == 49) || (Transmutation == 50) || (Transmutation == 51)) {
                System.out.println("THE QUARTERLY GRADE OF  " + name + " IS 72 ");
            } else if ((Transmutation == 52) || (Transmutation == 53) || (Transmutation == 54) || (Transmutation == 55)) {
                System.out.println("THE QUARTERLY GRADE OF " + name + " IS 73 ");
            } else if ((Transmutation == 56) || (Transmutation == 57) || (Transmutation == 58) || (Transmutation == 59)) {
                System.out.println("THE QUARTERLY GRADE OF  " + name + " IS 74 ");
            } else if ((Transmutation == 60) || (Transmutation == 61)) {
                System.out.println("THE QUARTERLY GRADE OF " + name + " IS 75 ");
            } else if ((Transmutation == 62) || (Transmutation == 63)) {
                System.out.println("THE QUARTERLY GRADE OF  " + name + " IS 76 ");
            } else if (Transmutation == 64) {
                System.out.println("THE QUARTERLY GRADE OF  " + name + " IS 77 ");
            } else if ((Transmutation == 65) || (Transmutation == 66)) {
                System.out.println("THE QUARTERLY GRADE OF  " + name + " IS 78 ");
            } else if (Transmutation == 67) {
                System.out.println("THE QUARTERLY GRADE OF  " + name + " IS 79 ");
            } else if ((Transmutation == 68) || (Transmutation == 69)) {
                System.out.println("THE QUARTERLY GRADE OF  " + name + " IS 80 ");
            } else if (Transmutation == 70) {
                System.out.println("THE QUARTERLY GRADE OF  " + name + " IS 81 ");
            } else if (Transmutation == 71) {
                System.out.println("THE QUARTERLY GRADE OF  " + name + " IS 82 ");
            } else if ((Transmutation == 72) || (Transmutation == 73)) {
                System.out.println("THE QUARTERLY GRADE OF " + name + " IS 83 ");
            } else if ((Transmutation == 74) || (Transmutation == 75)) {
                System.out.println("THE QUARTERLY GRADE OF " + name + " IS 85 ");
            } else if ((Transmutation == 76) || (Transmutation == 77)) {
                System.out.println("THE QUARTERLY GRADE OF " + name + " IS 85 ");
            } else if (Transmutation == 78) {
                System.out.println("THE QUARTERLY GRADE OF  " + name + " IS 86 ");
            } else if (Transmutation == 79) {
                System.out.println("THE QUARTERLY GRADE OF  " + name + " IS 87 ");
            } else if ((Transmutation == 80) || (Transmutation == 81)) {
                System.out.println("THE QUARTERLY GRADE OF  " + name + " IS 88 ");
            } else if ((Transmutation == 82) || (Transmutation == 83)) {
                System.out.println("THE QUARTERLY GRADE OF " + name + " IS 89 ");
            } else if ((Transmutation == 84) || (Transmutation == 85)) {
                System.out.println("THE QUARTERLY GRADE OF " + name + " IS  90 ");
            } else if (Transmutation == 86) {
                System.out.println("THE QUARTERLY GRADE OF " + name + " IS  91 ");
            } else if (Transmutation == 87) {
                System.out.println("THE QUARTERLY GRADE OF " + name + " IS  92 ");
            } else if ((Transmutation == 88) || (Transmutation == 89)) {
                System.out.println("THE QUARTERLY GRADE OF " + name + " IS 93 ");
            } else if ((Transmutation == 90) || (Transmutation == 91)) {
                System.out.println("THE QUARTERLY GRADE OF " + name + " IS 94 ");
            } else if (Transmutation == 92) {
                System.out.println("THE QUARTERLY GRADE OF " + name + " IS  95 ");
            } else if ((Transmutation == 93) || (Transmutation == 94)) {
                System.out.println("THE QUARTERLY GRADE OF " + name + " IS 96 ");
            } else if (Transmutation == 95) {
                System.out.println("THE QUARTERLY GRADE OF " + name + " IS  97 ");
            } else if ((Transmutation == 96) || (Transmutation == 97)) {
                System.out.println("THE QUARTERLY GRADE OF " + name + " IS  98 ");
            } else if ((Transmutation == 98) || (Transmutation == 99)) {
                System.out.println("THE QUARTERLY GRADE OF " + name + " IS  99 ");
            } else if (Transmutation == 100) {
                System.out.println("THE QUARTERLY GRADE OF " + name + " IS  100 ");
            } else {
                System.out.print("The Initial value is below 43 the Quarterly grade of the student is automatically 70\n");
            }
            System.out.println("\n\n\nDo you want add another Student?\nChoose\nPress : [1] to add"

                    + "\nPress : [2] Terminate the Program");
            log = gg.next();
        }

        if (log.equals("2") == true) {
            System.exit(0);
        }
    }
}