package Week3.ImageData;

public class RotateImage extends ImageEdit{
    @Override
    protected int convertPixel(ImageData oldImage, int x, int y, int newHeight) {
        return oldImage.getPixel(newHeight - y - 1, x);
    }

    @Override
    protected int getNewHeight(ImageData oldImage) {
        return oldImage.getWidth();
    }

    @Override
    protected int getNewWidth(ImageData oldImage) {
        return oldImage.getHeight();
    }
}
