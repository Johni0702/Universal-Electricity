package universalelectricity.basiccomponents;

import universalelectricity.extend.TileEntityConductor;

public class TileEntityCopperWire extends TileEntityConductor
{
    @Override
    public double getResistance()
    {
        return 0.3;
    }
}