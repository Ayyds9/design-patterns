package designpatterns.component.electric;

public class Electric extends ElectricAppliance{
    private String name;
    public Electric(String name) {
        this.name = name;
    }
    @Override
    public void open() {
        System.out.println(name + "打开");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void close() {
        System.out.println(name + "关闭");
    }
}
