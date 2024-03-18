package Week3.ImageData;

public class ScaleImage extends ImageEdit {
    @Override
    protected int convertPixel(ImageData oldImage, int x, int y, int newHeight) {
        return oldImage.getPixel(x * 2, y * 2);
    }

    @Override
    protected int getNewHeight(ImageData oldImage) {
        return oldImage.getHeight() / 2;
    }

    @Override
    protected int getNewWidth(ImageData oldImage) {
        return oldImage.getWidth() / 2;
    }
}
