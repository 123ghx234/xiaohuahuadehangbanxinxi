package Plane.Shiti;

public class Order
{
    private String id;
    private String customType;//乘客的类型
    private float airPortTax;//机场税
    private float ryf;//燃油费
    private float hkzhf;//航空综合险
    private float jptgf;//机票退改险
    private float yhq;//优惠券
    private float hszj;//含税总价
    private Passanger passangers[];//乘客列表

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomType() {
        return customType;
    }

    public void setCustomType(String customType) {
        this.customType = customType;
    }

    public float getAirPortTax() {
        return airPortTax;
    }

    public void setAirPortTax(float airPortTax) {
        this.airPortTax = airPortTax;
    }

    public float getRyf() {
        return ryf;
    }

    public void setRyf(float ryf) {
        this.ryf = ryf;
    }

    public float getHkzhf() {
        return hkzhf;
    }

    public void setHkzhf(float hkzhf) {
        this.hkzhf = hkzhf;
    }

    public float getJptgf() {
        return jptgf;
    }

    public void setJptgf(float jptgf) {
        this.jptgf = jptgf;
    }

    public float getYhq() {
        return yhq;
    }

    public void setYhq(float yhq) {
        this.yhq = yhq;
    }

    public float getHszj() {
        return hszj;
    }

    public void setHszj(float hszj) {
        this.hszj = hszj;
    }

    public Passanger[] getPassangers() {
        return passangers;
    }

    public void setPassangers(Passanger[] passangers) {
        this.passangers = passangers;
    }

}
