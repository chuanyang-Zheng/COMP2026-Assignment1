import java.io.File;
import java.util.Scanner;
public class Output {
    public static void main(String[] args) throws Exception {
        new Output().runApp();
    }

    Output() {
    }

    void runApp() throws Exception {
        Scanner in = new Scanner(System.in);

        String filename = in.next();//get file name
        File inputfile = new File(filename);//file
        Scanner file = new Scanner(inputfile);//input file

        boolean noduplicate = true;

        String[] arrayx = new String[99 * 99];
        int rownumber = 0;
        int columnnumber = 0;
        int count = 0;//count where added
        rownumber = Integer.parseInt(file.nextLine());//get block row
        columnnumber = Integer.parseInt(file.nextLine());//get block colomn

        int maxrownumber = 0;
        int maxcolumnnumber = 0;

        int[][] array = new int[99][99];
        for(int j=0;j<array.length;j++)
        {
            for(int i=0;i<array[j][i];i++)
                array[j][i]=0;
        }
        while (file.hasNextLine()) {


            String positionindex = file.next();//get position number
            int numberx = file.nextInt();// get number and delete /n


            int number1 = 0;//first char
            int number2 = 0;//second char
            int number3 = 0;//third char
            int number4 = 0;//forth char


            String firststring = positionindex;//get position

            if ((int) (firststring.charAt(1)) >= 60 && (int) (firststring.charAt(1)) <= 90)// make sure second char is a number or a char
            {

                switch (firststring.charAt(0)) {// get number
                    case 'A':
                        number1 = 1;
                        break;
                    case 'B':
                        number1 = 2;
                        break;
                    case 'C':
                        number1 = 3;
                        break;
                    case 'D':
                        number1 = 4;
                        break;


                }
                switch (firststring.charAt(1)) {//get number
                    case 'A':
                        number2 = 1;
                        break;
                    case 'B':
                        number2 = 2;
                        break;
                    case 'C':
                        number2 = 3;
                        break;
                    case 'D':
                        number2 = 4;
                        break;
                    case 'E':
                        number2 = 5;
                        break;
                    case 'F':
                        number2 = 6;
                        break;
                    case 'G':
                        number2 = 7;
                        break;
                    case 'H':
                        number2 = 8;
                        break;
                    case 'I':
                        number2 = 9;
                        break;
                    case 'J':
                        number2 = 10;
                        break;
                    case 'K':
                        number2 = 11;
                        break;
                    case 'L':
                        number2 = 12;
                        break;
                    case 'M':
                        number2 = 13;
                        break;
                    case 'N':
                        number2 = 14;
                        break;
                    case 'O':
                        number2 = 15;
                        break;
                    case 'P':
                        number2 = 16;
                        break;
                    case 'Q':
                        number2 = 17;
                        break;
                    case 'R':
                        number2 = 18;
                        break;
                    case 'S':
                        number2 = 19;
                        break;
                    case 'T':
                        number2 = 20;
                        break;
                    case 'U':
                        number2 = 21;
                        break;
                    case 'V':
                        number2 = 22;
                        break;
                    case 'W':
                        number2 = 23;
                        break;
                    case 'X':
                        number2 = 24;
                        break;
                    case 'Y':
                        number2 = 25;
                        break;
                    case 'Z':
                        number2 = 26;
                        break;

                }
                if (firststring.length() == 3) {//get number
                    switch (number3) {
                        case '1':
                            number3 = 1;
                            break;
                        case '2':
                            number3 = 2;
                            break;
                        case '3':
                            number3 = 3;
                            break;
                        case '4':
                            number3 = 4;
                            break;
                        case '5':
                            number3 = 5;
                            break;
                        case '6':
                            number3 = 6;
                            break;
                        case '7':
                            number3 = 7;
                            break;
                        case '8':
                            number3 = 8;
                            break;
                        case '9':
                            number3 = 9;
                            break;

                    }
                    array[number3][number1 * 26 + number2] = numberx;//calculate the position
                    if (maxrownumber < number3)
                        maxrownumber = number3;
                    if (maxcolumnnumber < number1 * 26 + number2)
                        maxcolumnnumber = number1 * 26 + number2;


                }
                if (firststring.length() == 4) {// different length
                    switch (number3) {
                        case '1':
                            number3 = 1;
                            break;
                        case '2':
                            number3 = 2;
                            break;
                        case '3':
                            number3 = 3;
                            break;
                        case '4':
                            number3 = 4;
                            break;
                        case '5':
                            number3 = 5;
                            break;
                        case '6':
                            number3 = 6;
                            break;
                        case '7':
                            number3 = 7;
                            break;
                        case '8':
                            number3 = 8;
                            break;
                        case '9':
                            number3 = 9;
                    }
                    switch (number4) {
                        case '1':
                            number4 = 1;
                            break;
                        case '2':
                            number4 = 2;
                            break;
                        case '3':
                            number4 = 3;
                            break;
                        case '4':
                            number4 = 4;
                            break;
                        case '5':
                            number4 = 5;
                            break;
                        case '6':
                            number3 = 6;
                            break;
                        case '7':
                            number3 = 7;
                            break;
                        case '8':
                            number3 = 8;
                            break;
                        case '9':
                            number3 = 9;
                            break;
                    }

                    array[number3 * 10 + number4][number1 * 26 + number2] = numberx;//calculate position
                    if (maxrownumber < number3 * 10 + number4)
                        maxrownumber = number3 * 10 + number4;
                    if (maxcolumnnumber < number1 * 26 + number2)
                        maxcolumnnumber = number1 * 26 + number2;
                }
            } else {
                switch (firststring.charAt(0)) {


                    case 'A':
                        number1 = 1;
                        break;

                    case 'B':
                        number1 = 2;
                        break;
                    case 'C':
                        number1 = 3;
                        break;

                    case 'D':
                        number1 = 4;
                        break;
                    case 'E':
                        number1 = 5;
                        break;

                    case 'F':
                        number1 = 6;
                        break;
                    case 'G':
                        number1 = 7;
                        break;

                    case 'H':
                        number1 = 8;
                        break;
                    case 'I':
                        number1 = 9;
                        break;

                    case 'J':
                        number1 = 10;
                        break;
                    case 'K':
                        number1 = 11;
                        break;

                    case 'L':
                        number1 = 12;
                        break;
                    case 'M':
                        number1 = 13;
                        break;

                    case 'N':
                        number1 = 14;
                        break;
                    case 'O':
                        number1 = 15;
                        break;

                    case 'P':
                        number1 = 16;
                        break;
                    case 'Q':
                        number1 = 17;
                        break;

                    case 'R':
                        number1 = 18;
                        break;
                    case 'S':
                        number1 = 19;
                        break;

                    case 'T':
                        number1 = 20;
                        break;
                    case 'U':
                        number1 = 21;
                        break;

                    case 'V':
                        number1 = 22;
                        break;
                    case 'W':
                        number1 = 23;
                        break;

                    case 'X':
                        number1 = 24;
                        break;
                    case 'Y':
                        number1 = 25;
                        break;

                    case 'Z':
                        number1 = 26;
                }
                if (firststring.length() == 2) {

                    switch (firststring.charAt(1)) {
                        case '1':
                            number3 = 1;
                            break;
                        case '2':
                            number3 = 2;
                            break;
                        case '3':
                            number3 = 3;
                            break;
                        case '4':
                            number3 = 4;
                            break;
                        case '5':
                            number3 = 5;
                            break;
                        case '6':
                            number3 = 6;
                            break;
                        case '7':
                            number3 = 7;
                            break;
                        case '8':
                            number3 = 8;
                            break;
                        case '9':
                            number3 = 9;
                    }
                    array[number3][number1] = numberx;

                    if (maxrownumber < number3)
                        maxrownumber = number3;
                    if (maxcolumnnumber < number1)
                        maxcolumnnumber = number1;
                } else {
                    switch (firststring.charAt(1)) {
                        case '1':
                            number3 = 1;
                            break;
                        case '2':
                            number3 = 2;
                            break;
                        case '3':
                            number3 = 3;
                            break;
                        case '4':
                            number3 = 4;
                            break;
                        case '5':
                            number3 = 5;
                            break;
                        case '6':
                            number3 = 6;
                            break;
                        case '7':
                            number3 = 7;
                            break;
                        case '8':
                            number3 = 8;
                            break;
                        case '9':
                            number3 = 9;
                    }

                    switch (firststring.charAt(2)) {
                        case '1':
                            number4 = 1;
                            break;
                        case '2':
                            number4 = 2;
                            break;
                        case '3':
                            number4 = 3;
                            break;
                        case '4':
                            number4 = 4;
                            break;
                        case '5':
                            number4 = 5;
                            break;
                        case '6':
                            number4 = 6;
                            break;
                        case '7':
                            number4 = 7;
                            break;
                        case '8':
                            number4 = 8;
                            break;
                        case '9':
                            number4 = 9;
                    }
                    array[number3 * 10 + number4][number1] = numberx;
                    if (maxrownumber < number3 * 10 + number4)
                        maxcolumnnumber = number3 * 10 + number4;
                    if (maxcolumnnumber < number1)
                        maxcolumnnumber = numberx;
                }

            }


            for (int i = 0; i < array.length; i++)// whether duplicate?
            {
                if (positionindex == arrayx[i]) {
                    noduplicate = false;
                    System.out.println(positionindex +" "+ numberx + " >>>Fail");
                    break;
                }

            }
            if (noduplicate == false)//have duplicate
                break;
            else {
                System.out.println(positionindex +" "+ numberx + " >>>Ok");
                arrayx[count] = positionindex;
            }
            count++;//go on


        }
        if(noduplicate==true) {// no duplicate
            for (int j = 0; j < maxrownumber; j++) {
                for (int i = 0; i < maxcolumnnumber; i++) {
                    if(array[j][i]!=0)
                    System.out.printf("%3d", array[j][i]);
                    else
                        System.out.printf("%3s"," ");
                }//print all

            }
        }

    }


}
