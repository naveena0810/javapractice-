class animal
{
    public void makesound()
    {
        System.out.println("animal makes a sound");
    }
}
class dog extends animal{
    public void makesound()
    {
        System.out.println("dog barks");
    }

}
public class overriding {
    public static void main(String[] args){
        animal ob1=new animal();
        dog ob2=new dog();
        ob1.makesound();
        ob2.makesound();
    }
    
}
