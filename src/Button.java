import greenfoot.*;
 
public class Button extends Actor
{
    private boolean clicked;
    String buttonText = "";
    private CommandReceiver r;
 
    public Button()
    {
        ;
    }
 
    public Button(String text, CommandReceiver re)
    {
        setText(text);
        r = re;
    }
 
    public void setText(String text)
    {
        buttonText=text;
        GreenfootImage textImg=new GreenfootImage(" "+text+" ", 24, Color.BLACK, new Color(0, 0, 0, 0));
        GreenfootImage image=new GreenfootImage(textImg.getWidth()+8, textImg.getHeight()+8);
        image.setColor(Color.DARK_GRAY);
        image.fill();
        image.setColor(Color.LIGHT_GRAY);
        image.fillRect(3, 3, image.getWidth()-6, image.getHeight()-6);
        image.setColor(Color.BLACK);
        image.drawImage(textImg, (image.getWidth()-textImg.getWidth())/2, (image.getHeight()-textImg.getHeight())/2);
        setImage(image);
    }
 
    public void act()
    {
        
        if(Greenfoot.mouseClicked(this)) 
        {
            r.execute();
            State.startMusic();
        }
     
    }
 
    public boolean gotClicked()
    {
        return clicked;
    }
 
    public String getText()
    {
        return buttonText;
    }
    
}