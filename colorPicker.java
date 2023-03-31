import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        /*
      
        Sample Output 1

        Enter a color name (red, green, blue, yellow, or magenta): red
        RGB value: (255, 0, 0)
        Sample Output 2

        Enter a color name (red, green, blue, yellow, or magenta): RED
        RGB value: (255, 0, 0)
        
        */
      
        Scanner sc = new Scanner(System.in);
        String ch;

        System.out.print("Enter a color name (red, green, blue, yellow, or magenta): ");
        ch = sc.nextLine();

        if(ch.equalsIgnoreCase("red")){
            System.out.print("RGB value: (255, 0, 0)");
        }
        else if(ch.equalsIgnoreCase("green")){
            System.out.print("RGB value: (0, 255, 0)");
        }
        else if(ch.equalsIgnoreCase("blue")){
            System.out.print("RGB value: (0, 0, 255)");
        }
        else if(ch.equalsIgnoreCase("magenta")){
            System.out.print("RGB value: (202, 31, 123)");
        }
        else if(ch.equalsIgnoreCase("yellow")){
            System.out.print("RGB value: (255, 255, 0)");
        }
    }
}
