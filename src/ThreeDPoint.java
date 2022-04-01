public class ThreeDPoint extends Point
{
    private int z;

    public ThreeDPoint(String name, int x, int y, int z)
    {
        super(name, x, y);
        this.z = z;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", z = " + z;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof ThreeDPoint))
        {
            return false;
        }
        else
        {
            ThreeDPoint temp = (ThreeDPoint)obj;
            return (super.equals(temp)) && (this.z == temp.z);
        }
    }
}
