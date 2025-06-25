package designpatterns.component.electric;

public abstract class ElectricAppliance {
    public abstract void open();
    public abstract void close();
    public abstract String getName();
    public abstract void setName(String name);
}
