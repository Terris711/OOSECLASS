package Week2.worksheet1_imageviewer_java.src.main.java.edu.curtin.imageviewer;

/**
 * Represents an image in an album.
 */
public class ImageRecord
{
    private String filename;
    private String caption;
    
    public ImageRecord(String newFilename, String newCaption)
    {
        filename = newFilename;
        caption = newCaption;
    }
    
    public String getFilename()
    {
        return filename;
    }
    
    public String getCaption()
    {
        return caption;
    }
}

