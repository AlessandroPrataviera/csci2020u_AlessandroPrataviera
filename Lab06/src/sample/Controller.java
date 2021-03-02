package sample;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Controller {
    @FXML
    private Canvas mainCanvas;
    @FXML
    private GraphicsContext gc;


    private static double[] avgHousingPricesByYear = {
            247381.0,264171.4,287715.3,294736.1, 308431.4,322635.9,340253.0,363153.7
    };
    private static double[] avgCommercialPricesByYear = {
            1121585.3,1219479.5,1246354.2,1295364.8, 1335932.6,1472362.0,1583521.9,1613246.3
    };


    @FXML
    public void initialize() {
        gc = mainCanvas.getGraphicsContext2D();

        drawBar(300,300,avgCommercialPricesByYear,Color.BLUE);
        System.out.print(gc.getLineWidth());
    }
    public void drawBar (int w,int h, double [] data2, Color color2) {


        double xInc2 = w / data2.length;

        double maxVal = Double.NEGATIVE_INFINITY;
        double minVal = Double.MAX_VALUE;



        double x = 0;
        for (double val : data2) {
            if (val > maxVal)
                maxVal = val;

            if (val < minVal)
                minVal = val;

        }
        for (double val : data2) {
            double height2 = ((val-minVal)/(maxVal-minVal)*h);
            gc.setFill(color2);
            gc.fillRect(x,(h-height2),xInc2,height2);
            x += xInc2;
        }


    }

}
