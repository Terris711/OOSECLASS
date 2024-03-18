package Week3.ImageData;

public class InvertImage extends ImageEdit{
    @Override
    protected int convertPixel(ImageData oldImage, int x, int y, int newHeight) {
        return ~oldImage.getPixel(x,y);
    }

    @Override
    protected int getNewHeight(ImageData oldImage) {
        return oldImage.getHeight();
    }

    @Override
    protected int getNewWidth(ImageData oldImage) {
        return oldImage.getWidth();
    }
}
