package Week3.ImageData;

import java.util.Scanner;

public class ImageEditApp {

    public static void main(String[] args) {
        ImageData image = new ImageData(8, 16);

        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter (1) Rotate Image, (2) Invert Image, (3) Scale Image,  (0) Quit");
            choice = input.nextInt();
            input.nextLine();

            try {
                switch (choice) {
                    case 1:
                        ImageEdit rotate = new RotateImage();
                        rotate.editImage(image);
                        System.out.println(rotate);
                        break;

                    case 2:
                        ImageEdit inverted = new InvertImage();
                        inverted.editImage(image);
                        System.out.println(inverted);
                        break;

                    case 3:
                        ImageEdit scaled = new ScaleImage();
                        scaled.editImage(image);
                        System.out.println(scaled);
                        break;

                    default:
                        System.out.println("Please enter a valid number !");
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Your input is not a number !");
            }
        } while(choice !=0);
    }
}
