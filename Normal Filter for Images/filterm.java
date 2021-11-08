import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class filterm {
    public static void main(String args[])throws IOException
    {
        BufferedImage img = null;
        File f = null;
        int inp;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter you choice:\n1:Negative\n2:Sepia\n");
        inp=sc.nextInt();


        
        // read image
        try
        {
            f = new File("C:\\Users\\91748\\py_program\\Image processing\\102.jpg");
            img = ImageIO.read(f);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

        
        // Get image width and height
        int width = img.getWidth();
        int height = img.getHeight();

        switch (inp){
  
            case 1:
  
  
        // Convert to negative
        for (int y = 0; y < height; y++)
        {
            for (int x = 0; x < width; x++)
            {
                int p = img.getRGB(x,y);
                int a = (p>>24)&0xff;
                int r = (p>>16)&0xff;
                int g = (p>>8)&0xff;
                int b = p&0xff;
  
                //subtract RGB from 255
                r = 255 - r;
                g = 255 - g;
                b = 255 - b;
  
                //set new RGB value
                p = (a<<24) | (r<<16) | (g<<8) | b;
                img.setRGB(x, y, p);
            }
        }
        break;

        case 2:
        for(int y = 0; y < height; y++)
        {
            for(int x = 0; x < width; x++)
            {
                int p = img.getRGB(x,y);
  
                int a = (p>>24)&0xff;
                int R = (p>>16)&0xff;
                int G = (p>>8)&0xff;
                int B = p&0xff;
  
                //calculate newRed, newGreen, newBlue
                int newRed = (int)(0.393*R + 0.769*G + 0.189*B);
                int newGreen = (int)(0.349*R + 0.686*G + 0.168*B);
                int newBlue = (int)(0.272*R + 0.534*G + 0.131*B);
  
                //check condition
                if (newRed > 255)
                    R = 255;
                else
                    R = newRed;
  
                if (newGreen > 255)
                    G = 255;
                else
                    G = newGreen;
  
                if (newBlue > 255)
                    B = 255;
                else
                    B = newBlue;
  
                //set new RGB value
                p = (a<<24) | (R<<16) | (G<<8) | B;
  
                img.setRGB(x, y, p);
            }
        }
        break;

        default:
        System.out.printf("Wrong input.");
     }
  
        // write image
        try
        {
            f = new File("C:\\Users\\91748\\py_program\\Image processing\\102a.jpg");
            ImageIO.write(img, "jpg", f);
            System.out.println("Successful!!");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}