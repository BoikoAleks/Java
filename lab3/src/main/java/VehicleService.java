import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VehicleService {
    public List<Vechicle>list;

    public VehicleService(List<Vechicle> list) {
        this.list = list;
    }

    public List<Vechicle> getList() {
        return list;
    }

    public void setList(List<Vechicle> list) {
        this.list = list;
    }

    public List<Vechicle> getByMake(String make)
    {
        List<Vechicle>res=new ArrayList<>();
        for(Vechicle v : getList())
        {
            if(v.getMake().equals(make))
            {
                res.add(v);
            }
        }
        return res;
    }
    public List<Vechicle> getByModel(String model)
    {
        List<Vechicle>res=new ArrayList<>();
        for(Vechicle v : getList())
        {
            if(v.getModel().equals(model))
            {
                res.add(v);
            }
        }
        return res;
    }
    public List<Vechicle> getByType(String type)
    {
        List<Vechicle>res=new ArrayList<>();
        for(Vechicle v : getList())
        {
            if(v.getType().equals(type))
            {
                res.add(v);
            }
        }
        return res;
    }
    public List<Vechicle> getByEngineMaxPower(int maxPower)
    {
        return getList().stream().filter(vechicle -> vechicle.getEngine().getMaxPower() == maxPower).collect(Collectors.toList());
    }
    public List<Vechicle> getByEngineCylindersNumber(int cylindersNumber)
    {
        return getList().stream().filter(vechicle -> vechicle.getEngine().getCylindersNumber() == cylindersNumber).collect(Collectors.toList());
    }
    public List<Vechicle>  getByBreakingSystemCoolingType(String coolingType)
    {
        return getList().stream().filter(vechicle -> vechicle.getBreakingSystem().getCoolingType().equals(coolingType)).collect(Collectors.toList());
    }
}
