/*
 * Hidden Image - Greedy Algorithm
 * Mr. Muir
 * 2018.02.26 - v1.0
 */
package edu.hdsb.gwss.chiadika.ics3u.u7;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * @author Wm.Muir
 */
public class HiddenImage {

    public static void main(String[] args) {

        // VARIABLES & OBJECTS
        String fileName = null;
        BufferedImage image = null;

        // IMAGES
        //  1. iron-puzzle.png
        //  2. copper-puzzle.png
        //  3. west-puzzle.png
        int imageNumber = 2;
        switch (imageNumber) {
            case 1:
                fileName = "iron-puzzle.png";
                break;
            case 2:
                fileName = "copper-puzzle.png";
                break;
        }

        // READ IMAGE
        try {
            image = ImageIO.read(new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // CREATE GUI
        DrawingPanel panel = new DrawingPanel(image.getWidth(), image.getHeight());
        //panel.setImage( image );

        switch (imageNumber) {
            case 1:
                panel.setImage(unhideIronPuzzle(image));
                break;
            case 2:
                panel.setImage(unhideCopperPuzzle(image));
                break;
        }

    }

    /**
     * Iron Horse
     * <ul>
     * <li>red values have all been divided by 10</li>
     * <li>blue and green values are all just meaningless random values
     * ("noise") added to obscure the real image</li>
     * </ul>
     *
     * @param image
     */
    public static BufferedImage unhideIronPuzzle(BufferedImage image) {
        Color c, color;
        int r;

        for (int w = 0; w < image.getWidth(); w++) {
            for (int h = 0; h < image.getHeight(); h++) {

                c = new Color(image.getRGB(w, h));
                r = c.getRed() * 10;

                color = new Color(r, 0, 0);

                image.setRGB(w, h, color.getRGB());
            }
        }

        return image;
    }

    /**
     * Iron Horse
     * <ul>
     * <li>set the red values to 0 to get that of the way</li>
     * <li>multiply the blue and green values by 20 to get them back
     * approximately to their proper values</li>
     * </ul>
     *
     * @param image
     */
    public static BufferedImage unhideCopperPuzzle(BufferedImage image) {
        Color c, color;
        int r, g, b;
        for (int w = 0; w < image.getWidth(); w++) {
            for (int h = 0; h < image.getHeight(); h++) {

                c = new Color(image.getRGB(w, h));
                g = Math.min(c.getGreen() * 20, 255);
                b = Math.min(c.getBlue() * 20 , 255);
                r = c.getRed() * 0;
                

                color = new Color(r, g, b);

                image.setRGB(w, h, color.getRGB());

            }
        }

        return image;
    }

}
