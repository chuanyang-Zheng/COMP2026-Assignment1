//student 17251311
// section 1
//1.ew should read the data first,so, I use Scanner to get data.
//2.I have to know whether the position have data or not ,so, I have to know which part have data. I use array to store the information.
//3.After I store the information about the position is occupied or not, I will check. This is use array to check.
import java.util.Scanner;
import java.io.*;
public class Input {
    public static void main(String[] args) throws Exception {
        new Input().runApp();
    }

    Input() {
    }

    void runApp() throws Exception {//app
        Scanner in = new Scanner(System.in);
        System.out.print("Intput file: ");
        String filename = in.next();//get file name
        File inputfile = new File(filename);//file
        Scanner file = new Scanner(inputfile);//input file

        boolean noduplicate=true;

        String [] array=new String[99*99];//max 99*99
        int rownumber = 0;
        int columnnumber=0;
        int count=0;//count where added
        rownumber=Integer.parseInt(file.nextLine());//get information
        columnnumber=Integer.parseInt(file.nextLine());//get information
        System.out.print();
        while(file.hasNextLine())
        {


            String positionindex=file.next();//get position number
            String numberx=file.nextLine();// get number and delete /n
            for(int i=0;i<array.length;i++)// whether duplicate?
            {
                if(positionindex==array[i])//position is occupied
                {
                    noduplicate=false;
                    System.out.println(positionindex + numberx+" >>>Fail");
                    break;
                }

            }
            if( noduplicate==false)//have duplicate
                break;
            else {
                System.out.println(positionindex + numberx + " >>>Ok");
                array[count] = positionindex;
            }
            count++;//go on


        }
    }
}
