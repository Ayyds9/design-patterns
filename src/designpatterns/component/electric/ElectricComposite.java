package designpatterns.component.electric;

import java.util.ArrayList;
import java.util.List;

public class ElectricComposite extends ElectricAppliance {
    private List<ElectricAppliance> electric = new ArrayList<ElectricAppliance>();
    private String name;

    public ElectricComposite(String name) {
        this.name = name;
    }

    public List<ElectricAppliance> getElectric() {
        return electric;
    }

    public void setElectric(List<ElectricAppliance> electric) {
        this.electric = electric;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(ElectricAppliance e) {
        electric.add(e);
    }

    public void remove(ElectricAppliance e) {
        electric.remove(e);
    }

    public ElectricAppliance getChild(int i) {
        return electric.get(i);
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    public void print() {
        System.out.print("");
        System.out.println(name);
        for (ElectricAppliance e : electric) {
            System.out.println(e.getName()+"属于"+ name);
            if (e instanceof ElectricComposite) {
                System.out.println("——————————————");
                ((ElectricComposite) e).print();
            }
        }
    }
}
