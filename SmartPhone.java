public class SmartPhone {
    String name;
    String os;
    int ram;
    int storage;
    int cam;
    double screen;

    public SmartPhone(String name,String os, int x, int y, double z)
    {
        this.name=name;
        this.os=os;
        this.ram=x;
        this.storage=y;
        this.screen=z;
    }

    public boolean equals(SmartPhone o)
    {
        if(this.hashCode()==o.hashCode())   //addresses equal, refers to same object
        {
            return true;
        }
        if(o == null || this.getClass() != o.getClass())
        {
            return false;
        }
        if(this.name==o.name && this.os==o.os && this.ram==o.ram && this.storage==o.storage && this.screen==o.screen)
        {
            return true;
        }
        return false;
    }
}
