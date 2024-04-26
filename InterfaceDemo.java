/*
 * What is Interface?
 * // Standard/ Plan / Prototype / Guideline / What to do / Contract
 */
// interface = Constants + Abstract Methods
// 100 % Abstract
interface IPlayer{ 
    int MAX = 100; // public static final int MAX = 100;
    // abstract interface IPlayer
    void kick(int power); // public abstract void kick(int power);
    void punch(int power);
    void jump(int x, int y);
}

// kick, punch , walk, run , jump
class Ryu implements IPlayer{

    @Override
    public void kick(int power) {
       System.out.println("Ryu Kick High");
    }

    @Override
    public void punch(int power) {
        System.out.println("Ryu Punch Hard");
    }

    @Override
    public void jump(int x, int y) {
        System.out.println("Ryu Jump High");
    }

}
class Vega implements IPlayer{

    @Override
    public void kick(int power) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'kick'");
    }

    @Override
    public void punch(int power) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'punch'");
    }

    @Override
    public void jump(int x, int y) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'jump'");
    }

}
class Honda{

}
public class InterfaceDemo {
    
}
