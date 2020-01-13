package info.vladyslav.EPAM_HW_9_1223.structural.bridge;

public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer){
        this.developer = developer;
    }
public abstract void developProgram();
}
